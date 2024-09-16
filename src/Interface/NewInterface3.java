/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interface;

/**
 *
 * @author hnguynis.no1
 */
public interface NewInterface3 extends NewInterface,NewInterface2{
    
    // Kế thừa interface với nhau thì dùng extend
    // Kế thừa, dẫn xuất từ class thì phải dùng implements với interface
    
    public abstract void X(String x);
}
