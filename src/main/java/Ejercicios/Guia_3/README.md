### Notas de clase teorica del 31/8/2026 
# Principios de diseño en POO

### Algunas definiciones

**Code smell**: Un indicio de que algo que no está bien en el código, cuando miras el codigo y te das cuenta que hay algo que no esta bien

**Deuda técnica**: Cuando uno no se dedica a resolver estos code smells, va acumulando deuda técnica, que es el costo implícito del trabajo adicional futuro resultante de elegir una solución mas fácil, peor, sobre una más robusta

**Refactoring**: Es el proceso de sentarse a resolver estos code smells, reescribir el código para mejorarlo sin cambiar el comportamiento de este mismo

## Principios de diseño generales

* YAGNI: You Ain´t Gonna Need It

Solo agregar una funcionalidad si es requerida
(ojo con esto en un examen, es muy raro que se tome este porque solamente viendo código no sabes si la funcionalidad se pidió, o no)

* KISS: Keep It Simple, Stupid!

(que se viole no siempre significa que el código este mal)

* DRY: Don't Repeat Yourself

No repetir código, puede aumentar la dificultad de leer el código, o el mantenimiento del codigo
(No solo código, sino documentación, etc)

* POLA: Principle of Least Astonishment

El sistema se debe de comportar como se espera que se comporte, no debe hacer algo que nos sorprenda y sea inesperado
(ejemplo, errores silenciosos)

* KOP: Knuth's Optimization Principle

No optimizar el código prematuramente, y en caso de hacerlo, medir el rendimiento antes y después, para asegurarse que la optimización realmente mejoro el rendimiento

* SoC: Separation of Concerns

Mirar un sistema como un conjunto de módulos, que abordan diferentes aspectos, o dominios

* Alta cohesión:

Cohesión -> es la medida en que dos elementos de un módulo están relacionados entre si

Se prefiere que los módulos tengan alta cohesión, que los elementos que lo integren se relacionen entre si

* Bajo acoplamiento:

Acoplamiento -> es la medida en que un módulo depende de otros módulos

Se prefiere que los módulos tengan bajo acoplamiento, que los elementos dependan entre si lo menos posible de otros módulos

## Principios de diseño del paradigma de objetos

* TDA: Tell, don't ask!

Solicitarle a un objeto que lleve a cabo una acción el mismo, y no consultar su estado para luego realizar una acción en base a su respuesta
(en los exámenes suele pasar que los alumnos ven un if y creen que se viola el TDA, para que esto sea cierto, la pregunta y la accion deben ir al mismo objeto)

* PoLK: Principle of Least Knowledge

Cada modulo debe conocer lo mínimo posible sobre otros módulos (bajar el acoplamiento, que la dependencia sea débil)

Un metodo F de la clase C solo debe invocar métodos de:
1. La propia clase C
2. Los objetos que son atributos de C
3. Los objetos recibidos por F como argumentos
4. Los objetos instanciados en F


* EDP: Explicit Dependencies Principle

Las clases y los métodos deben requerir explicitamente los objetos necesarios para funcionar correctamente, en lugar de asumir que están disponibles en el contexto

## Principio SOLID

* SRP: Single Responsibility Principle

Cada clase deberia tener una sola responsabilidad, o proposito

* OCP: Open/Closed Principle

Las clases deben estar abiertas para su extensión, pero cerradas para su modificacion, se debe poder agregar nuevas funcionalidades a una clase sin modificar su código existente

* LSP: Liskov Substitution Principle

Si tenemos una clase base, y una clase derivada, se deberian reemplazar una instancia de una por una instancia de otra sin romper el comportamiento del programa

* DIP: Dependency Inversion Principle

Las clases de alto nivel no deben depender de clases de bajo nivel, no puede haber una dependencia directa y ambas deben de depender de abstracciones

* ISP: Interface Segregation Principle

Una clase no debe depender de métodos de otras clases que no utiliza

### **Muchos de estos principios se contradicen entre si**

## Conclusión con respecto a la herencia

**Preferir composición sobre herencia**

Si tenes disponible usar ambas, en la gran mayoría de casos es preferible utilizar la composición, para reutilizar codigo y extender funcionalidades