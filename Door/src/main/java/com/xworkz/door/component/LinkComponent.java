package com.xworkz.door.component;

import com.xworkz.door.dto.LinkDTO;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class LinkComponent {
    public LinkComponent() {
        System.out.println("Created LinkComponent using no-arg constructor");
    }

    @RequestMapping("/link")
    public String getLink(LinkDTO linkDTO) {
        System.out.println("Invoked getLink method in LinkComponent");
        System.out.println("First name"+linkDTO.getFname());
        System.out.println("Last Name"+linkDTO.getLname());
        System.out.println("Number"+linkDTO.getNumber());
        System.out.println("Email"+linkDTO.getEmail());
        System.out.println("Address"+linkDTO.getAddress());
        return "link.jsp";
    }
}
