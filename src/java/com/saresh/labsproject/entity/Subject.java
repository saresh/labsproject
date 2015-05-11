/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saresh.labsproject.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author saresh
 */

@Entity
@Table(name = "subjects")
public class Subject {    
    private int id;
    private String title;
    private String description;
    private List<LabWork> labs = new ArrayList<>();
    private User creator;
    private List<User> usersAssigned = new ArrayList<>();
            
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

    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "subject")
    public List<LabWork> getLabs() {
        return labs;
    }

    public void setLabs(List<LabWork> labs) {
        this.labs = labs;
    }


    @ManyToOne
    @JoinColumn(name="user_creator_id")
    public User getCreator() {
        return creator;
    }

    public void setCreator(User creator) {
        this.creator = creator;
    }

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "subject_user_assigned", joinColumns = { 
                    @JoinColumn(name = "subject_id", nullable = false, updatable = false) }, 
                    inverseJoinColumns = { @JoinColumn(name = "user_id", 
					nullable = false, updatable = false) })
    public List<User> getUsersAssigned() {
        return usersAssigned;
    }

    public void setUsersAssigned(List<User> usersAssigned) {
        this.usersAssigned = usersAssigned;
    }    
}
