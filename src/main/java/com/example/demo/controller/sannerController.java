package com.example.demo.controller;

import com.example.demo.pojo.Filefold;
import com.example.demo.repository.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class sannerController {

    @Autowired
    private FileRepository fileRepository;

    @RequestMapping("/index")
    public String insertAll(){
        Filefold f = new Filefold();
        List<Filefold> list = new ArrayList<>();
        fileRepository.saveAll(list);
        return "你好啊！";
    }
}
