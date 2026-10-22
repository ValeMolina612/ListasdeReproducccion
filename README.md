# ListasdeReproducccion
Actividad Binas
retos-listas- Molina Rosas- Villanueva lazo  
# Reto 2: Lista doble — Reproductor de canciones

## Integrantes
- Molina Rosas Maria Valeria
- Villanueva Lazo Lluvia Estefania 

## Datos de la actividad
- **Asignatura:** Estructuras de datos
- **Docente** Rodriguez Barron Gabriel
- **Versión:** B — Lista de reproducción de canciones
- **Fecha:** B —22/10/2026
  
## Objetivo
Implementar una lista doblemente enlazada para organizar una lista de canciones, permitiendo agregarlas al final, insertar una canción después de otra y recorrer la playlist en sentido inverso.

## Conceptos aprendidos

Una lista doblemente enlazada es una estructura de datos en la que cada nodo contiene un dato y dos referencias: una al siguiente nodo y otra al nodo anterior. Esto permite recorrer la lista en ambos sentidos.

Una de sus ventajas es que se puede avanzar y retroceder entre las canciones sin tener que comenzar desde el principio. Como desventaja, es necesario actualizar correctamente los dos enlaces al insertar elementos para evitar errores en la lista.

Un ejemplo de uso real es un reproductor de música, donde podemos pasar a la siguiente canción o regresar a la anterior.

## Reto 2: Reproductor con anterior y siguiente

### ¿Qué se pidió?
Completar el código de una lista doblemente enlazada para insertar canciones al final, insertar una canción después de otra canción indicada y mostrar la playlist en orden inverso.

### ¿Cómo se resolvió?

**1. Inserción al final**

Se creó un nuevo nodo para guardar la canción. Si la lista estaba vacía, el nodo se asignó tanto a la cabeza como a la cola. Si ya existían canciones, se enlazó el último nodo con el nuevo y se actualizó la cola.
<img width="1905" height="1010" alt="reto1-compilacion png" src="https://github.com/user-attachments/assets/6193ecdc-c900-4edb-8950-b45a5ff9da31" />
<img width="1910" height="1015" alt="reto1-ejecucion png" src="https://github.com/user-attachments/assets/918e0780-9d78-4eca-b9f8-705137673695" />

**2. Inserción después de una canción**

Primero se recorrió la lista para encontrar la canción indicada. Si se encontró, se creó el nuevo nodo y se actualizaron las referencias `anterior` y `siguiente` para colocarlo después de la canción existente. Si la canción indicada era la última, también se actualizó la cola.
<img width="1916" height="1007" alt="reto2-compilacion png" src="https://github.com/user-attachments/assets/48744985-7755-430a-a5ca-ccbc72979e3c" />
<img width="1917" height="1023" alt="reto2-ejecucion png (2)" src="https://github.com/user-attachments/assets/0968ffe0-1f67-4ac6-8b3d-6db65bfb3de8" />

**3. Recorrido inverso**

Para mostrar las canciones en orden inverso, se comenzó desde la cola y se avanzó utilizando la referencia `anterior` hasta llegar a `null`.
<img width="1916" height="1010" alt="reto3-compilacion png" src="https://github.com/user-attachments/assets/c2661bfd-3cc4-409b-a334-e48452220a58" />
<img width="1917" height="1020" alt="reto3 - ejecucion png" src="https://github.com/user-attachments/assets/27e5e4c2-6f63-4596-8f8c-6205bcf92cf7" />


### Preguntas 
. ¿Qué punteros tuvieron que actualizar en la eliminación de una lista doble y por qué son más que en la simple?
 Tuvimos que actualizar tanto el puntero siguiente como el puntero anterior de los nodos que estaban al lado del que borramos. Son más que en la simple porque en una lista doble los nodos van en dos direcciones, así que hay que arreglar el puente de ida y de vuelta para no romper la cadena.

2. ¿Qué error cometieron (o evitaron) por no considerar el caso de lista vacía o de un solo nodo?
 El error de que el programa truene o se caiga. Si olvidas revisar estos casos, el código intenta leer un puntero que no existe (null) —como buscar el "siguiente" de un nodo que está solo— y la aplicación falla.

3. ¿Qué pasaría si en la lista circular se recorre con while (actual != null)?
 Se generaría un bucle infinito. Como las listas circulares nunca terminan en null (el último nodo siempre vuelve a apuntar al primero), la condición de que sea diferente de null siempre se cumple y el programa se quedaría atascado congelado.

4. ¿En qué situación elegirían cada tipo de lista?


Lista simple: Cuando solo necesitas avanzar en una dirección y quieres ahorrar memoria (ej. una lista de pendientes).

Lista doble: Cuando necesitas moverte con facilidad hacia adelante y hacia atrás (ej. los botones de "Atrás" y "Adelante" del navegador).

Lista circular: Cuando el proceso debe repetirse en un círculo sin fin (ej. los turnos de los jugadores en un juego o una canción en bucle).

5. ¿Qué fue lo más difícil y cómo lo resolvieron como bina?
 Lo más difícil fue no perder el hilo mental de los punteros al momento de reconectarlos y terminar borrando información por error. Lo resolvimos dibujando esquemas en papel paso a paso antes de escribir el código y revisando la lógica juntos línea por línea.





