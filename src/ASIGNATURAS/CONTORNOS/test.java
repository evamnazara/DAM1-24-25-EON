import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class AgeClassifierTest {

    @Test
    void testInfantil() {
        assertEquals("Infantil", AgeClassifier.classify(0));
        assertEquals("Infantil", AgeClassifier.classify(12));
    }

    @Test
    void testAdolescente() {
        assertEquals("Adolescente", AgeClassifier.classify(13));
        assertEquals("Adolescente", AgeClassifier.classify(17));
    }

    @Test
    void testAdulto() {
        assertEquals("Adulto", AgeClassifier.classify(18));
        assertEquals("Adulto", AgeClassifier.classify(64));
    }

    @Test
    void testSenior() {
        assertEquals("Senior", AgeClassifier.classify(65));
        assertEquals("Senior", AgeClassifier.classify(120));
    }

    @Test
    void testEdadInvalida() {
        assertThrows(IllegalArgumentException.class, () -> AgeClassifier.classify(-1));
        assertThrows(IllegalArgumentException.class, () -> AgeClassifier.classify(121));
    }
}