package ejerciciospruebas.conversortemperaturas;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {

    //0°C = 32°F
    @Test
    void testCelsiusToFahrenheitCero() {
        assertEquals(32.0, TemperatureConverter.celsiusToFahrenheit(0), 0.001);
    }

    @Test
    void testCelsiusToFahrenheitPuntoCongelacion() {
        assertEquals(32.0, TemperatureConverter.celsiusToFahrenheit(0), 0.001, "El punto de congelación (0°C) debe ser 32°F");
    }

    @Test
    void testCelsiusToFahrenheitPuntoEbullicion() {
        assertEquals(212.0, TemperatureConverter.celsiusToFahrenheit(100), 0.001, "El punto de ebullición (100°C) debe ser 212°F");
    }

    @Test
    void testCelsiusToFahrenheitNegativo() {
        assertEquals(-40.0, TemperatureConverter.celsiusToFahrenheit(-40), 0.001, "-40°C debe ser -40°F");
    }

    @Test
    void testCelsiusToFahrenheitDecimal() {
        assertEquals(98.6, TemperatureConverter.celsiusToFahrenheit(37), 0.001, "37°C debe ser 98.6°F");
    }
}
