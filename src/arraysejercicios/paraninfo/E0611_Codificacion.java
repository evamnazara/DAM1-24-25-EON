/*E0611. Se dispone de los siguientes conjuntos de letras: 
 
conjunto 1: e  i  k  m  p  q  r  s  t  u  v 
 
conjunto 2: p  v  i  u  m  t  e  r  k  q  s 
 
Con esta información es posible codificar un texto, convirtiendo cada letra del conjunto 1 
en su correspondiente del conjunto 2. El resto de las letras no se modifican. Los conjuntos 
se utilizan tanto para codificar mayúsculas como minúsculas, mostrando siempre el 
resultado de la codificación en minúsculas. 
 
Un ejemplo: la palabra "PaquiTo" se codifica como "matqvko". 
 
Realizar un programa que codifique un texto. Para ello implementar la siguiente función:  
 
Crea un programa principal o tests unitarios para probar los métodos anteriores.  */

package arraysejercicios.paraninfo;

import java.util.*;

public class E0611_Codificacion {
    public static void main(String[] args) {
        String conjunto1 = "eikmpqrtuv";
        String conjunto2 = "pviumterkqs";

        Scanner sc = new Scanner(System.in);
        System.out.println("Frase a codificar: ");
        String fraseOriginal = sc.nextLine();
        sc.close();

        String fraseCodificada = codifica(conjunto1, conjunto2, fraseOriginal);

        System.out.println("Frase codificada:");
        System.out.println(fraseCodificada);

        //NO FUNCIONA
        String fraseCodificada2 = codifica2(conjunto1.toCharArray(), conjunto2.toCharArray(), fraseCodificada);
        System.out.println(fraseCodificada2);
    }


    
    public static String codifica(String conjunto1,String conjunto2, String fraseOriginal)  {
        //recorrer frase > revisar elemento1 > convertirlo 
        
        String codificada ="";

        for (int i = 0; i < fraseOriginal.length(); i++) { //recorre frase
            char letraActual = Character.toLowerCase(fraseOriginal.charAt(i)); //variable de letra a minus
            int posicion = conjunto1.indexOf(fraseOriginal.charAt(i));

            if (posicion == -1 ) {
                codificada += letraActual;
            } else {
                codificada += conjunto2.charAt(posicion);
            }
        }

        return codificada;
        //return null;

        
    }
    //NO FUNCIONA
    static String codifica2(char[] conjunto1, char[] conjunto2, String fraseOriginal) {
        
        fraseOriginal = fraseOriginal.toLowerCase();

        for (int i = 0; i < fraseOriginal.length(); i++) {
            fraseOriginal += fraseOriginal.replace(conjunto1[i], conjunto2[i]);
        }

        return fraseOriginal;
    } 
    /* OTRAS OPCIONES DE FUNCION: 
    
    //devuelve el carácter c codificado según los conjuntos 1 y 2 que se le pasan. 
    //public static char codifica(String conjunto1[],String conjunto2[], char c)
    public static char codifica(char conjunto1[],char conjunto2[], char c)  {
        
        return ' ';
    }
    //Implementa también el método para codificar una palabra o frase entera: 
    public static String codifica(char[] conjunto1, char[] conjunto2, String palabra) {

        return null;

    }
    public static String codifica(String[] conjunto1, String[] conjunto2, String palabra) {

        return null;
    } 
        */
}


