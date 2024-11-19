/*
Modifica la actividad anterior (EP0217) para que, además de los dos números aleatorios, 
también aparezca aleatoriamente la operación que debe realizar el jugador: suma, resta o multiplicación.

Amplía el programa anterior para que muestre el número de segundos que el usuario ha tardado en responder. Utiliza la clase LocalTime.
*/

package ud2.exercicios.eon202411.ejercicioscondicionales;

import java.time.LocalTime;
import java.util.Scanner;

public class EP0217_juegoSuma_2 {
    public static void main(String[] args) {
        // Genera un número entero entre 1 y 99
        int MAX = 99;
        int MIN = 1;

        int num1 = (int) (Math.random() * (MAX - MIN + 1)) + MIN;
        int num2 = (int) (Math.random() * (MAX - MIN + 1)) + MIN;

        Scanner sc = new Scanner(System.in);
        LocalTime horaInicial = LocalTime.now();
        System.out.printf("Escribe el resultado de sumar %d y %d: ", num1, num2);
        int sumaUsuario = sc.nextInt();
        sc.close();
        LocalTime horaFinal = LocalTime.now();

        if (sumaUsuario == num1 + num2) {
            System.out.printf("Resultado correcto. Has tardado %d segundos %n", horaFinal.toSecondOfDay() - horaInicial.toSecondOfDay());
        } else {
            System.out.printf("¡Has fallado! El resultado correcto es %d%n", num1 + num2);
        }

    }
    
}
