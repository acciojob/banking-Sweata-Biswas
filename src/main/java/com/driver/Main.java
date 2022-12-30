package com.driver;

public class Main {
    public static void main(String[] args) throws Exception {

        BankAccount bankAccount = new CurrentAccount("Sweata",6000,"AABC");
        System.out.println(bankAccount.generateAccountNumber(3,30));
        bankAccount.deposit(300);
        bankAccount.withdraw(100);


    }
}