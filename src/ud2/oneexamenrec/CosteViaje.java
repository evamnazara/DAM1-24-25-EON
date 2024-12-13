/* AUTORA: Eva María Otero Názara */


package ud2.oneexamenrec;

public class CosteViaje {
    public static void main(String[] args) {
        //Un coche de gasolina que consuma 6 litros a los 100 km gastará: 9,126 €
        //Un coche diesel que consuma 5 litros a los 100 km gastará: 7,175 €
        //Un coche eléctrico que consuma 15 kWh a los 100 km gastará: 2,48865 €

        System.out.println(costeViaje(100, 1, 6));
        System.out.println(costeViaje(100, 2, 5));
        System.out.println(costeViaje(100, 3, 15));

    }
    static double costeViaje (double km, int tipoCombustible, double consumoMedio) {
        double precioViaje = 0;
        double eurosporLitro;

        
        
        switch (tipoCombustible) {
                case 1: //Gasolina, Sin plomo 95: 1,521 € / litro
                    eurosporLitro = 1.521;
                    System.out.println("Gasolina.");
                    precioViaje = (consumoMedio * eurosporLitro) * km / 100 ; 

                    break;

                case 2: //Diesel, Gasóleo A: 1,435 € / litro
                    eurosporLitro = 1.435;
                    System.out.println("Diesel");
                    precioViaje = (consumoMedio * eurosporLitro) * km / 100 ; 
                    break;

                case 3: //Electricidad, kWh: 0,16591 € / kWh
                    System.out.println("Electrico");
                    eurosporLitro = 0.16591;
                    precioViaje = (consumoMedio * eurosporLitro) * km / 100 ; 
                    break;

        } 

        return precioViaje;


    }

}
