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
public class CharDataType {
    public static void main(String[] args) {
        // kiểu dữ liệu char
        char ch = 'a'; // kí tự được để trong nháy đơn
        String str = "a"; // chuỗi thì phải để trong nháy kép
        
       // ví dụ
        System.out.print ("Mời nhập vào kí tự: ");
       String input = new Scanner(System.in).nextLine();
       char kiTu = input.charAt(0); // lấy kí tự đầu tiên tại index 0
        System.out.println("Kí tự vừa nhập: " + kiTu);
        
        // so sánh các kí tự theo bảng mã ASCII
        System.out.println(Character.compare('b','b')); // giống nhau thì bằng 0
        System.out.println(Character.compare('a','b')); // số này đứng trước số kia thì trả âm
        System.out.println(Character.compare('b','a')); // số này đứng sau số kia thì trả dương
        
        // Char Methods
        /*
        Character.isDigit() -> true nếu truyền vào là số
        Character.isLetter() -> true nếu truyền vào là chữ cái
        Character.isWhiteSpace() -> true nếu truyền vào là space
        Character.isLowerCase() -> true nếu truyền vào là chữ thường 
        Character.isUpperCase() -> true nếu truyền vào là chữ hoa
        */
        char a1 = '1';
        char b1 = 'a';
        char c1 = ' ';
        char d1 = 'a';
        char e1 = 'A';
        
        System.out.println(Character.isDigit(a1));
        System.out.println(Character.isLetter(b1));
        System.out.println(Character.isWhitespace(c1));
        System.out.println(Character.isLowerCase(d1));
        System.out.println(Character.isUpperCase(e1));
        
    }
}
