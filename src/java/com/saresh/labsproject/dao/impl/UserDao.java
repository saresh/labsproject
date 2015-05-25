/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.saresh.labsproject.dao.impl;

import com.saresh.labsproject.dao.interfaces.IUserDao;
import com.saresh.labsproject.entity.User;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author saresh
 */
@Repository
@Transactional
public class UserDao implements IUserDao {
    private static final String SELECT_USER_BY_LOGIN_PASSWORD = "FROM User where login = :login and password = :password";
    private static final String SELECT_USER_BY_LOGIN = "FROM User where login = :login";
    private SessionFactory sessionFactory;    
    
    @Autowired
    public UserDao(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }
    
    private Session currentSession(){
        return sessionFactory.getCurrentSession();
    }

    @Override
    public void addUser(User user) {
        currentSession().save(user);
    }

    @Override
    public User findUser(int id) {
        return (User) currentSession().get(User.class, id);        
    }

    @Override
    public User findUser(String login, String password) {
        Query query = currentSession().createQuery(SELECT_USER_BY_LOGIN_PASSWORD);
        query.setParameter("login", login);
        query.setParameter("password", password);
        List<User> resultList = query.list();
        
        if (resultList.size() > 0) {
            return resultList.get(0);
	} else {
            return null;
	}        
    }

    @Override
    public boolean isUserExist(String login) {
        Query query = currentSession().createQuery(SELECT_USER_BY_LOGIN);
        query.setParameter("login", login);
        List<User> resultList = query.list();
        
        boolean result;
        
        if (resultList.size() != 0){
            result = true;
        } else {
            result = false;
        }
        
        return result;
    }

    @Override
    public User findUser(String login) {
        Query query = currentSession().createQuery(SELECT_USER_BY_LOGIN);
        query.setParameter("login", login);
        List<User> resultList = query.list();
        
        if (resultList.size() > 0) {
            return resultList.get(0);
	} else {
            return null;
	}        
    }
    
}
