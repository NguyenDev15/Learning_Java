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
public class ExerciseStringJava2 {
    public static void main(String[] args) {
        // Cho một chuỗi các môn và điểm 
        // tính tổng các số trong chuỗi
        // tính trung bình cộng
        
        String str1 = "English = 78 Science = 83 Math = 68 History = 65";
        int sum = 0;
        int count = 0;
         // Tách chuỗi thành các thành phần bằng cách sử dụng split();
         String[] parts = str1.split(" ");
         
         for(String pt : parts){
             try{
                 int num = Integer.parseInt(pt);
                 sum += num;
                 count++;
             }catch(NumberFormatException e){
                 // không làm gì cả
             }
         }
         // tính trung bình cộng
         double tbCong = (double)sum / count;
         
         // xuất kết quả
         System.out.println("Tổng các số trong chuỗi = " + sum );
         System.out.println("Trung bình cộng = " + tbCong );
         
    }
}
