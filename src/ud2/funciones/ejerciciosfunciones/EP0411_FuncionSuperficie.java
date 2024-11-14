//EP0411. Diseña una función que calcule y muestre la superficie y el volumen de una esfera.

package ud2.funciones.ejerciciosfunciones;

public class EP0411_FuncionSuperficie {


    public static double esfera (double radio) {
        double superficie = (4 * Math.PI) * (radio * radio);
        double volumen = (4 * Math.PI / 3) * (radio * radio * radio);
        
        double esfera = superficie * volumen;
        
        System.out.println("superficie: " + superficie);
        System.out.println("superficie: " + volumen);


        return esfera;
    } 
    public static void main(String[] args) {
        //double radio = 4.0;
        System.out.println(esfera(4));
        

    }
    
}
