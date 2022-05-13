package EstRepetitivas;

import java.util.Scanner;

/**
 * Examen
 */
public class Examen {
    

    static Scanner lt=new Scanner(System.in);

    public static void pregunta1JSTC() {
        //Definir Variables
        double EC, EP, TP, promedio;
        String estado;
        //Datos de Entrada
         System.out.println("Ingrese la nota de el examen de conocimientos: ");
            EC=lt.nextDouble();
         System.out.println("Ingrese la nota de la entrevista persona: ");
            EP=lt.nextDouble();
         System.out.println("Ingrese la nota del test psicologico: ");
            TP=lt.nextDouble();
        
        //Proceso
         promedio=EC*0.4+EP*0.25+TP*0.35;
            if (promedio>=17 && promedio<=20) {
            estado="\n\nAprobo \n\tSe encuentra en el nivel 4";
            }else if(promedio<17 && promedio>=14){
            estado="\n\nAprobo \n\tSe encuentra en el nivel 3";
             }else if(promedio<14 && promedio>=11){
            estado="\n\nAprobo \n\tSe encuentra en el nivel 2";
            }else if(promedio<11){
            estado="\n\nDesaprobo y pierde la vacante \n\tSe encuentra en el nivel 1";
            }else{
            estado="\n\nDesaprobado";
        }
        //Datos de salida
        System.out.println(estado);
    }
}

