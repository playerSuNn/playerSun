package vn.edu.giadinh.tuan07;

public class Amoeba {
    String sound;//biến object.aif
    int x;
    int y;

    Amoeba(){}

    public Amoeba(String s,int xx,int yy)
    {
        sound = s;
        x = xx;
        y =yy;
    }

    void rotate(){
        //code xử lí cho các hình xoay360 độ
        //giống kim đồng hồ
        //1.xác định tọa độ x,y
        //2.xoay theo x,y
        System.out.println("Xoay quanh theo tọa độ x = "+x+" và y = "+y);
    }

    void playSound()
    {
        //code xử lý file.aif để phát âm thanh
        //của một tập tin.aif
        System.out.println("Phát ra file.aif có tên "+sound);
    }
    
}
