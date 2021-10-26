package com.nhutnl2008110101.lab7;

public class Lion extends Animals{
    /*protected void khacBiet(){
        System.out.println("Picture = LionPicture.pdf");
        System.out.println("Food = Thịt sống ");
        System.out.println("Hunger = 2");
    }*/

    @Override
    public void makaNoise() {
        System.out.println("gao gao gao");
    }
    
    @Override
    protected void eat() {
        System.out.println("Ăn thịt sống");
    }
    @Override
    protected void roam() {
        System.out.println("Săn mồi");
    }
}
