package com.xworkz.c_namedquery.service;

import com.xworkz.c_namedquery.entity.AadharEntity;

import java.util.List;

public interface AadharService {
    boolean addAll(List<AadharEntity>entityList);
    AadharEntity findByName(String name);
}
