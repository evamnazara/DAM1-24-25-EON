package arrays;

public class FotoMafalda {
    
}

Para este programa de Arrays en java, resuelve el problema con variables legibles y funciones sencillas. Añade souts donde sea necesario para darle sentido al programa y hacerlo amigables con el usuario. Añade comentarios con los pasos que sigues, NO utilices parseo de ningun tipo, ni funciones como ArrayList, StringBuilder, , Map... sólo Strings y Arrays simples y tipos primitivos. 

/* 
Foto con Mafalda
Tiempo máximo: 1,000-2,000 s  Memoria máxima: 8192 KiB
Personajes de Mafalda con la cara borrada para hacerse fotos como si fueran ellos
Para homenajear a Quino y su Universo Mafalda, en una feria de Comics pusieron un mural de los personajes con las cabezas huecas, para que los asistentes pudieran ponerse detrás y fotografiarse con sus caras sustituyendo a las de los famosos personajes.

Se montó una enorme cola de gente esperando, cada uno queriendo ponerse en la posición de su personaje favorito. El caos fue tal que desde entonces los organizadores han puesto unas reglas muy estrictas para el uso del mural cuando lo han llevado a otros eventos:

Todos los retratados en una foto deben representar a un personaje diferente del mural.
Para que no queden demasiado vacías, al menos debe haber 3 personas en cada foto.
No se hacen fotos si no hay alguien en el puesto de Mafalda. Cuando llega alguien que quiere aparecer como ella, se hace inmediatamente la foto, siempre que se cumpla la condición anterior.
Si cuando llega alguien por Mafalda no hay gente suficiente en la foto, se espera hasta que lo haya.
Si cuando le toca el turno a alguien su personaje está ocupado, espera, dejando pasar a los siguientes de la cola, hasta que su puesto queda libre.
Estas normas han generado algo de descontento entre los usuarios, que querrían salir en las fotos con sus amigos en lugar de con desconocidos. Pero son muy efectivas, porque las colas se han reducido mucho.

Entrada
Cada caso de prueba comienza con un número 1 ≤ n ≤ 200.000 indicando cuánta gente quiere hacerse una foto en el mural.

A continuación aparecen los personajes del Universo Mafalda que cada una de esas n personas quiere ser (Mafalda, Felipe, Manolito, Susanita, Miguelito, Libertad o Guille).

La entrada termina con un 0, que no debe procesarse.

Salida
Por cada caso de prueba se escribirá una línea con dos números, indicando cuántas fotos se han hecho, y cuánta gente finalmente se queda sin aparecer en ninguna.

Entrada de ejemplo
5 Felipe Manolito Mafalda Susanita Miguelito
4 Mafalda Susanita Miguelito Felipe
10 Felipe Felipe Felipe Susanita Miguelito Libertad Guille Mafalda Mafalda Susanita
0
Salida de ejemplo
 
1 2
1 1
2 1

*/