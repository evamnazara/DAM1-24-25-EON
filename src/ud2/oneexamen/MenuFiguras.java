//NO CORREGIDO 
//autora: Eva María Otero Názara

package ud2.oneexamen;

//import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuFiguras {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("MENU PRINCIPAL: ");
        System.out.println("Selecciona una de las siguientes opciones [1, 2, 3]: ");
        System.out.println("1. Triangulo");
        System.out.println("2. Rectángulo");
        System.out.println("0. SALIR ");
        
        int eleccionUsuario = sc.nextInt();


        if (eleccionUsuario != 1 || eleccionUsuario != 2 || eleccionUsuario != 3 ){
            System.out.println("OPCIÓN INVÁLIDA.");
        } else {
            System.out.println("Has elegido la opción " + eleccionUsuario);
        }
        //int validación = (leerEntero(eleccionUsuario));

        switch (eleccionUsuario) {
            case 1:
                    System.out.println("Escribe un número entero entre 2 y 20: "); 
                    int numTriangulo = sc.nextInt();

                    if (numTriangulo >= 2 && numTriangulo <= 20) {
                        for (int i = 0; i < numTriangulo; i++) {
                            for (int j = numTriangulo - i; j > 0; j--) {
                                System.out.print("* ");
                            }
                            System.out.println("");
                        } 
                    } else {
                        System.out.println("Introduce un número válido");  
                    }     
                break;

            case 2: 
                    int filas; 
                    int columnas;

                    System.out.print("Introduce número de filas: ");
                    filas = sc.nextInt();

                    System.out.print("Introduce número de columnas: ");
                    columnas = sc.nextInt();

                    if (filas >= 2 && filas <= 20 && columnas >= 2 && columnas <= 20  ) {
                        for (int i = 1; i <= filas; i++){    
                            for(int j = 1; j <= columnas; j++){                                      
                                System.out.print(" * ");
                            } 
                            System.out.println();
                        }  
                    } else {
                        System.out.println("Por favor, introduce un numero entero del 2 al 20.");
                    }
                    
                    
                
                                
                        
                break;

            case 0: 
                System.out.println("¡Hasta pronto!");
                break;
        }

        
        sc.close();
        
    }

   /*  public static int leerEntero(int eleccionUsuario) {
        boolean valido = false;

        while (!valido) {
            try {
                System.out.print("Introduce un número entero: ");
                valido = true; 
            } catch (InputMismatchException e) {
                System.out.println("Opción inválida.");
            }
        }
    } 
    */
    
}
