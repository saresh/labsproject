/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saresh.labsproject.entity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author saresh
 */
public class Subject {    
    private int id;
    private String title;
    private String description;
    private List<LabWork> labs = new ArrayList<>();
    private User creator;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<LabWork> getLabs() {
        return labs;
    }

    public void setLabs(List<LabWork> labs) {
        this.labs = labs;
    }

    public User getCreator() {
        return creator;
    }

    public void setCreator(User creator) {
        this.creator = creator;
    }
    
    
}
