package Ejercicios.Guia_4.Chat;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

import static Ejercicios.Guia_4.Chat.Chat.hbox;

public class Usuario extends BorderPane {
    private final String nombreUsuario;
    private final Chat servidor;

    public Usuario(String nombre, Chat servidor) {
        this.nombreUsuario = nombre;
        this.servidor = servidor;
    }

    // Funcion que devuelve la escena lista para asignar al stage
    public Scene ventanaUsuario() {
        var campoMensajes = new TextField();
        var chat = new VBox();
        // Se suscribe al evento del servidor para agregar los mensajes enviados
        hbox.addEventHandler(NuevoMensaje.MENSAJE_ENVIADO, mensajeRecibido -> {
            var label = new Label(mensajeRecibido.getUsuario() + ": " + mensajeRecibido.getMensaje());
            chat.getChildren().add(label);
        });

        // Si se presiona enter, el servidor recibe el mensaje con el usuario y dispara el evento
        campoMensajes.setOnKeyPressed(tecla -> {
            if (tecla.getCode() == KeyCode.ENTER) {
                servidor.recibirMensaje(campoMensajes.getText(), this.getNombreUsuario());
                campoMensajes.clear();
            }
        });
        var borderPane = new BorderPane();
        borderPane.setTop(chat);
        borderPane.setBottom(campoMensajes);
        return new Scene(borderPane, 300, 400);
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

}