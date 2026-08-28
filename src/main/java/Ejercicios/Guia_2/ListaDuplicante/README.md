# Lista duplicante
Se desea implementar una clase `ListaDuplicante<T>`, que tenga los métodos:

* `add(T x)`, que agrega el elemento `x` al final de la lista **dos veces**. 
* `get(int i)`, que obtiene el elemento que está en la posición `i`.

Basándose en la clase `java.util.ArrayList<T>`, implementar `ListaDuplicante<T>`:

a) Usando composición
b) Usando herencia

¿Qué ventajas y desventajas tiene cada una de las implementaciones?

# Respuesta
La ventaja de la herencia por sobre la composicion es que no requerimos de programar el funcionamiento,
y utilizamos los metodos ya heredados para implementar el nuevo
La desventaja de esto es que al heredar, tambien heredamos todos los otros metodos de ArrayList que para este caso
son innecesarios y podrian romper con el funcionamiento de nuestra ListaDuplicante
La composicion nos permite proteger el funcionamiento a costa de tener que hacer el trabajo nosotros manualmente