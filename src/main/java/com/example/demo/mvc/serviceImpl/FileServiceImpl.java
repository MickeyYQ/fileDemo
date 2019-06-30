package com.example.demo.mvc.serviceImpl;

import com.example.demo.mvc.pojo.Filefold;
import com.example.demo.mvc.repository.FileRepository;
import com.example.demo.mvc.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Service
public class FileServiceImpl implements FileService {

    @Autowired
    private FileRepository fileRepository;

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public void save(Filefold filefold) {
        fileRepository.save(filefold);
    }

    @Transactional
    @Override
    public boolean batchSave(Filefold filefold) {
        boolean flag=false;
        try{
            entityManager.persist(filefold);
            flag = true;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return flag;
    }

}
