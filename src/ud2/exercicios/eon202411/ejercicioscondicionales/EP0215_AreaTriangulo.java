/*EP0215. Escribe una aplicación que solicite por consola dos números reales que
corresponden a la base y la altura de un triángulo. Deberá mostrarse su área, comprobando
que los números introducidos por el usuario no son negativos, algo que no tendría sentido. */

package ud2.exercicios.eon202411.ejercicioscondicionales;

import java.util.Scanner;

public class EP0215_AreaTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double base;
        double altura;

        do {
            System.out.print("Introduzca la base del triángulo: ");
            base = sc.nextDouble();
            } while (base < 0);

                do{
                    System.out.print("\nIntroduzca la altura del triángulo: ");
                    altura = sc.nextDouble();
                } while(altura < 0);

        sc.close();

        double area = base * altura / 2;


        if (base < 1 && altura < 1){
            System.out.println("Los números introducidos tienen que ser mayores que 0. ");
        }
        else{
            System.out.printf("Área del triángulo: %.2f", area);
        }


        
    }
}
