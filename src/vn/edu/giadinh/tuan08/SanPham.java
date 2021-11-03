package vn.edu.giadinh.tuan08;

import java.util.Scanner;

public class SanPham {

    private String tenSP;
    private double donGia;
    private double giamGia;

    static Scanner sc = new Scanner(System.in);

    SanPham(){

    }
    
    public void nhapInfo(){
        System.out.println("Tên sản phẩm : ");
        tenSP = sc.nextLine();
        System.out.println("Đơn giá :");
        donGia = sc.nextDouble();
        System.out.println("Giảm giá :");
        giamGia = sc.nextDouble();
    }

    public void xuatInfo(){
        System.out.println("Đơn giá");
        System.out.println("-------------------");
        System.out.println("Tên sản phẩm: "+tenSP);
        System.out.println("Đơn giá : "+donGia);
        System.out.println("Giảm giá : "+giamGia);
    }
}
