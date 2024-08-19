/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learning_java;
import java.util.Scanner;

/**
 *
 * @author hnguynis.no1
 */
public class UseScanner {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
        // cho phép nhập chuỗi
//        System.out.print("Mời nhập vào mật khẩu cấp 1: ");
//        String mkc1 = scan.nextLine();
//        System.out.println("Mật khẩu cấp 1 là: " + mkc1);


       /* đối với các kiểu khác cũng vậy có nhiều kiểu khác nhau
        ví dụ: nextInt(), nextFoat(), nextDouble(),... tùy theo kiểu dữ liệu
        */
       
       
       // nên cho kiểu dữ liệu và tạo luôn cái Scanner để tránh lỗi
//        System.out.print("Nhập vào số nguyên đi: ");
//        int soNguyen = new Scanner(System.in).nextInt();
//        System.out.println("Bạn vừa nhập: " + soNguyen);
//        
//        System.out.print("Nhập vào số thực đi: ");
//        float soThuc = new Scanner(System.in).nextFloat();
//        System.out.println("Bạn vừa nhập: " + soThuc);
        
        // Bài tập 1
        System.out.println("Bài tập 1 : ");
        
        System.out.print("Mời bạn nhập vào bán kính: ");
        double banKinh = new Scanner(System.in).nextFloat();
        double chuVi = 2 * Math.PI * banKinh;
        double dienTich = Math.PI * Math.pow(banKinh, 2);
        // xuất kết quả
        System.out.println("Chu vi = " + chuVi);
        System.out.println("Diện tích = " + dienTich);
        
        // Bài tập 2
        System.out.println("Bài tập 2 : ");
        System.out.print("Mời bạn nhập vào chiều dài hình chữ nhật: ");
        int chieuDaiHcn = new Scanner(System.in).nextInt();
        System.out.print("Mời bạn nhập vào chiều rộng hình chữ nhật: ");
        int chieuRongHcn = new Scanner(System.in).nextInt();
        // Công thức tính CV DT hình chữ nhật
        int chuViHcn = (chieuDaiHcn + chieuRongHcn) * 2;
        int dienTichHcn = chieuDaiHcn * chieuRongHcn;
        // xuất kết quả
        System.out.println("Chu vi hình chữ nhật = " + chuViHcn);
        System.out.println("Diện tích hình chữ nhật = " + dienTichHcn);
        
    }
}
