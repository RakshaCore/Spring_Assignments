package com.xworkz.door.dto;

public class SoapDTO {
    private String name;
    private String brand;
    private int price;
    private String fragrance;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SoapDTO() {
        System.out.println("Created SoapDTO using no-arg constructor");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getFragrance() {
        return fragrance;
    }

    public void setFragrance(String fragrance) {
        this.fragrance = fragrance;
    }

}
