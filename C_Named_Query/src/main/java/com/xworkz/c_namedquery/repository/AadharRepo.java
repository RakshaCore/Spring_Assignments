package com.xworkz.c_namedquery.repository;

import com.xworkz.c_namedquery.entity.AadharEntity;

import java.util.List;

public interface AadharRepo {
    boolean addAll(List<AadharEntity> list);

    AadharEntity findByName(String name);
}
