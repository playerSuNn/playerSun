package com.nhutnl2008110101.lab6;

public class Circle {
    String music = "Cô thắm không về.";
    boolean click = true;

    Circle(){

    }

    void click_Shape()
    {
        if(click == true)
        {
            System.out.println("Xoay một vòng hình tròn");
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
