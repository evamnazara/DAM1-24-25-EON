import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;

public class E1208 {
    public static void main(String[] args) {
        Collection <Integer> numeros = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            Random rnd = new Random();
            numeros.add(rnd.nextInt());
        }
        System.out.println(numeros);
    }
}