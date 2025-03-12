package ud5.interfacesejercicios.EP0913_Futbolista;

import java.util.Arrays;

public class AppFutbolista {
    public static void main(String[] args) {
        Futbolista[] futbolistas = {
            new Futbolista("77416510M", "A Futbolista", 14, 5),
            new Futbolista("11589761C", "B Futbolista", 24, 9),
            new Futbolista("74658211B", "C Futbolista", 20, 7),
            new Futbolista("76987510Y", "D Futbolista", 19, 3),
            new Futbolista("78463610L", "E Futbolista", 18, 4),
        };

        System.out.println(Arrays.toString(futbolistas));
    }
}
