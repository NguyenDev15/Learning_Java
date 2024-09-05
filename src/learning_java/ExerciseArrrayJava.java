/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learning_java;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author hnguynis.no1
 */
public class ExerciseArrrayJava {
    public static void main(String[] args) {
      
        Random rd = new Random();
        
        System.out.print("Mời nhập vào phần tử của mảng: ");
        int n = new Scanner(System.in).nextInt();
        // tạo mảng gồm n phần tử
        int[] arr = new int[n];
        // tạo phần tử ngẫu nhiên cho mảng
        for(int i = 0; i < arr.length; i++){
             int random = rd.nextInt(11);
             arr[i] = random;
  
        }
        // xuất các giá trị trong mảng
        System.out.println("\nMảng ngẫu nhiên vừa tạo ra là: ");
        System.out.println(Arrays.toString(arr));
  
        // tạo mảng clone để không tác động thay đổi vào mảng gốc
        int[] clone = arr.clone();
        
        
        
        
        // đảo ngược mảng
        for(int i = 0 , j = arr.length - 1; i < j; i++ , j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            
        }
        // xuất mảng sau khi đảo ngược
        System.out.println("\nMảng ngẫu khi đảo ngược là: ");
        System.out.println(Arrays.toString(arr));
    
    
        
        
        
        // sắp xếp mảng tăng dần
        Arrays.sort(arr);
        System.out.println("\nMảng sau sắp xếp tăng dần là");
        System.out.println(Arrays.toString(arr));
        
        
        
        
        
        
        // tính tổng các vị trí trong mảng
        int sumArr = 0;
        for(int i = 0; i < arr.length; i++){
            sumArr += arr[i];
        }
        System.out.println("\nTổng mảng = " + sumArr);
        
        
        
        
        
        
        // cho người dùng nhập vào một số bất kì 
        //          ktra xem số đó có tồn tại trong mảng hay không 
        //          nếu có xuất ra vị trí index của số đó trong mảng
        
        System.out.print("\nMời nhập vào số ngẫu nhiên: ");
        int num = new Scanner(System.in).nextInt();
        boolean check = false;
        String location = "";
        for(int i = 0; i < clone.length; i++){
           
            if(num == clone[i]){
                check = true;
                location += i + " ";
            }
        }
        if(check == true){
            System.out.println(num + " có tồn tại trong mảng với vị trí index = " + location);
        }
        else{
            System.out.println(num + " không có tồn tại trong mảng!");
        }
        
        
        
    }
    
}
