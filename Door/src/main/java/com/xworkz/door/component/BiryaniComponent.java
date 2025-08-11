package com.xworkz.door.component;

import com.xworkz.door.dto.BiryaniDTO;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class BiryaniComponent {

    public BiryaniComponent() {
        System.out.println("Created BiryaniComponent using no-arg constructor");
    }

    @RequestMapping("/biryani")
    public String getBiryani(BiryaniDTO biryaniDTO) {
        System.out.println("Invoked getBiryani method in BiryaniComponent");
        System.out.println("Briyani type: "+biryaniDTO.getType());
        System.out.println("Spice-level: "+biryaniDTO.getSpice());
        System.out.println("Accompaniments : "+biryaniDTO.getAccompaniments());
        System.out.println("briyani size :"+biryaniDTO.getSize());
        System.out.println("Rice type: "+biryaniDTO.getRice());
        System.out.println("method of BriyaniComponent is called..");
        return "biryani.jsp";
    }
}
