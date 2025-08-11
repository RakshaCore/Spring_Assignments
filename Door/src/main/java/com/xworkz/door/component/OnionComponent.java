package com.xworkz.door.component;

import com.xworkz.door.dto.OnionDTO;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class OnionComponent {
    public OnionComponent() {
        System.out.println("Created OnionComponent using no-arg constructor");
    }

    @RequestMapping("/onion")
    public String getOnion(OnionDTO onionDTO) {
        System.out.println("Invoked getOnion method in OnionComponent");
        System.out.println("Onion Type"+onionDTO.getType());
        System.out.println("Color"+onionDTO.getColor());
        System.out.println("Weight"+onionDTO.getQuantity());
        System.out.println("Color"+onionDTO.getColor());
        return "onion.jsp";
    }
}
