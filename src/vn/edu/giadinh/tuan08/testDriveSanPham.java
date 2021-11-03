package vn.edu.giadinh.tuan08;

import java.util.Scanner;

public class testDriveSanPham {
    public static void main(String[] args) {
        KhoSanPham khosanpham = new KhoSanPham();
        Scanner sc = new Scanner(System.in);
        do
        {
            System.out.println("---THÔNG TIN SẢN PHẢM---");
            System.out.println("1.Chọn những sản phẩm cần mua ");
            System.out.println("2.Xuất hóa đơn những sản phẩm đó ");
            System.out.println("3.Tìm theo tên sản phẩm ");
            System.out.println("4.Kết thúc");
            System.out.println("--------------------------------------");

            int luaChon = sc.nextInt();
            switch(luaChon)
            {
                case 1:
                {
                    khosanpham.nhapDanhSach();
                };
                break;
                case 2:
                {
                    khosanpham.xuatDanhSach();
                };
                break;
                /*case 3:
                {
                    khosanpham.timTheoTen();
                };
                break;*/
                case 4:
                {
                    System.out.println("Kết Thúc");
                    System.exit(0);
                    break;
                }
            }
            System.out.println("Quay lại yes/no ");
            sc.nextLine();

        }
        while(sc.nextLine().equals("yes"));
    }
    
}
