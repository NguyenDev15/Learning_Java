/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CongTy;

/**
 *
 * @author hnguynis.no1
 */
public class NhanVienHanhChinh extends NhanVien{
    // Nhân Viên Hành Chính sẽ kế thừa từ NhanVien
    public NhanVienHanhChinh(String ten, String quequan, int cccd){
        super(ten, quequan, cccd);  // sử dụng super để gọi constructor từ class cha
    }

    @Override
    public double tinhLuong() {
        return luongcoban;
    }
    
    
}
