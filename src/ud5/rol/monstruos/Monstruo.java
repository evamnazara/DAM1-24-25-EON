package ud5.rol.monstruos;

public class Monstruo {
    String nombre;
    int ataque; 
    int defensa;
    int velocidad;
    int puntosdeVida;


    public Monstruo (String nombre, int ataque, int defensa, int velocidad, int puntosdeVida) {

    }
    public void atacar(){

    }

    public boolean estaVivo(){
        boolean estaVivo = true;

        if (puntosdeVida <= 0) {
                estaVivo = false;
            }
        
        return estaVivo;
    }

    public void mostrar() {
        System.out.println("MONSTRUO: ");
        System.out.println("Nombre: " + nombre);
        System.out.println("Ataque: " + ataque);
        System.out.println("Defensa: " + defensa);
        System.out.println("Velocidad: " + velocidad);
        System.out.println("Puntos de Vida: " + puntosdeVida);
    }

    public boolean perderVida() {
        boolean perderVida = false;

        if (puntosdeVida <= 0) {
            perderVida = true;
            System.out.println("rip");
            return perderVida;
        }

        return perderVida;
    }
    @Override
    public String toString() {
        return "Monstruo: " + nombre + " (" + puntosdeVida + ") ";
    }

   /*
   40% de que sea un Orco 
    30% de que sea una Aranha 
    20% de que sea un Troll 
    10% de que sea un Dragon 
    
    Monstruo generaMonstruoAleatorio()  */ 
    
}
