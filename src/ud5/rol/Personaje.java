/*
 * Diseña una clase Personaje que se utilizará en un juego de rol. Los personajes de esta clase tendrán un nombre, una raza (a elegir entre HUMANO, ELFO, ENANO, HOBBIT, 
ORCO o TROLL) y las siguientes características físicas numéricas (números enteros 
mayores que cero): 
fuerza, agilidad, constitución, inteligencia, intuicion y presencia. 
Además los personajes tendrán los atributos “nivel” y “experiencia” 
(que se inicializarán por defecto en 1 y 0 respectivamente) y 
“puntos de vida” (que tendrá un valor inicial de 50 más 
el valor de constitución del personaje). 
 */
package ud5.rol;

import java.util.Random;

public class Personaje {
    Raza raza;
    String nombre;
    int fuerza;
    int agilidad;
    int constitucion;

    int nivel = 0;
    int experiencia = 1;
    int puntosDeVida = 50; //+ constiucion de persona
    

    // indicando todos los parámetros
    public Personaje(String nombre, Raza raza, int fuerza, int agilidad, int constitucion, int nivel, int experiencia, int puntosDeVida) {
        this.nombre = nombre;
        this.raza = raza;
        this.fuerza = fuerza;
        this.agilidad = agilidad;
        this.constitucion = constitucion;
        this.nivel = nivel;
        this.experiencia = experiencia;
        this.puntosDeVida = 50 + constitucion; //?

        /* 
        raza válida
        atributos numéricos mayores o iguales a 1 menos experiencia */
    }

   
    // Indicando nombre, raza y características físicas. 
    public Personaje(String nombre, Raza raza) {
        Random rnd = new Random();

         /*
         En este caso el nivel se inicializará a 1 y 
         la experiencia a 0 y los puntos de vida al 50 más el 
         valor de constitución. */
        this.nivel = 1;
        this.puntosDeVida = 50 + constitucion;

    }

    public Personaje (String nombre) {
        this.nombre = nombre;
        raza = Raza.HUMANO;

    }


    public void setPuntosDeVida(int puntosDeVida) {
        this.puntosDeVida = puntosDeVida + constitucion;
    }

    public int getPuntosdeVidaActuales() {
        //!!
        int puntosdeVidaActuales = 0;

        return puntosdeVidaActuales;

    }
    public void toString(String nombre, int pI, int pA) {
        int puntosdeVidaActuales = getPuntosdeVidaActuales();
        System.out.println(nombre + "("+ puntosDeVida+"/"+ puntosdeVidaActuales +")");
    }

    public void mostrarDatosPersonaje() {
        System.out.println("Información de personaje:");
        System.out.println("Raza: " + raza);
        System.out.println("Fuerza: " + fuerza);
        System.out.println("Agilidad: " + agilidad);
        System.out.println("Constitución: " + constitucion);
        System.out.println("Nivel: " + nivel);
        System.out.println("Experiencia: " + experiencia);
        System.out.println("Puntos de vida: " + puntosDeVida);

    }



    
}