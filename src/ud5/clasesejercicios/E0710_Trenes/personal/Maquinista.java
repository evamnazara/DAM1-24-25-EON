package ud5.clasesejercicios.E0710_Trenes.personal;

public class Maquinista {
    String nombre;
    String dni;
    double sueldo;
    String rango;

    public Maquinista() {
    }

    public Maquinista(String nombre, String dni, double sueldo, String rango) {
        this.nombre = nombre;
        this.dni = dni;
        this.sueldo = sueldo;
        this.rango = rango;
    }

    @Override
    public String toString() {
        return "MAQUINISTA: \n" + //
                nombre + "\\n (DNI:" +dni +") \\n" + //
                        "(Sueldo: " + sueldo + ")\\n" +
                        "(rango: " + rango + ")\\n";
    }

}