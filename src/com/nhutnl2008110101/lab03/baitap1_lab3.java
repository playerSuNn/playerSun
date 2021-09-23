package com.nhutnl2008110101.lab03;

import java.util.Scanner;

public class baitap1_lab3 {
    public static void main(String[] args) {
        int n;
        System.out.println("Nhập số cần kiểm tra");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if(n>0)
        {
            if(kiemtrasonguyento(n)==1)
                System.out.println(n +" Là số nguyên tố");
            else
                System.out.println(n +" Không phải là số nguyên tố");
        }
    }
    public static int kiemtrasonguyento(int n)
    {
        int dem=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
                dem++;
        }
        if(dem==2)
            return 1;
        else return 0;
    }
    
}
