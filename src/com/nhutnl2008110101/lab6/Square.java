package com.nhutnl2008110101.lab6;

public class Square {
    String nameMusic = "Cảm nhận -MAIAMNHAC-";
    boolean click = true;

    Square()
    {

    }

    void click_Shape()
    {
        if(click == true)
        {
            System.out.println("Xoay một vòng hình vuông");
        }
        else
        {
            System.out.println("ENROR");
        }
    }
    void playMusic()
    {
        System.out.println(nameMusic);
    }
}
