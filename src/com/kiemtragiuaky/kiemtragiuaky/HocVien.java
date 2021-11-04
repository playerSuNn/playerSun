package com.nhutnl2008110101.kiemtragiuaky;

public class HocVien extends Nguoi{
    private float diemMonhoc1;
    private float diemMonhoc2;
    private static int soLuongHv;
    private float diemTB;

    HocVien(){}

    public void setDiemMonhoc1(float diemMonhoc1) {
        this.diemMonhoc1 = diemMonhoc1;
    }

    public float getDiemMonhoc1() {
        return diemMonhoc1;
    }

    public void setDiemMonhoc2(float diemMonhoc2) {
        this.diemMonhoc2 = diemMonhoc2;
    }
    public float getDiemMonhoc2() {
        return diemMonhoc2;
    }

    public static void setSoLuongHv(int soLuongHv) {
        HocVien.soLuongHv = soLuongHv;
    }
    public static int getSoLuongHv() {
        return soLuongHv;
    }

    protected float diemTB()
    {
        System.out.println("ĐIỂM TB : "+(diemMonhoc1+diemMonhoc2)/2);
        return diemTB;
    }
    @Override
    public String toString() {
        return super.toString();
    }
    protected void xuat(){
        System.out.println("THÔNG TIN HỌC VIÊN");
        System.out.println("Số lượng Học Viên : "+soLuongHv);
        System.out.println("Điểm môn 1 : "+diemMonhoc1);
        System.out.println("Điểm môn 2 : "+diemMonhoc2);
        System.out.println("Điểm TB    : "+(diemMonhoc1+diemMonhoc2)/2);
    }
    
}
