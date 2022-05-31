package Recursividad;

import javax.lang.model.util.ElementScanner6;

public class demo {

    public static int factorialR(int n) {
        if ( n>1 ) {
            return factorialR(n-1)*n;
            
        }
        return 1;

    }
            
    public static int fibonaciR(int n) {
        if (n>1) {
            return fibonaciR(n-1)+fibonaciR(n-2);
   
        }
       return n; 
    }

   public static int potencia(int base, int exponente) {
         if (exponente == 0) {
             return 1;
        
               
           }
         
           
       }
       
       
   }


    public static void main(String[] args) {
        System.out.println("holas");
        System.out.println(factorialR(5));
        System.out.println(fibonaciR(6));
        System.out.println(potencia(4));
    }
}

