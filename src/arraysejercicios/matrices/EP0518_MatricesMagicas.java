/*EP0518. Escribe un programa que solicite los elementos de una matriz de tamaño 4 x 4. 

La aplicación debe decidir si la matriz introducida corresponde a una matriz mágica, que es aquella donde la suma de los elementos de cualquier fila o de cualquier columna valen lo mismo.
 */

 //recorrer fila a fila 
 //recorrer columna a columna
 //contadores de suma 
package arraysejercicios.matrices;

public class EP0518_MatricesMagicas {

    public static void main(String[] args) {

        int [][] matriz;

        matriz = generarMatrizAleatori_0a9(4, 4);

        mostrarMatriz(matriz);
        Integer constanteMagica = null; //? 

        int sumaFilas = 0;
        int sumaColumnas = 0;

        for (int i = 0; i < matriz.length; i++) { // Recorrer las filasç
            int suma = 0; //coje la suma de cada fila
            for (int j = 0; j <  matriz.length; j++) { // Recorrer las columnas
                suma += matriz[i][j]; 
            }
            if (constanteMagica == null) {
                constanteMagica = suma;
            } else if (constanteMagica != suma) {

                System.out.println("falso");
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            int suma = 0;

            for (int j = 0; j < matriz[i].length; j++) {
                suma+= matriz [i][j];
            }
        }

    }

    public static Boolean esMagica(int[][] t) {

        if (t ==null || t.length == 0){
                return false;}

        if (t[0].length == 1) {
            return true;}
                    
            return null;
    }

    
static int[][] generarMatrizAleatori_0a9(int numFilas, int numColumnas) {
    int[][] matriz = new int[numFilas] [numColumnas];

    for(int i = 0; i < matriz.length; i++) 
    for (int j = 0; j < matriz[i].length; j++)  
        matriz[i][j] =(int) (Math.random() * 10) + 1; 
    
    return matriz;
}

static void mostrarMatriz(int [][] tabla) {
    for(int i = 0; i < tabla.length; i++) {
        for (int j = 0; j < tabla[i].length; j++)
        System.out.print(tabla[i][j] + " ");
        System.out.println(" ");
    }

}

}