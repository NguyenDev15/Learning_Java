/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CongTy;

/**
 *
 * @author hnguynis.no1
 */
public abstract class NhanVien {
   // thuộc tính
    protected String ten;
    protected String quequan;
    protected int cccd;
    protected double luongcoban = 850;
    
    // constructor
    public NhanVien(String ten, String quequan, int cccd){
        this.ten = ten;
        this.quequan = quequan;
        this.cccd = cccd;
    }    
    
    
   // abstract methods
   /* trong lớp có phương thức là abstract thì class cũng phải abstract
    Đặc biệt: phương thức abstract sẽ không có phần thân    
    nên các class được kế thừa phải tự định nghĩa lại phương thức
    Và: abstract methods là trừu tượng, nên không thể khởi tạo nó bằng new ( new NhanVien ...)
    */
    // phương thức abstracs
    public abstract double tinhLuong();
        
    
}
