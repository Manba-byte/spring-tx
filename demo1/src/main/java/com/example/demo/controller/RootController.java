package com.example.demo.controller;

import com.example.demo.remote.RemoteDemo2Service;
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

    @Autowired
    private RemoteDemo2Service remoteDemo2Service;


    @GetMapping("/get")
    public String get() {

        return "hello world\n" + request.getRequestURL();
    }

    @GetMapping("/testRemote")
    public String testRemote(){
        return remoteDemo2Service.say();
    }
}
