package com.xworkz.door.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DoorConfigInitial extends AbstractAnnotationConfigDispatcherServletInitializer {
    public DoorConfigInitial()
    {
        System.out.println("Configuration is created!");
    }
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[0];
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/on","/soap","/butter","/bottle","/shoe","/chappal","/socks","/chutney",
                "/onion","/milk","/curry","/biryani","/parota","/egg"};
    }
}
