/*
Realiza un programa que permita introducir por teclado las alturas (en metros, sin decimales) de 
las  montañas  que  componen  una  determinada  cordillera  montañosa,  de  Oeste  a  Este.  La 
entrada  terminará  cuando  se  introduzca  una  altura  negativa  o  se  llegue  al  límite  de  1000 
montañas. 
Sólo se pueden construir abadías en las cimas que sean más altas que todas las montañas que 
tengan al Este. 
El  programa  debe  indicar  el  número  máximo  de  abadías  que  se  pueden  construir  en  esa 
cordillera montañosa y adicionalmente el listado de índices de montañas en las que se pueden 
construir (comenzando en 1 para la montaña situada más al Oeste).   */
package arraysejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class AbadiasPirenaicas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] cordillera = new int[0]; 

        final int MAX_MONTANHAS = 1000;
        int numeroMontanha = 0;
        int alturas = 0; 

        System.out.println("Para salir, introduce -1. Recuerda que el máximo de montañas son 1000.");
        System.out.println("Introduce la altura de la primera montaña: ");
        alturas = sc.nextInt();

        while (alturas != -1 && numeroMontanha <= MAX_MONTANHAS) {
            
            cordillera = Arrays.copyOf(cordillera, cordillera.length + 1);
            cordillera[cordillera.length -1] = alturas;

            System.out.println("Introduce la siguiente altura: ");
            alturas = sc.nextInt();
            numeroMontanha++;
        }
        sc.close();

        System.out.println("Alturas de los picos introducidos: " + Arrays.toString(cordillera));
        System.out.println("Numero total de montañas: " + numeroMontanha);

        int montanhaEste = cordillera[cordillera.length -1];
        int maxAltitud = montanhaEste;

        System.out.println("Altura de la montaña más al este: " + montanhaEste + " metros.");


        //bien!!!
        int abadias[] = new int[0];

        for(int i = 0; i < cordillera.length; i++) {
            if (cordillera[i] > maxAltitud) {
                maxAltitud = cordillera[i];
                abadias = Arrays.copyOf(abadias, abadias.length +1);
                abadias[abadias.length - 1] = i + 1;
                //como numeroAbadias++;
            }
        }

        //ordenar de oeste a este 
        Arrays.sort(abadias);


        if (abadias.length > 1) {
            System.out.println("Se podrían construir " + abadias.length + " abadías en las alturas: " + Arrays.toString(abadias)); //imprimir abadias hace que imprima los numeros, no las alturas
        } else {
            System.out.println("No se puede construir ninguna abadía.");
        }


       

    }

    
}
