package ud5.interfaces;

public class Leon implements Sonido {
    String nombre; 

    @Override
    public void voz() {
        System.out.println("gggRRRR");
        System.out.println("prrrrrr");
    }
    @Override 
    public void vozDurmiendo() {
        System.out.println("Grrrrrrrrrrrrrrrrrrrrrrrrrrrzzzzzzzzzzzzz");
    }
}
