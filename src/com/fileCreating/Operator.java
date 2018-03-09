package com.fileCreating;

public class Operator {
    private String password;

    public boolean checkPassWord(String password){
        return this.password.equals(password);
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
