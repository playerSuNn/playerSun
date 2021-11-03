package com.nhutnl2008110101.lab8_2;

public class Vuong extends ChuNhat{
    private double canh;

    Vuong(){}

    protected void xuat(){
        System.out.println("---THÔNG TIN HÌNH VUÔNG");
        System.out.println("CHIỀU DÀI CẠNH : "+getChieuDai());
        System.out.println("CHU VI : "+(getChieuDai()*4));
        System.out.println("DIỆN TÍCH : "+(getChieuDai()*getChieuDai()));
    }

    
}
