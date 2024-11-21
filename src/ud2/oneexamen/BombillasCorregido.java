package ud2.oneexamen;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.*;

public class BombillasCorregido {
    public static void main(String[] args) {
        System.out.println(causaFinBombilla(1000, 200, 10));
        System.out.println(causaFinBombilla(1000, 100, 1));
        System.out.println(causaFinBombilla(1000, 100, 10));
        System.out.println(causaFinBombilla(100, 100, 100));
        System.out.println(causaFinBombilla(100, -10, 10));
        System.out.println(causaFinBombilla(1000, 10, 0));
    }
    
    public static String causaFinBombilla(int horas, int encendidos, int horasPorEncendido) {
        String causa;

        if (horas > 0 && encendidos > 0 && horasPorEncendido > 0 && horasPorEncendido <= 10 ) {
            int tiempoUso = encendidos * horasPorEncendido;


            if ((tiempoUso > horas)) {
                causa = "HORAS";  

            } else if  (tiempoUso < horas ) {
                causa = "ENCENDIDOS";   

            } else {
                causa = "ENCENDIDOS + HORAS";
            }     
        } else {
            causa = "ERROR";
        }
        
        return causa;
    }


@Test

public void causaFinBombillaTest() {
    assertEquals("ERROR", causaFinBombilla(100, 100, 100));
    assertEquals("ERROR", causaFinBombilla(1000, -10, 10));
    assertEquals("ERROR", causaFinBombilla(0, 10, 10));
    assertEquals("ERROR", causaFinBombilla(1000, 10, 0));
    assertEquals("ENCENDIDOS", causaFinBombilla(500, 400, 1));
    assertEquals("HORAS", causaFinBombilla(1000, 10000, 1));
    assertEquals("HORAS", causaFinBombilla(1000, 200, 10));
    assertEquals("HORAS", causaFinBombilla(2000, 700, 3));
    assertEquals("ENCENDIDOS", causaFinBombilla(2000, 600, 3));
    assertEquals("ENCENDIDOS", causaFinBombilla(1000, 100, 1));
    assertEquals("ENCENDIDOS", causaFinBombilla(1000, 100, 9));
    assertEquals("ENCENDIDOS + HORAS", causaFinBombilla(1000, 100, 10)); 

    }
}


