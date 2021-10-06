package vn.edu.giadinh.tuan04;

import java.util.Scanner;

public class CT_MinhhoaKCT {
    public static void main(String[] args) {
        System.out.println("Please in about money input:");
        Scanner sc = new Scanner(System.in);
        int soTien = sc.nextInt();
        int soDu = 0;
        soDu = soDu + soTien;
        System.out.println("AccountNumber = " +soTien);
        System.out.println("AccountBalance = " +soDu);
        soDu = soDu - 50;
        System.out.println("AccountNumber =" +soTien);
        System.out.println("AccountBalance = " +soDu);
        soDu = soDu - 10;
        System.out.println("AccountNumber = " +soTien);
        System.out.println("AccountBalance = " +soDu);
        System.out.println("Please in about money!:");
        int drawTien = sc.nextInt();
        soDu = soDu - drawTien;
        System.out.println("Money after draw:"+soDu);
    }
    public static void show(int soTien, int soDu){
        System.out.println("AccountNumber = "+soTien);
        System.out.println("AccountBalance = "+soDu);
    }
    
}
