package com.xworkz.door.component;

import com.xworkz.door.dto.EggDTO;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class EggComponent {
    public EggComponent() {
        System.out.println("Created EggComponent using no-arg constructor");
    }

    @RequestMapping("/egg")
    public String getEgg(EggDTO eggDTO) {
        System.out.println("Invoked getEgg method in EggComponent");
        System.out.println("Egg Size"+eggDTO.getSize());
        System.out.println("Egg Type"+eggDTO.getType());
        System.out.println("Egg Color"+eggDTO.getColor());
        System.out.println("Egg Quantity"+eggDTO.getQuantity());
        return "egg.jsp";
    }
}
