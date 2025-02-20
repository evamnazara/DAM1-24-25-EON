package ud5.clasesejercicios.E0801;

public class Hora {
    int hora;
    int minuto;

    public Hora(int hora, int minuto) {
        this.hora = hora;
        this.minuto = minuto;
    }

    public void inc() {
        this.minuto = minuto++;

        if (minuto > 59) {
            minuto = 0;
            hora++;
        }

    }

  /*   public boolean setMinuto(int valor) {
        if (valor < 60) {
            return true;
        } else {
            return false;}
    }

    public boolean setHora(int valor) {
        if (valor < 24 ) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    public String toString(){
        return hora + ":" + minuto;
    }
*/
    
    public static void main(String[] args) {
        
    }
}
