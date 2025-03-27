package arrays;

public class PanicoEnElTunel {
    
}
Para este programa de Arrays en java, resuelve el problema con variables legibles y funciones sencillas. Añade comentarios con los pasos que sigues, NO utilices parseo de ningun tipo, ni funciones como ArrayList, StringBuilder, , Map... sólo Strings y Arrays simples y tipos primitivos. Añade souts donde sea necesario para darle sentido al programa y hacerlo amigables con el usuario.

/* 

Pánico en el túnel
Tiempo máximo: 1,000-4,000 s  Memoria máxima: 10240 KiB
En el último Consejo de Ministros se ha decidido que se va a poner en marcha la construcción de un túnel que va a unir la península ibérica con las islas Baleares. Si se pudo unir Europa con Inglaterra el siglo pasado, el gobierno tiene claro que nosotros podremos hacer un túnel similar, como experiencia piloto para un proyecto aún más ambicioso que uniría también las islas Canarias.

Uno de los temas que más preocupan es la seguridad, por lo que se instalarán un número aún por determinar de teléfonos de emergencia (eso sí, nunca serán más de 500) de forma que ante algún accidente la gente pueda salir rápidamente de sus coches y notificarlo en el teléfono más cercano.

No obstante existe el problema de que los accidentados, a la hora de salir de sus vehículos y echar a correr hacia ese teléfono, duden sobre hacia qué lado ir pues en esos momentos de pánico se pierde la capacidad de decisión y no se tiene la agilidad mental suficiente para elegir bien.

De lo que se trata, pues, es de hacer una pequeña aplicación para móvil que se pueda usar dentro del túnel y que, dada la localización actual de la persona, le diga hacia qué lado tiene que correr, si hacia el lado que le acerca hacia la península o hacia el lado que le acerca a las islas.

Como el túnel está aún por construir, crearemos y probaremos el núcleo del sistema utilizando distintas descripciones de túneles. Cada descripción consiste en discretizar el túnel en distintas secciones en las que puede (o no) haber un teléfono de emergencia.

Entrada
La entrada estará compuesta por varios casos de prueba. Cada caso de prueba tendrá una primera línea con la descripción del túnel. Esa línea tendrá un carácter por cada sección del túnel (que puede ser de hasta 1.000.000 secciones) donde 'T' indica que en esa sección hay un teléfono, y '.' indica ausencia de teléfono. El primer carácter de la línea se corresponde con la sección "del lado de la península".

Tras la descripción del túnel, aparecerá un número n
 con la cantidad de consultas que vienen a continuación. Le siguen n
 líneas, cada una con un entero que indica en qué sección se encuentra el accidentado (entre 1 y el número de secciones total, siendo 1 la primera sección en la ruta desde la península hacia las islas).

Salida
Por cada caso de prueba se escribirán n
 líneas, una por consulta, donde se indicará "PENINSULA" si el accidentado debe correr hacia el lado de la península o "ISLAS" si debe ir en la dirección contraria. Si no hace falta correr porque estamos en una sección con teléfono, se escribirá "AQUI". Ten en cuenta que:

Si se está más cerca de una de las salidas que de un teléfono, se preferirá correr hacia la salida.
Si los teléfonos más próximos de ambos lados están a la misma distancia, preferiremos ir hacia aquel que esté más cerca de una de las salidas del túnel.
Si en el escenario anterior vuelve a haber empate, se irá hacia la península.
Entrada de ejemplo
.T...T.T.
4
2
3
4
7
...
1
2
Salida de ejemplo
 
AQUI
PENINSULA
PENINSULA
ISLAS
PENINSULA
*/