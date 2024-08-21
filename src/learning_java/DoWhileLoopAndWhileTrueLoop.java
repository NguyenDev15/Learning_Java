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
public class DoWhileLoopAndWhileTrueLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        Cấu trúc Do While (Do chứa khối lệnh lặp, While là điều kiện lặp)
        */
        System.out.println("Do While");
        int a = 1;
        int tong = 0;
        do{
            tong += a;
            a++;
        }while(a <=5);
            System.out.println("tong = " + tong);
            
         /* 
         Cấu trúc While(true) chạy đến khi gặp break thì thoát   
         */
         System.out.println("\nWhile(true)");
         int n = 0;
         while (true) {            
            n++;
             System.out.println("n = " + n);
             if(n == 10){
                 break;
             }
        }
    }
}
