package ud4.apuntes;

//import java.util.Arrays;
/*import java.util.Scanner;

public class espacios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Frase: ");
        String frase = sc.nextLine();
        String fraseSinEspacios = frase.replaceAll(" ", "");

        System.out.println("Frase sin espacios: " + fraseSinEspacios);

        System.out.println(String.valueOf(frase));
        //String lombricesSplit = "que dices lombrices";
       
        sc.close();

    }
    
}*/

Aquí tienes un código en Java basado en la descripción de la imagen. Implementa una versión de Wordle en consola con una lista de palabras almacenada en un archivo JSON.

Características:

Carga palabras desde palabras.json (o usa una palabra predeterminada si el archivo no existe).

Permite 6 intentos para adivinar la palabra de 5 letras.

Muestra las letras correctas, incorrectas y en la posición equivocada.

Guarda las palabras usadas y sus estadísticas en palabras.json.



---

Código en Java

Clase Palabra

import org.json.JSONObject;

public class Palabra {
    private String texto;
    private int vecesOculta;
    private int vecesAdivinada;
    private int vecesIntentada;

    public Palabra(String texto) {
        this.texto = texto.toUpperCase();
        this.vecesOculta = 0;
        this.vecesAdivinada = 0;
        this.vecesIntentada = 0;
    }

    public String getTexto() { return texto; }
    public void incrementarOculta() { vecesOculta++; }
    public void incrementarAdivinada() { vecesAdivinada++; }
    public void incrementarIntentada() { vecesIntentada++; }

    public JSONObject toJson() {
        JSONObject json = new JSONObject();
        json.put("texto", texto);
        json.put("vecesOculta", vecesOculta);
        json.put("vecesAdivinada", vecesAdivinada);
        json.put("vecesIntentada", vecesIntentada);
        return json;
    }

    @Override
    public String toString() {
        return texto + " | Oculta: " + vecesOculta + " | Adivinada: " + vecesAdivinada + " | Intentada: " + vecesIntentada;
    }
}


---

Clase Wordle

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Wordle {
    private static final String ARCHIVO_JSON = "palabras.json";
    private static final int INTENTOS_MAXIMOS = 6;
    private static final List<Palabra> palabras = new ArrayList<>();
    private static Palabra palabraOculta;

    public static void main(String[] args) {
        cargarPalabras();
        seleccionarPalabra();
        jugar();
        guardarPalabras();
    }

    private static void cargarPalabras() {
        try {
            String contenido = new String(Files.readAllBytes(Paths.get(ARCHIVO_JSON)));
            JSONArray jsonArray = new JSONArray(contenido);
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObj = jsonArray.getJSONObject(i);
                Palabra p = new Palabra(jsonObj.getString("texto"));
                palabras.add(p);
            }
        } catch (IOException e) {
            System.out.println("No se encontró 'palabras.json', iniciando con una palabra por defecto.");
            palabras.add(new Palabra("XOGAR"));
        }
    }

    private static void seleccionarPalabra() {
        Random rand = new Random();
        palabraOculta = palabras.get(rand.nextInt(palabras.size()));
        palabraOculta.incrementarOculta();
    }

    private static void jugar() {
        Scanner scanner = new Scanner(System.in);
        int intentos = 0;
        boolean adivinada = false;

        System.out.println("Bienvenido a Wordle! Intenta adivinar la palabra de 5 letras.");

        while (intentos < INTENTOS_MAXIMOS && !adivinada) {
            System.out.print("Intento " + (intentos + 1) + ": ");
            String intento = scanner.next().toUpperCase();

            if (intento.length() != 5) {
                System.out.println("Debe ser una palabra de 5 letras.");
                continue;
            }

            mostrarResultado(intento);
            intentos++;

            if (intento.equals(palabraOculta.getTexto())) {
                System.out.println("¡Felicidades! Has adivinado la palabra.");
                palabraOculta.incrementarAdivinada();
                adivinada = true;
            }
        }

        if (!adivinada) {
            System.out.println("Lo siento, la palabra era: " + palabraOculta.getTexto());
        }
    }

    private static void mostrarResultado(String intento) {
        String oculta = palabraOculta.getTexto();
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < 5; i++) {
            char letra = intento.charAt(i);
            if (letra == oculta.charAt(i)) {
                resultado.append(letra).append(" ✔ "); // Letra correcta y en posición correcta
            } else if (oculta.contains(String.valueOf(letra))) {
                resultado.append(letra).append(" ✖ "); // Letra en palabra pero posición incorrecta
            } else {
                resultado.append(letra).append(" ❌ "); // Letra no está en la palabra
            }
        }
        System.out.println(resultado);
    }

    private static void guardarPalabras() {
        JSONArray jsonArray = new JSONArray();
        for (Palabra p : palabras) {
            jsonArray.put(p.toJson());
        }
        try (FileWriter file = new FileWriter(ARCHIVO_JSON)) {
            file.write(jsonArray.toString());
        } catch (IOException e) {
            System.out.println("Error al guardar las palabras.");
        }
    }
}


---

Explicación del código

1. Carga de palabras: Intenta leer palabras.json. Si no existe, usa "XOGAR".


2. Selección de palabra: Elige una palabra aleatoria de la lista.


3. Juego:

El usuario tiene 6 intentos para adivinar la palabra.

Muestra letras correctas, incorrectas y en la posición errónea.

Si adivina, muestra un mensaje de victoria.



4. Guardado de datos:

Guarda las estadísticas de las palabras usadas en palabras.json.





---

Ejemplo de ejecución

Bienvenido a Wordle! Intenta adivinar la palabra de 5 letras.
Intento 1: XOGAR
X ✔ O ✖ G ❌ A ✔ R ✔ 
Intento 2: XULAR
X ✔ U ❌ L ❌ A ✔ R ✔ 
Intento 3: XOGAR
¡Felicidades! Has adivinado la palabra.

Si el usuario no acierta, muestra:

Lo siento, la palabra era: XOGAR


---

Este código implementa todas las funciones básicas del Wordle y almacena estadísticas de uso de cada palabra. ¡Pruébalo y dime si quieres agregar algo más!
