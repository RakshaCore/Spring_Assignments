package com.xworkz.door.dto;

public class ShoeDTO {
    private String brand;
    private String material;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    private String size;
    private String color;

    public ShoeDTO() {
        System.out.println("Created ShoeDTO using no-arg constructor");
    }

    public ShoeDTO(String brand, String size, String color) {
        this.brand = brand;
        this.size = size;
        this.color = color;
        System.out.println("Created ShoeDTO using parameterized constructor");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
