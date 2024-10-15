package examenesanteriores;
import java.util.*;
public class Hectareas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double m2CamposFutbol = 105 * 70;
        double m2CanchaBaloncesto = 28 * 15;
        double m2PistaTenis = 23.77 * 10.97;
        double m2Retiro = 125;


        System.out.println("introduce el número de hectáreas que quieres convertir:");


        double hectareas = sc.nextDouble();
        double m2 = hectareas * 10000; 

        sc.close();

        double numCamposFutbol = m2 / m2CamposFutbol;
        double numCanchaBaloncesto = m2 / m2CanchaBaloncesto;
        double numPistasTenis = m2 / m2PistaTenis;
        double numsRetiro = m2 / m2Retiro;

        System.out.printf("%.2f hectareas"); 


    }
}
