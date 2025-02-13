/* CORREGIR.
 * 
 * HACER METODO DE QUITAR LAS MAYUSCULAS
  */
package arraysejercicios.paraninfo;
import java.util.Scanner;

public class E0610_Palindromos {
    public static void main(String[] args) {
        
     Scanner sc = new Scanner(System.in);
        String frase = "";
        System.out.println("Frase:");
        frase = sc.nextLine();
        sc.close();

        if (esPalindromo(frase)) {
            System.out.println("La frase es palíndroma.");
        } else {
            System.out.println("La frase NO es palíndroma. ");
        }

    }

    static boolean esPalindromo(String frase) {
        String frasesinEspacios = sinEspacios(frase);
        String fraseInvertidaSInEspacios = invertirSinEspacios(frasesinEspacios);

        return frasesinEspacios.equalsIgnoreCase(fraseInvertidaSInEspacios);
    }

   static String invertirSinEspacios (String frase) {
        String fraseInvertida = "";

        for (int i = frase.length() -1; i >= 0; i-- ){
           char letra = frase.charAt(i);
            if (letra != ' ') {
                } switch (letra) {
                    case 'á': letra = 'a'; break;
                    case 'é': letra = 'e'; break;
                    case 'í': letra = 'i'; break;
                    case 'ó': letra = 'o'; break;
                    case 'ú': letra = 'u'; break;
                }

                fraseInvertida += letra;
            }

            return fraseInvertida;
    }

    

    static String sinEspacios (String frase) {
        String fraseSinEspacios = "";

        for (int i = 0; i < frase.length(); i-- ){
           char letra = frase.charAt(i);
            if (letra != ' ') {
                fraseSinEspacios += letra;
            } switch (letra) {
                case 'á': letra = 'a'; break;
                case 'é': letra = 'e'; break;
                case 'í': letra = 'i'; break;
                case 'ó': letra = 'o'; break;
                case 'ú': letra = 'u'; break;
            }
        }

        return fraseSinEspacios;
    }
}
