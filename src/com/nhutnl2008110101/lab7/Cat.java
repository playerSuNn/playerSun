package com.nhutnl2008110101.lab7;

public class Cat extends HoMeo{

    @Override
    public void makaNoise() {
        System.out.println("meo meo meo");
    }

    protected void dacdiemRieng(){
        System.out.println("Thích ăn cá");
    }
    @Override
    protected void roam() {
        System.out.println("Đuổi chuột");
    }
    
}
