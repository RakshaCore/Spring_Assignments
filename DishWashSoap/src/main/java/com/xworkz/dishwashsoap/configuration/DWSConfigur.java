package com.xworkz.dishwashsoap.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.io.*;
import java.util.Base64;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Configuration
@ComponentScan("com.xworkz.dishwashsoap.fusion")
public class DWSConfigur {
    public DWSConfigur() {
        System.out.println("Running DWSConfigar in DishwashSoap");
    }
    @Bean
    public Base64.Decoder decoder(){
        System.out.println("-----------------------------------------------------------");
        System.out.println("Running bean method decoder");
        return Base64.getDecoder();
    }

    @Bean
    public Pattern pattern(){
        System.out.println("Running bean method pattern");
        return Pattern.compile(".*");
    }
    @Bean
    public Matcher matcher(){
        System.out.println("Running bean method matcher");
        return Pattern.compile("X").matcher("x");
    }
    @Bean
    public BufferedReader bufferedReader(){
        System.out.println("Running bean method bufferedReader");
        return new BufferedReader(new InputStreamReader(System.in));
    }
    @Bean
    public InputStreamReader inputStreamReader(){
        System.out.println("Running bean method inputStreamReader");

        return new InputStreamReader(System.in);
    }
    @Bean
    public BufferedWriter bufferedWriter(){
        System.out.println("Running bean method bufferedWriter");
        return new BufferedWriter(new OutputStreamWriter(System.out));
    }
    @Bean
    public OutputStreamWriter outputStreamWriter(){
        System.out.println("Running bean method outputStreamWriter");
        return new OutputStreamWriter(System.out);
    }
    @Bean
    public DataInputStream dataInput(){
        System.out.println("Running bean method dataInput");
        return new DataInputStream(System.in);
    }
    @Bean
    public DataOutputStream dataOutputStream(){
        System.out.println("Running bean method dataOutputStream");
        return new DataOutputStream(System.out);
    }
    @Bean
    public ObjectOutputStream outputStream() throws IOException {
        System.out.println("Running bean method outputStream");
        return new ObjectOutputStream(System.out);
    }

}
