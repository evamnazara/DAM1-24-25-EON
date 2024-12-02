package ud3.apuntes;

//import java.nio.channels.Pipe.SourceChannel;

public class EjemploPoo {
    public static void main(String[] args) {
        
        
        // =============== CREACIÓN DE OBJETO PERSONA ===============

        Persona p = new Persona(); 

        //tipo (Persona)- identificador (p) 
            //ALTERNATIVA:
            // Persona p;
            // p = new Persona();
    
        //=============== UTILIZACIÓN DE MÉTODOS DEFINIDOS EN LA CLASE PERSONA   ===============                                 
        p.inicializar("Arsenio","Leante","Gomez",30);

        String nombre2 = p.nombreCompleto();

        if(p.esMayorEdad()){
           System.out.println(nombre2 + " es mayor de edad");
        }else{
           System.out.println(nombre2 + " no es mayor de edad");
        }

        // =============== CREACIÓN DE OTRA PERSONA ===============

        /* Persona p2 = new Persona();
        
        p2.inicializar("María", "Perez", "Castro", 17);    

        String nombrePersona2 = p2.nombreCompleto();
    
        if(p2.esMayorEdad()){
            System.out.println(nombrePersona2 + " es mayor de edad");
         }else{
            System.out.println(nombrePersona2 + " no es mayor de edad");
         } */

        // ===================== CUMPLEAÑOS ===============

        /* Asignamos cumpleañero = p, con loq eu apuntamos a la persona Leandro.
         * Al inicializar el método le sumamos un año y obtenemos su edad. */
        Persona cumpleanhero = p; 
        cumpleanhero.cumplirAnhos();
        System.out.println(cumpleanhero.nombreCompleto() + " tiene " + cumpleanhero.getEdad() + " años.");
        /* de añadir un null aquí, desaparece la referencia, pero no el objeto.
         * 
         */
        cumpleanhero = null; 


        // =============== MIEMBROS ESTÁTICOS ============

        //se puede llamar un contador de una clase ANTES de haber inicializado la clase
        System.out.println(Persona.contadorPersonas);
        Persona.incrementarContador();
        System.out.println(Persona.contadorPersonas);
    
    }

}
