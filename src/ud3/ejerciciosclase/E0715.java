package ud3.ejerciciosclase;


public class E0715 {
    public static void main(String[] args) {
        Calendario fecha = new Calendario(2024,12,8);
        fecha.incrementarDia();
        fecha.incrementarAnho(5);
        fecha.mostrar();
        fecha.incrementarAnho(1);
        fecha.mostrar();

        System.out.println("Fin de programa.");
    }
}

