package arrays;
import java.util.Scanner;

public class ManiasTenemosTodos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Array para representar los días de la semana
        char[] diasSemana = {'L', 'M', 'X', 'J', 'V', 'S', 'D'};

        // Leer el número de casos de prueba
        int casos = sc.nextInt();
        sc.nextLine(); // Consumimos el salto de línea

        // Procesar cada caso de prueba
        for (int caso = 0; caso < casos; caso++) {
            int semanas = sc.nextInt(); // Leer cantidad de semanas almacenadas
            sc.nextLine(); // Consumimos el salto de línea

            // Array para almacenar las pastillas de cada semana
            char[][] pastillas = new char[semanas][7];

            // Leer las semanas de pastillas
            for (int i = 0; i < semanas; i++) {
                pastillas[i] = sc.nextLine().toCharArray(); // Guardamos cada línea como array de caracteres
            }

            // Simulación del consumo de pastillas desde el lunes
            int semanaActual = 0;
            boolean necesitaComprar = false;

            while (!necesitaComprar) {
                for (int dia = 0; dia < 7; dia++) { // Recorrer de lunes a domingo
                    boolean pastillaTomada = false;

                    // Buscar una pastilla reciclada en las semanas almacenadas
                    for (int s = 0; s < semanas; s++) {
                        if (pastillas[s][dia] == '*') { // Si hay una pastilla disponible
                            pastillas[s][dia] = '-'; // Mayte la toma
                            pastillaTomada = true;
                            break;
                        }
                    }

                    // Si no hay pastillas para este día, se termina la simulación
                    if (!pastillaTomada) {
                        System.out.println(diasSemana[dia] + " " + (semanaActual + 1));
                        necesitaComprar = true;
                        break;
                    }
                }
                semanaActual++; // Avanzamos a la siguiente semana
            }
        }

        sc.close();
    }
}


/*Manías tenemos todos
Tiempo máximo: 2,000-3,000 s  Memoria máxima: 4096 KiB
Blister de pastillas
Blister de pastillas de Mayte
Todos dicen que Mayte es una maniática… y ella no entiende por qué. Al fin y al cabo todos tenemos nuestras rarezas…

Una de las de Mayte tiene que ver con las pastillas. Cuando el médico le pone un tratamiento, ella pide en la farmacia que sean de un laboratorio que las envase con el día de la semana impreso. De esta manera puede controlar si algún día se le ha olvidado tomársela.

Hasta aquí su familia y amigos consideran que todo es relativamente normal. Lo que ya no lo es tanto es que si un día se le olvida tomar su medicación, se "salte" la pastilla de ese día y no se la tome. Dice que es incapaz de tomar una pastilla en un día de la semana distinto del que indica la caja. Cuando se salta una toma, sencillamente abandona indefinidamente la pastilla; ni siquiera la utiliza el mismo día de la semana siguiente. Eso hace que a día de hoy tenga una buena colección de pastillas dispersas en distintas cajas, sólo porque se le olvidó tomarlas y su manía le impide aprovecharlas.

Pero eso está a punto de cambiar. Recientemente ha decidido que, si finalmente aplican la medida del llamado euro por receta, recuperará todas las pastillas descartadas para ahorrarse algo de dinero. Eso sí, no está dispuesta a romper su hábito, por lo que seguirá tomándose únicamente las pastillas que estén etiquetadas con el día de la semana que le corresponda.

Suponiendo que comienza a reciclar pastillas el próximo lunes, ¿puedes ayudar a Mayte a saber que día tendrá que volver a la farmacia a comprar pastillas?

Entrada
La primera línea de la entrada contendrá el número de casos de prueba que vienen a continuación.

Cada caso de prueba comienza con un número que indica la cantidad de semanas que Mayte lleva guardando pastillas. A continuación, se muestra, en líneas independientes, el estado de las pastillas correspondientes a cada semana. Comenzando por la del lunes, para cada una de las 7 pastillas se mostrará un * si Mayte no se tomó esa pastilla, o un - si lo hizo. Por ejemplo, si Mayte se ha tomado las pastillas del martes, miércoles, viernes y sábado la entrada será "*--*--*".

Salida
Para cada caso de prueba se debe indicar el día de la semana en el que Mayte deberá empezar una caja no usada de pastillas, y en qué semana se está (empezando a contar por 1). Recuerda que Mayte comienza en lunes la medida de reciclar pastillas, y que nunca se toma una pastilla un día de la semana diferente a aquél con el que está etiquetada.

En la salida, los días de la semana se representarán con una única letra, escribiendo L para lunes, M para martes, X para miércoles, J para jueves, V para viernes, S para sábado y D para domingo.

Entrada de ejemplo
2
4
*******
*--*--*
*-*-*-*
--*---*
3
-------
*****-*
*******
Salida de ejemplo
M 2
S 2 */