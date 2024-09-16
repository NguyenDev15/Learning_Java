/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TinhDaHinh;

/**
 *
 * @author hnguynis.no1
 */
public class TruongPhong extends NhanSu{

      // thêm constructor từ lớp Cha
    public TruongPhong(String ten, String queQuan, String cccd){
        super(ten,queQuan,cccd);
    }
    
    // @Override
    @Override
    public double tinhLuongNv(int ngayCong) {
        return 50 * ngayCong; // 50 đô 1 ngày công
    }
    
}
