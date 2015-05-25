/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saresh.labsproject.security;

import com.saresh.labsproject.dao.impl.UserDao;
import com.saresh.labsproject.dao.interfaces.IUserDao;
import com.saresh.labsproject.entity.UserRole;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 *
 * @author saresh
 */
public class LPUserDetailsService implements UserDetailsService{
    
    @Autowired
    private IUserDao userDao;

    @Override
    public UserDetails loadUserByUsername(String username) 
            throws UsernameNotFoundException {
        
        com.saresh.labsproject.entity.User user = userDao.findUser(username);
        List<GrantedAuthority> authorities = buildUserAuthority(user.getUserRoles());
        
        return buildUserForAuthentication(user, authorities);
    }

    private UserDetails buildUserForAuthentication(com.saresh.labsproject.entity.User user, List<GrantedAuthority> authorities) {
        return new User(user.getLogin(), 
			user.getPassword(), user.isEnabled(), 
                        true, true, true, authorities);
    }
    
    private List<GrantedAuthority> buildUserAuthority(Set<UserRole> userRoles) {
        Set<GrantedAuthority> setAuths = new HashSet<GrantedAuthority>();
        for (UserRole userRole : userRoles) {
            setAuths.add(new SimpleGrantedAuthority(userRole.getRole()));
	}
 
	List<GrantedAuthority> Result = new ArrayList<GrantedAuthority>(setAuths);
 
	return Result;
        
    }

    
    
}
