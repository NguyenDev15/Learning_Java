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
public class ExerciseStringJava4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // nhập liệu
        System.out.print("Mời nhập đoạn tin nhắn cần mã hóa:  ");
        String nhapTin = sc.nextLine();
        // xuất kết quả sau khi mã hóa
        String kq = chuyenDoi(nhapTin);
        System.out.println("Sau khi mã hóa: " + kq);
        
        
    }

    // hàm chuyển đổi mã hóa
    public static String chuyenDoi(String nhapTin){
          /*
        Viết chương trình chuyển tin nhắn sang mật mã theo bảng
         String a="abcdefghijklmnopqrstuvwxyz";  
         String b="zxcvbnmasdfghjklqwertyuiop"; 
        */
        
        String a = "abcdefghijklmnopqrstuvwxyz"; 
        String b = "zxcvbnmasdfghjklqwertyuiop"; 
        String result = "";
    
        for(int i = 0; i < nhapTin.length(); i++){
            char c = Character.toLowerCase(nhapTin.charAt(i));
            // tìm vị trí của c trong biến a
            int index = a.indexOf(c);
            // thêm vào result nếu ng dùng nhập không có trong bảng mã hóa
            if(index == -1){
                result += c;
            }
            else{
                result += b.charAt(index);
            }
            
        } 
            return result;
           
    }
}
