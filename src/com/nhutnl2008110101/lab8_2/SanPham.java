package com.nhutnl2008110101.lab8_2;

import java.util.Scanner;

public class SanPham {
    private String tenSP;
    private double donGia;
    private double giamGia;
    private double thueNhapKhau;

    public SanPham()
    {

    }

    protected void xuat(){
        System.out.println("Xuất hóa đơn");
        System.out.println("--------------------");
        System.out.println("Tên sản phẩm : "+tenSP);
        System.out.println("Đơn giá : "+donGia+" VND");
        System.out.println("Giảm giá : "+giamGia+" VND");
        System.out.println("Thành tiền : "+(donGia-giamGia)+" VND");
    }

    protected void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên sản phẩm:");
        tenSP = sc.nextLine();
        System.out.println("Nhập Đơn giá: ");
        donGia = sc.nextDouble();
        System.out.println("Số tiền được giảm: ");
        giamGia = sc.nextDouble();
    }

    public SanPham(String tenSanpham , double donGia , double giamGia)
    {
        this.tenSP = tenSanpham;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public SanPham(String tenSanpham , double donGia)
    {
        this(tenSanpham, donGia, 0);
    }

    protected void getThueNhapKhau(){
        thueNhapKhau = donGia*(10/100);
        System.out.println("Thuế nhập khẩu : "+thueNhapKhau+" VND");
    }
}
