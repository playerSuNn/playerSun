package com.nhutnl2008110101.kiemtragiuaky;

public class Nguoi {
    private String hoTen;
    private String diaChi;

    Nguoi(){}

    public String getHoTen() {
        return hoTen;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        String s;
        s = "Tên :" +getHoTen()+ "\n" +"Địa chỉ : " +getDiaChi();
        //return super.toString();
        return s;
    }

    protected void xuat()
    {
        System.out.println("Họ và Tên : "+hoTen);
        System.out.println("Địa chỉ   : "+diaChi);
    }
}
