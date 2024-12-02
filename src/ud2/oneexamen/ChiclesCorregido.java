package ud2.oneexamen;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

public class ChiclesCorregido {

    public static void main(){
        int a;
        a = totalChicles(7,3,1);
        System.out.println(a);
    }

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
            assertEquals(6, totalChicles(5, 5, 1));
            assertEquals(111, totalChicles(100, 10, 1));
            assertEquals(-1, totalChicles(20, 2, 5));
            assertEquals(-1, totalChicles(10, -1, 0));
            assertEquals(-1, totalChicles(-1, 2, 1));
            assertEquals(-1, totalChicles(10, 1, -1));
            assertEquals(-1, totalChicles(20, 2, 2));
            assertEquals(10, totalChicles(7, 3, 1));
            assertEquals(40, totalChicles(27, 3, 1));
            assertEquals(21, totalChicles(11, 2, 1));
            assertEquals(31, totalChicles(16, 2, 1));
            assertEquals(100, totalChicles(100, 0, 0));
            assertEquals(100, totalChicles(100, 0, 1));
            assertEquals(0, totalChicles(0, 0, 1));
            assertEquals(0, totalChicles(0, 2, 1));
    }

}
