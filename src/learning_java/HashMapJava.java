/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learning_java;
import java.util.HashMap;
import java.util.Scanner;
/**
 *
 * @author hnguynis.no1
 */
public class HashMapJava {
    public static void main(String[] args) {
        // khai báo HashMap cũng gần như tương tự với ArrayList
        // Kiểu dữ liệu được khai báo dưới dạng wrapper
        HashMap<Integer, String> map1 = new HashMap<>(); // <key,value>
        HashMap<Integer, Float> map2 = new HashMap<>();
        
        //
        /*
        Các phương thức 
        1. put(key,value) -> Thêm 1 phần tử theo cặp key,value
        2. get(key) -> Truy xuất giá trị thông qua key
        3. remove(key) -> Xóa 1 phần tử ( XÓA CẢ CẶP KEY,VALUE)
        4. containsKey(key) -> Ktra xem key có tồn tại trong HashMap ?
        5. containsValue(value) -> Ktra xem value có tồn tại trong HashMap ?
        6. isEmpty() -> Ktra xem HashMap có rỗng hay không
        7. size() -> Ktra số lượng phần tử trong HashMap
        */
        
        // 1. thêm các phần tử | put(key,value)
        // key phải khác nhau nếu trùng sẽ bị đè lên nhau
        map1.put(1,"Hoa Hồng");
        map1.put(2,"Hoa Lan");
        map1.put(3,"Hoa 10 Giờ");
        
        // 2. lấy giá trị của 1 phần tử | get(key)
        String value1 = map1.get(1);
        String value2 = map1.get(2);
        String value3 = map1.get(3);
        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);
        
        // 3. xóa phần tử khỏi HashMap | remove(key)
        map1.remove(1);
        System.out.println(map1.get(1));
        
        // 4. Ktra xem key có tồn tại trong HashMap ? | containsKey(key)
        boolean check = map1.containsKey(1);
        System.out.println(check);
        
        // 5. Ktra xem value có tồn tại trong HashMap ? | containsValue(value)
        boolean valueCheck = map1.containsValue("Hoa Lan");
        System.out.println(valueCheck);
        
        // 6. Ktra xem HashMap có rỗng hay không | isEmpty()
        boolean isEmpty = map1.isEmpty();
        System.out.println(isEmpty);
        
        // 7. Ktra số lượng phần tử trong HashMap | size()
        int soLuong = map1.size();
        System.out.println("size = " + soLuong);
        
        
        // DUYỆT HASHMAP 
        for(Integer key : map1.keySet()){
            String value = map1.get(key);
            System.out.println(key+ " : " + value);
        }
    }
}
