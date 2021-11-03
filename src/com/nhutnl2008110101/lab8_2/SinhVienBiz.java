package com.nhutnl2008110101.lab8_2;

public class SinhVienBiz extends SinhVien{
    private double diemMarketing;
    private double diemSales;

    SinhVienBiz(double diemMarketing, double diemSales){
        super();
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }
    @Override
    public double getDiem() {
        //Ghi đè lên getDiem tính điểm cho SvBiz
        System.out.println("Điểm Sinh Viên Biz : "+((2*diemMarketing)+diemSales)/3);
        return this.diemMarketing;
    }
    protected void xuatDiemSvBiz(){
        System.out.println("Điểm Marketing : "+diemMarketing);
        System.out.println("Điểm Sales     : "+diemSales);
    }
}
