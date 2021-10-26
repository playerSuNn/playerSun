package vn.edu.giadinh.tuan07.inheritence;

public class testDriveallShape {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.rotate();
        circle.playSound();

        Square square = new Square();
        square.rotate();
        square.playSound();

        Amoeba amoeba = new Amoeba("sound", 5, 10);
        amoeba.rotate();
        amoeba.playSound();
    }
    
}
