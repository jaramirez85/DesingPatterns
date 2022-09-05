package edu.meli.desingpatterns.adapter.service;

public class BankData {

    private int account;
    private String name;
    private double balance;
    private String type;

    public BankData(int account, String name, double balance, String type) {
        this.account = account;
        this.name = name;
        this.balance = balance;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getAccount() {
        return account;
    }

    public double getBalance() {
        return balance;
    }
    public String getType() {
        return type;
    }
}
