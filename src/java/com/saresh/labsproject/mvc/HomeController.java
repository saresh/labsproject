/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.saresh.labsproject.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author saresh
 */
@Controller
public class HomeController {
    
    @RequestMapping ({"/", "/home", "/main"})
    public String showHomePage(Model model){
        
        model.addAttribute("welcometext", "Hi there, saresh");
        return "home";        
    }
}
