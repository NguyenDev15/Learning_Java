/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learning_java;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author hnguynis.no1
 */
public class RandomJava {
    public static void main(String[] args) {
        // Random numbers
        
        // khởi tạo đối tượng ngẫu nhiên
        Random rd =  new Random();
        // lấy 1 số nguyên ngẫu nhiên
        int a = rd.nextInt(0,51); // chạy từ 0 đến 50
        System.out.println(a);
        // lấy 1 số thực ngẫu nhiên
        double b = rd.nextDouble(-100,101); 
        System.out.println(b);
    }
}
