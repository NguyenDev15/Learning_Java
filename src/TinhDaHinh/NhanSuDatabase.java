/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TinhDaHinh;

/**
 *
 * @author hnguynis.no1
 */
public class NhanSuDatabase {
    public static void main(String[] args) {
        NhanSu ns1 = new PhoPhong("Tui là tui", "Không biết", "00012455");
        
        
        // xem các thuộc tính đã bị private thông qua setter
        System.out.println("Ns1 đang làm Phó Phòng");
        System.out.println("Họ và tên: " +ns1.getTen());
        System.out.println("Quê Quán: " +ns1.getQuequan());
        System.out.println("Cccd: " +ns1.getCccd());
        // xuất lương phó phòng
        System.out.println(ns1.tinhLuongNv(15));
        
        System.out.println("");
        
        // thay đổi chức vụ từ phó thành trưởng
        ns1 = new TruongPhong("Tui là tui", "Không biết", "00012455");
        // in lương khi ns1 làm trưởng phòng
        System.out.println("Ns1 đang làm Trưởng Phòng");
        System.out.println("Họ và tên: " +ns1.getTen());
        System.out.println("Quê Quán: " +ns1.getQuequan());
        System.out.println("Cccd: " +ns1.getCccd());
        System.out.println(ns1.tinhLuongNv(15));
                
        
        
    }
}
