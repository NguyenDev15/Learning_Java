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
public class ExerciseStringJava1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời nhập vào một chuỗi: ");
        String s = sc.nextLine();
        int numCount = 0;
        int upperCount = 0;
        int lowerCount = 0;
        int spaceCount = 0;
        
       for(int i = 0; i < s.length(); i++){
           char c = s.charAt(i); // lấy kí tự tại vị trí index i của chuỗi s
           if(Character.isDigit(c)){
               numCount++;
           }
           else if(Character.isUpperCase(c)){
               upperCount++;
           }
           else if(Character.isLowerCase(c)){
               lowerCount++;
           }
           else if(Character.isWhitespace(c)){
               spaceCount++;
           }
       }
       System.out.printf("Có %s số trong chuỗi",numCount);
       System.out.printf("\nCó %s số in hoa trong chuỗi",upperCount);
       System.out.printf("\nCó %s số in thường trong chuỗi",lowerCount);
       System.out.printf("\nCó %s khoảng trắng trong chuỗi\n",spaceCount);
        
       
    }
}
