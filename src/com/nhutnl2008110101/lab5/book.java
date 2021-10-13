package com.nhutnl2008110101.lab5;

import java.util.Scanner;

public class book {
    double price;// giá sách
    int quantity;//số lượng
    int yearPub;//năm sản xuất
    String companyPub;//nhà sản xuất
    String type;//loại sách
    String titlebook;//tên sách
    Scanner sc = new Scanner(System.in);

    book(){

    }

    void enter()
    {
        System.out.println("Enter Book Title : ");
        titlebook = sc.next();
        System.out.println("Enter Price : ");
        price = sc.nextDouble();
        System.out.println("Quantity : ");
        quantity = sc.nextInt();
        System.out.println("Enter Type : ");
        type = sc.next();
        System.out.println("Enter Publishing Company : ");
        companyPub = sc.next();
        System.out.println("Enter Publishing year : ");
        yearPub = sc.nextInt();
        System.out.println("=====#####=====");
    }

    void print()
    {
        System.out.println("Book Title : "+titlebook);
        System.out.println("Price : "+price);
        System.out.println("Quantity : "+quantity);
        System.out.println("Type : "+type);
        System.out.println("Publishing Company : "+companyPub);
        System.out.println("Publishing Year : "+yearPub);
    }
    
}
