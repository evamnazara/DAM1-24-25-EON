package ud5.clasesejercicios.E0710.personal;

/*Mecánicos: su nombre, teléfono (para contactar en caso de urgencia) y en qué 
especialidad desarrollan su trabajo (esta puede ser: frenos, hidráulica, electricidad o 
motor). */
public class Mecanico {
    String nombre;
    String telefono;
    //enumeracion 
    enum Especialidad {FRENOS, HIDRAULICA, ELECTRICIDAD, MOTOR};
    Especialidad especialidad;
    
    public Mecanico(String nombre, String telefono, Especialidad frenos) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.especialidad = frenos;
    }
    
}
