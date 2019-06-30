package com.example.demo.mvc.service;

import com.example.demo.mvc.pojo.Filefold;


public interface FileService {

    public void save(Filefold filefold);

    public boolean batchSave(Filefold filefold);

}
