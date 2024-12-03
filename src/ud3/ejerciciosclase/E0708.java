package ud3.ejerciciosclase;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class E0708 {
    public static void main(String[] args) {
        Sintonizador miRadio = new Sintonizador();
        miRadio.display();
        miRadio.up();
        miRadio.upThin();
        miRadio.display();
        miRadio.fijarMemoria1(0);
        miRadio.down();
        miRadio.display();
        miRadio.setMemoria2(0);
        miRadio.display();
    }

    //TEST DE PRUEBA
   @Test 
   public void testSintonizador() {
        assertEquals(0, 0);
   }

}
