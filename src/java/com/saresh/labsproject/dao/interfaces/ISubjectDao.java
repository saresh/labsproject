/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.saresh.labsproject.dao.interfaces;

import com.saresh.labsproject.entity.Subject;
import java.util.List;

/**
 *
 * @author saresh
 */
public interface ISubjectDao {
    Subject findSubject(int id);
    
    List<Subject> findAllSubjects();
    
    List<Subject> findSubjectByUserId(int userId);
    
}
