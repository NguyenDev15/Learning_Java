/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interface;

/**
 *
 * @author hnguynis.no1
 */
public interface NewInterface {
    
    // tập các thuộc tính ( chỉ được phép là hằng số)
    static final double phuCap = 15;

    // các phương thức lúc này phải là trừu tượng
    // mà trừu tượng thì kco body
    public abstract void thongTin(String ten, String cccd, int namSinh);
    public abstract double tinhNgayLuong(double luongNgay, int soNgayCong);

}
