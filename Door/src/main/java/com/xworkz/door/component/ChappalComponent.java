package com.xworkz.door.component;

import com.xworkz.door.dto.ChappalDTO;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class ChappalComponent {
    public ChappalComponent() {
        System.out.println("Created ChappalComponent using no-arg constructor");
    }

    @RequestMapping("/chappal")
    public String getChappal(ChappalDTO chappalDTO) {
        System.out.println("Invoked getChappal method in ChappalComponent");
        System.out.println("Chappal size"+chappalDTO.getSize());
        System.out.println("Chappal color"+chappalDTO.getColor());
        System.out.println("Chappal Brand"+chappalDTO.getBrand());
        System.out.println("Chappal Type"+chappalDTO.getType());
        return "chappal.jsp";
    }
}
