package ud5.clasesejercicios.E0710.personal;

import java.time.LocalDate;

/*

●  Jefes de estación: su nombre, DNI y la fecha en la que fue nombrado jefe de 
estación.  */
public class JefeEstacion {
    String nombre;
    String dni;
    LocalDate fechaNombramiento;
    

    public JefeEstacion(String nombre, String dni, LocalDate fechaNombramiento) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaNombramiento = fechaNombramiento;
    }
}
