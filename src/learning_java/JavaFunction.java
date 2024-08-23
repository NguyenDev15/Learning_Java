/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learning_java;

import java.util.Scanner;

/**
 *
 * @author hnguynis.no1
 */
public class JavaFunction {
    public static void main(String[] args) {
        // hàm có giá trị và có return
        int kq = Cong(1,2,3);
        System.out.println("Tông x,y,z = " + kq);
        
        // hàm void không có giá trị trả về
        XinChao("male");
        XinChao("female");
        XinChao("meo meo");
        
        // bài tập giải pt bậc 2 sử dụng hàm
        // cho người dùng nhập vào a,b,c và tính ptB2
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời nhập vào a: ");
        double a = sc.nextDouble();
        System.out.print("Mời nhập vào b: ");
        double b = sc.nextDouble();
        System.out.print("Mời nhập vào c: ");
        double c = sc.nextDouble();
        String kqPtBacHai = ptBHai(a,b,c);
        System.out.println(kqPtBacHai);
        
        // bài tập phép toán
        System.out.print("Mời nhập vào n: ");
        double n = sc.nextDouble();
        System.out.print("Mời nhập vào m: ");
        double m = new Scanner(System.in).nextDouble();
        System.out.println("Mời nhập vào phép toán bạn chọn: + - * /");
        String phepToan = new Scanner(System.in).nextLine();
        String kqPhepToan = tinhToan(n,m,phepToan);
        System.out.println(kqPhepToan);
    }
   
    
    
    
    
    // khai báo hàm có giá trị trả về phải có return
    public static int Cong(int x, int y, int z){
            return x + y + z;
    }
    
    // hàm thủ tục (void) thì không cần return
    public static void XinChao(String gioiTinh){
        if(gioiTinh.equals("female")){
            System.out.println("Tôi là nữ");
        }
        else if(gioiTinh.equals("male")){
        System.out.println("Tôi là nam");
        }
        else{
            System.out.println("Giới tính không xác định!");
        }
    }
    
    // hàm tính pt bậc 2
    public static String ptBHai(double a, double b, double c) {
        
        String result = "";
        double delTa = (b * b) - (4 * a * c);
        
        if(delTa < 0){
            result = "Phương trình a = " + a + " b = " + b + " c = " + c + " vô nghiệm";
        }  
        else if(delTa == 0){
            double nghiemKep = (-b / (2 * a));
            result = "Phương trình a = " + a + " b = " + b + " c = " + c + " có nghiệm kép x1 = x2 = " + nghiemKep;
        }
        else if(delTa > 0){
            double  x1 = (-b + Math.sqrt(delTa)) / (2 * a);
            double x2 = (-b - Math.sqrt(delTa)) / (2 * a);
            result = "Phương trình a = " + a + " b = " + b + " c = " + c + " có 2 nghiệm phân biệt x1 = " + x1 + " x2 = " + x2;
           
        }
        return result;
    }
    
    
    // bài tập sử dụng các phép toán khi nhập vào
    public static String tinhToan(double n, double m, String phepToan) {
        String result = "";
 
        if(phepToan.equals("+")){
            result = "n + m = " + (n+m);
        }
        else if(phepToan.equals("-")){
            result = "n - m = " + (n-m);
        }
        else if(phepToan.equals("*")){
            result = "n * m = " + (n*m);
        }
        else if(phepToan.equals("/")){
            if(m != 0){
            result = "n / m = " + (n/m);
            }else{
                result = "m phải lớn hơn 0 !";
            }
        }
        return result;
    }
}
