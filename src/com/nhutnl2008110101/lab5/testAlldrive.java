package com.nhutnl2008110101.lab5;

public class testAlldrive {
    public static void main(String[] args) {
        //Sách 
        book sach = new book();
        sach.enter();
        sach.print();
        //Nhân Viên
        customer nv = new customer();
        nv.enterCus();
        nv.printCus();
        //Xe
        car xe = new car();
        xe.enterCar();
        xe.printCar();
        //Tài khoản
        account tk = new account();
        tk.enterAcc();
        tk.printAcc();
        //Máy tính
        computer pc = new computer();
        pc.enterPC();
        pc.printPC();
    }
    
}
