package com.nhutnl2008110101.tuan10;

public class Circle extends Shape{
    private int radius;
    public Circle(int bienX,int bienY, int bineR){
        super(bienX, bienY);
        radius = bineR;
    }
    public void draw(){
        System.out.println("Draw Circle at "+x+","+y);
    }
    public void erase(){
        System.out.println("Erase Circle at "+x+","+y);
        
    }
    
}
