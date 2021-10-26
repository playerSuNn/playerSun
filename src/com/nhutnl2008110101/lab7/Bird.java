package com.nhutnl2008110101.lab7;

public class Bird extends DVkhac{
    @Override
    public void makaNoise() {
        System.out.println("Chim hót chíc chíc");
    }
    @Override
    protected void roam() {
        System.out.println("Bay trên trời");
    }
    @Override
    protected void eat() {
        System.out.println("Ăn sâu bọ");
    }
    @Override
    protected void sleep() {
        System.out.println("Bay về tổ ngủ");
    }
    
}
