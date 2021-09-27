package vn.edu.giadinh.tuan02;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class CT_NhapvaIn {
    public static void main(String[] args) {
        int lapLai = 0;
        do
        {
            System.out.println("Nhập số phần tử của mảng:");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] mang = new int[n];
           nhapMang(n,mang);
           Arrays.sort(mang);
           xuatMang(n,mang);
           timPhantuNhonhat(n,mang);
           tbcCacsoChiahetcho3̣(n,mang);
       }
       while(lapLai != 0);
    }
    public static void nhapMang(int n,int mang[]){
        for(int i = 0; i < n; i++){
            System.out.println("Nhập vào phần tử thứ " +(i + 1));
            Scanner sc = new Scanner(System.in);
            mang[i] = sc.nextInt();
        }
    }
    public static void xuatMang(int n,int mang[]){
        for(int i = 0; i < n; i++){
            System.out.println("Phần tử "+(i+1)+" có giá trị là: " +mang[i]);
        }
    }
    public static void timPhantuNhonhat(int n,int mang[]){
        int min = mang[0];
        for(int i = 0 ; i < n ; i++){
            if(mang[i] < min){
                min = mang[i];
            }
        }
        System.out.println("Phần tử có giá trị nhỏ nhất là:"+min);
    }
    public static void tbcCacsoChiahetcho3̣(int n,int mang[]){
        float tong = 0;
        float dem = 0;
        for(int i = 0 ; i < n ; i++){
            if(mang[i] % 3 == 0){
                tong = mang[i];
                dem = 1;
            }
        }
        System.out.println("Trung bình cộng các số chia hết cho 3 là:" +(tong/dem));
    }
    
}
