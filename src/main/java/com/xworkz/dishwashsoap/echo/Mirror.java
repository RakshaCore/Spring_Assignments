package com.xworkz.dishwashsoap.echo;

import org.springframework.stereotype.Component;

@Component
public class Mirror {
    public Mirror() {
        System.out.println("Running Mirror in Echo");
    }
}
