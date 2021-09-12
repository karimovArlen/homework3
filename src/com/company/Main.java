package com.company;

public class Main {


    public static void main(String[] args) {
        System.out.println("\uD83D\uDCB0");
        System.out.println("Demir Bank");
        System.out.println("Выберите язык обшения:" +
                "Русский ️ " +
                "Кыргызча ️ " +
                "English ✔️ ");
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(20000);

        System.out.println("====================");


        while (true) {
            try {
                if (bankAccount.getAmount() != 0) {
                    bankAccount.withDraw(6000);
                    System.out.println();
                }
            } catch (LimitException limitException) {
                try {
                    System.out.println("The account balance is " + bankAccount.getAmount());
                    bankAccount.withDraw((int) bankAccount.getAmount());
                    System.out.println("\nYour account balance" + bankAccount.getAmount());
                } catch (LimitException e) {
                    System.out.println(e.getMessage());
                }
            }
        }

    }
}
