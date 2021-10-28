package com.nhutnl2008110101.lab8;

public class Hippo extends Animals{
    public Hippo(){
        System.out.println("making a hippo");
    }
    public Hippo(String n){
        super(n);
    }
    

    @Override
    protected void makaNoise() {
        if(hunger == 1)
        {
            System.out.println("Kiêu bình thường");
        }
        else if(hunger == 2)
        {
            System.out.println("Kiêu Kiểu đối");
        }
    }
    @Override
    protected void eat() {
        System.out.println("ăn kiểu hà mã ");
    }
}
