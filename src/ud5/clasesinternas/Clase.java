package ud5.clasesinternas;

import java.util.Comparator;

public class Clase {

    static class ClaseAnidadaEstatica {

    }
    class ClaseInterna{

    }
    public static void main(String[] args) {
        class ClaseInternaLocal {
            int claseIL;
        }

        Comparator claseAnonima = new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                return o1.getClass().getSimpleName().compareTo(o2.getClass().getSimpleName());

            }

    
        };
    }
}
