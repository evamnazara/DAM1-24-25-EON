/*E0214. Crear una aplicación que solicite al usuario una fecha (día, mes, año) y muestre la
fecha correspondiente al día siguiente. */

package ud2.ejercicios;

import java.util.*;

public class E02014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el día: ");
        int dia = sc.nextInt();

        System.out.println("Introduce el mes: ");
        int mes = sc.nextInt();

        System.out.println("Introduce el anho: ");
        int anho = sc.nextInt();

        boolean hayqueIncrementarMes = false;
        //variable bandera
        sc.close();
        
        
        dia++;
        switch (mes) {
            case 1,3,5,7,8,10,12:
            if (dia > 31) { hayqueIncrementarMes = true;
                //se implementa directamente en el if y se optimica
                //if (dia > 31); {
                //dia = 1;
                //mes++;
                }
                break; 
            case 2:
                if (dia > 28) {
                    dia = 1;
                    mes++;
                }
                break;
            case 4, 6, 9, 11:
                if (dia > 30) {
                    dia = 1;
                    mes++;
                }
            default:
                break;
        }
        if (mes > 12) {
            mes = 1;
            anho++;
        }
        if (hayqueIncrementarMes) {
            dia = 1;
            mes++;
    
             if (mes > 12) {
                mes = 1;
                anho++;
        }
    }
       
        System.out.println("El día siguiente es " + dia + "/" + mes + "/" + anho);
        System.out.printf("El día siguiente es %d/%d/%d/%n", dia, mes, anho);
    
    
        
    
    }
}

