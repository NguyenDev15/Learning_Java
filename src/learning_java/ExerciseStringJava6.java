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
public class ExerciseStringJava6 {
    public static void main(String[] args) {
        /*
        Viết chương trình tách số và chữ số
        ví dụ nhập vào abc123 thì in ra abc và 123
        */
        
        Scanner sc = new Scanner(System.in);
        // xử lí chuỗi nhập
        String resultLetter = "";
        String resultNumber = "";
        // nhập chuỗi
        System.out.print("Xin mời nhập vào số và chữ:  ");
        String nhapLieu = sc.nextLine();
        
        // duyệt
        for(int i = 0; i < nhapLieu.length(); i++){
            char c = nhapLieu.charAt(i);
            
            if(Character.isDigit(c)){
                resultNumber += c;
                // có thể dùng append() để thêm
            }
            else if(Character.isLetter(c)){
                resultLetter += c;
                // có thể dùng append() để thêm
            }
        }
        System.out.println("Số: " + resultNumber);
        System.out.println("Chữ: " + resultLetter);
        
        
        
        
        
    }
}
