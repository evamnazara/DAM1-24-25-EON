//eva
package ud5.rol;

import java.util.Random;

public class Personaje {
    final int PUNTOS_VIDA_INICIALES = 50;
    Raza raza;
    String nombre;
    int fuerza;
    int agilidad;
    int constitucion;

    int nivel;
    int experiencia;
    int puntosDeVida;
    

    //inicializaciones

    //1. todos los parámetros 
    public Personaje(String nombre, Raza raza, int fuerza, int agilidad, int constitucion, int nivel, int experiencia, int puntosDeVida) {
        this.nombre = nombre;
        this.raza = raza;
        this.fuerza = fuerza;
        this.agilidad = agilidad;
        this.constitucion = constitucion;
        this.nivel = nivel;
        this.experiencia = experiencia;
        this.puntosDeVida = PUNTOS_VIDA_INICIALES + constitucion;

        if (fuerza < 1 || agilidad < 1 || constitucion < 1) {
            throw new IllegalArgumentException("Atributos inválidos. ¡Tienen que ser todos mayores a 0!");
        }
        
        //raza válida?
    }

   
    // inicialización 2: nombre y raza > características físicas aleatorias 
    public Personaje(String nombre, Raza raza) {
        Random rnd = new Random();

        this.nombre = nombre;
        this.raza = raza;
        this.fuerza = rnd.nextInt(100) + 1;
        this.agilidad = rnd.nextInt(100) + 1;
        this.constitucion = rnd.nextInt(100) + 1;

        this.nivel = 1;
        this.experiencia = 0;
        this.puntosDeVida = PUNTOS_VIDA_INICIALES + constitucion;

    }

    //inicialización 3: nombre > atributos aleatorios

    public Personaje (String nombre) {
        Random rnd = new Random();

        this.nombre = nombre;
        raza = Raza.HUMANO;

        this.fuerza = rnd.nextInt(100) + 1;
        this.agilidad = rnd.nextInt(100) + 1;
        this.constitucion = rnd.nextInt(100) + 1;

        this.nivel = 1;
        this.experiencia = 0;
        this.puntosDeVida = PUNTOS_VIDA_INICIALES + constitucion;

    }

    public int getPuntosdeVidaActuales() {
        // aun no tiene sentido?
        int puntosdeVidaActuales = 0;
        return puntosdeVidaActuales;

    }

   
    public void mostrar() {
        System.out.println("____________________________");
        System.out.println();
        System.out.println("=== INFORMACIÓN DEL PERSONAJE ===");
        System.out.println();
        System.out.println("Nombre: " + nombre);
        System.out.println("Raza: " + raza);
        System.out.println("Fuerza: " + fuerza);
        System.out.println("Agilidad: " + agilidad);
        System.out.println("Constitución: " + constitucion);
        System.out.println("Nivel: " + nivel);
        System.out.println("Experiencia: " + experiencia);
        System.out.println("Puntos de Vida: " + puntosDeVida);
    }

    public void toString(String nombre, int pI, int pA) {
        int puntosdeVidaActuales = getPuntosdeVidaActuales();
        System.out.println(nombre + "("+ puntosDeVida+"/"+ puntosdeVidaActuales +")");
    }

    @Override
    public String toString() {
    return nombre + " (" + puntosDeVida + "/" + getPuntosdeVidaActuales() + ")"; 
    }
        

    //ejercicio 2

    /*  Si experiencia  supera un múltiplo de 1000 sube de nivel. 
        Se pueden subir varios niveles de golpe. 
        Devuelve el número de niveles que sube el personaje. 
    */
    public byte sumarExperiencia(int puntos) {

        int experienciaOriginal = this.experiencia;
        this.experiencia += puntos;
    
        int nivelesSubidos = (this.experiencia / 1000) - (experienciaOriginal / 1000);
    
        if (nivelesSubidos > 0) {
            this.nivel += nivelesSubidos;
            }
    
        return (byte) nivelesSubidos;
    }
    
    //nivel +1 y caracteristicas + 5% 
    public void subirNivel() {
        this.nivel = nivel + 1;

        this.fuerza = fuerza + (fuerza * 5 / 100);
        this.agilidad = agilidad + (agilidad * 5 / 100);
        this.constitucion = constitucion + (constitucion * 5 / 100);
    }
    
    
    //restaura puntos de vida a original menos si son más 
    public void curar() {
        if (puntosDeVida >= (PUNTOS_VIDA_INICIALES + constitucion)) {
            System.out.println("No puedes curarte, tus puntos de vida son mayores a los iniciales.");
        } else {
            puntosDeVida = PUNTOS_VIDA_INICIALES + constitucion;
            System.out.println("Te has curado. Tus puntos de vida vuelven a ser " + puntosDeVida);
        }
    }

    //bajan los puntos que toquen, si los puntos llegan o bajan de 0 el personaje muere
    
    //completar ig
    public boolean perderVida(int puntos) {
        boolean perderVida = false;
            if (puntosDeVida <= 0) {
                perderVida = true;
            }

        return perderVida;
    }

    public boolean estaVivo(){
        boolean estaVivo = true;

        if (puntosDeVida <= 0) {
                estaVivo = false;
            }
        
        return estaVivo;
    }

    /* 
    int atacar(Personaje enemigo): permite a un personaje atacar a otro con el siguiente algoritmo:
    El personaje atacante utilizará una puntuación de ataque resultado de sumar un número aleatorio entre 1 y 100 al valor de su atributo de fuerza. 
    El personaje atacado o enemigo utilizará una puntuación de defensa resultado de sumar un número aleatorio entre 1 y 100 al valor de su atributo de agilidad. 
    La diferencia entre la puntuación de ataque y la de defensa, si es positiva, será el daño realizado y resultará en el número de puntos de vida que pierde el personaje atacado y en el número de puntos de experiencia que suman tanto el personaje atacante como el atacado. El daño no podrá ser negativo ni mayor que los puntos de vida restantes del defensor. El valor se ajustará a esos límites si es necesario.
    Si la diferencia es cero o negativa se entiende que el personaje atacante falla o que el atacado esquiva o para el ataque.
    El método devolverá los puntos de daño.
    */
}