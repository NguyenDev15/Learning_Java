/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLiDiem;

/**
 *
 * @author hnguynis.no1
 */
public class DiemDatabase {
    public static void main(String[] args) {
        // tạo đối tượng từ khoa toán
        KhoaToan toan1 = new KhoaToan("Nguyễn A", "0001234");
        toan1.tinhDiemTrungBinh();
        
        // override có tác dụng cùng tên phương thưc nhưng tính năng khác nhau
        
        // tạo đối tượng từ khoa văn
        KhoaVan van1 = new KhoaVan("Nguyễn B", "000112445");
        van1.tinhDiemTrungBinh();
    }
}
