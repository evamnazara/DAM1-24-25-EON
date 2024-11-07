package ud2.funciones;

import java.util.Scanner;
import ud2.Util;

public class MetodoVoid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena;
        char simbolo;
        System.out.print("Introduce cadena de texto: ");
        cadena = sc.nextLine();
        System.out.println("introduce el simbolo que quieras que forme la caja:");
        
        simbolo = sc.nextLine().charAt(0);
        sc.close();
        Util.cajaTexto(cadena,simbolo); //llamada al método
    }

    // método que muestra un String rodeado por un borde 
    // COMENTADO EN EL PRINCIPAL 
    /*public static void cajaTexto(String str){
            int n = str.length(); //longitud del String
            for (int i = 1; i <= n + 4; i++){ //borde de arriba
                 System.out.print("#"); 
            }
            
            System.out.println();

            System.out.println("# " + str + " #"); //cadena con un borde en cada lado              

            for (int i = 1; i <= n + 4; i++){ //borde de abajo
                 System.out.print("#"); 
            }
            
            System.out.println();
    }*/
}