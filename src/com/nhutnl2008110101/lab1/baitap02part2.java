package com.nhutnl2008110101.lab1;

import java.util.Scanner;

public class baitap02part2 {
    public static void main(String[] args) {
        float chieuDai,chieuRog,chuVi,dienTik,canhMin,canhMax;
        System.out.println("Nhập chiều dài và chiều rộng: ");
        Scanner sc = new Scanner(System.in);
        chieuDai = sc.nextFloat();
        chieuRog = sc.nextFloat();
        chuVi = (chieuDai+chieuRog)*2;
        dienTik = chieuDai*chieuRog;
        canhMin = Math.min(chieuDai,chieuRog);
        canhMax = Math.max(chieuDai,chieuRog);
        System.out.println("Chu vi là:" + chuVi);
        System.out.println("Diện tích là:" + dienTik);
        System.out.println("Cạnh nhỏ nhất là:" + canhMin);
        System.out.println("Cạnh lớn nhất là:" + canhMax);
    }
    
}
