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
public class WhileLoopJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời nhập số nguyên từ 1 đến 99: ");
        int n = sc.nextInt();
        while(n < 1 || n > 99){
            System.out.println("Nhập lại n , chỉ được từ 1 đến 99");
            n = sc.nextInt();
        }
        System.out.println("Bạn đã nhập xong n = " + n);
    }
}
