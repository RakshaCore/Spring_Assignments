package com.xworkz.door.dto;

public class SocksDTO {
    private String name;
    private String brand;
    private int price;
    private String color;

    public SocksDTO() {
        System.out.println("Created SocksDTO using no-arg constructor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
