/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learning_java;

/**
 *
 * @author hnguynis.no1
 */
public class VariableDeclaration {
    public static void main(String[] args) {
        // khai báo biến
        int a;
        byte tuoi;
        float diemToan;
        // khai báo cùng lúc nhiều biến
        int b,c,d,e;
        
        // khời tạo biến
        int tuoiCon = 10;
        float diemVan = 7.5f; // kiểu float khi khời tạo phải thêm f vào phía sau
        double diemHoa = 7.5; // kiểu double thì không cần
        System.out.println(tuoiCon);
        // thay đổi giá trị tuoiCon và xuát ra 
        tuoiCon = 15;
        System.out.println(tuoiCon);
        
        // hằng số 
        final int DOSOI =  100; // hằng số không thể thay đổi giá trị (final + kiểu dữ liệu)
        System.out.println(DOSOI);
        
        /* Quy tắc đặt tên biến thì vẫn theo như cấc ngôn ngữ khác
        - Quy tắc lạc đà
        */
        
    }
}
