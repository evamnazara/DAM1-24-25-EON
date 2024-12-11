package ud2;

import java.util.Scanner;

public class repaso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* 
            // MAYOR O MENOR DE EDAD
        int edad;
        System.out.println("introduce tu edad");
        edad = sc.nextInt();
        sc.close();

        if (edad < 18) {
            System.out.println("eres menor");
        } else if (edad >= 18 && edad <= 30) {
            System.out.println("eres un adulto joven");
        } else if (edad > 30 && edad <60 ) {
            System.out.println("eres adulto mayorcito");
        } else if ( edad > 60){
            System.out.println("cuidate");
        } */

        //CALCULO DE AREAS: 

        System.out.println("Elige una opcion: \n1: Cuadrado \n2: Rectangulo \n3: Triángulo");

        int figuraElegida = sc.nextInt();
        switch (figuraElegida) {
            case 1:
                //formula: lado*lado 
                    int lado;
                    int areaCuadrado;

                    System.out.println("Introduce el largo del cuadrado:");
                    lado = sc.nextInt();
                    areaCuadrado = lado * lado;

                    System.out.println("El area del cuadrado es: " + areaCuadrado);

                break;
            case 2: 
                //base * altura: 

                break; 
            case 3: 
                //base * altura / 2
                break;
        }
        sc.close();
    }
}
