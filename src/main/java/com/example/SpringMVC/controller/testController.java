package com.example.SpringMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class testController {

    @RequestMapping("/show")
    public String show(){
        System.out.println("show.....");
        return "/index.jsp";
    }
}
