/* AUTORA: Eva María Otero Názara */


package ud2.oneexamenrec;
import java.util.Scanner;

public class Galibo {
    public static void main(String[] args) {
        int tamanoMaximoCarril;
        int numeroPuentes; //(hasta 100)
        Scanner sc = new Scanner(System.in);

        System.out.println("Numero de puentes en el trayecto:");
        numeroPuentes = sc.nextInt();

        if (numeroPuentes <=100 ) {
            int numeroCarriles; //(como mucho 5)
            int alturaCarriles; //(un número entre 200 y 800)

                System.out.println("Número de carriles que pasan por debajo:");
                numeroCarriles = sc.nextInt();
                
                if (numeroCarriles <= 5) {  
                    System.out.println("Introduce la altura de los carriles:");
                        alturaCarriles = sc.nextInt();
                        if (alturaCarriles >= 200 && alturaCarriles <=800) {
                        tamanoMaximoCarril = alturaCarriles; 
                        System.out.println("Altura máximo de camion: " + tamanoMaximoCarril + "cm."); 

                    } else {
                        System.out.println("La altura de los carriles debe estar comprendida entre 200 y 800."); }


                } else {
                    System.out.println("El número máximo de carriles es 5");
                    }

        } else {
            System.out.println("El número máximo de puentes por trayecto son 100."); }
        sc.close();
            
    }

}
    

