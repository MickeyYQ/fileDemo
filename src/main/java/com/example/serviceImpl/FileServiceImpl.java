package com.example.serviceImpl;

import com.example.pojo.Filefold;
import com.example.repository.FileRepository;
import com.example.service.FileService;
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
