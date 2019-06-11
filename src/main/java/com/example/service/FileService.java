package com.example.service;

import com.example.pojo.Filefold;
import org.springframework.stereotype.Repository;

@Repository
public interface FileService {

    public void save(Filefold filefold);

}
