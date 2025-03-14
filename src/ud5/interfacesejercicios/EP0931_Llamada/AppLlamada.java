package ud5.interfacesejercicios.EP0931_Llamada;

import java.time.LocalDateTime;

import ud5.interfacesejercicios.EP0931_Llamada.Llamada.ZonaInterlocutor;

public class AppLlamada {
    public static void main(String[] args) {
        Llamada l1 = new Llamada("666777444", "666555888", false, LocalDateTime.now(), LocalDateTime.of(2025, 03, 14, 13, 30, 25), ZonaInterlocutor.ZONA1);

        //l1.minutosLlamada(LocalDateTime.now(),LocalDateTime.of(2025, 03, 14, 13, 30, 25));

        l1.minutosLlamada();
    }
}
