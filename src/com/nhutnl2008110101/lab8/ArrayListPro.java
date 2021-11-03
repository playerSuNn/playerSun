package com.nhutnl2008110101.lab8;

import java.util.ArrayList;
import java.util.List;

import com.nhutnl2008110101.lab7.Circle;
import com.nhutnl2008110101.lab7.Square;
import com.nhutnl2008110101.lab7.Dog;
import com.nhutnl2008110101.lab7.Moeba;
import com.nhutnl2008110101.lab7.Shape;

public class ArrayListPro {
    public static void main(String[] args) {
        List<String> list;

        list = new ArrayList<>();

        list.add("Tý");
        list.add("Sửu");
        list.add("Dần");

        System.out.println(list);

        ArrayList<String> list5;

        list5 = new ArrayList<>();

        list5.add("Xuân");
        list5.add("Hạ");
        
        System.out.println("số phần tử list5 :"+list5.size());
        System.out.println(list5);

        List<Shape> list2 = new ArrayList<>();

        Circle circle = new com.nhutnl2008110101.lab7.Circle();
        Square square = new Square();
        Moeba moeba = new Moeba(5, 10);

        list2.add(circle);
        list2.add(square);
        list2.add(moeba);

        /*for (Shape shape : list2){
            shape
            shape
            cần romote điều kiển
        }*/

        List<Animals> list3;

        List<Dog> list4;
    }
    
}
