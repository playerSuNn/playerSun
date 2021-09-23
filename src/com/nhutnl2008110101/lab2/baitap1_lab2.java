package com.nhutnl2008110101.lab2;

import java.util.Scanner;

public class baitap1_lab2 {
    public static void main(String[] args) {
        float a,b;
        double nghiemX;
        System.out.println("Nhập hệ số a và b:");
        Scanner sc = new Scanner(System.in);
        a = sc.nextFloat();
        b = sc.nextFloat();
        if( a == 0 )
        {
            if(b == 0)
            {
                System.out.println("Phương trình vô số nghiệm");
            }
            else
            {
                System.out.println("Phương trình vô nghiệm ");
            } 
        }
        else 
        {
            nghiemX = -b/a;
            System.out.println("Phương trình có nghiệm X:" + nghiemX);
        }

    }
    
}
