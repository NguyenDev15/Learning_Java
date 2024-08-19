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
public class TernaryOperator {
    public static void main(String[] args) {
        // Toán tử 3 ngôi
        // Thật chất nó sẽ như kiểu if else rút gọn
        Scanner sc = new Scanner(System.in);
        System.out.print("Xin mời nhập vào một số nguyên n: ");
        int n = sc.nextInt();
        String traLoi = (n % 2 == 0)?"Chẵn" : "Lẻ";
        System.out.println("Số " + n + " là số " + traLoi);
        
        // Bài tập vận dụng toán tử 3 ngôi
        System.out.print("Xin mời nhập vào điểm: ");
        double score = new Scanner(System.in).nextDouble();
        String ketQuaDiem = (score >= 8 && score <= 10)?"Giỏi" : 
                ((score >= 6.5 && score < 8)?"Khá" : 
                ((score >= 5 && score < 6.5)?"Trung bình" : "Yếu"));
        System.out.println("Bạn xếp loại " + ketQuaDiem);
    }
}
