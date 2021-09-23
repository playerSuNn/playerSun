package com.nhutnl2008110101.lab2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class baitap1_lab2part2 {
    public static void main(String[] args) {
        float a,b;
        double nghiemX;
        System.out.println("Nhập a và b:");
        Scanner sc = new Scanner(System.in);
        a = sc.nextFloat();
        b = sc.nextFloat();
        // làm tròn 2 số thập phân
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Phương trình:" + a +"x +" + b + " = 0.");
        if(a == 0)
        {
            if(b == 0){
                System.out.println("Phương trình vô số nghiệm");
            }
            else
            {
                System.out.println("Phương trình vô nghiệm");
            }
        }
        else
        {
            nghiemX = -b/a;
            System.out.println("Vậy nghiệm pt X:" + df.format(nghiemX) +".");
        }

    }
    
}
