package com.nhutnl2008110101.lab5;

import java.util.Scanner;

public class customer {
    String staffName;//tên nhân viên
    String birthDay;//ngày sinh
    String address;//địa chỉ
    String workPart;//bộ phận làm việc
    double wage;//lương
    Scanner sc = new Scanner(System.in);

    //Method

    customer(){

    }

    void enterCus()
    {
        System.out.println("Enter Staff's Name : ");
        staffName = sc.next();
        System.out.println("Enter Birth Day : ");
        birthDay = sc.next();
        System.out.println("Enter Staff's Address : ");
        address = sc.next();
        System.out.println("Enter Working Parts : ");
        workPart = sc.next();
        System.out.println("Enter Staff's Wage : ");
        wage = sc.nextDouble();
        System.out.println("-----------------------------");
    }

    void printCus()
    {
        System.out.println("Staff's Name : "+staffName);
        System.out.println("Birth Day : "+birthDay);
        System.out.println("Address : "+address);
        System.out.println("Working Part : "+workPart);
        System.out.println("Wage : "+wage);
    }
}
