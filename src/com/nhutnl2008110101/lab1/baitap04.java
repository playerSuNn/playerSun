package com.nhutnl2008110101.lab1;

import java.util.Scanner;

public class baitap04 {
    public static void main(String[] args) {
        float a,b,c,delta;
        double canDelta;
        System.out.println("Nhập hệ số a,b,c của pt bậc 2:");
        Scanner sc = new Scanner(System.in);
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        delta = b*b - 4*a*c;
        canDelta = Math.sqrt(delta);
        System.out.println("Vậy delta có kết quả là:" + delta);
        System.out.println("Căn delta bằng :" + canDelta);
    }
    
}
