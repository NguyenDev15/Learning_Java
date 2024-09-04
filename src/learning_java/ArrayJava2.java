/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learning_java; 
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author hnguynis.no1
 */
public class ArrayJava2 {
    public static void main(String[] args) {
        
        
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời nhập vào số phần tử của mảng:  ");
        int n = sc.nextInt();
        // tạo mảng có n phần tử ( cấp phát bộ nhớ cho mảng )
        int[] array = new int[n];
        // nhập dữ liệu cho từng phần tử
        for(int i = 0; i < array.length; i++){
            System.out.print("array["+i+"] = ");
            array[i] = sc.nextInt();
        }
        // xuất mảng sau khi khời tạo và nhập mảng
        System.out.println(Arrays.toString(array));
        
        
        
        
        
        // Sắp xếp mảng tăng dần
        int[] mang1 = {6,5,3,98,54,24,65,61};
        Arrays.sort(mang1);
        System.out.println("Mảng sau khi sắp xếp tăng là: ");
        System.out.println(Arrays.toString(mang1));
        
        
        
        
        
        // Đảo ngược mảng
        int[] mang2 = {6,5,3,98,54,24,65,61};
        for(int i = 0, j = mang2.length - 1; i < j; i++, j--){
            int temp = mang2[i];
            mang2[i] = mang2[j];
            mang2[j] = temp;
        }
        // xuất mảng
        System.out.println("Mảng sau khi đảo ngược là: ");
        System.out.println(Arrays.toString(mang2) + "\n\n");
        
        
        
        
        
        // gán mảng truy xuất cùng vùng nhớ
        int[] mang3 = {1,2,4,5,6,4,2,6,7};
        int[] mang4 = mang3;
        mang3[0] = 100;
        System.out.println(Arrays.toString(mang3));
        System.out.println(Arrays.toString(mang4));
        // nếu truy xuất sửa đổi cùng vùng nhớ thì sẽ làm vùng nhớ gốc bị thay đổi
        
        
        
        // dùng .clone() để tạo một bản sao
        int[] mang5 = {1,4,5,6,3,2,5};
        int[] mang6 = mang5.clone();
        mang6[0] = 100;
        System.out.println("\n\n"+Arrays.toString(mang5));
        System.out.println(Arrays.toString(mang6));
        
    }
}
