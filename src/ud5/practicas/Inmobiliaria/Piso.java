package ud5.practicas.Inmobiliaria;

public class Piso extends Inmueble{
    int planta;

    public Piso(String direccion, int metrosCuadrados, int numHabitaciones, int numBanhos, int precioVenta,
            int precioAlquiler, int planta) {
        super(direccion, metrosCuadrados, numHabitaciones, numBanhos, precioVenta, precioAlquiler);
        this.planta = planta;
    }

    public Piso(String direccion, int metrosCuadrados, int numHabitaciones, int numBanhos, int planta) {
        super(direccion, metrosCuadrados, numHabitaciones, numBanhos);
        this.planta = planta;
    }

    
}
