package com.xworkz.dishwashsoap.initialize;

import com.xworkz.dishwashsoap.configuration.*;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DishWashSoapInitial extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{DWSConfig.class, DWSConfigu.class, DWSConfigur.class, DWSConfigurat.class, DWSConfiguration.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[0];
    }

    @Override
    protected String[] getServletMappings() {
        return new String[0];
    }
}
