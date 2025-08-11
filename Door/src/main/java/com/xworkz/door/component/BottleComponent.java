package com.xworkz.door.component;

import com.xworkz.door.dto.BottleDTO;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class BottleComponent {
    public BottleComponent() {
        System.out.println("Created BottleComponent using no-arg constructor");
    }

    @RequestMapping("/bottle")
    public String getBottle(BottleDTO bottleDTO) {
        System.out.println("Invoked getBottle method in BottleComponent");
        System.out.println("Bottle material :"+bottleDTO.getMaterial());
        System.out.println("Bottle capacity :"+bottleDTO.getCapacity());
        System.out.println("Bottle color :"+bottleDTO.getColor());
        System.out.println("Bottle shape :"+bottleDTO.getShape());
        System.out.println("Bottle price :"+bottleDTO.getPrice());
        return "bottle.jsp";
    }
}
