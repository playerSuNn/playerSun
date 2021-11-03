package com.nhutnl2008110101.lab8_2;

public class testDrive {
    public static void main(String[] args) {
        ChuNhat chuNhat = new ChuNhat();
        chuNhat.setChieuDai(7);
        chuNhat.setChieuRong(5);
        chuNhat.xuat();
        System.out.println("-------------------");
        Vuong vuong = new Vuong();
        vuong.setChieuDai(5);
        vuong.xuat();
        System.out.println("--------------------");
        SinhVien sv = new SinhVien();
        sv.setHoTen("AlexChang");
        sv.setNganh("IT-IOT");
        sv.setDiem(6);
        sv.xuat();
        System.out.println("---------------------");
        SinhVienIT sVienIT = new SinhVienIT("AlexChang", "IT-IOT", 7.3, 5.2, 6.4, 8.5);
        sVienIT.xuatDiemSvIT();
        sVienIT.getDiem();
        System.out.println("----------------------");
        SinhVienBiz sBiz = new SinhVienBiz(7.7, 9.1);
        sBiz.xuatDiemSvBiz();
        sBiz.getDiem();
    }
    
}
