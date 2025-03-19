package ud5.bingo;


class Jugador {
    String nombre;
    Carton[] cartones;

    public Jugador(String nombre, int numCartones) {
        this.nombre = nombre;
        cartones = new Carton[numCartones];
        for (int i = 0; i < cartones.length; i++) {
            cartones[i] = new Carton();
        }
    }

    @Override
    public String toString() {
        String str = "Jugador: " + nombre + " (" + cartones.length + " cartones)\n\n";
        for (int i = 0; i < cartones.length; i++) {
            str += cartones[i] + "\n";
        }
        return str;
    }

}