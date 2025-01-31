/*Matrículas 
Las matrículas de los automóviles en España están compuestas por dos partes. La primera 
consiste en un número decimal de 4 dígitos que se va incrementando de uno en uno. 
Cuando se llega al último valor (9999), se reinicia la cuenta (en 0000) y se incrementa la 
segunda parte, que contiene letras. 
 
Esta segunda parte consiste en tres letras consecutivas, excluyendo las vocales y las letras 
Ñ y Q. Cuando, tras recorrer todos los números, se incrementa la letra, se pasa a la 
siguiente en el abecedario en la letra situada más a la derecha. Si para ella se acaba el 
abecedario, se vuelve al principio (B) y se incrementa la anterior con este mismo 
procedimiento. 
 
Implementa y prueba las siguientes dos funciones: 
 
boolean esMatriculaValida(String matricula); 
Devuelve true si el String que se le pasa como parámetro es una matrícula válida o false en caso contrario. La 
función no distinguirá entre mayúsculas y minúsculas. 
 
Ideas: 
●  Podemos utilizar una variable de tipo bandera/interruptor/boolean que inicialice a 
true, suponiendo que la matrícula es correcta y que cambie a false si detectamos 
alguna condición para que no lo sea. 
●  Validar longitud. 
●  Para los 4 primeros caracteres validamos si es un dígito. Character.isDigit()? 
●  Para los 3 últimos caracteres validamos que sea una letra válida (indiferente 
minúscula o mayúscula). Módulo: boolean esLetraValida(char ch);? 
 
String siguienteMatricula(String matricula); 
Devuelve el valor de la matrícula siguiente a la que se le pasa como parámetro. 
 
Ideas: 
●  Invocamos el método anterior para validar la matrícula de entrada. 
●  Podemos implementar un módulo para incrementar los dígitos:  
String incrementarDigitos(String matricula); 
●  Si los dígitos han dado la vuelta: matricula.substring(0, 4).equals(“0000”) 
podemos implementar otro módulo para incrementar las letras:  
String incrementarLetras(String matricula);  */

package arraysejercicios.UD04Practica;

import java.util.Scanner;

public class Matriculas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("VALIDADOR DE MATRÍCULAS:");
        System.out.println("Introduce una matrícula: ");
        String matricula = sc.nextLine();
        System.out.println(esMatriculaValida(matricula));
        
        System.out.println("COMPARADOR DE MATRÍCULAS:");
        System.out.println("Introduce la matricula a comparar:");
        String matricula2 = sc.nextLine();
        if (esMatriculaValida(matricula) == true) {
                comparaMatriculas(matricula, matricula2);
        } else {
            System.out.println("Introduce una matrícula correcta.");
        }
        
    }

    static boolean esMatriculaValida(String matricula) {
        final int LONGITUD = 7;

        //partir la cadena en 2 trozos 
        String numeros = matricula.substring(0,4);
        System.out.println(numeros);
        String letras = matricula.substring(4, 7);
        System.out.println(letras);


        //validacion numeros
        boolean numValidados = false;
        for (int i = 0; i < numeros.length(); i++ ){
            if (! Character.isDigit(i)) { 
                    numValidados = true;      
                    System.out.println("Los números son correctos.");
                }
        }
        

        //validacion letras
        boolean letrasValidadas = true;

        String letrasInvalidas = "AEIUOÑQ";

        if (letras.contains(letrasInvalidas)) {
            letrasValidadas = false;
            System.out.println("Las letras son correctas.");
            }


        //comprobacion
        if (matricula.length() == LONGITUD && numValidados == true && letrasValidadas == true) {
            return true;
        } else {
            System.out.println("Matrícula inválida.");
            return false;
        }

    }

    //Devuelve el valor de la matrícula siguiente a la que se le pasa como parámetro. 
    static String siguienteMatricula(String matricula) {
        String e ="";


        return e;
    }

    static int comparaMatriculas(String m1, String m2) {
        //NO IMPLEMENTADA

        return 2;
    }
}
