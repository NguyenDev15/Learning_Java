/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learning_java;

/**
 *
 * @author hnguynis.no1
 */
public class DataTypeCoercion {
    public static void main(String[] args) {
        // Ép kiểu dữ liệu
        
        int a = 5;
        int b = 10;
        double kq = (double)a/b; // ép kiểu int sang double
        System.out.println(kq);
        
        // nên ép từ kiểu dữ liệu nhỏ sang lớn để tránh bị sai 
    }
}

