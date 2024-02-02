package com.blueyonder.team2.JobPortalHireNow.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping("/welcome")
@SessionAttributes(names = "name")
public class WelcomeController {
    @GetMapping
    public String showWelcomePage(Model model){
        model.addAttribute("name", "vikas");
        return "welcome";
    }
}
