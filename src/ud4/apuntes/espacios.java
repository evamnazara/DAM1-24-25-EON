package ud4.apuntes;

//import java.util.Arrays;
import java.util.Scanner;

public class espacios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Frase: ");
        String frase = sc.nextLine();
        String fraseSinEspacios = frase.replaceAll(" ", "");

        System.out.println("Frase sin espacios: " + fraseSinEspacios);

        System.out.println(String.valueOf(frase));
        //String lombricesSplit = "que dices lombrices";
       
        sc.close();

    }
    
}
