package com.xworkz.c_namedquery.service;

import com.xworkz.c_namedquery.entity.AadharEntity;
import com.xworkz.c_namedquery.repository.AadharRepo;
import com.xworkz.c_namedquery.repository.AadharRepoImpl;

import java.util.List;

public class AadharServiceImpl implements AadharService{
    @Override
    public boolean addAll(List<AadharEntity> entityList) {
        if (entityList != null){
            AadharRepo aadharRepo=new AadharRepoImpl();
            aadharRepo.addAll(entityList);
            return true;
        }

        return false;
    }

    @Override
    public AadharEntity findByName(String name) {
        if (name != null){
            AadharRepo aadharRepo=new AadharRepoImpl();
            return aadharRepo.findByName(name);
        }
        return null;
    }
}
