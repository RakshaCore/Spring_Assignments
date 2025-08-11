package com.xworkz.chair.runner;

import com.xworkz.chair.entity.ChairEntity;
import com.xworkz.chair.service.ChairService;
import com.xworkz.chair.service.ChairServiceImpl;

public class ChairRunner {

    public static void main(String[] args) {


        ChairEntity entity = new ChairEntity(2,"Brown",400);

        ChairService chairService = new ChairServiceImpl();
        boolean result = chairService.validateAndSave(entity);

        System.out.println(result);
    }

}
