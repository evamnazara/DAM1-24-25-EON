/* Radar.java
Os radares de tramo consisten en colocar dúas cámaras en dous puntos dunha estrada para
comprobar canto tempo tarda un vehículo en percorrer ese tramo. Segundo o teorema de
Bonnet-Lagrange ou do valor medio, se a velocidade media dun vehículo ao recorrer o tramo supera
a velocidade máxima permitida, podemos asegurar (aínda que non o viramos) que nalgún punto do
traxecto superouse a velocidade permitida.
Por exemplo: si colocamos as cámaras separadas 10Km nun tramo cuxa velocidade está limitada a
110Km/h, e un coche tarda 5 minutos (300) en ser visto pola segunda cámara, saberemos que a súa
velocidade media foi de 120Km/h, e polo tanto nalgún sitio superou o límite de velocidade aínda que
ao pasar por debaixo das dúas cámaras o coche fose a 80Km/h.
Implementa unha función coa seguinte declaración que acepte como parámetros de entrada a
distancia en km, o tempo en segundos e o límite de velocidade en km/h e que devolva 0 se non se
superou o límite ou, en caso contrario, o exceso de velocidade en km/h.
static int excesoVelocidade(double distancia, int tempo, int limite);
# PROBAS
assert excesoVelocidade(10, 600, 60) == 0
assert excesoVelocidade(10, 600, 50) == 10
assert excesoVelocidade(10, 600, 30) == 30
assert excesoVelocidade(15, 300, 120) == 60
assert excesoVelocidade(15, 300, 90) == 90
assert excesoVelocidade(10, 300, 120) == 0
assert excesoVelocidade(10, 300, 90) == 30
Analiza a seguinte táboa da DXT sobre de infraccións de velocidade e observa o patrón que seguen
os puntos perdidos en función dos tramos no exceso de velocidade. Fíxate que segundo eses tramos
a táboa divídese en dous grupos:
1. Cando o límite é menor ou igual a 50
2. Cando o límite é maior ou igual a 60.Implementa unha función coa seguinte declaración que acepte o límite e o exceso de velocidade e
devolva o importe da multa corrspondente:
static int multaInfraccion(int limite, double excesoVelocidade);
# PROBAS
assert multaInfraccion(20, 0) == 0
assert multaInfraccion(20, 15) == 100
assert multaInfraccion(30, 21) == 300
assert multaInfraccion(40, 31) == 400
assert multaInfraccion(50, 50) == 500
assert multaInfraccion(50, 51) == 600
assert multaInfraccion(60, 0) == 0
assert multaInfraccion(70, 30) == 100
assert multaInfraccion(80, 31) == 300
assert multaInfraccion(90, 51) == 400
assert multaInfraccion(100, 61) == 500
assert multaInfraccion(110, 71) == 600
assert multaInfraccion(120, 1) == 100
Usando as funcións anteriores, deseña un programa que simule o funcionamento dun radar de tramo
onde os parámetros de distancia e límite de velocidade estean codificados como constantes cos
valores 10 e 120 respectivamente..
O programa recibirá por teclado o tempo en segundos que tardou un vehiculo en percorrer a
distancia indicada e amosará unha das seguintes mensaxes:
a. “Velocidade dentro do límite”, se non hai exceso de velocidada.
b. “Infracción por exceso de velocidade!!  */ 

package ud2.practicas;

import java.util.Scanner;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Radar {

    

    public static void main(String[] args) {

        final double DISTANCIA_KM = 10.0;
        final int LIMITE_VELOCIDAD_KMH = 120; 

        Scanner sc = new Scanner(System.in);

        System.out.println("RADAR:");
        System.out.print("Introduce en segundos el tiempo tardado en recorrer el tramo: ");
        int tiempoSegundos = sc.nextInt();

        int excesoVelocidad = excesoVelocidad(DISTANCIA_KM, tiempoSegundos, LIMITE_VELOCIDAD_KMH);

        if (excesoVelocidad == 0) {
            System.out.println("Velocidad dentro del límite establecido.");
        } else {
            System.out.printf("Se ha cometido una infracción por exceso de velocidad: %d km/h%n", excesoVelocidad);

            int importeMulta = multaInfraccion(LIMITE_VELOCIDAD_KMH, excesoVelocidad);
            System.out.println("Debe abonar una multa.");
            System.out.printf("Importe de la multa: %d €%n", importeMulta);
        }

        sc.close();
    }

    public static int excesoVelocidad(double distancia, int tiempo, int limite) {
        
        double tiempoHoras = tiempo / 3600.0;
        double velocidadMedia = distancia / tiempoHoras; 

        if (velocidadMedia > limite) {
            return (int) (velocidadMedia - limite);
        }

        return 0; 
    }

    public static int multaInfraccion(int limiteVelocidad, int excesoVelocidad) {
        
        if (excesoVelocidad == 0) {
            return 0; 
        }

        if (limiteVelocidad <= 50) {
            if (excesoVelocidad <= 20) 
                return 100;
            if (excesoVelocidad <= 30) 
                return 300;
            if (excesoVelocidad <= 40) 
                return 400;
            if (excesoVelocidad <= 50) 
                return 500;

            return 600;

        } else {
            if (excesoVelocidad <= 30) 
                return 100;
            if (excesoVelocidad <= 50) 
                return 300;
            if (excesoVelocidad <= 60) 
                return 400;
            if (excesoVelocidad <= 70) 
                return 500;

            return 600; 
        }
    }

    @Test
    public void testExcesoVelocidad() {
        assertEquals(0, Radar.excesoVelocidad(10.0, 600, 60)); 
        assertEquals(10, Radar.excesoVelocidad(10.0, 600, 50));
        assertEquals(30, Radar.excesoVelocidad(10.0, 600, 30)); 
        assertEquals(60, Radar.excesoVelocidad(15.0, 300, 120)); 
        assertEquals(90, Radar.excesoVelocidad(15.0, 300, 90)); 
        assertEquals(0, Radar.excesoVelocidad(10.0, 300, 120)); 
        assertEquals(30, Radar.excesoVelocidad(10.0, 300, 90)); 
    }

    @Test
    public void testMultaInfraccion() {
        assertEquals(0, Radar.multaInfraccion(20, 0));
        assertEquals(100, Radar.multaInfraccion(20, 15));
        assertEquals(300, Radar.multaInfraccion(30, 21));
        assertEquals(400, Radar.multaInfraccion(40, 31)); 
        assertEquals(500, Radar.multaInfraccion(50, 50));
        assertEquals(600, Radar.multaInfraccion(50, 51));
        assertEquals(0, Radar.multaInfraccion(60, 0)); 
        assertEquals(100, Radar.multaInfraccion(70, 30));
        assertEquals(300, Radar.multaInfraccion(80, 31)); 
        assertEquals(400, Radar.multaInfraccion(90, 51)); 
        assertEquals(500, Radar.multaInfraccion(100, 61)); 
        assertEquals(600, Radar.multaInfraccion(110, 71));
        assertEquals(100, Radar.multaInfraccion(120, 1));
    }

}
