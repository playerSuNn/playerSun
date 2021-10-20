package vn.edu.giadinh.tuan06;

public class Drive {
    public static void main(String[] args) {
        Dogg dog = new Dogg();

        System.out.println("Breed : "+dog.breed);
        System.out.println("Age : "+dog.age);
        System.out.println("**************");

        dog.age = 1;

        Dogg dog1 = new Dogg(1, "Fernir", "Gray");

        Dogg dog2 = new Dogg(3, "Wolf", "Silver");

        Dogg dog3 = new Dogg(2, "Ngao Tây Tạng", "Vàng Đất");
        //cùng được sinh ra trong một Class
        //Nhưng khác trạng thái(kết quả int ra)

        dog1.printDog();
        dog2.printDog();
        dog3.printDog();
        dog3.barkOut(3);
        dog3.bark(5);
    }
    
}
