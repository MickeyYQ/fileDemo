package com.example.demo;

import com.example.pojo.Filefold;
import com.example.repository.FileRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.UUID;

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

        filefold.setId(123);
        fileRepository.insertNr(filefold.getId());
    }

}
