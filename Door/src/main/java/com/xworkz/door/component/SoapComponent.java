package com.xworkz.door.component;

import com.xworkz.door.dto.SoapDTO;
import com.xworkz.door.dto.SocksDTO;

public class SoapComponent {

    public SoapComponent() {
        System.out.println("Created SoapComponent using no-arg constructor");
    }

    public String getSoap(SoapDTO soapDTO) {
        System.out.println("Invoked getSoap method in SoapComponent");
        System.out.println("Name: " + soapDTO.getName());
        System.out.println("Brand: " + soapDTO.getBrand());
        System.out.println("Price: " + soapDTO.getPrice());
        System.out.println("Fragrance: " + soapDTO.getFragrance());
        return "soap.jsp";
    }
}
