import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {
    @Test 
    //TODAS LAS EXCEPCIONES SE PRUEBAN ASI 
    void factorialExcepcion() {
        try {
           // int resultado = MathUtils.factorial(-1);
            fail("FALLO: n < 0 deberia generar una excepcion");
        } catch (Exception e) {
        }

    }

    @Test 
    void factorialNoBucle() {
        assertEquals(1, MathUtils.factorial(0));
    }

    @Test 
    void factorialBucle() {
        assertEquals(1, MathUtils.factorial(1));
    }

    
    @Test
    void testFactorialDeCero() {
        assertEquals(1, MathUtils.factorial(0));
    }

    @Test
    void testFactorialDeUno() {
        assertEquals(1, MathUtils.factorial(1));
    }

    @Test
    void testFactorialDeNumeroPequeno() {
        assertEquals(120, MathUtils.factorial(5));
    }

    @Test
    void testFactorialDeNumeroMayor() {
        assertEquals(3628800, MathUtils.factorial(10), "El factorial de 10 debe ser 3628800");
    }


}