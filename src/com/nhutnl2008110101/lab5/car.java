package com.nhutnl2008110101.lab5;

import java.util.Scanner;

public class car {
    String con;//Car Owner's Name tên chủ xe
    String license;//Giấy phép
    String vehicles;//dòng xe
    String proCom;//Production Company hãng sản xuất
    double fuelCap;//Dung tích xăng
    double maxSpeed;//Tốc độ tối đa
    Scanner sc = new Scanner(System.in);

    car(){

    }

    void enterCar()
    {
        System.out.println("-----Enter Infomation-----");
        System.out.println("Enter Car Owner's Name : ");
        con = sc.next();
        System.out.println("Enter License : ");
        license = sc.next();
        System.out.println("Enter Vehicles : ");
        vehicles = sc.next();
        System.out.println("Enter Production Company : ");
        proCom = sc.next();
        System.out.println("Enter Fuel Capacity : ");
        fuelCap = sc.nextDouble();
        System.out.println("Enter Max Speed : ");
        maxSpeed = sc.nextDouble();
        System.out.println("-----------------------------------");
    }

    void printCar()
    {
        System.out.println("Car Owner's Name : "+con);
        System.out.println("License : "+license);
        System.out.println("Vehicles : "+vehicles);
        System.out.println("Production Company : "+proCom);
        System.out.println("Fuel Capacity : "+fuelCap);
        System.out.println("Max Speed : "+maxSpeed);
    }
    
}
