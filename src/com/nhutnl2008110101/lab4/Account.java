package com.nhutnl2008110101.lab4;

public class Account {
    //attribute - thuộc tính - data
    int numberAccount;
    int numberBalance;

    //method - function

    Account(int a,int b)
    {
        numberAccount = a;
        numberBalance = b;
    }
    void showData(){
        System.out.println("Number account : "+numberAccount);
        System.out.println("Number balance : "+numberBalance);
    }
    void deposit(int ammount ){
        numberBalance += ammount;
    }
    void withdraw(int ammount){
        numberBalance -= ammount;
    }
}
    