package com.nhutnl2008110101.lab8_2;

public class SinhVien {
    private String hoTen;
    private String nganh;
    private double diem;
    private String hocLuc;


    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public String getHoTen() {
        return hoTen;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }
    public String getNganh() {
        return nganh;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }
    public double getDiem() {
        return diem;
    }

    public void setHocLuc(String hocLuc) {
        this.hocLuc = hocLuc;
    }
    public String getHocLuc() {

        if(getDiem() < 5 ){
            this.hocLuc = "Yếu";
            return this.hocLuc;
        }
        else if(getDiem() >= 5 && getDiem() < 6.5 ){
            this.hocLuc = "Trung bình";
            return this.hocLuc;
        }
        else if(getDiem() >= 6.5 && getDiem() < 7.5 ){
            this.hocLuc = "Khá";
            return this.hocLuc;
        }
        else if(getDiem() >= 7.5 && getDiem() < 9 ){
            this.hocLuc = "Giỏi";
            return this.hocLuc;
        }
        if(getDiem() >= 9 && getDiem() < 10){
            this.hocLuc = "Xuất sắc";
            return this.hocLuc;
        }
        return hocLuc;   
    }

    protected void xuat(){
        System.err.println("---THÔNG TIN SINH VIÊN---");
        System.out.println("HỌ VÀ TÊN :"+getHoTen());
        System.out.println("NGÀNH     :"+getNganh());
        System.out.println("ĐIỂM      :"+getDiem());
        System.out.println("HỌC LỰC   :"+getHocLuc());
    }  
}
