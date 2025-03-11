package ud5.apuntesinterfaces;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Socio implements Comparable { 
    int id; 
    String nombre; 
 
    public Socio(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    

    @Override
    public String toString() {
        return "\nID: " + id + " | Nombre: " + nombre;
    }



    //... 
    public static void main(String[] args) {
        Socio s = new Socio(1,"Maria");
   
        Socio s2 = new Socio(2, "Lolo");

        if (s.compareTo(s2) == 0) {
            System.out.println("son iguales");
        } else if (s.compareTo(s2) < 0) {
            System.out.println(s + " es menor ");
        } else {
            System.out.println(s + " es mayor ");
        }


        System.out.println("array de socios ordenado ");

        Socio[] socios = {
                s, 
                s2, 
            new Socio (8, "Eva"),

            new Socio (4, "Paco"),
            new Socio (6, "Laura"),
        };
        System.out.println(Arrays.toString(socios));
        Arrays.sort(socios);
        System.out.println(Arrays.toString(socios));
    
    }

    /*@Override 
    public int compareTo(Object o) { 
        //Socio otroSocio = ((Socio) o); es un ejemplo de casteo para entender la comparacion

        int resultado = id - ((Socio) o).id;       
        return resultado;  

        /* si lo pide ordenado al reves

         * int resultado = otroSocio.id - id;
         * 
        
    } */

    //ordena alfabeticamente ascendentemente
    @Override 
    public int compareTo(Object o) {
        Socio otroSocio = ((Socio) o);
        
        return nombre.compareTo(otroSocio.nombre);
        //ORDENAR A LA INVERSA: 
        //return -nombre.compareTo(otroSocio.nombre);
        //return otroSocio.nombre.compareTo(nombre);

    }
}  