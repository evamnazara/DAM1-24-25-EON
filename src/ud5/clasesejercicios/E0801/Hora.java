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
        Hora hora1 = new Hora(1,54);
        hora1.toString();
       // hora1.inc();
        hora1.toString();


        Hora hora2 = new Hora(55,3);

        hora2.toString();
      //  hora2.inc();
        hora2.toString();

        Hora hora3 = new Hora(3,59);
        hora3.toString();
      //  hora3.inc();
        hora3.toString();
    }
}
