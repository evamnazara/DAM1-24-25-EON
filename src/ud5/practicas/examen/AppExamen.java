package examen;

public class AppExamen {
    public static void main(String[] args) {
        String[] respuestasP1 = {"r1", "r2", "r3", "r4"};
        Pregunta p1 = new Pregunta("ENUNCIADO PREGUNTA 1", respuestasP1, 1);
        
        String[] respuestasP2 = {"r1", "r2", "r3", "r4"};
        Pregunta p2 = new Pregunta("ENUNCIADO PREGUNTA 2", respuestasP2, 1);

        Examen examen = new Examen("TEST DE CONTORNOS", 5);
        examen.addPregunta(p1);
        examen.addPregunta(p2);
        System.out.println(p1.toString());
        System.out.println(p2.toString());


        System.out.println("PRIMERA PREGUNTA: " + p1.corregir(4)); // true
        System.out.println("SEGUNDA PREGUNTA: " + p2.corregir(0)); // false
    }
}
