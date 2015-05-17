/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.saresh.labsproject.dao.impl;

import com.saresh.labsproject.dao.interfaces.ISubjectDao;
import com.saresh.labsproject.entity.Subject;
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
public class SubjectDao implements ISubjectDao{
    private static final String SELECT_ALL = "from Subject";
    private static final String SELECT_BY_USER_CREATED_ID = "from Subject where user_creator_id = :user_id";
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
        Query query = currentSession().createQuery(SELECT_ALL);
        List<Subject> resultList = query.list();
        return resultList;
    }

    @Override
    public List<Subject> findSubjectByUserId(int userId) {
        Query query = currentSession().createQuery(SELECT_BY_USER_CREATED_ID);
        query.setParameter("user_id", userId);
        List<Subject> resultList = query.list();
        return resultList;
    }
    
}
