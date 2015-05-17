/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.saresh.labsproject.dao.impl;

import com.saresh.labsproject.dao.interfaces.ILabWorkDao;
import com.saresh.labsproject.entity.LabWork;
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
public class LabWorkDao implements ILabWorkDao{
    private static final String SELECT_BY_SUBJECT_ID = "from LabWork where subject_id = :subject_id";
    private SessionFactory sessionFactory;
    
    @Autowired
    public LabWorkDao(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }
    
    private Session currentSession(){
        return sessionFactory.getCurrentSession();
    }

    @Override
    public LabWork findLabWorkById(int id) {
        return (LabWork) currentSession().get(LabWork.class, id);
    }

    @Override
    public List<LabWork> findLabWorksBySubjectId(int subjectId) {
        Query query = currentSession().createQuery(SELECT_BY_SUBJECT_ID);
        query.setParameter("subject_id", subjectId);
        List<LabWork> resultList = query.list();
        return resultList;
    }
    
}
