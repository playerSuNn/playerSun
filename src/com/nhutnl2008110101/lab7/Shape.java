package com.nhutnl2008110101.lab7;

public class Shape {
    private String nameSong;
    private boolean click = true;

    protected void rotate()
    {
        System.out.println("Xoay vòng 360* theo tâm");
    }

    protected void chamVao(){
        if(click == true)
        {
            System.out.println("Có thể click vào : CLICK ");
        }
        else
        {
            System.out.println("Chưa click được");
        }
    }
    protected void playMusic(){
        System.out.println("Phát bài nhạc từng hình");
    }
}
