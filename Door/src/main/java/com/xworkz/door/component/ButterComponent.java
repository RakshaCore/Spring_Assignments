package com.xworkz.door.component;

import com.xworkz.door.dto.ButterDTO;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class ButterComponent {
    public ButterComponent() {
        System.out.println("Created ButterComponent using no-arg constructor");
    }

    @RequestMapping("/butter")
    public String getButter(ButterDTO butterDTO) {
        System.out.println("Butter type: "+butterDTO.getType());
        System.out.println("Butter fatContent: "+butterDTO.getFatContent());
        System.out.println("Butter saltType: "+butterDTO.getSaltType());
        System.out.println("Butter packageSize: "+butterDTO.getPackageSize());
        System.out.println("Butter brand: "+butterDTO.getBrand());
        System.out.println("Invoked getButter method in ButterComponent");
        return "butter.jsp";
    }
}
