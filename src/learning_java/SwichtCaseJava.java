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
public class SwichtCaseJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời bạn nhập vào số nguyên n: ");
        int a = sc.nextInt();
        int check = (a%2);
        switch(check)
        {
            case 0:
                System.out.println(a + " là số chẵn");
                break;
            default:
                System.out.println(a + " là số lẻ");
                break;
        }   
        
        // bài tập
System.out.print("1. Tìm theo tên \n2. Tìm theo tác giả \n3. Tìm theo nhà xuất bản \n4. Tìm theo tiêu đề \nChọn mục: ");
        int find = new Scanner(System.in).nextInt();
        switch(find)
        {
            case 1:
                System.out.println("Tên: ");
                break;
            case 2:
                System.out.println("Tác giả: ");
                break;
            case 3:
                System.out.println("Nhà xuất bản: ");
                break;
            case 4:
                System.out.println("Tiêu đề: ");
                break;
            default:
                System.out.println("Mục chọn không hợp lệ!");
                break;
        }
        
    }
}
