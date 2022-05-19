package EstRepetitivas;

import java.util.Scanner;

public class EjerciciosVarios {
    static Scanner leerT=new Scanner(System.in);
    public static int factorialN(int numero) {
        int resultado=1;
        if (numero>1){
            for (int i = 1; i <= numero; i++){
                resultado=resultado*1; 
            }
        }
        return resultado;
    }




    public static void main(String[] args) {
        System.out.println("ingrese un numero");
        int num=leerT.nextInt();
        System.out.println(factorialN(num));
        for (int i = 1; i <= num; i++){
            System.out.println("Factorial de"+ i+"es:"+factorialN(i)); 
        }
        
    }

}
