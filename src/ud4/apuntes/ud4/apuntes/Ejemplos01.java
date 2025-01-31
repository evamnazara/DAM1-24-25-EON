package ud4.apuntes;

public class Ejemplos01 {
    public static void main(String[] args) {
        int[] edad; //declaracion de variable

        //los arrays son estaticos. no pueden crecer ni decrecer una vez que se pone una tamaño
        //para añadir se hacen copias
        edad = new int[5]; //num de elementos - 5 desde 0

        edad[0] = 28; //asignacion de valores
        edad[1] = 35;
        edad[2] = 18;
        edad[3] = 12;
        edad[4] = 60;

        System.out.println(edad[4]);

        System.out.println("La dedad de la persona 2 es " + edad[3] + " años.");
        System.out.println("Fin de programa.");

    }
}
