/*E0302. Implementar una aplicación para calcular datos estadísticos de las edades de los
alumnos de un centro educativo. Se introducirán datos hasta que uno de ellos sea
negativo, y se mostrará: la suma de todas las edades introducidas, la media, el número
de alumnos y cuántos son mayores de edad. */

package ud2.exercicios.eon202411.ejerciciosbucles;

import java.util.Scanner;

public class E0302_EdadesAlumnos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la edad de un alumno: ");
        int edad = sc.nextInt();

        sc.close(); 
        
        int contador = 0, numeroAlumnos = 0, numeroAdultos = 0;

        while (edad > 0) {

            numeroAlumnos++;
            contador += edad;
            
            if (edad >= 18){
                numeroAdultos++;
            }

            System.out.println("Suma de edades total: " + contador );
            System.out.println("Media de edad: " + contador/(double)numeroAlumnos );
            System.out.println("Número total de alumnos: " + numeroAlumnos);
            System.out.println("Número de alumnos mayores de edad: " + numeroAdultos);
            
            System.out.print("\n\nIntroduce la edad de un alumno: ");
            edad = sc.nextInt();
        }
       
    }
}
