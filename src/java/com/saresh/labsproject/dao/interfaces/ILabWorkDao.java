/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.saresh.labsproject.dao.interfaces;

import com.saresh.labsproject.entity.LabWork;
import java.util.List;

/**
 *
 * @author saresh
 */
public interface ILabWorkDao {
    
    LabWork findLabWorkById(int id);
    
    List<LabWork> findLabWorksBySubjectId(int subjectId);
    
    
}
