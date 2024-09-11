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
        sv3.setDiem(100);
        sv3.setHoTen("Tui mới sửa tên thông qua setter");
        sv3.hienThiThongTin();
        
        
        
        
        

        
        
        
        
        
    }
}
