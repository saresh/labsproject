/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.saresh.labsproject.mvc;


import com.saresh.labsproject.dao.factory.DaoFactory;
import com.saresh.labsproject.dao.impl.SubjectDao;
import com.saresh.labsproject.dao.interfaces.ISubjectDao;
import com.saresh.labsproject.entity.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author saresh
 */
@Controller
public class HomeController {
    
    @Autowired
    private ISubjectDao subjectDao;
            
    @RequestMapping ({"/", "/home", "/main"})
    public String showHomePage(Model model){
        
        Subject sbj = subjectDao.findSubject(1);
        model.addAttribute("welcometext", "Hi there, saresh");
        model.addAttribute("subject", sbj);
        return "home";        
    }
}
