package com.nhutnl2008110101.lab8_2;

import java.util.ArrayList;
import java.util.Scanner;
import com.nhutnl2008110101.lab8_2.SanPham;

public class listSanpham {
    static ArrayList<SanPham> danhsachSP = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public void nhapDanhSach()
    {
        SanPham sanpham = new SanPham();
        sanpham.nhap();
        sc.nextLine();
        danhsachSP.add(sanpham);
        System.out.println(sanpham);
    

    }


    
}
