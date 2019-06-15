package com.example.demo.service;

import com.example.demo.pojo.Filefold;
import com.example.demo.repository.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


public interface FileService {

    public void save(Filefold filefold);

    public boolean batchSave(Filefold filefold);

}
