package com.example.demo.controller;

import com.example.demo.pojo.Filefold;
import com.example.demo.repository.FileRepository;
import com.example.demo.util.DateTime;
import com.example.demo.util.FileScanner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class sannerController {

    @Autowired
    private FileRepository fileRepository;

    @RequestMapping("/index")
    public String insertAll(){
        DateTime dt = new DateTime();
        Filefold f = new Filefold();
        List<String> list ;
        List<Filefold> ffd = new ArrayList<>();
        FileScanner fs = new FileScanner();
        list = fs.getFile("C:\\Users\\Mickey\\Documents\\2019test.txt");
        System.out.println("list----->" + list);
        for(String s : list){
            System.out.println(dt.date()+" s-->>>>>>"+s);


            if(s.equals("null") || s == null){
                return s.toString().replace("null","");
            }else{
                s = s.substring(0,s.length() - 1);
                System.out.println("修改后的s"+s);
            }
            String a [] = s.split("|");
            System.out.println("a-->>>>>>"+a);
        }
        f.setFilenamea("a");
        f.setFilenameb("b");
        f.setFilenamec("c");
        f.setFilenamed("d");
        f.setFilenamee("e");
        f.setFilenamef("f");
        f.setFilenameg("g");
        f.setFilenameh("h");
        //ffd.add(f);

        for(int a = 0 ;a<list.size();a++){
            if(list.equals("") || list == null || list.equals("null")){
                list.clear();
            }else{
                //fileRepository.saveAll(ffd);
            }
        }
        return "你好啊！";
    }
}
