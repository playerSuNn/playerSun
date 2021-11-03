package com.nhutnl2008110101.lab8_2;

public class SinhVienIT extends SinhVien{
    private double diemJava;
    private double diemCss;
    private double diemHtml;
    
    SinhVienIT(String hoTen,String nganh,Double diem,Double diemJava,Double diemHtml,Double diemCss)
    {
        super();
        this.diemJava = diemJava;
        this.diemCss = diemCss;
        this.diemHtml = diemHtml;
    }

    @Override
    public double getDiem() {
        //Ghi đè lên getDiem tính điểm cho SvIT
        System.out.println("Điểm SinhViên IT : "+((2*diemJava)+diemCss+diemHtml)/4);
        return this.diemCss;
    }

    protected void xuatDiemSvIT(){
        System.out.println("Điểm JAVA : "+diemJava);
        System.out.println("Điểm CSS  : "+diemCss);
        System.out.println("Điểm HTML : "+diemHtml);
    }
}
