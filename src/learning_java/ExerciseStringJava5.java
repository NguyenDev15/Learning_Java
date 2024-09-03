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
public class ExerciseStringJava5 {
    public static void main(String[] args) {
        /*
        đếm từ tôi trong chuỗi sau
        a = "tôi chăm học tôi chịu khó tôi đẹp trai";
        */
        
        String a = "tôi chăm học tôi chịu khó tôi đẹp trai";
        String[] words = a.split(" ");
        int count = 0;
        
        for(String pt : words){
           if(pt.equals("tôi")){
               count++;
           }
        }
        System.out.println("Số từ tôi trong chuỗi = " + count);
    }
}
