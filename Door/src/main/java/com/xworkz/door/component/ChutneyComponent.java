package com.xworkz.door.component;

import com.xworkz.door.dto.ChappalDTO;
import com.xworkz.door.dto.ChutneyDTO;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class ChutneyComponent {

    public ChutneyComponent() {
        System.out.println("Created ChutneyComponent using no-arg constructor");
    }

    @RequestMapping("/chutney")
    public String getChutney(ChutneyDTO chutneyDTO) {
        System.out.println("Invoked getChutney method in ChutneyComponent");
        System.out.println("Chutney color"+chutneyDTO.getColor());
        System.out.println("Chutney Ingredients"+chutneyDTO.getMainIngredient());
        System.out.println("Chutney Quantity"+chutneyDTO.getQuantity());
        System.out.println("Chutney Type"+chutneyDTO.getType());
        System.out.println("Chutney Spice"+chutneyDTO.getSpiceLevel());
        return "chutney.jsp";
    }
}
