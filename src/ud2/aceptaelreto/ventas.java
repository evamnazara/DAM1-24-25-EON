/*
 Para ello, ha estado apuntando la caja diaria que se ha realizado en las últimas semanas. Le gustaría saber qué día de la semana se producen el mayor y el menor número de ventas, y si las ventas del domingo superan a la media semanal. De esta manera podrá establecer estrategias de marketing que le permitan recuperar algo de las ganancias perdidas.

Javier abre su bar todos los días menos los Lunes, que utiliza para descansar.

Realiza un programa que ayude a Javier en su cometido. Dada una lista de valores correspondiente a una semana, nuestro programa deberá decirle a Javier el día de la semana que más y menos ha vendido, y si las ventas del domingo superan la media.

Entrada
El programa recibirá una lista de semanas a evaluar. Cada semana constará de un valor para cada día. El número de semanas es indeterminado. El programa terminará de ejecutarse cuando para el primer día de la semana se indique una venta de -1.

Salida
Para cada caso de prueba, el programa escribirá una línea conteniendo dos días de la semana (MARTES, MIERCOLES, JUEVES, VIERNES, SABADO o DOMINGO). El primero indicará el día de más ventas y el segundo el de menos. Después se indicará un SI si el domingo se realizaron más ventas que la media semanal, y NO en caso contrario. Las tres palabras se separarán entre ellas por un espacio.

Si hay empate en alguno de los valores de ventas mínimo y máximo, se especificará EMPATE. */

package ud2.aceptaelreto;
import java.util.*;

//SIMPLIFICADO PARA UNA SEMANA
//calculo maximo minimo y media
public class ventas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double mediaGanancias;
        double ganaciasMinimas = 0; 
        double gananciasMaximas = 0;
        double recaudacion;

        int diaMax, diaMin; 
        double media = 0; //inicia en 0 

        System.out.println("");


        

        for(int i = 0; i < 6; i++) {
            recaudacion = sc.nextDouble();
            media += recaudacion;

            if (i == 0) {
                ganaciasMinimas = recaudacion;
                gananciasMaximas = recaudacion; 
                //porque estas en el dia 0 
                diaMin = 0;
                diaMax = 0;
            } else { //fura de la primera pasada del bucle

                if (recaudacion < ganaciasMinimas) { 
                        ganaciasMinimas = recaudacion;
                        diaMin = i;
                } else if (recaudacion > gananciasMaximas) {
                        gananciasMaximas = recaudacion;
                        diaMax = i;
                }
            }
            media += recaudacion; //sumatorio de recaudacion

        }
        media /= 6; //reescribe media como el real

       /*System.out.println(diaSemana(diaMax) + " " + diaSemana(diaMin) + " " + recaudacion > media ? "SI" : "NO");


        private static String diaSemana (int dia) {
            return switch (dia) {
                case 0: yield "MARTES";
                case 1: yield "MIERCOLES";
                case 2: yield "JUEVES";
                case 3: yield "VIERNES";
                case 4: yield "SABADO";
                case 5: yield "DOMINGO";
                default yield "ERROR"
            }

        }*/

    }
}
