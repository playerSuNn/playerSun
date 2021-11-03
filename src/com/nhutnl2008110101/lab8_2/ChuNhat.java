package com.nhutnl2008110101.lab8_2;

public class ChuNhat {
    private double chieuDai;
    private double chieuRong;

    ChuNhat(){}

    public double getChieuDai() {
        return chieuDai;
    }
    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }


    public double getChieuRong() {
        return chieuRong;
    }
    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    private double getDienTich;
    private double getChuVi;

    protected void xuat(){
        System.out.println("---THÔNG TIN HÌNH CHỮ NHẬT---");
        System.out.println("CHIỀU DÀI : "+getChieuDai());
        System.out.println("CHIỀU RỘNG : "+getChieuRong());
        System.out.println("CHU VI : "+(getChieuDai()+getChieuRong())*2);
        System.out.println("DIỆN TÍCH : "+(getChieuDai()*getChieuRong()));
    }
    

    
}
