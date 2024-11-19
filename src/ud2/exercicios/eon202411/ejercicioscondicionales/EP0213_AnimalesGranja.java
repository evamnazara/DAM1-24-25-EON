/* EP0213. En una granja se compra diariamente una cantidad (comidaDiaria) de comida
para los animales. El número de animales que alimentar (todos de la misma especie) es
numAnimales, y sabemos que cada animal come una media de kilosPorAnimal.
Diseña un programa que solicite al usuario los valores anteriores y determine si disponemos de 
alimento suficiente para cada animal. 
En caso negativo, ha de calcular cuál es la ración que corresponde a cada uno de los animales.


Nota: Evitar que la aplicación realice divisiones por cero.

*/

package ud2.exercicios.eon202411.ejercicioscondicionales;

import java.util.Scanner;

public class EP0213_AnimalesGranja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double comidaDiaria;
        int numAnimales;
        double kilosPorAnimal;
        double racionCorrespondiente;


        
        System.out.println("Introduce el número de kg de comida comprados a diario:: ");
        comidaDiaria = sc.nextDouble();

        System.out.println("Introduce el número total de animales de la granja: ");
        numAnimales = sc.nextInt();

        System.out.println("Introduce en kg la cantidad de comida que consume cada animal al día: ");
        kilosPorAnimal = sc.nextDouble();
        sc.close();


        if (numAnimales <= 0 ){
            System.out.println("No hay animales.r");

            if (comidaDiaria <= 0){
                System.out.println("No hay suficiente pienso para los animales");
            }
        }
        
        
        if (comidaDiaria > numAnimales * kilosPorAnimal){
            System.out.println("Hay comida suficiente para todos los animales");
        }
        else {
            racionCorrespondiente = comidaDiaria / numAnimales; 
            System.out.println("No hay suficiente comida para todos los animales.");

            System.out.printf("Solo podrán consumir %.2f kg de comida al día\n",racionCorrespondiente);
        }

    }
}
