package com.blueyonder.team2.JobPortalHireNow.controller;


import com.blueyonder.team2.JobPortalHireNow.model.LoginForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController {
    @GetMapping
    public String getLogin(Model model){
        model.addAttribute("loginForm", new LoginForm());
        return "login";
    }
    @PostMapping
    public String postLogin(@ModelAttribute LoginForm loginForm, Model model){
        model.addAttribute("username", loginForm.getUsername());
        return "result";
    }
}
