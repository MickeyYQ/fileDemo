package com.example.demo.controller;

import com.example.demo.pojo.Filefold;
import com.example.demo.repository.FileRepository;
import com.example.demo.util.FileScanner;
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
        List<String> list = new ArrayList<>();
        List<Filefold> ffd = new ArrayList<>();
        FileScanner fs = new FileScanner();
        String a = fs.getFile("C:\\Users\\Mickey\\Documents\\2019test.txt");
        System.out.println("a----->" + a);
        list.add(a);
        for(String b : list){
            System.out.println(b);
        }

        fileRepository.saveAll(ffd);
        return "你好啊！";
    }
}
