//autora: Eva María Otero Názara

//SOLO SE VALORA LA FUNCION 

package ud2.oneexamen;

public class ChiclesRegalo {
    public static void main(String[] args) {
        int chiclesComprados = 25;
        int contadorRegalados = 0;
        int chiclesGratis = 5;
        int chiclesRegalados = (totalChicles(chiclesComprados, contadorRegalados, chiclesGratis));
        System.out.println("Chicles regalados: " + chiclesRegalados);
    }

    public static int totalChicles(int a, int b, int c) {
        int chiclesComprados = 25;
        int contadorRegalados = 0;
        int chiclesTotales;

       while (chiclesComprados % 5 == 0){ 
                contadorRegalados++;
            }

        chiclesTotales = chiclesComprados + contadorRegalados;
        return chiclesTotales;       
     }

    }
    

