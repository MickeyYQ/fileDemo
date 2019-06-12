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
        filefold.setFilenamea("");
        filefold.setFilenameb("");
        filefold.setFilenamec("");
        filefold.setFilenamed("");
        filefold.setFilenamee("");
        filefold.setFilenamef("");
        filefold.setFilenameg("");
        filefold.setFilenameh("");
        fileRepository.save(filefold);
    }

    @Test
    public void del() {
        fileRepository.deleteById(1);
    }

    @Test
    public void watch() {
        fileRepository.findAll();
    }

}
