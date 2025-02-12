//EjArrays03. Leer por teclado la nota de los alumnos de una clase y calcular la nota media del grupo. Mostrar los alumnos con notas superiores a la media.

package arraysejercicios.arrays;

import java.util.Scanner;

public class EjArrays03 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos alumnos hay en la clase? ");
        int numAlumnos = sc.nextInt();
        
        double[] notas = new double[numAlumnos];
        
        for (int i = 0; i < numAlumnos; i++) {
            System.out.print("Introduce la nota del alumno " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }
        
        double sumaNotas = 0;
        for (int i = 0; i < numAlumnos; i++) {
            sumaNotas += notas[i];
        }
        double media = sumaNotas / numAlumnos;

        System.out.println("La nota media del grupo es: " + media);
        
        System.out.println("Alumnos con notas superiores a la media:");
        for (int i = 0; i < numAlumnos; i++) {
            if (notas[i] > media) {
                System.out.println("Alumno " + (i + 1) + ": " + notas[i]);
            }
        }

        sc.close();
    }
}
