package com.nhutnl2008110101.lab03;

import java.util.Scanner;

public class baitap1_lab3part2 {
    public static void main(String[] args) {
        boolean kt = true;
        System.out.println("Nhập vào số muốn kiểm tra: ");
        Scanner sc = new Scanner(System.in);
        int soCankt = sc.nextInt();
        for(int i = 2; i < soCankt - 1; i++){
            if(soCankt % i == 0){
                kt = false;
                break;
            }
            i++;
        }
        if(kt == true){
            System.out.println("Đây là số nguyên tố ");
        }
        else{
            System.out.println("Không phải là số nguyên tố");
        }
    }
    
    
}
