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
public class StringDataType {
    public static void main(String[] args) {
        // Kiểu dữ liệu String
        String a = "Hồi đó tôi chê mồm em rộng"
                + "\nKhông tin hai đứa chập mồm đo";
        System.out.println(a);
        
        // StringBuilder 
        StringBuilder str = new StringBuilder();
        // các phương thức thường dùng 
        // 1. append(); -> thêm vào cuối chuỗi
        str.append("Xin chào! ");
        str.append("mình mới học lập trình, hihi");
        System.out.println(str);
        // 2. insert(index, chuỗi cần chèn)
        str.insert(32, " Java");
        System.out.println(str); // thêm vào sau chữ trình
        // 3. delete(start, end - 1)
        str.delete(32, 37); // xóa chữ Java
        System.out.println(str);
        // 4. str.length() -> trả về độ dài của chuỗi
        System.out.println("Độ dài của chuỗi là: " + str.length());
    }
}
