package com.xworkz.door.component;

import com.xworkz.door.dto.SocksDTO;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class SocksComponent {
    public SocksComponent() {
        System.out.println("Created SocksComponent using no-arg constructor");
    }

    @RequestMapping("/socks")
    public String getSocks(SocksDTO socksDTO) {
        System.out.println("Invoked getSocks method in SocksComponent");
        System.out.println("Socks Name: " + socksDTO.getName());
        System.out.println("Socks Brand: " + socksDTO.getBrand());
        System.out.println("Socks Price: " + socksDTO.getPrice());
        System.out.println("Socks Color: " + socksDTO.getColor());

        return "socks.jsp";
    }
}
