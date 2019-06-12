package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class sannerController {

    @RequestMapping("/index")
    public String insertAll(){


        return "你好啊！";
    }
}
