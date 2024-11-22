package ud3.apuntes;

public class Fecha {
    private int dia;
    private int mes;
    private int anho;

    private boolean esBisiesto() {
        return ((anho % 4 == 0) && (anho % 100 != 0) || (anho % 400 == 0));
    }

    public void setDia(int d) {
        dia = d;
    }

    public void setMes(int m) {
        mes = m;
    }

    public void setAnho(int a) {
        anho = a;
    }

    public void asignarFecha(int d, int m, int a) {
        setDia(d);
        setMes(m);
        setAnho(a);
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnho() {
        return anho;
    }

    public boolean fechaCorrecta() {
        boolean diaCorrecto, mesCorrecto, anyoCorrecto;
        anyoCorrecto = (anho > 0);
        mesCorrecto = (mes >= 1) && (mes <= 12);
        
        switch (mes) {
            case 2:
                if (esBisiesto()) {
                    diaCorrecto = (dia >= 1 && dia <= 29);
                } else {
                    diaCorrecto = (dia >= 1 && dia <= 28);
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                diaCorrecto = (dia >= 1 && dia <= 30);
                break;
            default:
                diaCorrecto = (dia >= 1 && dia <= 31);
        }

        return diaCorrecto && mesCorrecto && anyoCorrecto;
    }
}