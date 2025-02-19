//eva
package ud5.rol;

public class Juego {
    public static void main(String[] args) {
        System.out.println("=========== JUEGO DE ROL ===========");
        System.out.println("1. Creación de personaje:");
        System.out.println();

        Personaje Levi = new Personaje("Levi Ackerman", Raza.ENANO, 200, 350, 70, 9, 96, 210);     
        Levi.mostrar();

        Personaje Eren = new Personaje("Eren");
        Eren.mostrar();

        Personaje Mikasa = new Personaje("Mikasa", Raza.HUMANO);
        Mikasa.mostrar();
}

}
