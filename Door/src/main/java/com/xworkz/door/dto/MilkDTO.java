package com.xworkz.door.dto;

public class MilkDTO {
    private String Type;
    private int Quantity;
    private int FatContent;
    private int Price;

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public int getFatContent() {
        return FatContent;
    }

    public void setFatContent(int fatContent) {
        FatContent = fatContent;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }
}
