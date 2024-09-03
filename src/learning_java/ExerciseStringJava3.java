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
public class ExerciseStringJava3 {
    public static void main(String[] args) {
     
        // gọi hàm  và nhập liệu mật khẩu
        Scanner sc = new Scanner(System.in);
        String password = "";
        while(true){
            System.out.println("Mật khẩu có ít nhất 6 kí tự và bao gồm 1 chữ cái, 1 chữ số!");
            System.out.print("Mời thiết lập mật khẩu:  ");
            String scanPassword1 = sc.nextLine();
            // ktra tính hợp lệ
            if(checkPass(scanPassword1) == true){
                password = scanPassword1;
                System.out.println("Thiết lập mật khẩu thành công");
                break;
            }
            else{
                System.out.print("Thiết lập không hợp lệ, xin mời thiết lập lại:  ");
                scanPassword1 = sc.nextLine();
            }
        }
        
            // cho người dùng nhập vào mk để login, sai 5 lần thì khóa thoát ctr
            int count = 0;
            String login = "";
            while(true){
                System.out.print("Mời login password vừa thiết lập:  ");
                login = sc.nextLine();
                // ktra mật khẩu có giống mật khẩu vừa thiết lập không
                if(login.equals(password)){
                    System.out.println("Login Success!");
                    break;
                }
                else{
                    System.out.print("Sai mật khẩu, còn " + (5 - count) + " lần thử " + "\n");
                    count++;
                    if(count == 6){
                        System.out.println("Bạn đã bị khóa account!");
                        break;
                    }
                }
            }
            
            
    }
   
    // hàm ktra tính hợp lệ của mật khẩu
    public static boolean checkPass(String password){
        // ktra độ dài
        if(password.length() < 6){
            return false;
        }
        // ktra xem mk có chứa ít nhất 1 chữ cái hay không
        boolean hasLetter = false;
        for(char c : password.toCharArray()){
           if(Character.isLetter(c)){
               hasLetter = true; 
               break;
           }
        }
        if(hasLetter == false){
            return false;
        }
        
        // ktra xem mk có chứa ít nhất 1 chữ số hay không
        boolean hasNumber = false;
        for(char c : password.toCharArray()){
            if(Character.isDigit(c)){
            hasNumber = true;
            break;      
            }
        }
        if(hasNumber == false){
            return false;
        }
        
        // Tổng hàm, nếu mk đầy đủ độ dài và chữ cái chữ số thì return true
        return true;
             
        
    }
}
