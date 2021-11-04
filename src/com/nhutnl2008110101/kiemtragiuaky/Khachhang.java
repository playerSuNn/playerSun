package com.nhutnl2008110101.kiemtragiuaky;

public class Khachhang extends Nguoi{
    private String tenCongty;
    private double giaTrihoaDon;

    Khachhang(){
    }

    public void setTenCongty(String tenCongty) {
        this.tenCongty = tenCongty;
    }
    public String getTenCongty() {
        return tenCongty;
    }

    public void setGiaTrihoaDon(double giaTrihoaDon) {
        this.giaTrihoaDon = giaTrihoaDon;
    }
    public double getGiaTrihoaDon() {
        return giaTrihoaDon;
    }

    @Override
    public String toString() {
        System.out.println("Hóa đơn có Giá Trị : "+1000"USD"");
    }
    protected void xuat()
    {
        System.out.println("Tên CÔNG TY : "+tenCongty);
        System.out.println("Giá Trị Hóa đơn : "+giaTrihoaDon);
    }
    
}
