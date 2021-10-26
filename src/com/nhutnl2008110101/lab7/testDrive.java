package com.nhutnl2008110101.lab7;

import java.util.Scanner;

public class testDrive {
    public static void main(String[] args) {
        /*System.out.println("LION");
        Lion lion = new Lion();
        /*lion.khacBiet();
        lion.makeNoise();
        lion.eat();
        lion.sleep();
        lion.roam();

        Dog dog = new Dog();
        //overdrive
        dog.makeNoise();
        dog.eat();
        //extands
        dog.roam();
        dog.sleep();
        // Đặc thù 
        dog.dacthuDog();*/

        int luaChon = 0;
        do
        {
            System.out.println("1.Động vật Họ Mèo");
            System.out.println("2.Động vật Họ Chó");
            System.out.println("3.Động vật khác");

            Scanner sc = new Scanner(System.in);
            luaChon = sc.nextInt();
            switch(luaChon)
            {
                case 1:dvHoMeo();
                case 2:dvHoCho();
                case 3:dvKhac();
            }
        }
        while(luaChon != 0);
        

    }
    static void dvHoMeo(){
        int loaiDV = 0;
        do
        {
            System.out.println("Chọn loài trong Họ Mèo");
            System.out.println("1.Lion \n2.Tiger \n3.Cat");
            Scanner sc = new Scanner(System.in);
            loaiDV = sc.nextInt();
            Lion lion = new Lion();
            Tiger tiger = new Tiger();
            Cat cat = new Cat();
            switch(loaiDV)
            {
                case 1:
                {
                    int tinhHuong = 0;
                    do
                    {
                        System.out.println("Chọn tình huống");
                        System.out.println("1.Ngày thường(Đặc điểm chung) \n2.Gặp kẻ thù(Đặc điểm riêng)");
                        Scanner in = new Scanner(System.in);
                        tinhHuong = in.nextInt();
                        switch(tinhHuong)
                        {
                            case 1:
                            {
                                lion.makaNoise();
                                lion.eat();
                                lion.roam();
                                lion.sleep();
                            };
                            break;
                            case 2:
                            {
                                lion.makaNoise();
                                lion.roam();
                            };
                            break;
                        }break;
                    }
                    while(tinhHuong != 0);
                };
                break;
                case 2:
                {
                    tiger.makaNoise();
                    tiger.eat();
                    tiger.roam();
                    tiger.sleep();
                    tiger.dacdiemRieng();
                };
                break;
                case 3:
                {
                    cat.makaNoise();
                    cat.eat();
                    cat.roam();
                    cat.sleep();
                };
                break;
            }
        }
        while(loaiDV != 0);
        
    }
    static void dvHoCho(){
        int giong = 0;
        do
        {
            System.out.println("Chọn loài trong Họ CHó");
            System.out.println("1.Dog \n2.Wolf \n3.Hyena");
            Scanner sc = new Scanner(System.in);
            giong = sc.nextInt();
            Dog dog = new Dog();
            Wolf wolf = new Wolf();
            Hyena hyena = new Hyena();
            switch(giong)
            {
                case 1:
                {
                    int tinhHuong2 = 0;
                    do
                    {
                        System.out.println("Chọn tình huống");
                        System.out.println("1.Ngày thường(Đặc điểm chung) \n2.Gặp kẻ thù(Đặc điểm riêng)");
                        Scanner in = new Scanner(System.in);
                        tinhHuong2 = in.nextInt();
                        switch(tinhHuong2)
                        {
                            case 1:
                            {
                                dog.makaNoise();
                                dog.eat();
                                dog.roam();
                                dog.sleep();
                            };
                            break;
                        }
                    }
                    while(tinhHuong2 != 0);
                };
                break;
                case 2:
                {
                    wolf.makaNoise();
                    wolf.eat();
                    wolf.roam();
                    wolf.sleep();
                };
                break;
                case 3:
                {
                    hyena.makaNoise();
                    hyena.eat();
                    hyena.roam();
                    hyena.sleep();
                };
                break;
            }
        }
        while(giong != 0);
    }
    static void dvKhac(){
        int chonLoai = 0;
        do
        {
            System.out.println("Chọn loài động vật");
            System.out.println("1.Hippo \n2.Bird");
            Scanner sc = new Scanner(System.in);
            chonLoai = sc.nextInt();
            Hippo hippo = new Hippo();
            Bird bird = new Bird();
            switch(chonLoai)
            {
                case 1:{
                    hippo.makaNoise();
                    hippo.eat();
                    hippo.roam();
                    hippo.sleep();
                };
                break;
                case 2:{
                    bird.makaNoise();
                    bird.eat();
                    bird.roam();
                    bird.sleep();
                };
                break;
            }
        }
        while(chonLoai != 0);
    }
    
}
