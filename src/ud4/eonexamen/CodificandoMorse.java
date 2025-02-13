//Eva Otero Názara
package ud4.eonexamen;

public class CodificandoMorse {
    public static void main(String[] args) {
       
        String frase = "YA NACIO";
        System.out.println(numPuntosMorse(frase)); //73
        /*
            ?  15 
            !  19
            SI  11  
            YA NACIO 73 */
    }

    static int numPuntosMorse(String frase) {

        final int LONGITUD_MAXIMA = 80;
        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ!?"; 
        String[] letrasMorse = { ".-", "-...", "-.-.", "-..", ".", "..-.", 
        "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", 
        "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", 
        "-.-.--", "..--.." }; 


        if (frase.length() > LONGITUD_MAXIMA) {
            System.out.println("La frase excede el máximo de " + LONGITUD_MAXIMA + "carácteres.");
        } else if (frase.isEmpty()) {
            System.out.println("Frase vacía.");
        };

         //punto se envía como un pitido
         //una raya como tres pitidos (tres puntos de duración).
         //símbolo y símbolde una misma letra hay que esperar un punto, entre letras de una misma palabra se esperan tres puntos, y entre palabras cinco puntos.

        String resultado = "";
        int numPuntos = resultado.length();

        return numPuntos;
    }; 

}
/*
 
El código Morse codifica cada carácter se codifica como una sucesión de puntos y rayas 
según una tabla como la siguiente:  
 
Letra  Código    Letra  Código    Letra  Código    Letra  Código 
A  .-    N  -.    H  ....    U  ..- 
B  -...    O  ---    I  ..    V  ...- 
C  -.-.    P  .--.    J  .---    W  .-- 
D  -..    Q  --.-    K  -.-    X  -..- 
E  .    R  .-.    L  .-..    Y  -.-- 
F  ..-.    S  ...    M  --    Z  --.. 
G  --.    T  -    !  -.-.--    ?  ..--.. 
 
En realidad, el mensaje se enviaba como una serie de pitidos. Según el estándar de 1922, 
un punto se envía como un pitido, una raya como tres pitidos (o un pitido de tres puntos de 
duración). Además, entre símbolo y símbolo (raya o punto) de una misma letra hay que  esperar un punto, entre letras de una misma palabra se esperan tres puntos, y entre 
palabras cinco puntos. 
 
Implementa el siguiente método que recibe una frase de no más de 80 letras mayúsculas 
del alfabeto inglés, signos de admiración, interrogación y espacios, y devuelve la duración 
del mensaje codificado en número de puntos. 
 
static int numPuntosMorse(String frase); 
 
Recurso: podes utilizar as seguintes estructuras que codifican as táboas do código Morse. 
String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ!?"; 
String[] letrasMorse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", 
"....", "..", ".---", "-.-", ".-..", 
        "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", 
".--", "-..-", "-.--", "--..", 
        "-.-.--", "..--.." }; 
*/