package ud6.apuntescolecciones;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Collection;

// Clase Cliente para ejemplos posteriores.
public class Cliente implements Comparable<Cliente>{
    String dni;
    String nombre;
    LocalDate fechaNacimiento;
    
    public Cliente(String dni, String nombre, String fechaNacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        DateTimeFormatter formatoFechas= DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.fechaNacimiento = LocalDate.parse(fechaNacimiento, formatoFechas);
    }

    private int edad() {
        return (int) fechaNacimiento.until(LocalDate.now(), ChronoUnit.YEARS);
    }

    @Override
    public boolean equals(Object obj) {
        return dni.equals(((Cliente)obj).dni);
    }

    @Override
    public String toString() {
        return "DNI: " + dni + " Nombre: " + nombre + " Edad: " + edad() + " \n";
    }

    @Override
    public int compareTo(Cliente o) {
        return dni.compareTo(o.dni);
    }

    public static void main(String[] args) {
        Collection<Cliente> clientes = new ArrayList<>();
        System.out.println(clientes.size());
        clientes.add(new Cliente("77416510M","Pepe","20/12/2000"));
        clientes.add(new Cliente("77416510M","Pepe","20/12/2000"));
        System.out.println(clientes.size());
        System.out.println(clientes.contains(new Cliente("77416510M","Pepe","20/12/2000")));
        System.out.println(clientes);

    }
}


