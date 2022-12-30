package com.driver;

public class StudentAccount extends BankAccount{

    String  institutionName;

    public StudentAccount(String name, double balance, String  institutionName) {
        //minimum balance is 0 by default

        super(name,balance,0);
        this.institutionName = institutionName;

    }
 public String getInstitutionName() {
        return institutionName;
    }

<<<<<<< HEAD
    public String getInstitutionName() {
        return institutionName;
    }

=======
>>>>>>> 4a52badb5959c09c67965fe0ee4911f27ca741ee
    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }
}
