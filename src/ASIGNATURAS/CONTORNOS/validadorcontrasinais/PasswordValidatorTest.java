/* 
        COMPLEJIDAD CICLOMATICA 5

  CAMINOS:
  
  1, 9 // no entra
  1, 2, 3 // sale en el if 
  1, 2, 4, 5, 7, 9 //for: entra en los dos ifs
  1, 2, 4, 5, 6, 9 // for: sale en el primer if 
  1, 2, 4, 5, 6, 7, 8, 9 // sale en el segundo if 

  */

package ASIGNATURAS.CONTORNOS.validadorcontrasinais;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

  
public class PasswordValidatorTest {

    //8 caracteres + no entra al bucle 
    @Test
    void testLongitud() {
            assertFalse(PasswordValidator.isValid("abc"));
    }

    //bucle - sale en el primer if 
    @Test
    void testBuclePrimeraCondicion() {
            assertFalse(PasswordValidator.isValid("contrasena"));
    }

    //bucle - sale en el segundo if 
    @Test
    void testBucleSegundaCondicion() {
            assertTrue(PasswordValidator.isValid("contrasena1"));
    }

    //contraseña correcta
    @Test
    void testCorrecto() {
            assertTrue(PasswordValidator.isValid("Contrasena1"));
    }
    


}
