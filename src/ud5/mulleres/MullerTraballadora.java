package ud5.mulleres;

public abstract class MullerTraballadora {
    String nome;
    String apelidos;
    int anoNacemento;


    public MullerTraballadora(String nome, String apelidos, int anoNacemento) {
        this.nome = nome;
        this.apelidos = apelidos;
        this.anoNacemento = anoNacemento;
    }

    public abstract String descricionContribucion();

    public int getAnoNacemento() {
        return anoNacemento;
    }

    public int getIdade(int anoActual) {
        int edad = anoActual - anoNacemento;
        return edad;
    }

}
