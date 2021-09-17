package vn.edu.giadinh.tuan02.lab1;

import java.util.Scanner;

public class baitap02 {
    public static void main(String[] args) {
        System.out.println("Bạn muốn biết gì về hình chữ nhật:");
        System.out.println("1.Chu vi");
        System.out.println("2.Diện tích");
        System.out.println("3.Cạnh nhỏ nhất");
        System.out.println("Chọn điều bạn muốn biết : ");
        Scanner sc = new Scanner(System.in);
        int luaChon = sc.nextInt();
        switch(luaChon)
        {
            case 1 :chuVi();; break;
            case 2 :dienTich();; break;
            case 3 :canhNhonhat();; break;
            default:System.out.println("Thoát");
        }

    }
    static void chuVi()
    {
        float chieuDai,chieuRog,chuVi,dienTik,canhMin;
        System.out.println("Nhập chiều dài và chiều rộng ");
        Scanner sc = new Scanner(System.in);
        chieuDai = sc.nextFloat();
        chieuRog = sc.nextFloat();
        chuVi = (chieuDai + chieuRog)*2;
        System.out.println("Chu vi là: " + chuVi);
        
    }
    static void dienTich()
    {
        float chieuDai,chieuRog,dienTik;
        System.out.println("Nhập chiều dài và chiều rộng : ");
        Scanner sc = new Scanner(System.in);
        chieuDai = sc.nextFloat();
        chieuRog = sc.nextFloat();
        dienTik = chieuDai*chieuRog;
        System.out.println("Diện tích là:" + dienTik);
    }
    static void canhNhonhat()
    {
        float chieuDai,chieuRog,canhMin;
        System.out.println("Nhập chiều dài và chiều rộng : ");
        Scanner sc = new Scanner(System.in);
        chieuDai = sc.nextFloat();
        chieuRog = sc.nextFloat();
        canhMin = Math.min(chieuDai,chieuRog);
        System.out.println("Cạnh nhỏ nhất là: " + canhMin);
    }
}
