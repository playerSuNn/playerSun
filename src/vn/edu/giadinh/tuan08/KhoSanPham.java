package vn.edu.giadinh.tuan08;

import java.util.ArrayList;
import java.util.Scanner;

public class KhoSanPham {

    static ArrayList<SanPham> dsSanpham = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public void nhapDanhSach(){
        while(true)
        {
            SanPham sanpham = new SanPham();
            sanpham.nhapInfo();

            sc.nextLine();
            dsSanpham.add(sanpham);

            System.out.println("Bạn có muốn mua thêm: (yes/no) ? ");
            if(sc.nextLine().equals("no"))
            break;
        }
    }

    public void xuatDanhSach()
    {
        for(SanPham sanpham: dsSanpham)
        {
            sanpham.xuatInfo();
        }
    }

    /*public void timTheoTen(){
        System.out.println("Tên cần tìm là: ");
        for(SanPham sanpham: dsSanpham)
        {
            if(sc.nextLine().equals(sanpham.equals()))
            sanpham.xuatInfo();
        }
    }*/
    
}
