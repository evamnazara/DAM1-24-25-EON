import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    @Test
    void testFactorialDeCero() {
        assertEquals(1, MathUtils.factorial(0), "El factorial de 0 debe ser 1");
    }

    @Test
    void testFactorialDeUno() {
        assertEquals(1, MathUtils.factorial(1), "El factorial de 1 debe ser 1");
    }

    @Test
    void testFactorialDeNumeroPequeno() {
        assertEquals(120, MathUtils.factorial(5), "El factorial de 5 debe ser 120");
    }

    @Test
    void testFactorialDeNumeroMayor() {
        assertEquals(3628800, MathUtils.factorial(10), "El factorial de 10 debe ser 3628800");
    }

    @Test
    void testFactorialDeNumeroNegativo() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> MathUtils.factorial(-5));
        assertEquals("El número debe ser positivo", exception.getMessage());
    }
}