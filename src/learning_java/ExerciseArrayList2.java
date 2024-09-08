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
public class ExerciseArrayList2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Scanner
        System.out.print("Mời nhập vào số phần tử của list: ");
        int n = sc.nextInt();
        // Tạo list
        ArrayList<Integer> list = new ArrayList<>();
        //Duyệt
        for(int i = 0; i < n; i++){
            System.out.print("List[" + i + "] = ");    
            int pt = sc.nextInt(); 
            list.add(pt);
       }
        System.out.println(list);
        // Tạo ra list mới để bình phương, xong add vào danh sách cuối
        ArrayList<Integer> binhPhuong = new ArrayList<>();
        for(int b2 : list){
            binhPhuong.add(b2*b2);
        }
        System.out.println("Danh sách mới đã bình phương: ");
        System.out.println(binhPhuong);
        
        // Xác định bao nhiêu phần tử lớn hơn 50
        int count = 0;
        boolean check = false;
        for(int ptLonHon50 : binhPhuong){
            if(ptLonHon50 > 50){
                check = true;
                count++;
            }
        }
        if(check){
            System.out.println("Số phần tử > 50 = " + count);
        }
        else{
            System.out.println("Không có phần tử nào > 50");
        }
        
        
        
        
        
        
    }
}
