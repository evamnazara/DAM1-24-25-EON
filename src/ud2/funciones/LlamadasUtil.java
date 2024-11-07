package ud2.funciones;

import java.util.Scanner;

import ud2.Util;

public class LlamadasUtil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el número: ");

        int n = sc.nextInt();
        sc.close();

        if (Util.esPar(n))
            System.out.println("Es par.");
        else
            System.out.println("Es impar.");
    }

}
