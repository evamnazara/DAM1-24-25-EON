
package ud5.clasesejercicios.abstractas.E0804;

import java.util.Arrays;

public class Violin extends Instrumento {        
    
    @Override 
    public void interpretar() {
        System.out.println("Violin: " + Arrays.toString(melodia));
    }

}

