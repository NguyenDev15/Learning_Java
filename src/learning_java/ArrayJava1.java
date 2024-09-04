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
public class ArrayJava1 {
    public static void main(String[] args) {
        // Khai báo mảng
        String[] arrString;
        Double[] arrDouble;
        Float[] arrFloat;
        
        // Khai báo mảng kèm theo kích thước
        String[] arrString2 = new String[12];
        int[] arrInt = new int[20];
        
        // Khai báo mảng có sẵn giá trị ban đầu
        String[] arrString3 = new String[]{"chí phèo", "thị nở", "ông giáo"};
        int[] arrInt2 = new int[]{1,2,3,4,5,6,7,8,9,10};
        
        // Truy xuất phần tử của mảng dựa theo index
        System.out.println(arrInt2[7]);
        System.out.println(arrString3[2]);
        
        // Length của Array bắt đầu từ 1
        System.out.println(arrInt2.length);
        
        // Duyệt mảng dùng for
        System.out.println("\nDUYỆT MẢNG DÙNG FOR\n"
                + "Cách 1:");
        // Cách 1
        int[] arrInt3 = new int[]{1,2,3,4,5,6,7,8,9,10};
        for(int pt : arrInt3){
            System.out.println(pt);
        }
        String[] arrString4 = new String[]{"chí phèo", "thị nở", "ông giáo"};
        for(String pt : arrString4){
            System.out.println(pt);
        }
        
        // Cách 2
        System.out.println("Cách 2:");
        int[] arrInt4 = new int[]{1,2,3,4,5,6,7,8,9,10};
        for(int i = 0; i < arrInt4.length; i++){
            System.out.println(arrInt4[i]);
        }
        
        System.out.println("\nUpdate toàn bộ mảng");
        // update toàn bộ danh sách
        int[] arrInt5 = new int[]{1,2,3,4,5,6,7,8,9,10};
        for(int i = 0; i < arrInt5.length; i++){
            System.out.println(arrInt5[i] + 5);
        }
    }
}
