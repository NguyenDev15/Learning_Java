/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TinhDaHinh;

/**
 *
 * @author hnguynis.no1
 */
public abstract class NhanSu { // NhanSu sẽ là class Cha của TruongPhong, PhoPhong
    // thêm thuộc tính
    private String ten;
    private String queQuan;
    private String cccd;

    public NhanSu(String ten, String queQuan, String cccd) {
        this.ten = ten;
        this.queQuan = queQuan;
        this.cccd = cccd;
    }
    
    
    // phương thức trừu tượng tính lương
    public abstract double tinhLuongNv(int ngayCong);
    
   
    // vì thuộc tính đang private nên cần sử dụng setter and getter
    public String getTen(){
        return ten;
    }
    public String getQuequan(){
        return queQuan;
    }
    public String getCccd(){
        return cccd;
    }
}
