package com.xworkz.door.component;

import com.xworkz.door.dto.MilkDTO;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class MilkComponent {
    public MilkComponent() {
        System.out.println("Created MilkComponent using no-arg constructor");
    }

    @RequestMapping("/milk")
    public String getMilk(MilkDTO milkDTO) {
        System.out.println("Invoked getMilk method in MilkComponent");
        System.out.println("Milk Type"+milkDTO.getType());
        System.out.println("Milk Qauntiy"+milkDTO.getQuantity());
        System.out.println("Milk Fat COntent"+milkDTO.getFatContent());
        System.out.println(""+milkDTO.getPrice());
        return "milk.jsp";
    }
}
