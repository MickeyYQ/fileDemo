package com.example.demo;

import com.example.demo.pojo.Filefold;
import com.example.demo.repository.FileRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    private FileRepository fileRepository;

    @Test
    public void contextLoads() {
        Filefold filefold = new Filefold();
        filefold.setFilenamea("a");
        filefold.setFilenameb("b");
        filefold.setFilenamec("c");
        filefold.setFilenamed("d");
        filefold.setFilenamee("e");
        filefold.setFilenamef("f");
        filefold.setFilenameg("g");
        filefold.setFilenameh("h");
        fileRepository.save(filefold);
    }

    @Test
    public void del() {
        fileRepository.deleteById(1);
    }

    @Test
    public void delAll(){
        fileRepository.deleteAll();
    }

    @Test
    public void watch() {
        fileRepository.findAll();
    }

}
