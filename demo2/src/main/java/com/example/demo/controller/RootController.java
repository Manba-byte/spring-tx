package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@Controller
@RestController()
@RequestMapping("/RootController")
public class RootController {

    @Autowired
    private HttpServletRequest request;


    @GetMapping("/get")
    public String get() {

        return "hello world\n" + request.getRequestURL();
    }

    @GetMapping("/say")
    public String say(){
        return "remote service is success say hello world";
    }
}
