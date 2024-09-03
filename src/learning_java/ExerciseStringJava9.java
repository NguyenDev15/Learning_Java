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

public class ExerciseStringJava9 {
    public static void main(String[] args) {
        // Nhập vào chuỗi => tối ưu hóa chuỗi
        // 1. Không có khoảng trắng dư thừa
        // 2. Các từ cách nhau chỉ 1 khoảng trắng
        // 3. Ký tự đầu tiên mỗi từ phải được viết hoa
        
        Scanner sc = new Scanner(System.in);
        String input = "    gà lạI  LậP    TRìNh";    
        String kq = chuanHoa(input);
        System.out.println(kq);
    }
    
    
    // hàm xử lí
    public static String chuanHoa(String input){
        input = input.trim();
        String[] words = input.split("\\s+");
        for(int i = 0; i < words.length; i++){
            words[i] = words[i].toLowerCase();
            // lấy chữ cái đầu tiên và sau đó in hoa lên
            String firstChar = words[i].substring(0,1);
            firstChar = firstChar.toUpperCase();
            // sau khi in hoa rồi cộng các index còn lại vào
            words[i] = firstChar + words[i].substring(1);
        }
        return String.join(" ", words);
    }
}
