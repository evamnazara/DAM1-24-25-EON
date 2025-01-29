/*E0613. Diseñar un algoritmo que lea del teclado una frase e indique, para cada letra que 
aparece en la frase, cuántas veces se repite. Se consideran iguales las letras mayúsculas 
y las minúsculas para realizar la cuenta. Un ejemplo sería: 
 
Frase: En un lugar de La Mancha. 
Resultado: 
a: 4 veces 
c: 1 vez 
d: 1 vez 
e: 2 veces 
...  */

package arraysejercicios.apuntes;


public class E0613_ContadorDeLetras {
    public static void main(String[] args) {
        String frase = "que dices lombrices";

        String abecedario = "abcdefghijklmñnopqrstuvxyz";
        int [] contadorRepeticiones = new int [abecedario.length()];

        
        for (int i = 0; i < frase.length() ; i++) {
            char letra = Character.toLowerCase(frase.charAt(i));
            int posicion = abecedario.indexOf(letra);
         if(posicion != -1) {
                contadorRepeticiones[posicion]++;

           }
        }

        System.out.println("Frase: " + frase);
        System.out.println("Resultado: ");

        for(int i = 0; i < contadorRepeticiones.length; i++){
            if (contadorRepeticiones[i] > 0) {
                System.out.print(abecedario.charAt(i) + ": " + contadorRepeticiones[i]);
                System.out.println(contadorRepeticiones[i] > 1 ? " veces. " : " vez.");
            }
        }

    }

}
