package com.nhutnl2008110101.lab7;

public class Tiger extends HoMeo{

    protected void dacdiemRieng(){
        System.out.println("Có vằn trên lưng");
    }
    @Override
    protected void eat() {
        System.out.println("Ăn thịt sống");
    }
    @Override
    protected void roam() {
        System.out.println("Đi săn mồi");
    }    
}
