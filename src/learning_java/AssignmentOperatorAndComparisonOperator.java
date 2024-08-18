/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learning_java;

/**
 *
 * @author hnguynis.no1
 */
public class AssignmentOperatorAndComparisonOperator {
    public static void main(String[] args) {
        // toán tử gán và các phép toán so sánh
        
        // gán cộng
        int x = 6;
        x += 4; // => x = x + 5;
        System.out.println("x = " + x); 
        
        // gán trừ
        int y = 11;
        y -= 1; // => y = y - 1;
        System.out.println("y = " + y); 
        
        // gán nhân
        int z = 5;
        z *= 2; // => z = z * 2
        System.out.println("z = " + z); 
        
        // phép toán so sánh
        System.out.println("Phép toán so sánh");
        int a = 5;
        int b = 4;
        System.out.println(a == b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);
        
        // Bài tập
        System.out.println("Bài tập: ");
        int c = 6;
        int d = 2;
        System.out.println(c += 3);
        System.out.println(c -= 5);
        System.out.println(c *= 2);
        System.out.println(c %= 3);
        System.out.println(c -= (b+7));
        
    }
}
