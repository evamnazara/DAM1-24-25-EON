package ejerciciospruebas.conversoredades;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class AgeClassifierTest {

    @Test
    void testInfantilLimite() {
        assertEquals("Infantil", AgeClassifier.classify(0));
        assertEquals("Infantil", AgeClassifier.classify(8));
        assertEquals("Infantil", AgeClassifier.classify(12));
    }

    @Test
    void testAdolescente() {
        assertEquals("Adolescente", AgeClassifier.classify(13));
        assertEquals("Adolescente", AgeClassifier.classify(1));
        assertEquals("Adolescente", AgeClassifier.classify(17));
    }

    @Test
    void testAdulto() {
        assertEquals("Adulto", AgeClassifier.classify(18));
        assertEquals("Adulto", AgeClassifier.classify(30));
        assertEquals("Adulto", AgeClassifier.classify(64));
    }

    @Test
    void testSenior() {
        assertEquals("Senior", AgeClassifier.classify(65));
        assertEquals("Senior", AgeClassifier.classify(70));
        assertEquals("Senior", AgeClassifier.classify(120));
    }

}