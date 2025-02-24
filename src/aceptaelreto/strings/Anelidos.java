/* */
package aceptaelreto.strings;

import java.util.Scanner;

public class Anelidos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            // Leer la línea de entrada
            String linea = scanner.nextLine().trim();
            
            // Separar número de fases y cadena inicial de anillos
            int espacio = encontrarEspacio(linea);
            if (espacio == -1) {
                break; // No hay un número de fases, fin de entrada
            }

            // Obtener número de fases sin usar parseo
            int fases = convertirAEntero(linea.substring(0, espacio));
            String anillos = linea.substring(espacio + 1); // Cadena de anillos con 'C' al final

            // Si la cadena de anillos es solo "C", terminar
            if (anillos.equals("C")) {
                break;
            }

            // Simular el crecimiento
            for (int i = 0; i < fases; i++) {
                anillos = crecerAnelido(anillos);
            }

            // Imprimir el resultado
            System.out.println(anillos);
        }

        scanner.close();
    }

    // Encuentra el primer espacio en la línea de entrada
    public static int encontrarEspacio(String texto) {
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == ' ') {
                return i;
            }
        }
        return -1; // No se encontró espacio
    }

    // Convierte un número en formato String a entero sin usar parseInt()
    public static int convertirAEntero(String numero) {
        int resultado = 0;
        for (int i = 0; i < numero.length(); i++) {
            char digito = numero.charAt(i);
            resultado = resultado * 10 + (digito - '0'); // Convertir char a número
        }
        return resultado;
    }

    // Simula una fase de crecimiento del anélido
    public static String crecerAnelido(String anillos) {
        String nuevaCadena = "";

        // Iterar sobre la cadena original sin incluir la 'C' final
        for (int i = 0; i < anillos.length() - 1; i++) {
            char anillo = anillos.charAt(i);
            if (anillo == 'A') {
                nuevaCadena += "NA"; // 'A' se convierte en "NA"
            } else if (anillo == 'N') {
                nuevaCadena += "AN"; // 'N' se convierte en "AN"
            }
        }

        return nuevaCadena + "C"; // Añadir la cabeza al final
    }
}

/*
ANELIDOS 


Como si fueras un programador de java novato, resuelve el siguiente problema. Utiliza variables claras, explica cada paso que haces. Puedes utilizar funciones básicas de Strings, pero no utilices funciones de parseo ni StringBuilder.

Anélidos
Tiempo máximo: 2,000 s Memoria máxima: 8192 KiB
Los anélidos son una variedad de lo que coloquialmente se conoce como gusanos. Su propiedad más característica (y que los diferencia del resto de variedades) es que sus cuerpos están compuestos por la repetición de "anillos" con la misma estructura, repitiéndose en cada anillo todos los órganos internos y externos. Seguramente los anélidos más conocidos sean las orugas.
En algunos lugares de la selva tropical se da una variedad de oruga, llamada thuelis, que intriga desde hace muchos años a los biólogos. Cuando nacen, poseen únicamente un anillo (además de la cabeza), de color o bien amarillo, o bien negro. En cada fase de crecimiento todos sus anillos se replican, de forma que donde antes había un anillo ahora aparecen dos. En particular cada anillo da lugar, a su lado y más cerca que él de la cabeza, a un nuevo anillo del color contrario:
Estas orugas crecen indefinidamente siguiendo ese patrón. Aunque no son venenosas, los colores que muestran son similares a los de otras especies que sí lo son, por lo que los depredadores suelen evitarlas. Se han llegado a encontrar ejemplares de casi dos metros.
Para una distribución inicial de anillos, ¿eres capaz de decir qué colores tendrán después de varias fases de crecimiento?
Entrada
La entrada estará compuesta de varios casos de prueba. Cada uno empezará con un número entero no negativo que indicará cuantas fases de crecimiento hay que simular. Después vendrá una cadena indicando los colores de los anillos del ejemplar (A para amarillo y N para negro), acabando con la letra C que indica la posición de la cabeza.
Ten en cuenta que, en muy raras ocasiones, el crecimiento no sigue el patrón habitual, por lo que las configuraciones iniciales de la entrada nonecesariamente serán alcanzables desde alguno de las dos variedades de nacimiento de los thuelis (un único anillo amarillo o negro).
La entrada terminará cuando se reciba un thuelis sin anillos.
Salida
Para cada caso de prueba el programa deberá indicar, en una línea, la configuración de colores de los anillos tras el número solicitado de fases de crecimiento, asumiendo que todas siguen el patrón habitual descrito. Se usará, como en la entrada, Apara amarillo y N para negro, acabando con la C para la cabeza. No se añadirán espacios en ningún caso.
====


 */