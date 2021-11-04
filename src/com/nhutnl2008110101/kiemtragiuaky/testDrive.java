package com.nhutnl2008110101.kiemtragiuaky;

public class testDrive {
    public static void main(String[] args) {
        Nguoi nguoi = new Nguoi();
        nguoi.setHoTen("ALEX CHANG");
        nguoi.setDiaChi("157 BONG SON");
        nguoi.xuat();
        System.out.println("---------------------");
        HocVien hocVien = new HocVien();
        hocVien.setDiemMonhoc1(7);
        hocVien.setDiemMonhoc2(8);
        hocVien.setSoLuongHv(300);
        hocVien.xuat();
        System.out.println("---------------------------");
        NhanVien nv = new NhanVien();
        nv.setHeSoluong(6);
        nv.xuat();
        System.out.println("------------------------");
        Khachhang khachhang = new Khachhang();
        khachhang.setTenCongty("LEO COMRATATION");
        khachhang.setDiaChi("189 DUONG BONG SON");
        khachhang.xuat();
    }
    
}
