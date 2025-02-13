
/*
E0710. Hemos recibido el encargo de un cliente para definir los paquetes y las clases 
necesarias (solo implementar los atributos y los constructores) para gestionar una empresa 
ferroviaria, en la que se distinguen dos grandes grupos: el personal y la maquinaria.  
 
En el primero se ubican todos los empleados de la empresa, que se clasifican en tres 
grupos: los maquinistas, los mecánicos y los jefes de estación. De cada uno de ellos es 
necesario guardar: 

 
En la parte de maquinaria podemos encontrar trenes, locomotoras y vagones. De cada uno 
de ellos hay que considerar: 

●  Locomotoras: disponen de una matrícula (que las identifica), la potencia de sus 
motores y una antigüedad (año de fabricación). Además, cada locomotora tiene 
asignado un mecánico que se encarga de su mantenimiento. 
●  Trenes: están formados por una locomotora y un máximo de 5 vagones. Cada tren 
tiene asignado un maquinista que es responsable de él. 
 
Todas las clases correspondientes al personal (Maquinista, Mecanico y 
JefeEstacion) serán de uso público. Entre las clases relativas a la maquinaria solo será 
posible construir, desde clases externas, objetos de tipo Tren y de tipo Locomotora. La 
clase Vagon será solo visible por sus clases vecinas. 
 
Implementa las clases anteriores, con constructores apropiados, método toString, etc. y 
creación de trenes en el programa principal. 
 
Partiendo del modelo de clases anterior: 
1.  Crea un tren con un maquinista llamado “Pepe López” y con 3 vagones de madera, 
hierro y pasajeros respectivamente y carga máxima y actual a criterio del 
programador. La locomotora será del año 2000 y el mecánico que la mantiene será 
“Marta Pérez”, especialista en motor. 
Imprime por consola los datos del tren creado invocando el método toString() del 
objeto. 
2.  Añade nuevos métodos y características…  */

package ud5.clasesejercicios.E0710;

import java.time.LocalDate;

import ud5.clasesejercicios.E0710.maquinaria.Locomotora;
import ud5.clasesejercicios.E0710.maquinaria.Tren;
import ud5.clasesejercicios.E0710.personal.*;

public class App {
    public static void main(String[] args) {
        Maquinista maquinista1 = new Maquinista("Maria", "77416510M", 1500, "Jefe");
        Mecanico mecanico1 = new Mecanico("Pepe", "777666555", Especialidad.FRENOS);

        JefeEstacion jefe = new JefeEstacion("Lola","77445640M", LocalDate.of(2023,10,1));

        //no se puede crear vagon -- solo es visible por clases vecinas 

        Locomotora locomotora = new Locomotora("1111AAA",5000, 2023, mecanico1);
        Tren tren = new Tren(locomotora, null, maquinista1);
    }
    
}

