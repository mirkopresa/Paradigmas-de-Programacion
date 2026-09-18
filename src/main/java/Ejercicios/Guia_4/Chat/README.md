# 8. Chat
Implementar una aplicación que simule un canal de chat con múltiples usuarios, mediante el sistema de eventos de JavaFX.

* Crear una clase `NuevoMensaje` que hereda de `Event`, para representar el evento de un nuevo mensaje enviado al canal.
* En la ventana principal simular el servidor que permite conectar nuevos usuarios al chat.
* Cuando se conecta un nuevo usuario, mostrar una ventana nueva (cada ventana es un `Stage`), con la vista del chat correspondiente a ese usuario. Las ventanas de chat no se conocen entre sí. Cada una de las ventanas se comunicará exclusivamente con el servidor, invocando métodos y escuchando eventos. La ventana de chat se suscribe para escuchar eventos de tipo `NuevoMensaje` del servidor.
* Cuando un usuario envía un mensaje desde una ventana de chat:
1. La ventana de chat envía el mensaje al servidor.
2. El servidor lanza un evento `NuevoMensaje` (mediante el método `fireEvent`).
3. Todas las ventanas reciben el evento y actualizan la vista para mostrar el mensaje nuevo.
