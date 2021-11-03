package com.nhutnl2008110101.lab8_2;

public class testSanPham {
    public static void main(String[] args) {
        SanPham sanpham01 = new SanPham();
        sanpham01.nhap();
        sanpham01.getThueNhapKhau();
        SanPham sanpham02 = new SanPham();
        sanpham02.nhap();
        sanpham02.getThueNhapKhau();
        // xuasats hóa đơn
        sanpham01.xuat();
        sanpham02.xuat();

        SanPham sp1 = new SanPham("AoKhoac", 30000, 1275);
        
        SanPham sp2 = new SanPham("AoHoodie", 10000);
            //xuát hóa đơn
        sp1.xuat();
        sp2.xuat();


    }
    
}
