//Eva María Otero Názara

package contornosud3eon;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmailValidatorTest {
    @Test
    void testBuclePrimeraCondicion() {
        assertTrue(EmailValidator.isValid("user@email.com"));
    }

    @Test
    void cadenaVacia() {
        assertFalse(EmailValidator.isValid(null));
    }

    @Test
    void sinArroba() {
        assertFalse(EmailValidator.isValid("useremail.com"));
    }
    @Test
    void dosArrobas() {
        assertFalse(EmailValidator.isValid("useremail@@com"));
    }


    @Test
    void sinPuntos() {
        assertFalse(EmailValidator.isValid("user@emailcom"));
    }

    @Test
    void masDeUnPunto() {
        assertFalse(EmailValidator.isValid("user@email..com"));
    }

    @Test
    void usuarioVacio() {
        assertFalse(EmailValidator.isValid("@email..com"));
    }

}
