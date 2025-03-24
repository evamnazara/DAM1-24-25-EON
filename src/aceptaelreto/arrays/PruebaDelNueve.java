package arrays;

import java.util.*;

public class PruebaDelNueve {

    // Función que convierte un número en base 'B' a su valor decimal
    public static int toDecimal(String num, int base) {
        int result = 0;
        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);
            int value;
            if (c >= '0' && c <= '9') {
                value = c - '0';
            } else {
                value = c - 'A' + 10;
            }
            result = result * base + value;
        }
        return result;
    }

    // Función que calcula el resumen de un número en base 'B'
    public static int resumen(int num, int base) {
        while (num >= base) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
            while (num >= base) {
                num -= base - 1;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();  // Número de casos de prueba
        sc.nextLine();  // Limpiar la nueva línea
        
        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();
            String[] parts = input.split(" ");
            
            int base = Integer.parseInt(parts[0]);  // Base numérica
            String dividendoStr = parts[1];  // Dividendo
            String divisorStr = parts[2];  // Divisor
            String cocienteStr = parts[3];  // Cociente
            String restoStr = parts[4];  // Resto
            
            // Convertir todos los valores a decimal
            int dividendo = toDecimal(dividendoStr, base);
            int divisor = toDecimal(divisorStr, base);
            int cociente = toDecimal(cocienteStr, base);
            int resto = toDecimal(restoStr, base);
            
            // Obtener los resúmenes de todos los valores
            int resumenDividendo = resumen(dividendo, base);
            int resumenDivisor = resumen(divisor, base);
            int resumenCociente = resumen(cociente, base);
            int resumenResto = resumen(resto, base);
            
            // Verificar si la relación de la división se cumple con los resúmenes
            int baseMinusOne = base - 1;
            int check = (resumenDivisor * resumenCociente + resumenResto) % baseMinusOne;
            
            if (check == resumenDividendo) {
                System.out.println("POSIBLEMENTE CORRECTO");
            } else {
                System.out.println("INCORRECTO");
            }
        }
        
        sc.close();
    }
}



/*Prueba del nueve en base N
Tiempo máximo: 1,000-5,000 s  Memoria máxima: 12288 KiB
La conocida como prueba del nueve es una técnica que nos permite comprobar si nos hemos equivocado al calcular el resultado de una operacion aritmética. La aplicación de la prueba del nueve requiere dos pasos. El primero es reducir (o "resumir") cada uno de los números de la operación a comprobar (operandos y resultado) a un sólo dígito, y luego repetir la operación original con esos dígitos.

Hay muchas maneras diferentes de realizar el primer paso de "reducción", pero todas acaban con el mismo valor. Una de las más sencillas consiste en ir sumando cada uno de los dígitos del número a reducir a la suma de los anteriores. Cada vez que sumamos el valor de un dígito, comprobamos si la suma acumulada hasta el momento es mayor o igual que 9. Si lo es, antes de continuar sumando restaremos 9 a ese valor acumulado. El objetivo es conseguir que el "resumen" de cualquier número sea un dígito comprendido entre 0 y 8. Por ejemplo, para el número 1732:

Ejemplo de cálculo del resumen
Otros ejemplos de reducción son:
126	0		803	2		2525	5		2535	6
El segundo paso de la prueba del nueve es repetir la operación original usando los dígitos "resumen", y comprobar si el resultado obtenido es el mismo que el dígito resumen del resultado original. Por ejemplo, para comprobar una suma, primero se reduce a un solo dígito tanto los operandos como el resultado. Una vez hecho esto, se suman los resúmenes obtenidos y se comprueba si el resultado es igual al resumen obtenido para él. La siguiente figura muestra un caso en el que la prueba del nueve detecta un error:

Ejemplo de aplicación de la prueba del 9
En este ejemplo, la suma de los resúmenes ha dado directamente un único dígito (el 6). Si hubiera dado un número mayor, tendríamos que aplicar el proceso descrito anteriormente hasta reducirlo.

Se debe tener en cuenta que la prueba del nueve no es infalible. Si en el caso anterior al hacer la suma hubiéramos llegado a la solución (incorrecta) 2526, el dígito resumen habría sido 6, y habría superado la prueba del 9. No obstante, se garantiza que si la prueba del nueve detecta un error, la operación original estará mal. Dicho de otro modo, la prueba del nueve puede dar falsos positivos (decir que la operación está bien, cuando no lo está), pero nunca falsos negativos (decir que la operación está mal, cuando está bien).

Para comprobar una división, no se hace la división con los resúmenes, dado que el dividendo podría ser cero y la división no podría calcularse. En su lugar, nos apoyamos en que el dividendo debe ser igual a la multiplicación del divisor por el cociente más el resto (D = d · c + r).

Por ejemplo, la división de 1732 entre 803 da 2, con resto 126, y por tanto se cumple que:

(803 × 2) + 126 = 1732

Usando los resúmenes:

(2 × 2) + 0 = 4

Si al calcular la división nos hubiéramos equivocado en el cociente o en el resto, probablemente la prueba del nueve lo habría detectado.

Para demostrar matemáticamente que la prueba del 9 funciona, se utiliza aritmética modular y el teorema fundamental de la numeración. De hecho, se puede demostrar que esta prueba funciona para todas las bases B de numeración cambiando únicamente el nueve de la descripcion por la base en la que estemos trabajando menos uno (B − 1). En ese caso, cada vez que sumemos mientras calculamos el dígito resumen, tendremos que comprobar si el número alcanzado es mayor o igual que B − 1 y restar B − 1 cuando eso ocurra.
Entrada
La entrada estará compuesta por un número que indicará el número de casos de prueba que aparecerán a continuación. Para cada caso de prueba se proporcionarán cinco números. El primero de ellos será la base en la que se encuentran los números que aparecen a continuación, y será un entero mayor que 2 y menor o igual que 36. Los cuatro siguientes serán el dividendo, el divisor, el cociente y el resto de una división, y estarán representados en la base dada. Ninguno de esos números superará el millón de dígitos.

Cuando se utilicen bases superiores a 10, los dígitos que superen el valor 9 se representarán mediante letras del alfabeto inglés (en mayúsculas), tal y como muestra la tabla siguiente.

Número:	0	1	2	3	…	9	10	11	…
Símbolo:	0	1	2	3	…	9	A	B	…
Salida
Para cada caso de prueba, se escribirá INCORRECTO si la prueba descrita determina que la división indicada en el caso de prueba es errónea, y se escribirá POSIBLEMENTE CORRECTO si no se detecta error alguno.

Entrada de ejemplo
4
10 1732 803 2 126
10 199 13 16 4
16 AF 12 9 D
3 2 1 1 0
Salida de ejemplo
 
POSIBLEMENTE CORRECTO
INCORRECTO
POSIBLEMENTE CORRECTO
INCORRECTO */