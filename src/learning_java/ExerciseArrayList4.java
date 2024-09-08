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
public class ExerciseArrayList4 {
    public static void main(String[] args) {
        // khởi tạo Random
        Random rd = new Random();
        // nhập số phần tử list
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời nhập vào số phần tử của list: ");
        int n = sc.nextInt();
        // khởi tạo list
        ArrayList<Integer> list = new ArrayList<>();
        // Duyệt
        for(int i = 0; i < n; i++){
            // pt ngẫu nhiên
            int random = rd.nextInt(1, 100);
            list.add(random);
        }
        // in list random
        System.out.println("List random = " + list);
        
        // duyệt và xuất ra những pt < 80
        ArrayList<Integer> beHon80 = new ArrayList<>();
        boolean check = false;
        for(int pt : list){
            if(pt < 80){
                  beHon80.add(pt);
                  check = true;
            }
        
        }
        
        
        // xuất pt > 80
        if(check){
            System.out.println("Các phần tử < 80 = " + beHon80);
        }
        else{
            System.out.println("Không có phần tử nào < 80");
        }
        
        
        
        String result = "";
        // duyệt để lấy index các phần tử < 80
        for(int i = 0; i < beHon80.size(); i++){
            
            if(check){
                result += i + " ";
            }
        }
        System.out.println("Vị trí index các phần tử < 80 = " + result);
        
        
        
    }
}
