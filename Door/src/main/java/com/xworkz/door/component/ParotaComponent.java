package com.xworkz.door.component;

import com.xworkz.door.dto.ParotaDTO;

public class ParotaComponent {

    public ParotaComponent() {
        System.out.println("Created ParotaComponent using no-arg constructor");
    }

    public String getParota(ParotaDTO parotaDTO) {
        System.out.println("Invoked getParota method in ParotaComponent");
        System.out.println("Parota Type: " + parotaDTO.getType());
        System.out.println("Parota Size: " + parotaDTO.getSize());
        System.out.println("Is Parota Stuffed: " + parotaDTO.getIsStuffed());
        System.out.println("Parota Flour Type: " + parotaDTO.getFlourType());
        return "parota.jsp";
    }
}
