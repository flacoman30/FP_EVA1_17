/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_17_rango;

import java.util.Scanner;

/**
 *
 * @author flac3
 */
public class EVA1_17_RANGO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int calificacion;
        Scanner captu = new Scanner(System.in);
        System.out.println("calificacion");
        calificacion = captu.nextInt();
        captu.nextLine();
        
        if(calificacion >= 60 && calificacion <= 100){
           System.out.println("aprobado");
        }else if(calificacion <= 0 && calificacion >= 100){   
           System.out.println("reprobo");
           
         }  else{   
           System.out.println("no vaido");
           
         }  
    }
    
}
