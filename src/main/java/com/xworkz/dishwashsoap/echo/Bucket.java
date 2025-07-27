package com.xworkz.dishwashsoap.echo;

import org.springframework.stereotype.Component;

@Component
public class Bucket {
    public Bucket() {
        System.out.println("Running Bucket in Echo");
    }
}
