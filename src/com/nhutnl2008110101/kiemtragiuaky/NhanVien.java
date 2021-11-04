package com.nhutnl2008110101.kiemtragiuaky;

import java.util.Scanner;

public class NhanVien extends Nguoi{
    private float heSoluong;

    NhanVien(){}
    Scanner sc = new Scanner(System.in);

    public void setHeSoluong(float heSoluong) {
        this.heSoluong = heSoluong;
    }
    public float getHeSoluong() {
        if(heSoluong > 0 && heSoluong <= 10)
        {
            this.heSoluong = heSoluong;
        }
        return heSoluong;
    }

    protected float tinhLuong(){
        System.out.println("SỐ TIỀN LƯƠNG : "+(1500000*heSoluong));
        return heSoluong;

    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

    protected void xuat(){
        System.out.println("THÔNG TIN NHÂN VIÊN");
        System.out.println("Số lương Nhân Viên : "+(1500000*heSoluong));
    }
}
