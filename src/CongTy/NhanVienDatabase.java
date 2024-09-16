/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CongTy;

/**
 *
 * @author hnguynis.no1
 */
public class NhanVienDatabase {
    public static void main(String[] args) {
        // tạo đối tượng là NhanVien
//        NhanVien nv1 = new NhanVien("Nhân viên 1", "Hà Nội", 10102222);
//        double luongnv1 = nv1.tinhLuong();
//        System.out.println("Lương nhân viên 1: " + luongnv1 + " $");   
        
        // tạo đối tượng là NhanVienHanhChinh
        NhanVienHanhChinh nvhc1 = new NhanVienHanhChinh("Nhân viên hc 1", "Tp.HCM", 10103333); 
        double luongnvhc1 = nvhc1.tinhLuong();
        System.out.println("Lương của nhân viên hành chính 1: " + luongnvhc1 + " $");
        
        
        
        // tạo đối tượng là NhanVienDiCa
        NhanVienDiCa nvdc1 = new NhanVienDiCa("Nhân viên dc 1", "Bình Định", 101095342);
        double luongnvdc1 = nvdc1.tinhLuong();
        System.out.println("Lương của nhân viên đi ca 1: " + luongnvdc1 + " $");
        
        // tạo đối tượng là NhanVienDiCa nhưng có thuộc tính ca không kế thừa từ NhanVien
        NhanVienDiCa nvdc2 = new NhanVienDiCa("Nhân viên đc 2", "Hậu Giang", 1010342346, 1);
        double luongnvdc2 = nvdc2.tinhLuong();
        System.out.println("Lương của nhân viên đi ca 2: " + luongnvdc2 + " $");
        System.out.println("Ca làm của nhân viên đi ca 2: " + nvdc2.ca);
    
    
    
    
    
    }
}
