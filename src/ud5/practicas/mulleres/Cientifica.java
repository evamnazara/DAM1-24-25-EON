package ud5.practicas.mulleres;

public class Cientifica extends MullerTraballadora implements IPioneira {

    String descubrimento; 
    
    public Cientifica (String nome, String apelidos, int anoNacemento, String descubrimento) {
        super(nome, apelidos, anoNacemento);
        this.descubrimento = descubrimento;
    }


   @Override
   public String descricionContribucion() {
       return getDescubrimentoOuAporte();
   }
   
   @Override
   public String getDescubrimentoOuAporte() {
       // TODO Auto-generated method stub
       return null;
   }

}
