package ud5.practicas.Inmobiliaria;

public class Casa extends Inmueble {
    int metrosTerreno;
     
        public Casa (String direccion, int metrosCuadrados, int metrosTerreno, int numHabitaciones, int numBanhos) {
            super(direccion,metrosCuadrados,numHabitaciones,numBanhos);
            this.metrosTerreno = metrosTerreno;
        }

    


}
