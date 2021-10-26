package com.nhutnl2008110101.lab6;

public class Square {
    private String nameMusic = "Cảm nhận -MAIAMNHAC-";
    private boolean click = true;

    public Square()
    {

    }

    public void click_Shape()
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
    public void playMusic()
    {
        System.out.println(nameMusic);
    }
}
