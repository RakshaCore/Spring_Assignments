package com.xworkz.door.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.xworkz.door")
public class DoorConfig {
    public DoorConfig()
    {
        System.out.println("Created DoorConfig using no-arg constructor");
    }
}
