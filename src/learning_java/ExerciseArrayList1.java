/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learning_java;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 *
 * @author hnguynis.no1
 */
public class ExerciseArrayList1 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         Random rd = new Random();
         
         //nhập số lượng phần tử
         System.out.print("Nhập vào phần số tử của mảng: ");
         int n = sc.nextInt();
         // tạo 1 danh sách
         ArrayList<Integer> lst = new ArrayList<>();
         
         for(int i = 0; i < n; i++){ 
             int random = rd.nextInt(1,101);
             lst.add(random);
         }
         System.out.println(lst);
                 
                         
         
    }
}
