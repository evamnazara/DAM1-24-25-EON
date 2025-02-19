package ud5.rol;

public class Juego {
    public static void main(String[] args) {
        System.out.println("=========== JUEGO DE ROL ===========");
        System.out.println("1. Creación de personaje:");
        System.out.println();
        //Personaje Eren = new Personaje(Raza.HUMANO, 5, 8, 5, 3, 10, 20);


        System.out.println();
        Personaje Eren = new Personaje("Eren", Raza.HUMANO, 90, 150, 8, 5, 150, 30);
        
        Eren.mostrarDatosPersonaje();

       // Eren.toString();

}

}
