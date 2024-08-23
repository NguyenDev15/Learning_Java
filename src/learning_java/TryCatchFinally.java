/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learning_java;

/**
 *
 * @author hnguynis.no1
 */
public class TryCatchFinally {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        
        try {
        int c = a/b;
            System.out.println("c = " + c);
        }
        catch(ArithmeticException e){
            System.out.println("Có lỗi toán học!");
            e.printStackTrace();
        }
        catch (Exception e) {
            System.out.println("Có lỗi!");
            e.printStackTrace();
        }
        finally{
            System.out.println("Có lỗi hay không đều phải làm cái này");
        }
        System.out.println("Đoạn code: ");
            
            
            
    }
}
