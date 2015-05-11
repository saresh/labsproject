/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.saresh.labsproject.dao.impl;

import com.saresh.labsproject.dao.interfaces.ISubjectDao;
import com.saresh.labsproject.entity.Subject;
import java.util.List;
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
public class SubjectDao implements ISubjectDao{
    
    private SessionFactory sessionFactory;
    
    @Autowired
    public SubjectDao(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }
    
    private Session currentSession(){
        return sessionFactory.getCurrentSession();
    }

    @Override
    public Subject findSubject(int id) {
        return (Subject) currentSession().get(Subject.class, id);
    }

    @Override
    public List<Subject> findAllSubjects() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Subject> findSubjectByUserId(int userId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
