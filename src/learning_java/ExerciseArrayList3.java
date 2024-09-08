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
public class ExerciseArrayList3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // list đề bài cho
        ArrayList<String> list = new ArrayList<>(
                List.of("2 + 5 + 7 =", "5 * 10 =", "sqrt(16) =", "12 % 2 ="));
        // list đáp án
        ArrayList<Float> dapAn = new ArrayList<>(List.of(14f, 50f, 4f,0f));
        
        // duyệt list câu hỏi
        for(int i = 0; i < list.size(); i++){
            // nhập kết quả
            System.out.print(list.get(i) + " ");
            Float kq = sc.nextFloat(); 
            
            if(kq.equals(dapAn.get(i))){
                System.out.println("Đúng!");
            }
            else{
                System.out.println("Sai! Kết quả = " + dapAn.get(i));
            }
        }
         
        
    }
}
