//con ejercicio 2 
package ud5.practicas.Inmobiliaria;

@SuppressWarnings("rawtypes")
public abstract class Inmueble implements Comparable {
    String direccion;
    Integer metrosCuadrados;
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

    //EJERCICIO 2 
    
    // Ordena Inmuebles por m2 (de mayor a menor) 
    public void sortMetrosDesc(Inmueble[] t){}; 
 
    //Ordena Inmuebles por numHabitaciones y luego por m2 (de mayor a menor) 
    public void sortHabMetrosDesc(Inmueble[] t){}; 
 
    //Ordena Inmuebles por precio Alquiler (de menor a mayor). (¿Y qué pasa con los inmuebles que no se ofrecen en alquiler?) 
    public void sortPrecioAlquilerAsc(Inmueble[] t){}; 
 
    //Ordena Inmuebles por precio Venta (de menor a mayor). (¿Y qué pasa con los inmuebles que no se ofrecen en venta?) 
    public void sortPrecioVentaAsc(Inmueble[] t){}; 

    @Override
    public int compareTo(Object o) {
        Inmueble inmueble = (Inmueble) o;
        int res = direccion.compareTo(inmueble.direccion);
        if (res == 0) {
            res = this.direccion.compareTo(inmueble.direccion);
        }
        return res;
    
}

}
