package praiasdegalicia;

import java.util.Arrays;

//subclase servicios 
public class AppBanderaAzul {
    public static void main(String[] args) {
        // Carga las playas desde el fichero JSON en un array de Praias
        Praia[] praias = Util.importarPraias("praiaisdegalicia/praias.json");
        System.out.println(Arrays.toString(praias));

        // TODO Resuelve el problema propuesto
        // ...
    }
}
