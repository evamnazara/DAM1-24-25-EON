package mulleres;

public abstract class MullerTraballadora {
    String nome;
    String apelidos;
    int anoNacemento;


//devolve unha descrición da súa contribución.
    abstract String descricionContribucion() {} 
    
// devolve a idade actual da persoa (se aínda vivise).

    public int getIdade(int anoActual)  {
        int idade = anoActual - anoNacemento;
        return idade;
    }
}
