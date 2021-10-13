package vn.edu.giadinh.tuan05;

public class Cow {
    //Attribute
    double weight;
    int age;

    //Method

    //hàm tạo mặc định 
    /*Cow()
    {
        //thiết lập info khoiwt tạo ban đầu 
        //weight = 5.5;
        age = 1;//tuổi trong bụng
    }*/

    //Method - function tạo - constructor có tham số
    /*Cow(double w)
    {
        weight = w;//truyền đổi số
    }*/

    //Constructor nhiều tham số
    Cow(double w, int a)
    {
        weight = w;
        age = a;
    }
    void moo()
    {
        System.out.println(" um bò .... um bò ");
    }
    
}
