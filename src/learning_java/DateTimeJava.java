/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learning_java;
import java.util.Scanner;
// khai báo thư viện của DateTime
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
/**
 *
 * @author hnguynis.no1
 */
public class DateTimeJava {
    public static void main(String[] args) {
        // Date time trong java
        
        // khởi tạo
        Calendar cal = Calendar.getInstance();
        // get toàn bộ thông tin về ngày giờ,...
        System.out.println(cal);
        
        // get năm, tháng, ngày
        int nam = cal.get(Calendar.YEAR);
        int thang = cal.get(Calendar.MONTH);
        int ngay = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println(nam);
        System.out.println(thang + 1); // +1 vào mới đúng tháng thực tế
        System.out.println(ngay);
        
        // set ngày tháng năm theo ý muốn
        cal.set(Calendar.YEAR,2000);
        cal.set(Calendar.MONTH,11);
        cal.set(Calendar.DAY_OF_MONTH,13);
        // kiểm tra ngày tháng năm sau khi thiết lập
        int namSinh = cal.get(Calendar.YEAR);
        int thangSinh = cal.get(Calendar.MONTH);
        int ngaySinh = cal.get(Calendar.DAY_OF_MONTH);
        // xuất 
        System.out.println("Ngày tháng năm sinh: "
                + ngaySinh + "/" 
                + (thangSinh + 1) + "/" 
                + namSinh);
        
        // xuất theo định dạng
        SimpleDateFormat dinhDang = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
        // tạo một đối tượng date để get time trong đối tượng cal
        Date d = cal.getTime();
        String s = dinhDang.format(d);
        System.out.println(s);
        
        
        
       try{
            /* Viết chương trình nhập vào ngày, tháng, năm sinh.
        cho biết số tuổi và in ra màn hình
        */
        Scanner sc = new Scanner(System.in);
        int day1, month1, year1;
        System.out.print("Mời nhập vào ngày sinh: ");
        day1 = sc.nextInt();
        System.out.print("Mời nhập vào tháng sinh: ");
        month1 = sc.nextInt();
        System.out.print("Mời nhập vào năm sinh: ");
        year1 = sc.nextInt();
        // khởi tạo
        Calendar birthday = Calendar.getInstance();
        // set 
        birthday.set(year1, month1 - 1, day1);
        // xuất ngày tháng năm sinh
        int namSinh1 = birthday.get(Calendar.YEAR);
        int thangSinh1 = birthday.get(Calendar.MONTH);
        int ngaySinh1 = birthday.get(Calendar.DAY_OF_MONTH);
        System.out.println("Ngày tháng năm sinh: "
                + ngaySinh1 + "/"
                + (thangSinh1 + 1) + "/"
                + namSinh1);
        // tính tuổi
        Calendar now = Calendar.getInstance();
        int namNow = now.get(Calendar.YEAR);
        int age = namNow - namSinh1;
        System.out.println("Tuổi của bạn là: " + age);
       }
       catch(Exception e){
           System.out.println("Mày ở hành tinh nào!");
       }
    }
}
