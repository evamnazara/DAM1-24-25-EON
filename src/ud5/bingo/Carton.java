package ud5.bingo;

import java.util.Arrays;
import java.util.Random;

class Carton {
    static final int MAXIMO_FILAS = 3;
    static final int MAXIMO_COLUMNAS = 5;

    int[][] numerosCarton;

    public int [][] generarCarton() {
        //FALTA QUE LOS NUMEROS NOE STEN REPETIDOS
        Random rnd = new Random();
        this.numerosCarton = new int [MAXIMO_FILAS][MAXIMO_COLUMNAS];

        for (int i = 0; i < MAXIMO_FILAS; i++) {
            for (int j = 0; j < MAXIMO_COLUMNAS; j++) {
                int numRandom = rnd.nextInt(Bingo.NUMERO_MAXIMO) +1;
                
                boolean numeroRepetido = false;
                do {
                    int ii = 0;
                    while  (ii <= i && !numeroRepetido) {
                        int jj = 0; 
                        while (jj <= MAXIMO_COLUMNAS && !numeroRepetido){
                                if (numerosCarton[ii][jj] == numRandom) {
                                    numeroRepetido = true;
                                    }
                                jj++;
                            }
                        ii++;
                    }
                    
                } while (numeroRepetido);
                    

                numerosCarton[i][j] = numRandom;
            }
        }
        System.out.println(Arrays.deepToString(numerosCarton));
        return numerosCarton;
    }

    private static void modoNumeroaNumero() {
        int numero = sortearNumero(); 
        System.out.println("Numero: " + numero);
    }

    private static int sortearNumero() {
        Random rnd = new Random();
        int numRandom;
        boolean repetido;

        do {
            numRandom = rnd.nextInt() + 1;
            repetido = false;

            int i = 0;

           /* while (i < numerosCarton.length && !repetido) {
                if (numerosCarton[i] == numRandom) {
                    repetido = true;
                } 
                i++;
            } */
        } while (repetido);

        return numRandom;
    }


}