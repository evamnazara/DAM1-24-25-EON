package ejerciciospruebas.conversoredades;

/* 6. Conversor de Idades a Categorías
Implementa AgeClassifier.classify(int age), que devolve:
"Infantil" para idades entre 0 e 12 anos.
"Adolescente" entre 13 e 17 anos.
"Adulto" entre 18 e 64 anos.
"Senior" a partir de 65 anos.*/

public class AgeClassifier {
    public static String classify(int age) {
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Idade non válida");
        }
        if (age <= 12) {
            return "Infantil";
        } else if (age <= 17) {
            return "Adolescente";
        } else if (age < 65) { 
            return "Adulto";
        }
        return "Senior"; 
    }
}

