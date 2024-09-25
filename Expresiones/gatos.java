package Expresiones;

public class gatos {
    public static void main(String[] args) {

        class Gato {
            String nombre;

            Gato(String nombre) {
                this.nombre = nombre;
            }

            boolean maullar() {
                return nombre.equals("Felino");
            }
        }

        Gato gato1 = new Gato("Felino");
        Gato gato2 = new Gato("Miau");
        boolean resultado = gato1.maullar() || gato2.maullar();
        
        System.out.println(resultado);
    }
}