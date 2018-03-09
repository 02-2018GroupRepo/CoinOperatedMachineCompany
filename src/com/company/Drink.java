package com.company;

public class Drink extends Product {

    private boolean isCan;

    public Drink(String uuid, String name, String description, double wholesalePrice, double retailPrice, boolean bottleType) {
        super(uuid, name, description, wholesalePrice, retailPrice);
        this.isCan = bottleType;
    }

    public boolean isCan() {
        return isCan;
    }
}
