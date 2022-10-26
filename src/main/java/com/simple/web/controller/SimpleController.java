package com.simple.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SimpleController {
    @RequestMapping("/")
    public String hello() {
        return "hello"; // return view file name -> /WEB-INF/views/hello.jsp
    }
}
