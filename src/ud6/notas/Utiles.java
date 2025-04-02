package ud6.notas;

import java.util.Iterator;
import java.util.Scanner;

@SuppressWarnings("unused")
public class Utiles {
    public static void main(String[] args) {
        /* ERROR: Con un bucle for each no podemos borrar elementos de la colección
              if (cliente.nombre.equals("Pepe"))
                clientes.remove(cliente);
            */
        //solo sirve para una cosa, por cada accion hay que crear otro

     /* System.out.println("IMPRESIÓN CON ITERADOR");
        Iterator<Cliente> it = clientes.iterator();
        while (it.hasNext()){
            Cliente c = it.next();
            System.out.println(c.nombre);
            if (c.nombre.equals("Pepe")) {
                it.remove();
            }
        } 
        } */
    }
       
}
