package com.firstspringboot.demo;

public class Account {

    public String accountName;
    public String accountNumber;
    public int balance;

    public Account(String accountName, String accountNumber, int balance){
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getBalance(CountryCode countryCode) {
        switch (countryCode){
            case KR:
                return balance;
            case EN:
                return balance / 1000;
            default:
                return 0;
        }
    }

    public void add(int money) {
        this.balance += money;
    }

    public int withdraw(int money){
        if(balance - money >= 0)
            this.balance -= money;
        else
            throw new IllegalArgumentException("not enough balance");

        return money;
    }
}
