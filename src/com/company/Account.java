package com.company;

public class Account {
    private int accountNumber ;
    private String userName;
    private double balance;
    private int pin;

    public Account(){

    }

    public Account(int accountNumber, String userName, double balance, int pin) {
        this.accountNumber = accountNumber;
        this.userName = userName;
        this.balance = balance;
        this.pin = pin;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

}
