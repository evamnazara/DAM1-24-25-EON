package ud5.EP0812a3;

/*EP0812. Las empresas de transporte, para evitar daños en los paquetes, embalan todas 
sus mercancías en cajas con el tamaño adecuado. Una caja se crea expresamente con un 
ancho, un alto y un fondo y, una vez creada, se mantiene inmutable. Cada caja lleva pegada 
una etiqueta, de un máximo de 30 caracteres, con información útil como el nombre del 
destinatario, dirección, etc. Implementa la clase Caja con los siguientes métodos: 

●  double getVolumen(): que devuelve el volumen de la caja en metros cúbicos. 
●  void setEtiqueta(String etiqueta): que modifica el valor de la etiqueta de 
la caja. 
●  String toString(): que devuelve una cadena con la representación de la caja.  */
public class Caja {
    int ancho;
    int alto; 
    int fondo;
    public Unidad unidad;

    //etiqueta
    String destinatario;
    String direccion;

    public Caja(int ancho, int alto, int fondo, Unidad unidad) {
        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
        this.unidad = unidad;
    }

    public double getVolumen(int an, int al, int fo) {
        double volumen = an * al * fo;
        return volumen;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public String getDireccion() {
        return direccion;
    }
    
    public Unidad getUnidad() {
        return unidad;
    }

    public String setEtiqueta(String etiqueta){
        String etiquetaS = "Destinario: " + getDestinatario() + "Direccion: " + getDireccion();
        return etiquetaS;
    }

    @Override
    //modificar despues
    public String toString() {
        String caja = "Caja: [ancho=" + ancho + ", alto=" + alto + ", fondo=" + fondo + ", unidad=" + unidad + "]";
        String etiqueta = setEtiqueta(caja);
        return caja + etiqueta;
    };

}
