/* AUTORA: Eva María Otero Názara */

package ud2.oneexamenrec;


import java.util.Scanner;

public class EstadisticaEstaturas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                int estatura;
                double mediaEstatura = 0;
                
                //int alturaMasAlta;
                //int alturaMasBaja;

                int numeroAlumnos = 0;
                int sumatorioAlturas = 0;
                System.out.println("Introduce la altura en cm: ");
                estatura = sc.nextInt();
                if (estatura > 0) {
                        for(int i = 0; i > 0; i++) {
                                //mediaEstatura += estatura; 
                
                                while (estatura > 0) {
                                        
                                        sumatorioAlturas++;
                                        numeroAlumnos++;
                
                                        System.out.println("Introduce la altura en cm: ");
                                        estatura = sc.nextInt();
                                } 
                        }
                        
                } else {
                        System.out.println("Altura inválida");
                }


                mediaEstatura = sumatorioAlturas / numeroAlumnos / 100;
                System.out.println("Numero de alumnos: " + numeroAlumnos);
                System.out.println("Media de altura: " + mediaEstatura + "m"); 
                sc.close();

        }
                


           

            
            

           
                        
            
}

           

