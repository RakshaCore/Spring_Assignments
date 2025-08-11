package com.xworkz.door.component;

import com.xworkz.door.dto.ShoeDTO;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class ShoeComponent {
    public ShoeComponent() {
        System.out.println("Created ShoeComponent using no-arg constructor");
    }

    @RequestMapping("/shoe")
    public String getShoe(ShoeDTO shoeDTO) {
        System.out.println("Invoked getShoe method in ShoeComponent");
        System.out.println("Shoe Brand: " + shoeDTO.getBrand());
        System.out.println("Shoe Size: " + shoeDTO.getSize());
        System.out.println("Shoe Color: " + shoeDTO.getColor());
        System.out.println("Shoe Material: " + shoeDTO.getMaterial());
        return "shoe.jsp";
    }
}
