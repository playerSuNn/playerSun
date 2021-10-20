package vn.edu.giadinh.tuan06;

public class testSymbol {
    public static void main(String[] args) {
        symbol plus = new symbol();
        int tong1 = plus.tong(5, 7);
        int tong3 = plus.tong2(3, 5, 7);
        System.out.println(tong1);
        System.out.println(tong3);
    }
    
}
