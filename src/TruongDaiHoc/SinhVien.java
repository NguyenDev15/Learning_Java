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
    // phương thức không có kiểu trả về
    public void hienThiThongTin(){
        System.out.println(hoTen + " : " + diem);
    }
    // phương thức có kiểu trả về
    public double tinhDTB(double diemToan, double diemVan){
        return (diemToan + diemVan) / 2;
    }
    // overloading methods
     public double tinhDTB(double diemToan, double diemVan, double diemAnh){
        return (diemToan + diemVan + diemAnh) / 3;
    }
    // parameters list
     public double tongDiem(double ... arr){
         double tong = 0.0;
         for(double x : arr){
             tong += x; 
         }
         return tong;
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
    
    
    // toString
    @Override
    public String toString() {
        return "SinhVien{" + "hoTen= " + hoTen + ", diem= " + diem + '}';
    }
    
    
    // support methods and service methods
    // 1. support methods chỉ sử dụng nội tại trong class
    private boolean checkDiem(){
        return this.diem >= 24;
    }
    // 2. service methods có thể gọi từ chương trình chính
    public void checkHopLeDiem(){
        if(checkDiem()){
            System.out.println("Điểm hợp lệ, tiếp tục nhập thông tin");
        }else{
            System.out.println("Kiểm tra điểm đầu vào của sinh viên");
        }
    }
    
    
}
