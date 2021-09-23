package com.nhutnl2008110101.lab03;

public class baitap2_lab3 {
    public static void main(String[] args) {
        int i,j;
        for(i = 1;i <= 10;i++)
        {
            System.out.println("Sau đây là chương trình in bảng nhân!");
            System.out.printf("Bảng Nhân " +i);
            for(j = 1;j < 10;j++)
            {
                System.out.printf("\n%d x %d = %d\n",i,j,i*j);
            }
        }
    }
}
