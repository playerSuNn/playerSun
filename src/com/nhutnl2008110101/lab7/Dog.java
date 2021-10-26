package com.nhutnl2008110101.lab7;

public class Dog extends Animals{
    @Override
    public void makaNoise() {
        System.out.println("gau gau gau");
    }
    @Override
    protected void eat() {
        System.out.println("ăn xương và chôn để dành");
    }
    protected void dacthuDog(){
        System.out.println("Đuổi mèo đuổi chuột");
    }
}
