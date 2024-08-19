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
public class IfElseCondition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double diemTb;
        System.out.print("Mời bạn nhập vào điểm trung bình: ");
        diemTb = sc.nextDouble();
        // check điều kiện
        if(diemTb < 5){
            System.out.println("Bạn đã trượt");   
        }
        else{
            System.out.println("Bạn đã đậu");
        }
        
        // ví dụ khác
        double diemToan;
        System.out.print("Mời bạn nhập vào điểm Toán của bạn: ");
        diemToan = sc.nextDouble();
        if(diemToan <= 10 && diemToan >= 8){
            System.out.println("Điểm xuất xắc");
        }
        else if(diemToan < 8 && diemToan >= 6.5){
            System.out.println("Điểm khá thôi");
        }
        else if(diemToan < 6.5 && diemToan >= 5){
            System.out.println("Điểm trung bình");
        }
        else{
            System.out.println("Điểm yếu, kém. Cải thiện đi!");
        }
        
        // Bài tập tính hệ pt
        System.out.println("Bài tập về hệ phương trình: ");
        System.out.print("Nhập vào tổng 2 số: ");
        double sum = new Scanner(System.in).nextInt();
        System.out.print("Nhập vào hiệu 2 số");
        double sub = new Scanner(System.in).nextInt();
        // công thức
        double x = (double)(sum + sub) / 2;
        double y = sum - x;
        
        System.out.println("X = " + x);
        System.out.println("y = " + y);
        
        
        // Bài tập tính năm nhuận
        System.out.println("Bài tập tính năm nhuận");
        
        System.out.print("Mời bạn nhập vào một năm bất kì: ");
        int nam = new Scanner(System.in).nextInt();
        // check điều kiện
        if((nam % 4 == 0) && (nam % 100 != 0) || (nam % 400 == 0)){
            System.out.printf("Năm %s là năm nhuận", nam);
        }
        else{
            System.out.printf("Năm %s là nhăm không nhuận",nam);
        }
    }
}
