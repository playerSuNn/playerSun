package com.nhutnl2008110101.lab7;

import java.util.Scanner;

public class tesrDrive_Shape {
    public static void main(String[] args) {
        Scanner inPut = new Scanner(System.in);
        Circle circle = new Circle();
        Square square = new Square();
        Triangle triangle = new Triangle();
        Moeba moeba = new Moeba(5,8);
        do
        {
            System.out.println("Lựa chọn hình bạn thích");
            System.out.println("1.Circle \n2.Square \n3.Triangle \n4.Moeba \n5.Thoát");
            int luaChon = inPut.nextInt();
            switch(luaChon)
            {
                case 1:{
                    circle.chamVao();
                    circle.rotate();
                    circle.playMusic();
                };
                break;
                case 2:{
                    square.chamVao();
                    square.rotate();
                    square.playMusic();
                };
                break;
                case 3:{
                    triangle.chamVao();
                    triangle.rotate();
                    triangle.playMusic();
                };
                break;
                case 4:{
                    moeba.chamVao();
                    moeba.rotate();
                    moeba.playMusic();
                };
                break;
                case 5:{
                    System.out.println("Thoát ra");
                    System.exit(0);
                }
            }
            System.out.println("-------------------------");
            System.out.println("Quay về MENU (yes/no)?");
            inPut.nextLine();
        }
        while(inPut.nextLine().equals("yes"));
    }
    
}
