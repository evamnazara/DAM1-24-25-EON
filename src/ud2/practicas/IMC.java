package ud2.practicas;

import java.util.Scanner;
import java.util.InputMismatchException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IMC {
    public static void main(String[] args) {
        double peso = leerPeso();
        int altura = lecturaAltura();

        double imc = imc(peso, altura);

        System.out.printf("Tu IMC es de: %.2f%n", imc);
        System.out.println("Clasificación: " + rangosIMC(imc));
    }

    public static double imc(double kg, double cm) {
        // formula: imc = masa / estatura2

        double alturaMetros = cm / 100.0;
        return kg / (alturaMetros * alturaMetros);
    }

    public static String rangosIMC(double imc) {
        if (imc < 18.50) {
            return "Bajo peso";
        } else if (imc >= 18.50 && imc < 25.00) {
            return "Normal";
        } else if (imc >= 25.00 && imc < 30.00) {
            return "Sobrepeso";
        } else {
            return "Obesidad";
        }
    }

    public static double leerPeso() {
        Scanner sc = new Scanner(System.in);
        double peso = -1;
        while (peso < 20 || peso > 300) {
            System.out.print("Introduce tu peso en kg [de 20 a 300]: ");
            try {
                peso = sc.nextDouble();
                if (peso < 20 || peso > 300) {
                    System.out.println("El peso debe estar entre 20 y 300 kg.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Por favor, introduce un número válido.");
            }
        }
        System.out.println("Has introducido un peso de " + peso + " kg.");
        return peso;
    }

    public static int lecturaAltura() {
        Scanner sc = new Scanner(System.in);
        int altura = -1;
        while (altura < 50 || altura > 250) {
            System.out.print("Introduce tu altura en centímetros [de 50 a 250 cm]: ");
            try {
                altura = sc.nextInt();
                if (altura < 50 || altura > 250) {
                    System.out.println("Por favor, introduce una altura entre 50 y 250 cm.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Por favor, introduce un número entero dentro de los límites.");
            }
        }
        System.out.println("Has introducido una altura de " + altura + " cm.");
        return altura;
    }

   

    @Test
    void testImc() {
        double resultadoCaso1 = imc(70, 170); assertEquals(24.22, resultadoCaso1, 0.01); 
        double resultadoCaso2 = imc(90, 185); assertEquals(26.30, resultadoCaso2, 0.01); 
        double resultadoCaso3 = imc(60, 160); assertEquals(23.44, resultadoCaso3, 0.01);
        double resultadoCaso4 = imc(45, 160); assertEquals(17.58, resultadoCaso4, 0.01);
        double resultadoCaso5 = imc(65, 165); assertEquals(23.88, resultadoCaso5, 0.01);
        double resultadoCaso6 = imc(100, 175); assertEquals(32.65, resultadoCaso6, 0.01);
        double resultadoCaso7 = imc(99.98, 200); assertEquals(24.99, resultadoCaso7, 0.01);
    }
}

