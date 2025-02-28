package ud5.interfaces;

public class Perro implements Sonido{
    String nombre;

    @Override
    public void voz() {
        System.out.println("woof");
    }

    
}
