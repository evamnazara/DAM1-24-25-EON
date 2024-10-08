package ud1.ejercicios.one20241004;

/* EP0123_ConversionMasa. Escribe un programa que convierta unidades de masa entre kilogramos y libras o viceversa. El programa solicitará al usuario la cantidad de masa y la unidad de medida origen (kilogramos o libras).
1 kilogramo = 1000 gramos
1 libra = 453.592 gramos
El programa deberá manejar las conversiones automáticamente y mostrar el resultado al usuario. Utiliza el operador ternario para evaluar la unidad de medida introducida por el usuario. El programa mostrará por pantalla el resultado con la unidad de medida adecuada.
 */
import java.util.*;

public class EP0123 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.println("Este programa convierte Kilogramos a Libras.");
        System.out.println("Primero introduce la cantidad de masa, sin unidades");
        double cantidad = sc.nextDouble();

        System.out.println("Ahora, introduce la unidad de medida [kilogramos (1) o libras (2)]");
        int unidad = sc.nextInt();

        double resultado = unidad == 1 ? cantidad * 2.20462 : cantidad / 2.20462;
        int conversion = unidad == 1 ? 2 : 1;

        System.out.println(cantidad + (unidad == 1 ? "kg" : "lb") + " equivalen a " + resultado + " " + (conversion == 1 ? "kg" : "lb"));

        sc.close();

    }
    
}

