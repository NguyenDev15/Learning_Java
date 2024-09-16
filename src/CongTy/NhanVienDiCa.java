/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CongTy;

/**
 *
 * 
 */
public class NhanVienDiCa extends NhanVien{
    
    // thêm thuộc tính mới của class NhanVienDiCa
    protected int ca;
    
    // Nhân Viên Đi Ca sẽ kế thừa từ NhanVien
    public NhanVienDiCa(String ten, String quequan, int cccd){
        super(ten, quequan, cccd); // sử dụng super để gọi constructor từ class cha
        
    }
    
    // overloading 
     public NhanVienDiCa(String ten, String quequan, int cccd, int ca){
        super(ten, quequan, cccd); // sử dụng super để gọi constructor từ class cha
        this.ca = ca;
    }

    @Override
    public double tinhLuong() {
       return luongcoban * 1.05;
    }
}
