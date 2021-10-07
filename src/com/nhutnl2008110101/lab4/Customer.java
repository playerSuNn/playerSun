package com.nhutnl2008110101.lab4;

import java.util.Scanner;

public class Customer {
    //Thuộc tính - data - attribute
    String[] userName = new String[99];
    String[] adressIP = new String[99];
    int soKhachhang;
    Customer()
    {
        int n = soKhachhang;
    }
    void getName()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter UserName : ");
        userName[1] = sc.nextLine();
        for(int i = 0 ; i < soKhachhang ; i++)
        {
            //Scanner sc = new Scanner(System.in);
            System.out.println("No."+(i+1)+":"+userName);
            userName[i] = sc.nextLine();
        }
    }
    void getAddress()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Address:");
        adressIP[1] = sc.nextLine();
        for(int i = 0 ; i < soKhachhang ; i++)
        {
            //Scanner sc = new Scanner(System.in);
            System.out.println("Enter Address no."+(i+1)+":"+adressIP);
            adressIP[i] = sc.nextLine();
        }
    }
    void showInfo_Cus()
    {
        System.out.println("User Name :"+userName[1]);
        System.out.println("Adress :"+adressIP[1]);
        for(int i = 0 ; i < soKhachhang ; i++)
        {
            System.out.println("No."+(i+1)+":"+userName);
            System.out.println("Adress:"+adressIP[i]);
        }
    }
}
