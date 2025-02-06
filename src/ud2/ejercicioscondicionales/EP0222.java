import java.util.Scanner;

public class EP0222 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Introduzca el número de fallos: ");
        int fallos = scanner.nextInt();

        switch (fallos) {
            case 0:
                System.out.printf("Fallos = %d\n", fallos);
                System.out.println("  ___\n" +
                                   " |   |\n" +
                                   "     |\n" +
                                   "     |\n" +
                                   "     |\n" +
                                   "     |\n" +
                                   "     |\n" +
                                   "     |\n" +
                                   "_____|");
            break;
            case 1:
                System.out.printf("Fallos = %d\n", fallos);
                System.out.println("  ___\n" +
                                   " |   |\n" +
                                   " o   |\n" +
                                   "     |\n" +
                                   "     |\n" +
                                   "     |\n" +
                                   "     |\n" +
                                   "     |\n" +
                                   "_____|");
            break;
            case 2:
                System.out.printf("Fallos = %d\n", fallos);
                System.out.println("  ___\n" +
                                   " |   |\n" +
                                   " o   |\n" +
                                   " |   |\n" +
                                   "     |\n" +
                                   "     |\n" +
                                   "     |\n" +
                                   "     |\n" +
                                   "_____|");
            break;
            case 3:
                System.out.printf("Fallos = %d\n", fallos);
                System.out.println("  ___\n" +
                                   " |   |\n" +
                                   " o   |\n" +
                                   "/|   |\n" +
                                   "     |\n" +
                                   "     |\n" +
                                   "     |\n" +
                                   "     |\n" +
                                   "_____|");
            break;
            case 4:
                System.out.printf("Fallos = %d\n", fallos);
                System.out.println("  ___\n" +
                                   " |   |\n" +
                                   " o   |\n" +
                                   "/|\\  |\n" +
                                   " |   |\n" +
                                   "     |\n" +
                                   "     |\n" +
                                   "     |\n" +
                                   "_____|");
            break;
            case 5:
                System.out.printf("Fallos = %d\n", fallos);
                System.out.println("  ___\n" +
                                   " |   |\n" +
                                   " o   |\n" +
                                   "/|\\  |\n" +
                                   " |   |\n" +
                                   "     |\n" +
                                   "     |\n" +
                                   "     |\n" +
                                   "_____|");
            break;
            case 6:
                System.out.printf("Fallos = %d\n", fallos);
                System.out.println("  ___\n" +
                                   " |   |\n" +
                                   " o   |\n" +
                                   "/|\\  |\n" +
                                   " |   |\n" +
                                   "/    |\n" +
                                   "     |\n" +
                                   "     |\n" +
                                   "_____|");
            break;
            case 7:
                System.out.printf("Fallos = %d\n", fallos);
                System.out.println("  ___\n" +
                                   " |   |\n" +
                                   " o   |\n" +
                                   "/|\\  |\n" +
                                   " |   |\n" +
                                   "/ \\  |\n" +
                                   "     |\n" +
                                   "     |\n" +
                                   "_____|");
            break;
        
            default:
            if(fallos > 7){
                System.out.println("Has perdido.");
            }else{
                System.out.println("El número de fallos no puede ser negativo");
            }
            break;
        }
    }
}
