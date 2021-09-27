package com.nhutnl2008110101.lab03;

import java.util.Scanner;

public class baitap4_lab3 {
    public static void main(String[] args) {
        System.out.println("Nhập số lượng Sinh viên:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] tenSv = new String[n];
        float[] diemSv = new float[n];
        nhapTenvaDiemSv(n,tenSv,diemSv);
        System.out.println("Xuất Tên và Điểm ");
        xuatdiemSV(n,tenSv,diemSv);
        System.out.println("Xét học lực ");
        xetHoclucSv(n,tenSv,diemSv);
    }
    public static void nhapTenvaDiemSv(int n, String tenSv[], float diemSv[] ){
        for(int i = 0; i < n ; i++)
        {
            System.out.printf("STT:"+ (i+1) +" Tên:");
            Scanner sc = new Scanner(System.in);
            tenSv[i] = sc.nextLine();
            System.out.printf("Điểm:");
            diemSv[i] = sc.nextFloat();
        }
    }
    public static void xuatdiemSV(int n, String tenSv[], float diemSv[] ){
        for(int i = 0; i < n; i++)
        {
            System.out.println("STT : "+(i+1)+" Tên : " +(tenSv[i]));
            System.out.println("Điểm của "+(tenSv[i])+" là : "+diemSv[i]);
        }
    }
    public static void xetHoclucSv(int n, String tenSv[], float diemSv[]){
        for(int i = 0 ;i < n; i++)
        {
            if( diemSv[i] < 5 )
            {
                System.out.println("Tên : "+tenSv[i]+". Điểm : "+diemSv[i]+"\nHọc lực : Yếu");
            }
            else if(diemSv[i] >= 5 && diemSv[i] < 6.5 )
            {
                System.out.println("Tên : "+tenSv[i]+". Điểm : "+diemSv[i]+"\nHọc lực : Trung Bình");
            }
            else if(diemSv[i] >= 6.5 && diemSv[i] < 7.5 )
            {
                System.out.println("Tên :"+tenSv[i]+". Điểm : "+diemSv[i]+"\nHọc lực : Khá");
            }
            else if(diemSv[i] >= 7.5 && diemSv[i] < 9)
            {
                System.out.println("Tên :"+tenSv[i]+". Điểm : "+diemSv[i]+"\nHọc lực : Giỏi");
            }
            if(diemSv[i] >= 9 && diemSv[i] <= 10)
            {
                System.out.println("Tên : "+(tenSv[i])+". Điểm : "+(diemSv[i])+"\nHọc lực : Xuất sắc");
            }
        }
    }
    
}
