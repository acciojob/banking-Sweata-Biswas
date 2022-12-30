package com.driver;

import java.util.Random;

public class BankAccount {

    private String name;
    private double balance;
    private double minBalance;

    public BankAccount(String name, double balance, double minBalance) {
        this.name = name;
        this.balance = balance;
        this.minBalance = minBalance;
    }

    public String generateAccountNumber(int digits, int sum) throws Exception{
        //Each digit of an account number can lie between 0 and 9 (both inclusive)
        //Generate account number having given number of 'digits' such that the sum of digits is equal to 'sum'
        //If it is not possible, throw "Account Number can not be generated" exception
        String accountNumber = generateAc(digits,sum);

        if(accountNumber.length()==0){
            throw new Exception("Account Number can not be generated");
        }
        return accountNumber;
    }

    public void deposit(double amount) {
        //add amount to balance
        this.balance = balance+amount;
    }

    public void withdraw(double amount) throws Exception {
        // Remember to throw "Insufficient Balance" exception, if the remaining amount would be less than minimum balance
        if(this.balance < amount){
            throw new Exception("Insufficient Balance");
        }
        this.balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
    private String generateAc(  int digit, int sum){
        if(digit>sum){
            return "";
        }
        int rem = sum % digit;
        if(digit< sum/9){
            return "";
        }
        if(digit == sum/9 && rem>0){
            return "";
        }
        String ACNo = "";
        while(sum > 0){
            if(sum >= 9){
                ACNo += "9";
                sum -= 9;
            }else{
                ACNo+= sum;

            }
        }


        return ACNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getMinBalance() {
        return minBalance;
    }

    public void setMinBalance(double minBalance) {
        this.minBalance = minBalance;
    }
}