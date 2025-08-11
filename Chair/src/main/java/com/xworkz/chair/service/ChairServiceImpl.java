package com.xworkz.chair.service;

import com.xworkz.chair.entity.ChairEntity;
import com.xworkz.chair.repository.ChairRepository;
import com.xworkz.chair.repository.ChairRepositoryImpl;

public class ChairServiceImpl implements ChairService{
    @Override
    public boolean validateAndSave(ChairEntity chairEntity) {

        ChairRepository chairRepository = new ChairRepositoryImpl();

        return chairRepository.save(chairEntity);
    }
}
