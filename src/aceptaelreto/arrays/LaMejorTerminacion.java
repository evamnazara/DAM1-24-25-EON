package arrays;

public class LaMejorTerminacion {
    
}

Para este programa de Arrays en java, resuelve el problema con variables legibles y funciones sencillas. Añade comentarios con los pasos que sigues, NO utilices parseo de ningun tipo, ni funciones como ArrayList, StringBuilder, , Map... sólo Strings y Arrays simples y tipos primitivos. Añade souts donde sea necesario para darle sentido al programa y hacerlo amigables con el usuario.

/* 
La mejor terminación
Tiempo máximo: 1,000-2,000 s  Memoria máxima: 4096 KiB
Décimo de la lotería de Navidad
En los sorteos de la lotería más mediáticos, como el del Gordo de Navidad o el del Niño, es habitual que los fetichistas busquen números con algún tipo de significado extraño o que los matemáticos y estadísticos se entretengan informando sobre los números más habituales.

Esto último es interesante si queremos maximizar la probabilidad de ganar algo. Dado que los números que terminan con el mismo dígito que el del premio principal tienen un reintegro, una buena forma de intentar, al menos, no perder dinero es jugar un número con la terminación más habitual en el histórico de sorteos.

Siendo puristas, la probabilidad de que salga un número es independiente de lo que haya ocurrido en años anteriores. Pero es tan tentador ignorar esto que no puedes resistirte.

Entrada
La entrada estará compuesta por múltiples casos de prueba que el programa deberá procesar. Cada uno comienza con un número n (1 ≤ n ≤ 10.000) indicando de cuántos sorteos anteriores conocemos el premio principal. A continuación aparecerán, en otra línea, los n números premiados en esos sorteos. Los números tendrán como mucho 5 dígitos.

La entrada terminará con un caso sin sorteos, que no deberá procesarse.

Salida
Por cada caso de prueba el programa escribirá la terminación (de un dígito) más premiada. Si hay varias terminaciones que aparecen el mismo número (máximo) de veces, se escribirá "VARIAS".

Entrada de ejemplo
3
00004 03847 39804
2
39875 09877
0
Salida de ejemplo
4
VARIAS

*/