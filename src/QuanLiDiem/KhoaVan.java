/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLiDiem;

/**
 *
 * @author hnguynis.no1
 */
public class KhoaVan extends NamHoc2024{

    public KhoaVan(String ten, String ccccd) {
        super(ten, ccccd);
    }
    
    // override có tác dụng cùng tên phương thưc nhưng tính năng khác nhau
    @Override
    public void tinhDiemTrungBinh(){
        System.out.println("Đây là tính điểm tb của Khoa Văn");
    }
}
