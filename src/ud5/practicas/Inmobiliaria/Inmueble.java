package ud5.practicas.Inmobiliaria;

public abstract class Inmueble {
    String direccion;
    int metrosCuadrados;
    int numHabitaciones;
    int numBanhos;
    int precioVenta;
    int precioAlquiler;


    public Inmueble(String direccion, int metrosCuadrados, int numHabitaciones, int numBanhos, int precioVenta,
            int precioAlquiler) {
        this.direccion = direccion;
        this.metrosCuadrados = metrosCuadrados;
        this.numHabitaciones = numHabitaciones;
        this.numBanhos = numBanhos;
        this.precioVenta = precioVenta;
        this.precioAlquiler = precioAlquiler;
    }

    public Inmueble(String direccion, int metrosCuadrados, int numHabitaciones, int numBanhos) {
        this.direccion = direccion;
        this.metrosCuadrados = metrosCuadrados;
        this.numHabitaciones = numHabitaciones;
        this.numBanhos = numBanhos;
    }
    
    public void setPrecioAlquiler(int precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }
         

    public void setPrecioVenta(int precioVenta) {
        this.precioVenta = precioVenta;
    }

    
    @Override
    public String toString() {
        return "Inmueble en direccion " + direccion + ", ("+ metrosCuadrados + " m2, " + numHabitaciones + " habitaciones";
    }

    public abstract String detalle();
    
}
