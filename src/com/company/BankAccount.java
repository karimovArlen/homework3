package com.company;

public class BankAccount {
    private double amount;


    public double getAmount() {
        return amount;
    }

    public void deposit(double sum){
        amount += sum;
        System.out.println("You have funded your account to " + sum);
        System.out.println("Your balance is " + amount);
    }

    public void withDraw (int sum) throws LimitException {
        if (sum > amount){
            throw new LimitException("You don't have enough funds in your account", amount);
        }
        amount -=sum;
        System.out.println("You have withdrawn from the account: "+ sum);
    }
}