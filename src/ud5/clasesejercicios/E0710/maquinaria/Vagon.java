/*Vagones: tienen un número que los identifica, una carga máxima (en kilos), la carga 
actual y el tipo de mercancía con el que están cargados.  */
package ud5.clasesejercicios.E0710.maquinaria;

public class Vagon {
    
    int id;
    int cargaMaxima;
    int cargaActual;
    String tipoMercancia;
    
    
    public Vagon(int id, int cargaMaxima, int cargaActual, String tipoMercancia) {
        this.id = id;
        this.cargaMaxima = cargaMaxima;
        this.cargaActual = cargaActual;
        this.tipoMercancia = tipoMercancia;
    }

    
}
