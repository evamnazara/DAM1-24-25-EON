//Eva María Otero Názara

package contornosud3eon;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class DiscountSystemTest {
    @Test
    void testCantidadMenora0() { //excepcion
        try {
            double resExcepción = DiscountSystem.applyDiscount(-3, false);
                fail ("Excepción");
            System.out.println(resExcepción);
        } catch (Exception e) {
            System.out.println("Prueba OK");
        }
    }

     
    @Test
    public void testCantidadEntre0y50() { //no lleva descuento
        double cantidadEntregada = 30;
        double descuento = cantidadEntregada - (cantidadEntregada * 0);
        assertEquals(descuento, DiscountSystem.applyDiscount(cantidadEntregada,false));
    }


    @Test
    public void testCantidad50a100() { //descuento de 5%
        double cantidadEntregada = 55;
        double descuento = cantidadEntregada - (cantidadEntregada * 0.05);
        assertEquals(descuento, DiscountSystem.applyDiscount(cantidadEntregada,false));

    }

    @Test
    public void testCantidad50() { //descuento de 5%
        double cantidadEntregada = 50;
        double descuento = cantidadEntregada - (cantidadEntregada * 0.05);
        assertEquals(descuento, DiscountSystem.applyDiscount(cantidadEntregada,false));
    }
    @Test
    public void testCantidad100() { //descuento de 5%
        double cantidadEntregada = 100;
        double descuento = cantidadEntregada - (cantidadEntregada * 0.05);
        assertEquals(descuento, DiscountSystem.applyDiscount(cantidadEntregada,false));
    }

    @Test
    public void testCantidadMayorA100() { //desc 10%
        double cantidadEntregada = 105;
        double descuento = cantidadEntregada - (cantidadEntregada * 0.10);
        assertEquals(descuento, DiscountSystem.applyDiscount(cantidadEntregada,false));
       
    }

    @Test
    public void testCantidad200_conFidelidad() { //descuento de 15%
        double cantidadEntregada = 200;
        double descuento = cantidadEntregada - (cantidadEntregada * 0.15);
        assertEquals(descuento, DiscountSystem.applyDiscount(cantidadEntregada,true));
    }

   @Test
    public void testCantidadMayora200_conFidelidad() { //descuento 15%
        double cantidadEntregada = 200;
        double descuento = cantidadEntregada - (cantidadEntregada * 0.15);
        assertEquals(descuento, DiscountSystem.applyDiscount(cantidadEntregada,true));
    }


    @Test
    public void testCantidadMayora200_sinFidelidad() { //descuento 10%
        double cantidadEntregada = 220;
        double descuento = cantidadEntregada - (cantidadEntregada * 0.10);
        assertEquals(descuento, DiscountSystem.applyDiscount(cantidadEntregada,false));

    }

}
