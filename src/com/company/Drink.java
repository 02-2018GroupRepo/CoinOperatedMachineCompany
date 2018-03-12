package com.company;

public abstract class Drink extends Products {

    private boolean isCan;


    public Drink(String uuid, String name, String description, double wholesalePrice, double retailPrice) {
        super(uuid, name, description, wholesalePrice, retailPrice);

    }

    public void setCan(boolean can) {
        isCan = can;


    }



}
