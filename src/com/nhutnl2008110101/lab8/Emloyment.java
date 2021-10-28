package com.nhutnl2008110101.lab8;

public class Emloyment extends Person{
    protected int salary;
    public String toString(){
        String s;
        s = getName() +","+ getBirthday();
        s += "," + salary;
        return s;
    }
    
}
