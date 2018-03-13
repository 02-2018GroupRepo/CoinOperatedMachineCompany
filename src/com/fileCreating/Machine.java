package com.fileCreating;

abstract class Machine {

    private String location;
    private String machine_id;
    private Coins_TotalCoinsInMachine coin = new Coins_TotalCoinsInMachine();

    public Machine(String location, String machine_id) {
        this.location = location;
        this.machine_id = machine_id;
    }

    public void setLocation(String location) {
        this.location = location.toLowerCase();
    }

    public String getLocation() {
        return location;
    }

    public String getMachine_id() {
        return machine_id;
    }

    public void setCoin(Coins_TotalCoinsInMachine coin) {
        this.coin = coin;
    }

    public Coins_TotalCoinsInMachine getCoin() {
        return coin;
    }
}

