package com.xworkz.fan.runner;

import javax.persistence.Entity;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FanRunner {
    public static void main(String[] args) {
       EntityManagerFactory EMF= Persistence.createEntityManagerFactory("TestPersistence");
       if(EMF!=null)
       {
           System.out.println("Connection Built!");
       }
    }
}
