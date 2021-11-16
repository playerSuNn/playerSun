package com.nhutnl2008110101.tuan10;

abstract public class Shape {
    protected int x, y;
    Shape(int bienX, int bienY){
        x = bienX;
        y = bienY;
    }
    abstract public void draw();
    abstract public void erase();
    public void moveTo(int bienX, int bienY){
        erase();
        x = bienX;
        y = bienY;
        draw();
    }
    
}
