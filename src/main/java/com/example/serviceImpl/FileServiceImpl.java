package com.example.serviceImpl;

import com.example.pojo.Filefold;
import com.example.repository.FileRepository;
import com.example.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FileServiceImpl implements FileService {

    @Autowired
    private FileRepository fileRepository;

    public void save(int id) {
        fileRepository.insertNr(id);
    }

    @Override
    public void save(Filefold filefold) {

    }

    @Override
    public Filefold findAll() {
        return null;
    }


    public List<Filefold> getFileFold() {
        return fileRepository.findAll();
    }
}
