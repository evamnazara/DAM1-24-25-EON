/*Ramón se pasa el día de Nochevieja contando los minutos que faltan para que den las uvas. ¿Puedes ayudarle?

Entrada
La entrada consiste en una serie de horas, cada una en una línea. Cada hora está formada por las horas y los minutos separados por : y utilizando siempre dos dígitos. Se utiliza una representación en formato 24 horas (es decir, desde 00:00 a 23:59).

La entrada termina cuando la hora es la medianoche (00:00), que no debe procesarse.

Salida
Para cada caso de prueba se mostrará una línea con el número de minutos que faltan para medianoche. */

package ud2.aceptaelreto;
import java.util.*;

public class nochevieja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Programa contador de minutos que quedan para medianoche.");
        System.out.println("¿Que hora es? HH:mm");
        String hora = sc.next();

        System.out.println(hora);
        sc.close();
    }
}
