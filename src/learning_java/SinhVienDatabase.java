/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learning_java;

import TruongDaiHoc.SinhVien;

/**
 *
 * @author hnguynis.no1
 */
public class SinhVienDatabase {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien();
        SinhVien sv2 = new SinhVien();
        sv1.hienThiThongTin();
        sv2.hienThiThongTin();
        
        SinhVien sv3 = new SinhVien("TUI LÀ TÊN", 9);
        sv3.hienThiThongTin();;
        
        
        
        /* getter và setter dùng để truy cập và có thể chỉnh sửa
        khi mà đối tượng đã được private hoặc protected
        getter: lấy thông tin
        setter: sửa thông tin
        */
        // dùng getter
        System.out.println(sv3.getHoTen());
        System.out.println(sv3.getDiem());
        // dùng setter
        sv3.setDiem(2.9);
        sv3.setHoTen("Tui mới sửa tên thông qua setter");
        sv3.hienThiThongTin();
        
        
        
        // test phương thức có kiểu trả về
        double dtbSv3 = sv3.tinhDTB(7.5,5.5);        
        System.out.println("Điểm trung bình Toán Văn sv3 = " + dtbSv3);

       
        
        // test phương thức toString
        System.out.println(sv3);
        
        
        
        // // support methods and service methods
        // sv3.checkDiem(); -> vì là support methods nên không thể gọi từ bên ngoài
        sv3.checkHopLeDiem();
        
        
        
        // overloading methods
        /* hiểu rằng là khi các phương thức trong class
        được tạo cùng tên nhưng khác về signature
        ( cùng tên phương thức nhưng khác sau về số lượng parameter )
        */
        double overLoading = sv3.tinhDTB(6, 7, 8);
        System.out.println("Điểm trung bình sv3 Toán Văn Anh = " + overLoading);
        
        
        
        // parameter list
        /*
        dùng khi không nắm rõ parameters sẽ đưa vào
        bao nhiêu cũng truyền vào được
        */
        double parameterList = sv3.tongDiem(7,3,8,3,5,7,8,5);
        System.out.println("Parameters List = " + parameterList);
        
    }
}
