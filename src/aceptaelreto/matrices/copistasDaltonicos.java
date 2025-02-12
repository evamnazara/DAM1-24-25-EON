package matrices;
import java.util.Scanner;

public class copistasDaltonicos {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    
            while (true) {
                // PASO 1: Leer el tamaño del cuadro (filas y columnas)
                int filas = sc.nextInt();
                int columnas = sc.nextInt();
                sc.nextLine(); // Consumir salto de línea
                
                // Si encontramos "0 0", terminamos el programa
                if (filas == 0 && columnas == 0) break;
    
                // PASO 2: Leer la matriz del cuadro
                char[][] cuadro = new char[filas][columnas];
    
                for (int i = 0; i < filas; i++) {
                    String linea = sc.nextLine();
                    for (int j = 0; j < columnas; j++) {
                        cuadro[i][j] = linea.charAt(j);
                    }
                }
    
                // PASO 3: Leer la cantidad de copistas daltónicos
                int numCopistas = sc.nextInt();
                sc.nextLine(); // Consumir salto de línea
    
                // PASO 4: Aplicar cada transformación
                for (int k = 0; k < numCopistas; k++) {
                    String transformacion = sc.nextLine();
                    char colorOriginal = transformacion.charAt(0);
                    char colorNuevo = transformacion.charAt(2);
    
                    // Recorrer la matriz y reemplazar el color original por el nuevo
                    for (int i = 0; i < filas; i++) {
                        for (int j = 0; j < columnas; j++) {
                            if (cuadro[i][j] == colorOriginal) {
                                cuadro[i][j] = colorNuevo;
                            }
                        }
                    }
                }
    
                // PASO 5: Imprimir el cuadro transformado
                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < columnas; j++) {
                        System.out.print(cuadro[i][j]);
                    }
                    System.out.println();
                }
                System.out.println(); // Separación entre casos de prueba
            }
    
            sc.close();
        }
    }

/* Copistas daltónicos
Tiempo máximo: 1,000-5,000 s  Memoria máxima: 4096 KiB
El daltonismo es un transtorno hereditario que ocasiona dificultad para distinguir ciertos colores. Hay distintos tipos de daltonismo que hacen que los colores que esas personas no distinguen varíen. Lo habitual, no obstante, es no distinguir algunos matices de verde y rojo.

Aunque el defecto genético no suele suponer ningún problema en la vida diaria de los afectados, la realidad es que les imposibilita para realizar algunos trabajos puntuales, como militares de carrera o pilotos.

Otro de los trabajos difíciles de realizar por los daltónicos es el de duplicador de obras de arte. El problema al hacer la copia de la obra es que esos dos colores que cualquier otro vería distintos terminan siendo el mismo en la copia. Si esa copia cae en las manos de un segundo duplicador daltónico que hace una nueva copia, y luego otro, y luego otro, el resultado final puede no parecerse en nada al original, sobre todo si el tipo de daltonismo de cada uno difiere1.

Como ejemplo, en la figura aparece la transformación que puede sufrir un cuadro de pixel art con uno de los personajes del Pacman tras el paso por varios copistas daltónicos. Los colores originales son azul, rojo, blanco y negro. En la primera reproducción el copista sufría un tipo de daltonismo que le hacía ver igual los colores azul y rojo lo que hace que todos los azules terminen siendo rojos2. En la segunda reproducción el copista convirtió todos los rojos en amarillo. El último de la serie veía todos los negros grises.

Camino de rellenado de los números
Lo que haremos será, precisamente, simular esa transformación de la obra original tras pasar por las manos de numerosos copistas daltónicos.

Entrada
La entrada estará compuesta por distintos casos de prueba. Cada caso de prueba comienza con la descripción de un cuadro que será copiado en serie por distintos daltónicos.

Los cuadros se representarán mediante letras mayúsculas, cada uno representando un color. Para eso una primera línea contendrá el tamaño del cuadro: dos números entre 1 y 500 indicando el número de filas y el número de columnas respectivamente, a lo que seguirá el cuadro. Acto seguido aparecerá una línea con el número de daltónicos que copiarán el cuadro. Por último por cada uno de los copistas aparecerá una línea con dos caracteres; el primero indica el código del color que no es capaz de distinguir y que es sustituido por el código del color marcado por el segundo carácter.

La salida terminará con un cuadro de tamaño 0×0 que no debe procesarse.

Salida
Para cada caso de prueba se escribirá el cuadro tal y como lo dibuja el último copista utilizando la misma representación usada en la entrada.

Entrada de ejemplo
1 4
ABCD
1
C D
9 9
AAAAAAAAA
AARRRRRAA
ARRRRRRRA
ARBBRBBRA
ARNBRNBRA
ARRRRRRRA
ARRRRRRRA
ARARARARA
AAAAAAAAA
3
A R
R Y
N G
0 0
Salida de ejemplo
ABDD
YYYYYYYYY
YYYYYYYYY
YYYYYYYYY
YYBBYBBYY
YYGBYGBYY
YYYYYYYYY
YYYYYYYYY
YYYYYYYYY
YYYYYYYYY */