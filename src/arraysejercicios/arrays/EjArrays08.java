//EjArrays08. Leer el nombre y sueldo de 20 empleados y mostrar el nombre y sueldo del empleado que más gana.

package arraysejercicios.arrays;
import java.util.Scanner;

public class EjArrays08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nombres = new String[20];
        double[] sueldos = new double[20];
        
        System.out.println("Ingrese el nombre y sueldo de 20 empleados:");
        for (int i = 0; i < 20; i++) {
            System.out.print("Nombre del empleado " + (i + 1) + ": ");
            nombres[i] = sc.next();
            System.out.print("Sueldo de " + nombres[i] + ": ");
            sueldos[i] = sc.nextDouble();
        }
        
        int indiceMax = 0;
        for (int i = 1; i < 20; i++) {
            if (sueldos[i] > sueldos[indiceMax]) {
                indiceMax = i;
            }
        }
        
        System.out.println("El empleado con mayor sueldo es: ");
        System.out.println("Nombre: " + nombres[indiceMax]);
        System.out.println("Sueldo: " + sueldos[indiceMax]);
        
        sc.close();
    }
}
