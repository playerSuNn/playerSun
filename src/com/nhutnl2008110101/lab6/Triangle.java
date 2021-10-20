package com.nhutnl2008110101.lab6;

public class Triangle {
    String music = "Tiền nhiều để làm gì -GDucky-";
    boolean click = true;

    Triangle(){

    }

    void click_Shape()
    {
        if(click == true)
        {
            System.out.println("Xoay đôi ba vòng hình tam giác");
        }
        else
        {
            System.out.println("ENROR");
        }
    }
    void playMusic()
    {
        System.out.println(music);
    }
    
}
