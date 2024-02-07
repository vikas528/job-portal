package com.blueyonder.team2.JobPortalHireNow.controller;


import com.blueyonder.team2.JobPortalHireNow.model.User;
import com.blueyonder.team2.JobPortalHireNow.model.user.LoginDto;
import com.blueyonder.team2.JobPortalHireNow.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/register")
    public String showSignUpForm(Model model){
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping("/register")
    public String processSignUp(User user){
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        userRepository.save(user);
        return "redirect:/index.html";
    }

    @GetMapping("/login")
    public String getLogin(Model model){
        model.addAttribute("loginDto", new LoginDto());
        return "login";
    }

    @PostMapping("/login")
    public String postLogin(LoginDto prevUser, Model model){
        User user = userRepository.findByUsername(prevUser.getUsername());
        model.addAttribute("user", user);
        return "redirect:/index.html";
    }

    @RequestMapping("logout")
    public String logout(){
        return "logout";
    }

    @GetMapping("/users")
    public String listUsers(Model model){
        List<User> users = userRepository.findAll();
        model.addAttribute("users", users);
        return "users";
    }

    @GetMapping("/welcome")
    public String Welcome(Model model){
        return "welcome";
    }
//    @GetMapping("/{username}")
//    public String getLogin(@PathVariable String username, Model model){
//        User user = userService.loginUser(username);
//        //throw exception here
//        if(user==null) return "error";
//        model.addAttribute("user", user);
//        return "login";
//    }

//    @PostMapping
//    public String postLogin(@ModelAttribute("user") User user, Model model){
////        String encryptedPassword = passwordEncoder.encode(user.getPassword());
////        user.setPassword(encryptedPassword);
//        userService.signupUser(user);
//        model.addAttribute("user", user);
//        return "result";
//    }
}