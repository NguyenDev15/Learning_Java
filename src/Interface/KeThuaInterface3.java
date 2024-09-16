/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

/**
 *
 * @author hnguynis.no1
 */
public class KeThuaInterface3 implements NewInterface3{

    
    /*
     - Có thể thấy KeThuaInterface3 là kế thừa của NewInterface3
     - Mà NewInterface3 kế thừa từ 2 Interface khác, nên ở trong
    KeThuaInterface3 phải @Override lại tất cả từ chính bản thân,
    được kế thừa, phải định nghĩa lại hết vì các phương thức lúc
    này là 1 trừu tượng (abstract)
    */
    
    @Override
    public void X(String x) {
    
    }
    @Override
    public void thongTin(String ten, String cccd, int namSinh) {
    
    }
    @Override
    public double tinhNgayLuong(double luongNgay, int soNgayCong) {
        return luongNgay * soNgayCong;
    }

    @Override
    public void setThuong(int cccd, double doanhThu) {
     
    }
}
