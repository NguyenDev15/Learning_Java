/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learning_java;

/**
 *
 * @author hnguynis.no1
 */
public class OperatorLogic {
    public static void main(String[] args) {
        // Toán tử logic &&, ||, !
        
        int a = 5;
        // check xem a > 4 && a < 10
        System.out.println(a > 4 && a < 3); // dấu && nếu chỉ một đk sai thì vẫn trả về false
        // check a > 10 || a > -1
        System.out.println(a > 10 || a > -1); // dấu || thì nếu 1 đk đúng thì vẫn trả true
        // phủ định 
        System.out.println(!(a > 10 || a < -1));
        
        // tiền tố, hậu tố (prefix, postfix)
        int x = 99;
        int y =  89;
        y++;
        y--;
        /* các phép toán phức tạp hơn thì ưu tiên tính prefix trước 
        xong đến các phép toán khác rồi mới đến postfix*/
        System.out.println("Sử dụng prefix postfix với phép toán phức tạp");
        int n = 1;
        int m = 2;
        int kq = n++ - ++m + 1; 
        System.out.println(n);
        System.out.println(m);
        System.out.println(kq);
        
        
        
    }
}
