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
public class StringMethods {
    public static void main(String[] args) {
        
          // StringBuilder part 1
        StringBuilder str = new StringBuilder();
        // các phương thức thường dùng 
        // 1. append(); -> thêm vào cuối chuỗi
        str.append("Xin chào! ");
        str.append("mình mới học lập trình, hihi");
        System.out.println(str);
        // 2. insert(index, chuỗi cần chèn)
        str.insert(32, " Java");
        System.out.println(str); // thêm vào sau chữ trình
        // 3. delete(start, end - 1)
        str.delete(32, 37); // xóa chữ Java
        System.out.println(str);
        // 4. str.length() -> trả về độ dài của chuỗi
        System.out.println("Độ dài của chuỗi là: " + str.length());
        
        /* StringBuilder part 2
        1. indexOf
        2. LastIndexOf
        3. contains
        4. substring
        5. replace
        6. replaceAll
        7. trim
        8. compareTo - compareTolnoreCase
        9. split
        10. toUpperCase - toLowerCase
        11. toCharArray
        12. reverse
        13. join
        */
        
        // 1. indexOf -> ktra vị trí xuất hiện đầu tiên của ký tự hoặc chuỗi
        // trả về -1 nếu không tìm thấy
        String chuoi = "huhu haha hihi";
        System.out.println("indexOf = " + chuoi.indexOf("huhu"));
        
        // 2. LastIndexOf -> ktra vị trí xuất hiện cuối cùng của ký tự hoặc chuỗi
        // trả về -1 nếu không tìm thấy
        System.out.println("LastIndexOf = " + chuoi.lastIndexOf("hihi"));
       
        // 3. contains -> ktra chuỗi con
        String chuoi2 = ".mp3";
        String chuoi3 = "zing.mp3";
        // ktra chuoi3 có chứa cụm String của chuoi2 không
        boolean checkString = chuoi3.contains(chuoi2);
        if(checkString == true){
            System.out.println("có .mp3 trong chuỗi");
        }
        else{
            System.out.println("Không tìm thấy .mp3 trong chuỗi");
        }
        
        // 4. substring -> Trích lọc chuỗi con từ chuỗi ban đầu
        // substring(int beginIndex)
        // substring(int beginIndex, int endIndex)
        String chuoi5 = "abcdefg";
        String chuoi6 = chuoi5.substring(2,6);// lấy từ 2 đến 6 - 1
        System.out.println("substring = " + chuoi6);
        
        // 5. replace("str old", "str new") -> thay thế toàn bộ
        String chuoi7 = "Tôi đi tìm Tôi";
        String chuoi8 = chuoi7.replace("Tôi", "Bạn");
        System.out.println("Chưa replace = " + chuoi7);
        System.out.println("Đã replace = " + chuoi8);
        
        // 6. replaceFirst("str old", "str new") -> thay thế từ đầu tiên gặp được
         String chuoi9 = chuoi7.replaceFirst("Tôi", "Bạn");
        System.out.println("Chưa replaceFirst = " + chuoi7);
         System.out.println("Đã replaceFirst = " + chuoi9);
         
         // 7. trim() -> xóa toàn bộ space ở đầu và cuối
         String chuoi10 = "       Gà lại lập trình        ";
         String chuoi11 = chuoi10.trim();
         System.out.println("chưa trim = " +chuoi10);
         System.out.println("trim = " + chuoi11);
         // 7.1 trim() -> mẹo xóa khoảng trắng ở cuối
         // vì Java không hỗ trợ trimStart hoặc trimEnd nên dùng mẹo
         // cách 1: dùng biểu thức chính quy (regular expression)
         // dùng \\s+$ để xóa tất cả khoảng trắng ở cuối chuỗi
         String chuoi12 = chuoi10.replaceAll("\\s+$", "");
         System.out.println("chưa xóa khoảng trắng ở cuối = " +chuoi10);
         System.out.println("xóa khoảng trắng ở cuối = " +chuoi12);
         // 7.2 trim() -> mẹo xóa khoảng trắng ở đầu
         // vì Java không hỗ trợ trimStart hoặc trimEnd nên dùng mẹo
         // cách 1: dùng biểu thức chính quy (regular expression)
         // dùng ^\\s+ để xóa tất cả khoảng trắng ở đầu chuỗi
         String chuoi13 = "       Gà lại lập trình        ";
         String chuoi14 = chuoi13.replaceFirst("^\\s+", "");
         System.out.println("chưa xóa khoảng trắng ở đầu = " + chuoi13);
         System.out.println("xóa khoảng trắng ở đầu = " + chuoi14);
         
         // 8. compareTo -> so sánh 2 chuỗi có phân biệt hoa thường
         String chuoi15 = "abcabc";
         String chuoi16 = "Abcabc";
         int x = chuoi15.compareTo(chuoi16);
         System.out.println("compareTo = " + x); // 2 chuỗi giống nhau thì trả về 0
         // ngược lại 2 chuỗi khác nhau sẽ trả về giá trị trong ASCII 
         // tùy vào vị trí trong ASCII mà sẽ trả số âm hoặc số dương 
         // 8.1 compareTolgnoreCase -> so sánh 2 chuỗi nhưng không phân biệt hoa thường
         int x1 = chuoi15.compareToIgnoreCase(chuoi16);
         System.out.println("compareTolgnoreCase = " + x1); // trả về 0 nếu giống nhau
         // và không phân biệt hoa thường
         
         // 9. split() -> tách chuỗi
         String chuoi17 = "Hello , World";
         String[] mang = chuoi17.split(" , ");
         // duyệt mảng
         for(int i = 0; i < mang.length; i++){
            System.out.println(mang[i]);
        }
         
         // 10. toUpperCase() -> in hoa
         String chuoi18 = "tự học chấm cc";
         System.out.println("toUpperCase = " + chuoi18.toUpperCase());
         // 10.1 toLowerCase -> in thường
         String chuoi19 = "TỰ HỌC CHẤM CC";
         System.out.println("toLowerCase = " + chuoi19.toLowerCase());
            
         // 11. toCharArray() - > tách chuỗi thành từng kí tự
         String chuoi20 = "abcdefg1234356487";
         char[] mang2 = chuoi20.toCharArray();
         for(int i = 0; i < mang2.length; i++){
            System.out.println(mang2[i]);
        }
         
        // 12. reverse() -> đảo ngược chuỗi
        String chuoi21 = "Em Yêu Tôi";
        // khai báo đối tượng thuộc class StringBuilder
        StringBuilder sb = new StringBuilder(chuoi21);
        sb.reverse();
        String chuoi22 = sb.toString();// chuyển sang chuỗi
        System.out.println("reverse = " + sb);
 
    }
}
