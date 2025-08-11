package com.xworkz.door.component;

import com.xworkz.door.dto.CurryDTO;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class CurryComponent {
    public CurryComponent() {
        System.out.println("Created CurryComponent using no-arg constructor");
    }

    @RequestMapping("/curry")
    public String getCurry(CurryDTO curryDTO) {
        System.out.println("Invoked getCurry method in CurryComponent");
        System.out.println("Curry:"+curryDTO.getColor());
        System.out.println(curryDTO.getMainIngredient());
        System.out.println(curryDTO.getName());
        System.out.println(curryDTO.getQuantity());
        System.out.println(curryDTO.getSpiceLevel());
        return "curry.jsp";
    }
}
