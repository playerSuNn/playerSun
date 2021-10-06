package vn.edu.giadinh.tuan04;

import java.util.Scanner;

public class Employee {
    String[] nameUser = new String[99];
    float salary;
    int soNhanvien;
    Employee()
    {
        float[] salary = new float[99];
        int n = soNhanvien;
    }
    void getName()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please in name NV : ");
        nameUser[1] = sc.nextLine();
        for(int i = 0 ; i < soNhanvien ; i++)
        {
            System.out.println("Please in NV No."+(i+1)+":");
            nameUser[i] = sc.nextLine();
        }
    }
    void getSalary()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please in salary NV : ");
        salary = sc.nextFloat();
        for(int i = 0 ; i < soNhanvien ; i++)
        {
            System.out.println("Please in salary NV No."+(i+1)+":");
            salary = sc.nextFloat();
        }
    }
    void showTTemployee()
    {
        System.out.println("Name NV : "+nameUser[1]);
        System.out.println("Salary NV : "+salary);
        for(int i = 0 ; i < soNhanvien ; i++)
        {
            System.out.println("Name NV:"+nameUser[i]);
            System.out.println("Salary NV:"+salary);
        }
    }
    
}
