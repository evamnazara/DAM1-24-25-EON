package arrays;
import java.util.Scanner;

public class ElGanadorEs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            // Leer primera línea del caso de prueba
            String primeraLinea = sc.nextLine();
            int numeroEquipos = primeraLinea.charAt(0) - '0'; // Convertimos el primer carácter a número
            int numeroGlobos = primeraLinea.charAt(2) - '0'; // Segundo número (ignora el espacio)

            // Caso de terminación
            if (numeroEquipos == 0 && numeroGlobos == 0) {
                break;
            }

            int[] globosPorEquipo = new int[numeroEquipos + 1]; // Índices 1 a numeroEquipos

            // Leer cada globo asignado
            for (int i = 0; i < numeroGlobos; i++) {
                String linea = sc.nextLine();
                int equipo = linea.charAt(0) - '0'; // Convertir primer número (equipo) a int
                globosPorEquipo[equipo]++; // Aumentar conteo de globos para ese equipo
            }

            // Determinar el equipo con más globos
            int maxGlobos = 0;
            int equipoGanador = -1;
            boolean hayEmpate = false;

            for (int i = 1; i <= numeroEquipos; i++) {
                if (globosPorEquipo[i] > maxGlobos) {
                    maxGlobos = globosPorEquipo[i];
                    equipoGanador = i;
                    hayEmpate = false;
                } else if (globosPorEquipo[i] == maxGlobos) {
                    hayEmpate = true;
                }
            }

            // Imprimir resultado
            if (hayEmpate) {
                System.out.println("EMPATE");
            } else {
                System.out.println(equipoGanador);
            }
        }
        sc.close();
    }
}



/*En muchos de los concursos de programación, como en el que hoy participas, cada vez que un equipo resuelve correctamente un problema recibe un globo del color asociado a ese problema. Al final, quien más globos consigue no sólo tiene su ordenador más colorido, sino que será el ganador del concurso.

Dada la lista de los globos colocados a cada equipo, ¿eres capaz de decir quién es el ganador?

Entrada
La entrada estará compuesta de múltiples casos de prueba, cada uno de ellos simulando un concurso. Cada caso de prueba comienza con una línea con dos números, el primero de ellos indicando el número de equipos participantes (entre 1 y 20) y el segundo el número de globos entregados.

A continuación aparecerá una línea por cada globo entregado, con el número del equipo que lo ha recibido (entre 1 y el número de equipos) y el color (una palabra de un máximo de 20 letras). Un equipo nunca recibirá dos veces el mismo color de globo.

La entrada terminará cuando se llegue a un concurso sin equipos ni globos.

Salida
Para cada caso de prueba se debe escribir el número del equipo ganador en una línea. En caso de empate, se escribirá EMPATE.

Entrada de ejemplo
4 3
2 Rojo
3 Amarillo
3 Azul
4 4
2 Rojo
3 Amarillo
3 Azul
2 Verde
0 0
Salida de ejemplo
3
EMPATE */