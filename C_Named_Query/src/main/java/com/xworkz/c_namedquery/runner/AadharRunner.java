package com.xworkz.c_namedquery.runner;

import com.xworkz.c_namedquery.entity.AadharEntity;
import com.xworkz.c_namedquery.service.AadharService;
import com.xworkz.c_namedquery.service.AadharServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class AadharRunner {
    public static void main(String[] args) {
        List<AadharEntity> aadharEntityList = new ArrayList<>();
        aadharEntityList.add(new AadharEntity("Ragini", 23, 9111222333L, "ragini.d@example.com"));
        aadharEntityList.add(new AadharEntity("Nikhil", 25, 9222333444L, "nikhil.r@example.com"));
        aadharEntityList.add(new AadharEntity("Tanvi", 26, 9333444555L, "tanvi.k@example.com"));
        aadharEntityList.add(new AadharEntity("Aditya", 28, 9444555666L, "aditya.s@example.com"));
        aadharEntityList.add(new AadharEntity("Ishita", 22, 9555666777L, "ishita.j@example.com"));
        aadharEntityList.add(new AadharEntity("Rajat", 27, 9666777888L, "rajat.v@example.com"));
        aadharEntityList.add(new AadharEntity("Kriti", 24, 9777888999L, "kriti.z@example.com"));
        aadharEntityList.add(new AadharEntity("Farhan", 29, 9888999000L, "farhan.m@example.com"));
        aadharEntityList.add(new AadharEntity("Mitali", 21, 9000111222L, "mitali.n@example.com"));
        aadharEntityList.add(new AadharEntity("Varun", 30, 9011222333L, "varun.p@example.com"));
        aadharEntityList.add(new AadharEntity("Lavanya", 20, 9122333444L, "lavanya.t@example.com"));
        aadharEntityList.add(new AadharEntity("Siddharth", 26, 9233444555L, "siddharth.b@example.com"));
        aadharEntityList.add(new AadharEntity("Ankita", 23, 9344555666L, "ankita.f@example.com"));
        aadharEntityList.add(new AadharEntity("Dev", 27, 9455666777L, "dev.h@example.com"));
        aadharEntityList.add(new AadharEntity("Rhea", 24, 9566777888L, "rhea.q@example.com"));
        aadharEntityList.add(new AadharEntity("Mahesh", 25, 9677888999L, "mahesh.y@example.com"));
        aadharEntityList.add(new AadharEntity("Tanya", 22, 9788999000L, "tanya.x@example.com"));
        aadharEntityList.add(new AadharEntity("Parth", 28, 9899000111L, "parth.l@example.com"));
        aadharEntityList.add(new AadharEntity("Simran", 21, 9001222333L, "simran.u@example.com"));
        aadharEntityList.add(new AadharEntity("Gaurav", 29, 9112333444L, "gaurav.e@example.com"));

        AadharService aadharService=new AadharServiceImpl();
        System.out.println("Find by name : ");
        AadharEntity entity = aadharService.findByName("Manoj");
        System.out.println(entity);

    }
}
