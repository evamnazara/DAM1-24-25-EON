package ud5.rol;

/*import java.nio.channels.Pipe.SourceChannel;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class AppCombateGrupos {
    public static void main(String[] args) {
        // Crear dos grupos de personajes
        Personaje[] grupo1 = crearGrupo("Grupo 1");
        Personaje[] grupo2 = crearGrupo("Grupo 2");

        // Iniciar combate
        combatir(grupo1, grupo2);
    }

    public static Personaje[] crearGrupo(String nombreGrupo) {
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("COMBATE EN GRUPO:");
        System.out.println("¿Cuántos personajes quieres que haya en cada grupo? El mínimo son 3, y el máximo 6");
        
        int numPersonajes = sc.nextInt();

            if (numPersonajes < 3 || numPersonajes > 6) {
                System.out.println("Por favor, introduce un número válido de jugadores.");
                numPersonajes = sc.nextInt();
            }

        Personaje[] grupo = new Personaje[numPersonajes];

        for (int i = 0; i < numPersonajes; i++) {
            grupo[i] = new Personaje("P" + (i + 1) + "-" + nombreGrupo, obtenerRazaAleatoria());
        }
        return grupo;
    }

    public static String obtenerRazaAleatoria() {
        String[] razas = {"HUMANO", "ELFO", "ENANO", "HOBBIT", "ORCO", "TROLL"};
        return razas[new Random().nextInt(razas.length)];
    }

    public static void combatir(Personaje[] grupo1, Personaje[] grupo2) {
        while (!grupoMuerto(grupo1) && !grupoMuerto(grupo2)) {
            Personaje[] todos = Arrays.copyOf(grupo1, grupo1.length + grupo2.length);
            System.arraycopy(grupo2, 0, todos, grupo1.length, grupo2.length);
            
            Arrays.sort(todos, Comparator.comparingInt(Personaje::getAgilidad).reversed());
            
            for (Personaje atacante : todos) {
                if (grupoMuerto(grupo1) || grupoMuerto(grupo2)) {
                    break;
                }
                Personaje[] enemigos = Arrays.asList(grupo1).contains(atacante) ? grupo2 : grupo1;
                atacar(atacante, enemigos);
            }
        }
        System.out.println("El combate ha terminado. Ganador: " + (grupoMuerto(grupo1) ? "Grupo 2" : "Grupo 1"));
    }

    public static boolean grupoMuerto(Personaje[] grupo) {
        for (Personaje p : grupo) {
            if (p.getPuntosDeVida() > 0) {
                return false;
            }
        }
        return true;
    }

    public static void atacar(Personaje atacante, Personaje[] enemigos) {
        if (atacante.getPuntosDeVida() <= 0) return; // No puede atacar si está muerto
        
        List<Personaje> enemigosVivos = new ArrayList<>();
        for (Personaje enemigo : enemigos) {
            if (enemigo.getPuntosDeVida() > 0) {
                enemigosVivos.add(enemigo);
            }
        }
        if (enemigosVivos.isEmpty()) return;
        
        Personaje objetivo = enemigosVivos.get(new Random().nextInt(enemigosVivos.size()));
        int dano = atacante.getFuerza();
        objetivo.recibirDanio(dano);
        System.out.println(atacante.getNombre() + " ataca a " + objetivo.getNombre() + " causando " + dano + " puntos de daño.");
    }

}
*/