package com.example.tasks;

public class BankClass {
    private static double balance;

    public static double deposit(double cash){
        balance += cash;
        return interest();
    }

    public static double withdrawl(double cash){
        balance -= cash;
        return  balance;
    }

    public static double interest(){
        if (balance > 0) {
            balance *= 1.1;
            balance = Math.round(balance * 100.0);
            balance /= 100.0;
        }
        return balance;
    }




}
