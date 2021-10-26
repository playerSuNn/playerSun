package com.nhutnl2008110101.lab7;

public class Animals {
    private String picture;
    private String food;
    private int hunger;
    private String boundaries;
    private String location;
    private String sound;

    protected void makaNoise()
    {
        //tên âm thanh cho loài khác nhau
        System.out.println("Phát ra tiếng : animal animal");
    }

    protected void eat()
    {
        System.out.println("Đói đi kiếm ăn");
    }
    protected void sleep()
    {
        System.out.println("Trời lặn đi ngủ");
    }
    protected void roam()
    {
        System.out.println("Buổi chiều đi dạo");
    }


    
}
