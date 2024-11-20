//autora: Eva María Otero Názara


package ud2.oneexamen;

public class DuraciónBombillas {

    public static void main(String[] args) {

        int numHorasIluminacion = 1000; 
        int numMaxEncendidos = 100; 
        int numHorasEncendida = 10;

        int causa = (causaFinBombilla(numHorasIluminacion, numMaxEncendidos, numHorasEncendida));
        //número de horas encendida en cada uso (como mucho 10).
        System.out.println(causa);
    }

    static int causaFinBombilla(int a, int b, int c) {
        int causa = 0; 

        if (a >= a) {
            System.out.println("HORAS");
        } else if (b >= b) {
            System.out.println("ENCENDIDOS");
        } else if (a >= a && b >= b)  {
            System.out.println("ENCENDIDOS + HORAS");
        } else {
            System.out.println("ERROR"); 
        }
        return causa;
    }
    
}
