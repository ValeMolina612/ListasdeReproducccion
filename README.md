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


### Pruebas realizadas

- Se agregaron canciones al final de la playlist.
- Se mostró la lista en orden normal.
- Se mostró la lista en orden inverso.
- Se insertó una canción después de otra existente.
- Se insertó una canción después de la última para comprobar la actualización de la cola.
- Se intentó insertar una canción después de una que no existe.
- Se comprobó el funcionamiento con






