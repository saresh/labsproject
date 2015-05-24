/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saresh.labsproject.entity;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;


/**
 *
 * @author saresh
 */

@Entity
@Table(name = "user")
public class User {
    private int id;
    private String login;
    private String password;
    private boolean enabled;
    private List<Subject> subjectsCreated;
    private List<Subject> subjectsAssigned;
    private Set<UserRole> userRoles = new HashSet<UserRole>(0);

    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    @Column(name="id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "login")
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    @Column(name = "enabled")
    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "creator")
    public List<Subject> getSubjectsCreated() {
        return subjectsCreated;
    }

    public void setSubjectsCreated(List<Subject> subjectsCreated) {
        this.subjectsCreated = subjectsCreated;
    }

    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "usersAssigned")
    public List<Subject> getSubjectsAssigned() {
        return subjectsAssigned;
    }

    public void setSubjectsAssigned(List<Subject> subjectsAssigned) {
        this.subjectsAssigned = subjectsAssigned;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    public Set<UserRole> getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(Set<UserRole> userRole) {
        this.userRoles = userRole;
    }
    
    
    
    
}
