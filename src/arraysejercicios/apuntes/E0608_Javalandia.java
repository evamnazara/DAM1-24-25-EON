//ARREGLAR 2 

/* E0608. 
Los habitantes de Javalandia tienen un idioma algo extraño; 
cuando hablan siempre comienzan sus frases con “Javalín, javalón”,
para después hacer una pausa más  o menos larga (la pausa se representa mediante espacios en blanco o tabuladores) y a 
continuación expresan el mensaje. 
Existe un dialecto que no comienza sus frases con la muletilla anterior, 
pero siempre las terminan con un silencio, más o menos prolongado y la coletilla 
“javalén, len, len”. 
Se pide diseñar un traductor que, en primer lugar, nos diga si la 
frase introducida está escrita en el idioma de Javalandia 
(en cualquiera de sus dialectos), 
y en caso afirmativo, nos muestre solo el mensaje sin muletillas.  
*/
package arraysejercicios.apuntes;
import java.util.*;

public class E0608_Javalandia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final String PREFIJO = "Javalín, javalón";
        final String SUFIJO = "javalén, len, len";


        System.out.println("Introduce la frase normal o en dialecto: ");

        String frase = sc.nextLine();

        if (frase.startsWith(PREFIJO) ) {
            System.out.println("La frase está en idioma Javalandia.");
            String fraseTraducida = frase.substring(PREFIJO.length());
            fraseTraducida = fraseTraducida.strip();
            System.out.println("Traducción: " + fraseTraducida);

        } else if (frase.endsWith(SUFIJO)) {
            System.out.println("La frase está en idioma Javalandia.");
            //String traduccion = frase.substring(0,frase.length()) - SUFIJO.length());

        } else {
            System.out.println("La frase está escrita normal.");
        }
            

        sc.close();
    }
}
