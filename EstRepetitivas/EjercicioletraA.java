package EstRepetitivas;

import java.util.Scanner;

public class EjercicioletraA {
    static Scanner leerT=new Scanner(System.in);
    
    public static void graficarA() {   
        System.out.println("Ingrese altura de la letra:");
        int cantF=leerT.nextInt();
        System.out.println("ingrese numero de filas:");
        int numFiLinea=leerT.nextInt();
        int medio=cantF+1;
        for (int f = 1; f < cantF; f++) {
            for (int c = 1; c <= 2/cantF; c++) {
                if (f==1 && medio==c ) {
                    System.out.print("*");
                }else{
                    System.out.print("*");
                }
                
            }
            
        }

    }
    public static void main(String[] args) {
        
    }

}
