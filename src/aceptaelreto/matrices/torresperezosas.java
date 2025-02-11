package matrices;

public class torresperezosas {
    public static void main(String[] args) {
       //linea  

       char [][] tablero1 = {
            {'.','.','.'},
            {'.','.','.'},
            {'.','.','.'}
       };

       char [][] tablero2 = {
        {'.','.','.'},
        {'x','.','.'},
        {'.','.','.'}
        };
        char [][] tablero3 = {
            {'.','.','.'},
            {'.','x','.'},
            {'.','.','.'}
            };

        System.out.println(caminosDistintos(tablero1));
        System.out.println(caminosDistintos(tablero2));
        System.out.println(caminosDistintos(tablero3));

        System.out.println(caminosDistintosRecursivo(tablero1));
        System.out.println(caminosDistintosRecursivo(tablero2));
        System.out.println(caminosDistintosRecursivo(tablero3));
    }
        
    private static int caminosDistintos(char[][] t) {        
        int [][] tablaResultado = new int[t.length][t.length];

        //recorre columnas de derecha a izquierda
        for (int j = 0; j < t.length; j++){
            //recorre de la ultima casilla 
           for (int i = tablaResultado.length - 1; i >= 0; i--) {
            //inicializa casilla inferior izquierda 
                if (j == 1 && i == t.length - 1) {
                    tablaResultado[i][j] = 1;
                } else if (t[i][j] != 'x') {
                    //casilla izquierda + casilla inferior

                    if (j > 0) {
                        tablaResultado[i][j] = tablaResultado[i][j -1];

                    }
                    if (i < t.length - 2) {
                    tablaResultado[i][j] += tablaResultado[i + 1][j];}
                }
           } 
        }

        //resultado en la casilla superior derecha
        return tablaResultado[0][t.length - 1];
        
    }

    private static int caminosDistintosRecursivo(char[][] t) {
        int [][] tr = new int [t.length][t.length];
        return calcularCasilla(t, 0, t.length -1);
    }

    private static int calcularCasilla(char[][] t, int i, int j){
        if(j == 0 && i == t.length -1) {
            return 1;

        } else if (t[i][j] != 'x') {
            return 0;
        } else if (j == 0) {
            calcularCasilla(t, i, j);
        } else if (i == t.length -1) {
            return calcularCasilla(t, i, j - 1 );
        }
        return calcularCasilla(t, i, j - 1) + calcularCasilla(t, i, j);
         
    }


}

/*
 * 
En un tablero de ajedrez las torres pueden moverse en horizontal y en vertical tantas casillas como quieran, pero siempre en línea recta. En nuestro caso, tenemos una torre perezosa que se mueve sólo hacia la derecha o hacia arriba y una casilla cada vez.

Si situamos a nuestra torre en la esquina inferior izquierda de un tablero de 3×3 y queremos que vaya a la esquina superior derecha, es fácil ver que tendrá que hacer como mínimo 4 movimientos, aunque puede seguir varias rutas distintas. En la siguiente figura aparecen dos de ellas:

Dos caminos igual de largos en un tablero de 3x3
Tiene sentido plantearse, ¿de cuántas formas distintas podría llegar nuestra torre desde el origen al destino con el mínimo número de movimientos posible? Una forma de hacer el cálculo es averiguar de forma iterativa el número de formas diferentes que tenemos de llegar hasta cada uno de los escaques intermedios. Empezamos anotando que sólo hay una forma para que la torre "vaya" de la casilla inicial a esa misma casilla inicial en el mínimo número de movimientos (no moviéndose):

Primer paso iterativo, con un '1' en la esquina inferior izquierda
Para las demás, sabemos que el número de maneras de llegar a un escaque en el mínimo número de pasos será la suma del número de formas de llegar a cada uno de los escaques adyacentes hacia la izquierda o hacia abajo (llegar a un escaque por arriba o por la derecha sería "ir hacia atrás"). Por tanto, lo que tenemos que hacer es ir calculando de cuántas formas se puede llegar a los escaques adyacentes de los ya conocidos sumando los números conseguidos anteriormente:

Siguientes pasos iterativos
Repitiendo el proceso hasta llegar a la última celda tenemos:

Ultimos pasos iterativos que rellenan el cuadrado completo
Esto demuestra que en un tablero de 3×3 hay seis formas distintas de ir, con el mínimo número de movimientos posibles, de una esquina a otra.

Si en el tablero hay algunas casillas no transitables es necesario adaptar el recorrido para tenerlas en cuenta. Por ejemplo, en el siguiente tablero de 3×3 con una celda no transitable se puede llegar del origen al destino de tres formas distintas utilizando los cuatro movimientos mínimos:

Tablero de 3x3 con una celda no transitable
Entrada
La entrada estará compuesta de varios tableros de distintos tamaños. Cada tablero comienza con una línea que contiene un número n (1 ≤ n ≤ 15) que indica el número de filas y columnas del tablero. A continuación aparecen n líneas, una por cada fila con n caracteres cada una. El carácter '.' (punto) indica una casilla transitable, mientras que 'X' significa casilla no transitable. Se garantiza que las casillas origen y destino siempre serán transitables.

La entrada termina con un tablero vacío que no debe procesarse.

Salida
Para cada caso de prueba se escribirá una línea con un único número que indica de cuántas formas distintas puede llegar nuestra torre perezosa desde la esquina inferior izquierda del tablero a la esquina superior derecha pasando por el mínimo número de casillas.

Se garantiza que el resultado nunca será mayor que 109.
 */