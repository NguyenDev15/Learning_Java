/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TruongDaiHoc;

/**
 *
 * 
 */
public class SinhVien {
    // lập trình hướng đối tượng
    
    /*
    Các mức độ truy xuất
    public > protected > (Không ghi gì) > private
    tùy theo mức độ sẽ không được truy xuất từ bên ngoài
    public sẽ truy xuất được ở tất cả
    */
    
    // thuộc tính
    protected String hoTen;
    private double diem;
    
    
    
    // constructor mặc định
    /* khởi tạo các giá trị mặc định 
    khi đối tượng vừa được tạo ra 
    */
    public SinhVien(){
        hoTen = "No Name";
        diem = 10;
    }
    // constructor có đối số

    public SinhVien(String hoTen, double diem) {
        this.hoTen = hoTen;
        this.diem = diem;
    }
    
    
    
    
    // phương thức ( các hàm )
    public void hienThiThongTin(){
        System.out.println(hoTen + " : " + diem);
    }
    
    
    //getter and setter -> dùng khi mà có thể chỉnh sửa đối tượng đã private
    // sử dụng gián tiếp
    public double getDiem() {
        return diem;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }
    
    
    
    
}
