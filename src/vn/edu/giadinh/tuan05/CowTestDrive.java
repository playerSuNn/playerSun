package vn.edu.giadinh.tuan05;

public class CowTestDrive {
    public static void main(String[] args) {
        Cow cow;//remote 1

        //cow = new Cow();//Constructor do Developers tạo ra

        //cow = new Cow(3.0);

        //cow = new Cow(12.5);

        cow = new Cow(9.75,1);

        Cow cow2 = new Cow(15.75,5);
        //Xuất info bò 1
        System.out.println("Bò Boo!");
        System.out.println("Cân nặng "+ cow.weight);
        System.out.println("Tuổi "+cow.age);
        
        //Xuất info bò 2
        System.out.println("Bò Alistar");
        System.out.println("Cân nặng "+cow2.weight);
        System.out.println("Tuổi "+cow2.age);
        System.out.println("Bò kêu");
        cow2.moo();
    }
    
}
