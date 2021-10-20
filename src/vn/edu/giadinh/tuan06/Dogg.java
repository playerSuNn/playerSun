package vn.edu.giadinh.tuan06;

public class Dogg {
    //attribute
    String breed;//biến state - trạng thái
    String color;//biến state
    int age;//biến state
    int size;
    //Biến state đc khai báo trong class nhưng 
    //ko ở trong phương thức nào cả

    //Method - Contructor
    Dogg(){}
    Dogg(int a,String b,String c)
    {
        age = a;
        breed = b;
        color = c;
    }

    void printDog()
    {
        System.out.println("Giống : "+breed);
        System.out.println("Màu sắc : "+color);
        System.out.println("Tuổi : "+age);
        System.out.println("----------------");
    }

    void barkOut(int sua)
    {
        sua = 3;
        System.out.println("Chó sũa "+sua+" tiếng");
        System.out.println("ấu.....ấu.....hú.....");
    }

    void bark(int noBarks)
    {
        while(noBarks > 0)
        {
            System.out.println("ruff");
            noBarks--;
        }
    }
    
}
