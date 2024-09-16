/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

/**
 *
 * @author hnguynis.no1
 */
public class InterfaceDatabase {
    public static void main(String[] args) {
        KeThuaInterface ktInterface1 = new KeThuaInterface();
        double  luongKT1 = ktInterface1.tinhNgayLuong(100, 31);
        System.out.println("Tiền lương của KT1: " + luongKT1);
    }
}
