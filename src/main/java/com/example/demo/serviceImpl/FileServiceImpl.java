package com.example.demo.serviceImpl;

import com.example.demo.repository.FileRepository;
import com.example.demo.service.FileService;
import com.example.demo.pojo.Filefold;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class FileServiceImpl implements FileService {

    @Autowired
    private FileRepository fileRepository;


    @Override
    public void save(Filefold filefold) {
        fileRepository.save(filefold);
    }
}
