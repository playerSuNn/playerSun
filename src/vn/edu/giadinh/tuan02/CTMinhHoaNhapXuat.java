package vn.edu.giadinh.tuan02;

import java.util.Scanner;

public class CTMinhHoaNhapXuat {

    public static void main(String[] args) {
        /*System.out.print("Gia Định");
        System.out.println("Đào tạo");
        System.out.printf("%d nghề",12);*/
        System.out.println("Nguyễn lê NHựt");
        
        /*String tenSinhVien;*/

        float diemKTLapTrinh;

        //biến nhập liệu//biến tham chiếu
        Scanner bienNhapLieu;//ApplicationProgrammingInterface
        //điều khiển từ xa 
        bienNhapLieu = new Scanner(System.in);
        System.out.print("Nhập vào điểm nhập môn Kỹ Thuật lập trình:");
        diemKTLapTrinh = bienNhapLieu.nextFloat();
        System.out.println("Diem : " + diemKTLapTrinh);
        //ví dụ khác 
        /*String tenSinhVien = new String("Mr Bean");*/
    }
    
}
