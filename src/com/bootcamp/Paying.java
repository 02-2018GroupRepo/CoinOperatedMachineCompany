package com.bootcamp;

import java.util.Map;

public interface Paying {

    public double getPrice(Map<Double, Integer> product);
    public void selection();
    public void insert(Double coin);
    public void returnMoney();
}
