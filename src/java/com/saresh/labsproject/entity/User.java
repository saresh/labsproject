/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saresh.labsproject.entity;

import java.util.List;
<<<<<<< HEAD
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
=======
>>>>>>> origin/master

/**
 *
 * @author saresh
 */
<<<<<<< HEAD
@Entity
@Table(name = "User")
=======
>>>>>>> origin/master
public class User {
    private int id;
    private String login;
    private String password;
    private List<Subject> subjectsCreated;
    private List<Subject> subjectsAssigned;

<<<<<<< HEAD
    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    @Column(name="id")
=======
>>>>>>> origin/master
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

<<<<<<< HEAD
    @Column(name = "login")
=======
>>>>>>> origin/master
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

<<<<<<< HEAD
    @Column(name = "password")
=======
>>>>>>> origin/master
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

<<<<<<< HEAD
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
=======
>>>>>>> origin/master
    public List<Subject> getSubjectsCreated() {
        return subjectsCreated;
    }

    public void setSubjectsCreated(List<Subject> subjectsCreated) {
        this.subjectsCreated = subjectsCreated;
    }

<<<<<<< HEAD
    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "usersAssigned")
    @OrderBy("id desc")
=======
>>>>>>> origin/master
    public List<Subject> getSubjectsAssigned() {
        return subjectsAssigned;
    }

    public void setSubjectsAssigned(List<Subject> subjectsAssigned) {
        this.subjectsAssigned = subjectsAssigned;
    }
    
    
}
