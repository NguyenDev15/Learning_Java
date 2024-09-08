/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learning_java;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 *
 * @author hnguynis.no1
 */
public class CollectionJava {
    public static void main(String[] args) {
        
        // Khi khai báo kiểu dữ liệu Collection thì phải đổi thành wrapper (in hoa kí tự đầu)
        // ví dụ boolean -> Boolean
        // int -> Integer
        // float -> Float
        // .....
        
        // 1. khai báo list
        ArrayList<Integer> lst = new ArrayList<>();
        // 2. khai báo với số lượng phần tử ban đầu
        ArrayList<Integer> lst2 = new ArrayList<>(5);
        // 3. khời tạo list với các phần tử ban đầu
        ArrayList<Integer> lst3 = new ArrayList<>(List.of(1,2,3,4,5,6));
        
        // xuất list
        System.out.println(lst);
        System.out.println(lst2);
        System.out.println(lst3);
        
        
        
        /* 
        Các phương thức: 
        1. add(index, element)
        2. size()
        3. get(int index)
        4. remove(int index)
        5. remove(Integer.valueOf(9));
        6. set(index, element)
        7. contains() 
        8. Collections.sort()
        9. indexOf()
        10. Collections.reverse -> đảo ngược list
        11. List.isEmpty
        12. clear() -> xóa
        */
        
        System.out.println("\nCác phương thức");
        
        // 1. add(index, element) -> thêm phần tử
        ArrayList<Integer> lst4 = new ArrayList<>();
        lst4.add(1);
        lst4.add(12);
        lst4.add(22);
        lst4.add(33);
        lst4.add(44);
        System.out.println("\n"+lst4);
        // add theo vị trí chỉ định
        lst4.add(2, 100); // add 100 vào index 2
        System.out.println(lst4);
        
        
        // 2. size() -> trả về số phần tử của list
        System.out.println("\nSố phần tử của list = " + lst4.size());
        
        
        // 3. get(int index) -> trả về giá trị list tại vị trí index
        System.out.println("\ngiá trị tại vị trí index 5 = "+ lst4.get(5));
        
        
        
        // 4. remove(int index) -> xóa theo index
        lst4.remove(2);
        System.out.println("\nlst4 sau khi xóa giá trị tại vị trí index 2: "  + lst4 );
        
        
        
        // 5. remove(Integer.valueOf(value)) -> xóa chỉ định
        ArrayList<Integer> lst5 =  new ArrayList<>(List.of(1,2,3,4,5));
        System.out.println("\nlst5 khi chưa xóa theo chỉ định: " + lst5);
        lst5.remove(Integer.valueOf(5));
        System.out.println("lst5 sau khi xóa giá trị chỉ định: " + lst5);
        
        
        
        // 6. set(index, element) -> thay đổi thông tin
        ArrayList<Integer> lst6 =  new ArrayList<>(List.of(2,9,3,5,8));
        System.out.println("\nlst6 ban đầu: " + lst6);
        lst6.set(1, 3);
        System.out.println("lst6 sau khi set tại vị trí index 1: " + lst6);
        
        
        
        // 7. contains() -> ktra 1 phần tử có nằm trong list không (Boolean)
        ArrayList<Integer> lst7 =  new ArrayList<>(List.of(2,4,6,8,10));
        boolean check = lst7.contains(5);
        System.out.println("\nCheck = " + check); // có thì true sai thì false
        
        
        
        // 8. Collections.sort() -> sắp xếp tăng dần
        ArrayList<Integer> lst8 =  new ArrayList<>(List.of(32,54,11,81,35,82));
        Collections.sort(lst8);
        System.out.println("\nlst8 sau khi sort: " + lst8);
        
        
        
       
        // 9.  indexOf() -> Tìm vị trí đầu tiên của element trong list
        // nếu không tìm thấy trả về -1
        ArrayList<Integer> lst9 =  new ArrayList<>(List.of(32,54,11,81,35,82));
        System.out.println("\nindexOf: " + lst9.indexOf(11));
        
        
        
        // duyệt list
        // cách 1
        ArrayList<Integer> lst10 =  new ArrayList<>(List.of(32,54,11,81,35,82));
        System.out.println("\nlst10 duỳng duyệt for");
        for(int vl : lst10){
            System.out.println(vl);
            
        }
        System.out.println("----------------------");
        // cách 2 khi cần sử dụng đến các vị trí index
        ArrayList<Integer> lst11 =  new ArrayList<>(List.of(32,54,11,81,35,82));
        for(int i = 0; i < lst11.size(); i++){
            int vl = lst11.get(i); 
            System.out.println(vl);
        }
        
        
        
        
        
    } 
}
