package ud5.practicas.Inmobiliaria;

import java.util.Scanner;

public class Inmueble {
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



    
    public void setPrecioAlquiler(int i) {
        Scanner sc = new Scanner(System.in);
        precioAlquiler = sc.nextInt();
        this.precioAlquiler = precioAlquiler;    
    }
    public void setPrecioVenta(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setPrecioVenta'");
    }
    public char[] detalle() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'detalle'");
    }
    
}
