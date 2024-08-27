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
public class MathJava {
    public static void main(String[] args) {
        // Math trong Java
        
        // Pi
        System.out.println("PI = " + Math.PI);
        // abs (trị tuyệt đối)
        int a =  Math.abs(-8);
        System.out.println("Abs 8 = " + a);
        // max, min
        System.out.println( "Max = " + Math.max(1, 2));
        System.out.println("Min = " + Math.min(1, 2));
        // sqrt( căn bậc 2 )
        System.out.println("sqrt 4 = " + Math.sqrt(4));
        // pow(mũ/lũy thừa)
        System.out.println("pow 3 mũ 2 = " + Math.pow(3,2));
        // sin cos tan
        int goc = 90;
        double sin = Math.sin(Math.PI * goc / 180);
        double cos= Math.cos(Math.PI * goc / 180);
        double tan = Math.tan(Math.PI * goc / 180);
        System.out.println("sin 90 = " + sin);
        System.out.println("cos 90 = " + cos);
        System.out.println("tan 90 = " + tan);
        System.out.println("cot 90 = " + 1/tan);
    }
}
