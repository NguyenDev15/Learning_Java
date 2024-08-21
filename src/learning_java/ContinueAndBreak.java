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
public class ContinueAndBreak {
    public static void main(String[] args) {
//        // continue
//        System.out.println("Continue");
//        int sum = 0;
//        for(int i = 0; i < 6; i++){
//            if(i == 3){
//                continue;
//            }
//            sum += i;
//        }
//        System.out.println("sum = " + sum);
//        
//        // break
//        System.out.println("Break");
//        int n = 0;
//        while( n < 100){
//            n++;
//            if(n == 21){
//                break;
//            }
//        System.out.println("n = " + n);
//        }
        
        // bài tập vận dụng Loop, Break, Continue
        // 1. tính giai thừa
        System.out.print("Xin nhập vào số n!: ");
        int n = new Scanner(System.in).nextInt();
        int giaiThua = 1;
        for(int i = 1; i <= n; i++){
            giaiThua *= i;
        }
        System.out.println(n+"! = " + giaiThua);
        
        // 2. tính tổng các số chẵn từ 0 đến a
        System.out.print("Mời bạn nhập a: ");
        int a = new Scanner(System.in).nextInt();
        int sum = 0;
            if(a % 2 != 0){
                System.out.println("Tôi không tính số lẻ");
            }
            else{  
            for(int i = 0; i <= a; i++){
            if(i % 2 == 0){
                sum += i;
            }
          }
            System.out.println("Tổng từ 0 đến "+ a + " = " + sum);
       }
            
            // 3. tìm số hoàn hảo từ 1 đến 1000
            for(int soHH = 1; soHH <= 1000; soHH++){
            int tongHH = 0;
                for(int i = 1; i < soHH; i++){
                if(soHH % i == 0){
                tongHH += i;
                }
            }
            if(tongHH == soHH){
                System.out.println(soHH + " là số hoàn hảo");
            }
        }
    }
}
