/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.saresh.labsproject.dao.interfaces;

import com.saresh.labsproject.entity.User;

/**
 *
 * @author saresh
 */
public interface IUserDao {
    void addUser(User user);

    User findUser(int id);
    
    User findUser(String login, String password);
    
    boolean isUserExist(String login);
}
