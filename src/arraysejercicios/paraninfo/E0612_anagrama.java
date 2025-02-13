package arraysejercicios.paraninfo;
import java.util.*;

public class E0612_anagrama {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);

        String palabra1;
        String palabra2;

        System.out.println("Introduce palabra 1: ");
        palabra1 = sc.nextLine();

        System.out.println("Introduce palabra 2: ");
        palabra2 = sc.nextLine();

        if (palabra1.length() == palabra2.length()) {
            
        }
        

        sc.close();*/

        System.out.println(sonAnagrama("amor","roma")); //true
        System.out.println(sonAnagrama("Amor", "Roma"));
        System.out.println(sonAnagrama("amor","rollo")); //falso

    }

    public static boolean sonAnagrama(String cadena1, String cadena2) {
         //A MINUSCULAS LA CADENA , al reves no funciona
        char[] palabra1 = cadena1.toLowerCase().toCharArray();
        char[] palabra2 = cadena2.toLowerCase().toCharArray();

        Arrays.sort(palabra1);
        Arrays.sort(palabra2);

        return Arrays.equals(palabra1,palabra2);

    }
}
