package com.nhutnl2008110101.lab03;

import java.util.Scanner;

public class baitap2_lab3part2 {
    public static void main(String[] args) {
        int luaChon;
        System.out.println("Nhập vào lựa chọn:");
        System.out.println("1.In ra màn hình 1 bảng nhân ");
        System.out.println("2.In ra màn hình 9 bảng nhân ");
        Scanner sc = new Scanner(System.in);
        luaChon = sc.nextInt();
        switch(luaChon)
        {
            case 1:inMotBangnhan();;break;
            case 2:inTatBangnhan();;break;
        }
    }
    static void inMotBangnhan()
    {
        int x,i;
        System.out.println("Nhập vào số tương ứng với bảng nhân muốn in:");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        for(i = 1;i <= 10;i++)
        {
            System.out.printf(" %d x %d = %d ,",x,i,x*i);
        }
    }
    static void inTatBangnhan()
    {
        int i,j;
        for(i = 1;i <= 10;i++)
        {
            System.out.println("\nBảng Nhân " +i);
            for(j = 1;j < 10;j++)
            {
                System.out.printf(" %d x %d = %d ,",i,j,i*j);
            }
        }
    }
    
}
