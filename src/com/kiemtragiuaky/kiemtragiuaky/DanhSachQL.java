package com.nhutnl2008110101.kiemtragiuaky;

import java.util.ArrayList;

public class DanhSachQL {
    private ArrayList<Nguoi> danhSach = new ArrayList<Nguoi>();
    public void them(Nguoi nguoi){
        this.danhSach.add(nguoi);
    }
    public void inDanhSach(){
        System.out.println(danhSach);
    }
    
}
