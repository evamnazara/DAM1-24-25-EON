package mulleres;

public class Artista extends MullerTraballadora {
    String estilo;

    public Artista(String nome, String apelidos, int anoNacemento, String estilo) {
            super(nome, apelidos, anoNacemento);
            this.estilo = estilo;
        }
    
    


    @Override
    public String descricionContribucion() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'descricionContribucion'");
    }

}
