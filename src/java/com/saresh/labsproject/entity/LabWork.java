/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saresh.labsproject.entity;

<<<<<<< HEAD
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "LabWork")
=======
>>>>>>> origin/master
public class LabWork {    
    private int id;
    private String title;
    private String description;
    private Subject subject;
    private String filepath;
    
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
    @Column(name = "title")
=======
>>>>>>> origin/master
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

<<<<<<< HEAD
    @Column(name = "description")
=======
>>>>>>> origin/master
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

<<<<<<< HEAD
    @ManyToOne
    @JoinColumn(name="subject_id")
=======
>>>>>>> origin/master
    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

<<<<<<< HEAD
    @Column(name = "file_path")
=======
>>>>>>> origin/master
    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }
    
}
