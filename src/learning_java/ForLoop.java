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
public class ForLoop {
    public static void main(String[] args) {
        System.out.println("For Loop");
        for(int i = 0; i <= 12; i+=2){
            System.out.println("i = " + i);
        }
        // tính tổng các số từ 1 đến 10
        int sum = 0;
        for(int i = 0; i < 11 ; i++){
            sum += i;
        }
        System.out.println("sum = " + sum);
    }
    
}
