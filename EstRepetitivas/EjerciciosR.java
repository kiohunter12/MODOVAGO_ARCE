package EstRepetitivas;

import java.util.Scanner;

public class EjerciciosR {

    public static void imprimirWhileN1_10() { 
        int numInit=1;
        while (numInit<=20) {
            System.out.println(numInit);
            numInit=numInit+1; 
        }


    }
    public static void imprimirDowhileN1_20() {
        int numInit=1;
        do {
            System.out.println(numInit);
            numInit++;

        } while (numInit<=20);

        
    }
    public static void imprimirForN1_20() {
        
        for (int numInit = 1; numInit <=20 ; numInit++) {
            System.out.println(numInit);
            
        }
            

        }
      public static void imprimirnombre() {
          Scanner lt=new Scanner(System.in);
          System.out.println("ingrese su nombre");
          String nombre=lt.next();
        for (int i = 0; i < nombre.length(); i++) {
            System.out.println(nombre.charAt(i)); 
            
        }
          
      }  
    


    
    public static void main(String[] args) {
        /*System.out.println("imprime while"); imprimirWhileN1_10();
        System.out.println("imprime do while"); imprimirDowhileN1_20();
        System.out.println("imprime for"); imprimirForN1_20();*/

        imprimirnombre();
    
    }
}
