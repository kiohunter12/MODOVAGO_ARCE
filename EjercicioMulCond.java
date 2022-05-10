import java.util.Scanner;

public class EjercicioMulCond {

    public static void profesor() {
        System.out.println("Enseñar");
    }

    public static void estudiante() {
        
        System.out.println("Aprender O estudiar");
    }

    public static void maquinaPC() {
        System.out.println("Procesa Informacion");
    }

    public static void proyector() {
        System.out.println("Proyecta imagenes");
    }

    public static void main(String[] args) {
        EjercicioMulCond obj=new EjercicioMulCond();
        Scanner lt=new Scanner(System.in);
        System.out.println("ingrese el numero del algoritmo:\n1=profesor\n2=estudiante"+
        "\n3=maquinaPC\n4=proyector");
        int opcionMet=lt.nextInt();

        switch (opcionMet) {
            case 1: profesor(); break;
            case 2: estudiante(); break;
            case 3: maquinaPC(); break;
            case 4: proyector(); break;
            default:System.err.println("esa opcion no existe"); break;
                
        }
       


    }
}
