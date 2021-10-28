package com.nhutnl2008110101.lab8;

public class Animals {
    private String name;

    protected String picture;

    protected String food;

    protected int hunger;

    public Animals(){
        //super();
        System.out.println("making animals....");
    }
    public Animals(String n){
        name = n;
    }

    protected void makaNoise(){
        System.out.println("Phát ra tiếng kiu");
    }
    protected void eat(){
        System.out.println("Ăn kiểu");
    }
}
