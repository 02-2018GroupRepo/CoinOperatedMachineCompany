package com.fileCreating;

import java.util.Map;

public interface CoinOperator {
    public void selection(int shelf, int comparment);
    public void insertion(Double coin);
    public void returnMoeney();
    public Map<Double, Integer> purchased(Double price);
}
