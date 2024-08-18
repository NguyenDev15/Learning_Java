/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learning_java;

/**
 *
 * @author hnguynis.no1
 */
public class Operator {
    public static void main(String[] args) {
        // phép cộng
        int a = 5, b = 10;
        System.out.println("a + b = " + (a+b)); 
        // hoặc có thể gán biến
        int kq = a + b;
        System.out.println("a + b = " + kq);
        // hoặc các phép tính khác
        System.out.println("a - b = " + (a-b));
        System.out.println("a * b = " + (a*b));
        System.out.println("a / b = " + ((double)a/b)); // ép kiểu mới tính đúng
        System.out.println("a % b = " + (a%b));
        
        // bài tập
        System.out.println("Bài tập vận dụng");
        int i1 = 2;
        int i2 = 5;
        int i3 = -3;
        float d1 = 2.0f;
        float d2 = 5.0f;
        float d3 = -0.5f;
        
        System.out.println("i1 + (i2 * i3) = " + (i1 + (i2 * i3)));
        System.out.println("i1 * (i2 + i3) = " + (i1 * (i2 + i3)));
        System.out.println("i1 / (i2 + i3) = " + ((float)i1 / (i2 + i3)));
        System.out.println("i1 / i2 + i3 = " + (((float)i1 / i2) + i3));
        System.out.println("d1 + d2 + (d3 / 3) = " + (d1 + d2 + ((float)d3 /3) ));
    }
}
