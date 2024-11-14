package ud2.funciones.ejerciciosfunciones;

public class EP0412_DistanciaEuclidea {

    public static void main(String[] args) {

        double x1 = 2;
        double y1 = 2;
        double x2 = 2;
        double y2 = 2;
        
        System.out.println(distancia(x1, y1, x2, y2));
        
    }

    static double distancia (double x1,double y1, double x2, double y2) {
        double distancia = Math.sqrt(Math.pow(x1 - x2, x1 - x2) + Math.pow(y1 - y2,y1 - y2));
        
       return distancia;

    }
    
}
