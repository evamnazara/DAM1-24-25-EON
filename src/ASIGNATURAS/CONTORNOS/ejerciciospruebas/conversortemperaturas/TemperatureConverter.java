package ASIGNATURAS.CONTORNOS.ejerciciospruebas.conversortemperaturas;
public class TemperatureConverter { 
    public static double celsiusToFahrenheit(double celsius) { 
        return celsius * (5 / 9) + 32;  
    } 
} 

/* 


3

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    void testSaldoInicial() {
        BankAccount cuenta = new BankAccount(100);
        assertEquals(100, cuenta.getBalance(), 0.001, "El saldo inicial debe ser 100");
    }

    @Test
    void testDepositoValido() {
        BankAccount cuenta = new BankAccount(100);
        cuenta.deposit(50);
        assertEquals(150, cuenta.getBalance(), 0.001, "Después de depositar 50, el saldo debe ser 150");
    }

    @Test
    void testDepositoNegativo() {
        BankAccount cuenta = new BankAccount(100);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> cuenta.deposit(-10));
        assertEquals("El monto del depósito debe ser positivo", exception.getMessage());
    }

    @Test
    void testRetiroValido() {
        BankAccount cuenta = new BankAccount(100);
        cuenta.withdraw(30);
        assertEquals(70, cuenta.getBalance(), 0.001, "Después de retirar 30, el saldo debe ser 70");
    }

    @Test
    void testRetiroMayorQueSaldo() {
        BankAccount cuenta = new BankAccount(50);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> cuenta.withdraw(100));
        assertEquals("Saldo insuficiente", exception.getMessage());
    }

    @Test
    void testRetiroNegativo() {
        BankAccount cuenta = new BankAccount(100);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> cuenta.withdraw(-20));
        assertEquals("El monto del retiro debe ser positivo", exception.getMessage());
    }

    @Test
    void testSaldoInicialNegativo() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> new BankAccount(-50));
        assertEquals("El saldo inicial no puede ser negativo", exception.getMessage());
    }
}
balance -= amount;
Explicación de las pruebas:
	•	testSaldoInicial: Comprueba que el saldo inicial se establece correctamente.
	•	testDepositoValido: Verifica que un depósito válido aumenta el saldo.
	•	testDepositoNegativo: Asegura que depositar una cantidad negativa lanza una excepción.
	•	testRetiroValido: Confirma que un retiro válido reduce el saldo correctamente.
	•	testRetiroMayorQueSaldo: Prueba que intentar retirar más dinero del disponible lanza una excepción.
	•	testRetiroNegativo: Asegura que intentar retirar una cantidad negativa genera un error.
	•	testSaldoInicialNegativo: Verifica que la cuenta no puede crearse con un saldo negativo.
*/
