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
public class ExerciseArrayList5 {
    public static void main(String[] args) {
        
        // cho list={1,9,3,14,5,27,8}
        // Viết chương trình in số lớn thứ 2 và số nhỏ thứ hai trong list
        // In ra vị trí index số đó
        
        
        // tạo list ban đầu
        ArrayList<Integer> list = new ArrayList<>(List.of(1,9,3,14,5,27,8));
        
        // copy list sang list mới khác
        ArrayList<Integer> copy = new ArrayList<>(list);
        // in thử
        System.out.println("list đã copyy = " + copy);
        // sắp xếp tăng dần
        Collections.sort(copy);
        System.out.println("list copy sau sắp xếp = " + copy);
        
        // in ra số lớn thứ 2 và nhỏ thứ 2 trong list
        
        int soLonNhat2 = copy.get(copy.size() - 2);
        int soNhoNhat2 = copy.get(1);
        
        System.out.println("Số lớn nhất = " + soLonNhat2);
        System.out.println("Số nhỏ nhất = " + soNhoNhat2);
        
        System.out.println("Vị trí index số lớn nhất = " + copy.indexOf(soLonNhat2));
        System.out.println("Vị trí index số nhỏ nhất = " + copy.indexOf(soNhoNhat2));
        
        
        
    }
}
