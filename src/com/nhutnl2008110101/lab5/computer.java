package com.nhutnl2008110101.lab5;

import java.util.Scanner;

public class computer {
    String producer;//nhà sản xuất
    int yom;//năm sản xuất - year of manufacture
    String os;//operating system - hệ điều hành 
    double price;//giá bán
    int waper;//waranty period - thời gian bảo hành
    String pcInfo;//thông tin máy tính
    Scanner sc = new Scanner(System.in);

    computer(){

    }

    void enterPC()
    {
        System.out.println("Enter Producer : ");
        producer = sc.next();
        System.out.println("Enter Year of Manufacture : ");
        yom = sc.nextInt();
        System.out.println("Enter Operating System : ");
        os = sc.next();
        System.out.println("Enter Price : ");
        price = sc.nextDouble();
        System.out.println("Enter Waranty Period : ");
        waper = sc.nextInt();
        System.out.println("--------------------------------");
    }

    void printPC()
    {
        System.out.println("Producer : "+producer);
        System.out.println("Year of Manufacture : "+yom);
        System.out.println("Operating System : "+os);
        System.out.println("Price : "+price);
        System.out.println("Waranty Period : "+waper);
        System.out.println("Computer Infomation : Ram 8GB , intelCore i5");
    }
    
}
