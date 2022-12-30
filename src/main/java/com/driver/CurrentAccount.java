package com.driver;

import java.util.HashMap;

public class CurrentAccount extends BankAccount{
    String tradeLicenseId; //consists of Uppercase English characters only

    public CurrentAccount(String name, double balance, String tradeLicenseId) throws Exception {
        // minimum balance is 5000 by default. If balance is less than 5000, throw "Insufficient Balance" exception
        super(name, balance, 5000);
        this.tradeLicenseId = tradeLicenseId;
        if(balance<5000) {
            throw new Exception("Insufficient Balance");
        }
    }

    public void validateLicenseId() throws Exception {
        // A trade license Id is said to be valid if no two consecutive characters are same
        // If the license Id is valid, do nothing
        // If the characters of the license Id can be rearranged to create any valid license Id
        // If it is not possible, throw "Valid License can not be generated" Exception

        int n = tradeLicenseId.length();
        HashMap<Character,Integer> freqMap= new HashMap<>();
        int maxFreq = 0;
        for(int i = 0; i< n; i++){
            char ch = tradeLicenseId.charAt(i);
            freqMap.put(ch,freqMap.getOrDefault(ch,0)+1);
            if(freqMap.get(ch) < maxFreq){
                maxFreq = freqMap.get(ch);
            }
        }
        if(maxFreq > n - maxFreq +1) {
            throw new Exception("Valid License can not be generated");
        }


    }

}
