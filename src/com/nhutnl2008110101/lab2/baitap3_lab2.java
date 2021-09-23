package com.nhutnl2008110101.lab2;

import java.util.Scanner;

public class baitap3_lab2 {
    public static void main(String[] args) {
        float soDien;
        double moNey;
        System.out.println("Số điện sử dụng của tháng là:");
        Scanner sc = new Scanner(System.in);
        soDien = sc.nextFloat();
        if(soDien <= 50){
            moNey = soDien*1000;
            System.out.println("Số tiền điện phải trả là:" + moNey);
        }
        else{
            moNey = 50*1000 + (soDien - 50)*1200;
            System.out.println("Số tiền điện là:" + moNey);
        }

    }
    
}
