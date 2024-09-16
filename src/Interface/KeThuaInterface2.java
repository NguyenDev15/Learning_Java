/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

/**
 *
 * @author hnguynis.no1
 */
public class KeThuaInterface2 implements NewInterface2,NewInterface{ // implements 2 interface
    
    /*
    Tóm lại một class có thể implements từ nhiều interface khác nhau
    
    nhưng phải @Override để định nghía lại các phương thức vì các phương thức gốc
    ở trong lớp cha đã là trừu tượng (abstract)
    */
    
    
    // NewInterface2
    @Override
    public void setThuong(int cccd, double doanhThu){
        
    }
    
    // NewInterface
    @Override
    public void thongTin(String ten, String cccd, int namSinh){
        
    }
    @Override
    public double tinhNgayLuong(double luongNgay, int soNgayCong){
        return luongNgay * soNgayCong;
    }
    
    
}
