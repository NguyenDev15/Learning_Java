
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

public class ExerciseStringJava7 {
    public static void main(String[] args) {
        /*
        Viết chương trình trích lọc string từ đường dẫn 
        D:/galailaptrinh/music/remix.mp3
        Tách tên tệp bao gồm cả đuôi remix.mp3
        Tách tên file remix
        */
        
        // tìm vị trí dấu gạch cuối cùng trong chuỗi
        String path = "D:/galailaptrinh/music/remix.mp3";
        int last$lastIndex = path.lastIndexOf("/");
        // lấy từ vị trí dấu gạch cuối đến hết chuỗi (dùng substring)
        String fileName = path.substring(last$lastIndex + 1);
        System.out.println(fileName);
        // lấy từ vị trí dấu gạch cuối cùng đến hết chữ remix và dùng replace để xóa .mp3
        String fileNameRemix = path.substring(last$lastIndex + 1);
        String replaceFileName = fileNameRemix.replace(".mp3", "");
        System.out.println(replaceFileName);
        
        
    }
}
