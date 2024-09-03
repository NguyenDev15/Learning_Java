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
public class ExerciseStringJava8 {
    public static void main(String[] args) {
        // Viết chương trình kiểm tra 1 chuỗi nhập vào từ bàn phím có phải Panlyndrome
        // ( tức là sau khi đảo ngược nó vẫn = nó)
        
        // nhập chuỗi
        Scanner sc = new Scanner(System.in);
        System.out.print("Xin mời nhập vào chuỗi:  ");
        String str = sc.nextLine();
        // khởi tạo
        StringBuilder chuoiDaoNguoc = new StringBuilder(str);
        String kq = chuoiDaoNguoc.reverse().toString();
        // check xem có phải Panlyndrome không
        if(str.equalsIgnoreCase(kq)){
            System.out.println("Success! ");
        }else{
            System.out.println("Fail! ");
        }
        
    }
}
