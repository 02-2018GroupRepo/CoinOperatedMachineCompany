package com.fileCreating;

public class Operator {
    private String password;

    public boolean checkPassWord(String password){
        return this.password.equals(password);
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void checkThisMachineTotalMoney(VendingMachine machine){
        System.out.println(machine.getAmountMoney());
    }

    public void setTotalNumCoins(int numNickels, int numDimes, int numQuarters, VendingMachine thisMachine){
        thisMachine.setTotalNumNickels(numNickels);
        thisMachine.setTotalNumDimes(numDimes);
        thisMachine.setTotalNumQuarters(numQuarters);
    }
}
