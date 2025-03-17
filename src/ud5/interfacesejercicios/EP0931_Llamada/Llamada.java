/*
EP0931_Llamada. En una compañía de telecomunicaciones se desean registrar los datos de todas las llamadas de sus clientes. 
    Implementar la clase Llamada, que guardará los siguientes datos: 
        número de teléfono del cliente, 
        número del interlocutor, a
        tributo booleano que indique si la llamada es saliente, 
        fecha y hora del inicio de la llamada y del fin, 
        atributo enumerado que indique la zona del interlocutor (suponer cinco zonas con tarifas distintas) y 
        tabla de constantes con las tarifas de las zonas en céntimos de euro/minuto. 
        
        En la clase se establecerá un orden natural compuesto basado en el número del teléfono del cliente como primer criterio y en la fecha y hora de inicio como segundo criterio. 
        Asimismo, se implementará un método 
        que devuelva la duración en minutos de la llamada y 
        otro que calcule su coste, si es saliente. 
        
        Por último, implementar el método toString(), que muestre los dos números de teléfono, la fecha y hora del inicio, la duración y el coste.  
*/

package ud5.interfacesejercicios.EP0931_Llamada;

import java.time.LocalDateTime;


public class Llamada {
    String telefonoCliente;
    String telefonoInterlocutor;
    boolean saliente;
    LocalDateTime fechaInicioLlamada;
    LocalDateTime fechaFinLlamada;
    enum ZonaInterlocutor {ZONA1, ZONA2, ZONA3, ZONA4, ZONA5}
    ZonaInterlocutor zona;

    //constructores 
    public Llamada(String telefonoCliente, String telefonoInterlocutor, boolean saliente, LocalDateTime fechaInicioLlamada, LocalDateTime fechaFinLlamada, ZonaInterlocutor zona) {
            this.telefonoCliente = telefonoCliente;
            this.telefonoInterlocutor = telefonoInterlocutor;
            this.saliente = saliente;
            this.fechaInicioLlamada = fechaInicioLlamada;
            this.fechaFinLlamada = fechaFinLlamada;
            this.zona = zona;
    };

    public ZonaInterlocutor getZona() {
        return zona;
    }

    public LocalDateTime getFechaInicioLlamada() {
        return fechaInicioLlamada;
    }

    public LocalDateTime getFechaFinLlamada() {
        return fechaFinLlamada;
    }
    public void minutosLlamada(){
        int minutosLlamada;

        minutosLlamada =  fechaFinLlamada.getMinute() - fechaInicioLlamada.getMinute();
        System.out.println(minutosLlamada);
    }
    public void setTarifaCliente(ZonaInterlocutor zona) {
        double tarifaZona1 = 0.01;
        double tarifaZona2 = 0.02;
        double tarifaZona3 = 0.03;
        double tarifaZona4 = 0.04;
        double tarifaZona5 = 0.05;

        double tarifaCliente;
        /*switch (Llamada.getZona()) {
            case ZONA1:
                tarifaCliente = Llamada.minutosLlamada() * tarifaZona1;
                break;
            case ZONA2:
                tarifaCliente = Llamada.minutosLlamada() * tarifaZona2;
                break;
            case ZONA3:
                tarifaCliente = Llamada.minutosLlamada() * tarifaZona3;
                break;
            case ZONA4:
                tarifaCliente = Llamada.minutosLlamada() * tarifaZona4;
                break;
            case ZONA5:
                tarifaCliente = Llamada.minutosLlamada() * tarifaZona5;
                break;
            default:
                System.out.println("Zona inválida");
                break;
        }
        */

    }
    
}
