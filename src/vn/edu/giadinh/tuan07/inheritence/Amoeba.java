package vn.edu.giadinh.tuan07.inheritence;

public class Amoeba extends Shape{
    int x;
    int y;

  

    public Amoeba(String s,int xx,int yy){
        x =xx;
        y =yy;

    }

    public void rotate(){
        System.out.println("Xoay với tọa độ x = "+x+" và y = "+y);
    }

    public void playSound(){
        System.out.println("Bài hát");
    }

}
