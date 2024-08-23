/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learning_java;

/**
 *
 * @author hnguynis.no1
 */
public class ForInFor {
    public static void main(String[] args) {
        for(int i = 1; i <= 7; i++){
            for(int j = 1; j <= 7; j++){    
                System.out.print(i+""+j+""+"\t"); 
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        
        for(int i = 1; i <= 7; i++){
            for(int j = 1; j <= 7; j++){ 
                if(i == 1 || i == 7 || j == 7 || j == 1){
                    
                System.out.print("*"+"\t"); 
                }else{
                    System.out.print(" "+"\t");
                }
            }
            System.out.println("");
        }
        
        
        
    }
}
