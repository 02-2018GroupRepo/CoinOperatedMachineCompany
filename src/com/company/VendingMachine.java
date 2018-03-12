package com.company;

import java.util.List;

public interface VendingMachine{
        public long selectProductAndGetPrice();
        public void insertCoins();
        public List<Coins> refund();

        public Compart collectProductAndChange();



    }

