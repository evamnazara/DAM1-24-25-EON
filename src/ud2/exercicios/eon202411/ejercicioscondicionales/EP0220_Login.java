/*EP0220_Login. Realiza un programa que solicite por teclado un nombre de usuario y contraseña, y que compruebe si corresponden al usuario “admin” con contraseña “abc123.,” indicando como resultado un mensaje apropiado.
 */

 package ud2.exercicios.eon202411.ejercicioscondicionales;

 import java.util.Scanner;
 
 public class EP0220_Login {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
 
         System.out.print("Introduce el nombre de usuario: ");
         String usuario = sc.nextLine();
 
         System.out.print("Introduce la contraseña: ");
         String contrasena = sc.nextLine();
 
         sc.close();
 
         if (usuario == "admin" && contrasena ==" abc123.") {
            System.out.println("Bienvenido, " + usuario + "!");
        } else {
            System.out.println("Usuario o contraseña incorrectos.");
        }
    }
}
 
