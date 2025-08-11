package com.xworkz.chair.repository;

import com.xworkz.chair.entity.ChairEntity;

public interface ChairRepository {

    boolean save(ChairEntity chairEntity);
    ChairEntity getChairEntityByID(int id);
    boolean updateChairEntityByID(int id,String color);
    void deleteChairEntityById(int id);

}
