/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLiDiem;

/**
 *
 * @author hnguynis.no1
 */
public class KhoaToan extends NamHoc2024{
    public KhoaToan(String ten, String cccd){
        super(ten, cccd);
    }
    
    // override có tác dụng cùng tên phương thưc nhưng tính năng khác nhau
    @Override
    public void tinhDiemTrungBinh(){
        System.out.println("Đây là phương thức của Khoa Toán");
    }
}
