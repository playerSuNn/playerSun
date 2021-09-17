package vn.edu.giadinh.tuan02.lab1;

import java.util.Scanner;

public class baitap03 {
    public static void main(String[] args) {
        float canh,theTik;
        System.out.println("Nhập vào chiều dài cạnh lập phương:");
        Scanner sc = new Scanner(System.in);
        canh = sc.nextFloat();
        theTik = canh*canh*canh;
        System.out.println("Vậy thể tích hình lập phương là:" + theTik);
    }
    
}
