package ASIGNATURAS.CONTORNOS.ejerciciospruebas.conversortemperaturas;

public class MathUtils { 
    public static int factorial(int n) { 
        if (n < 0) { 
            throw new IllegalArgumentException("O número debe ser positivo"); 
        } 
        int resultado = 1; 
        for (int i = 1; i <= n; i++) {  //error: es i++
            resultado *= i; 
        } 
        return resultado; 
    } 
}

//c.c = 3

