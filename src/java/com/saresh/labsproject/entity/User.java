/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saresh.labsproject.entity;

import java.util.List;

/**
 *
 * @author saresh
 */
public class User {
    private int id;
    private String login;
    private String password;
    private List<Subject> subjectsCreated;
    private List<Subject> subjectsAssigned;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Subject> getSubjectsCreated() {
        return subjectsCreated;
    }

    public void setSubjectsCreated(List<Subject> subjectsCreated) {
        this.subjectsCreated = subjectsCreated;
    }

    public List<Subject> getSubjectsAssigned() {
        return subjectsAssigned;
    }

    public void setSubjectsAssigned(List<Subject> subjectsAssigned) {
        this.subjectsAssigned = subjectsAssigned;
    }
    
    
}
