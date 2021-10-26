package com.nhutnl2008110101.lab7;

public class Moeba extends Shape{
    private int x;
    private int y;
    
    public Moeba(int toadoX, int toadoY){
        x = toadoX;
        y = toadoY;
    }
    @Override
    protected void rotate() {
        System.out.println("Xoay vòng với tọa độ x = "+x+" và y = "+y);
    }
    @Override
    protected void playMusic() {
        System.out.println("Amoeba phát bài : Bigcityboi");
    }
}
