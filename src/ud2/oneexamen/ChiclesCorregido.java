package ud2.oneexamen;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

public class ChiclesCorregido {

    static int totalChicles (int chiclesComprados, int numeroEnvoltorios,  int chiclesRegalados){

        int total  = chiclesComprados;
        int extras = chiclesComprados;
        int contador = 0;
 

        if ( chiclesRegalados > numeroEnvoltorios ){
            return -1; }
        if ( numeroEnvoltorios == 0 ){
            return chiclesComprados; }
        
        while( extras >= numeroEnvoltorios ) {
            contador = (extras / numeroEnvoltorios) * chiclesRegalados;
            total += contador;
            extras = extras / numeroEnvoltorios;
        };

        return total;

    }


    @Test
    public void ChiclesRegaloTest() {
        assertEquals(31, totalChicles(25, 5, 1));
        assertEquals(6, totalChicles(5, 5, 1 ));
        assertEquals(111, totalChicles(100, 10, 1));
        assertEquals(100, totalChicles(100, 0, 0));
        assertEquals(-1, totalChicles(20, 2, 5));
        assertEquals(-1, totalChicles(10, -1, 0));
    }


}
