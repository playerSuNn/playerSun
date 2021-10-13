package com.nhutnl2008110101.lab5;

import java.util.Scanner;

public class account {
    String accName;//tên chủ tài khoản
    int accNumber;//số tài khoản
    double accBalance;
    Scanner sc = new Scanner(System.in);

    account(){

    }

    void enterAcc()
    {
        System.out.println("Enter Account Name : ");
        accName = sc.next();
        System.out.println("Enter Account Number : ");
        accNumber = sc.nextInt();
        System.out.println("Enter Account Balance : ");
        accBalance = sc.nextDouble();
    }

    void printAcc()
    {
        System.out.println("Account Name : "+accName);
        System.out.println("Account Number : "+accNumber);
        System.out.println("Account Balance : "+accBalance);
    }
}
