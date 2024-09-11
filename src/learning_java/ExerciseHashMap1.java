/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learning_java;
import java.util.Scanner;
import java.util.HashMap;
/**
 *
 * @author hnguynis.no1
 */
public class ExerciseHashMap1 {
    public static void main(String[] args) {
        

        // Tạo 1 HashMap để chứa username và password
        HashMap<String, String> users = new HashMap<>();
        
        // dữ liệu trong HashMap
        users.put("user 1", "abc1");
        users.put("user 2", "abc2");
        users.put("user 3", "abc3");
        users.put("user 4", "abc4");
        users.put("user 5", "abc5");
        users.put("user 6", "abc6");
        users.put("user 7", "abc7");
        users.put("user 8", "abc8");
        users.put("user 9", "abc9");
        users.put("user 10", "abc10");
        
        
        // khởi tạo Scanner
        Scanner sc = new Scanner(System.in);
        
        
        
        // check user có tồn tại, sai thì nhập lại
        System.out.print("Username: ");
        String userName = sc.nextLine();
        while(true){
                
        if(users.containsKey(userName) == false){
            // nếu kco key nào trong HashMap users
            // thì user không tồn tại
            System.out.print("User không tồn tại! Nhập lại: ");
            userName = sc.nextLine();
            }else{
                break;
            }
                
        }
        
        
        // check password sau khi user đã tồn tại, sai thì nhập lại
        System.out.print("Password: ");
        String passWord = sc.nextLine();
        while(true){
            if(users.get(userName).equals(passWord) == false){
            // ktra xem password nhập vào có đúng không
            System.out.print("Sai password! Nhập lại: ");
            passWord = sc.nextLine();
        }
        else{
            System.out.println("Login Success!");
            break;
        }
        }
         
        
        
        
        
        
                
    }
}
