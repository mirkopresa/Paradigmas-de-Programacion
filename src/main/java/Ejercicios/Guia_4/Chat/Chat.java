package Ejercicios.Guia_4.Chat;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Chat extends Application {
    public static HBox hbox = new HBox();
    @Override
    public void start(Stage stage) {
        var campo = new TextField();
        var button = new Button("Agregar usuario");
        // Boton que crea un nuevo usuario con su respectiva ventana
        button.setOnAction(e -> {
            var usuarioNuevo = new Usuario(campo.getText(), this);
            var nuevoStage = new Stage();
            nuevoStage.setScene(usuarioNuevo.ventanaUsuario());
            nuevoStage.setTitle(usuarioNuevo.getNombreUsuario());
            nuevoStage.show();
        });

        hbox.getChildren().addAll(campo, button);
        // Ventana principal del servidor
        var mainScene = new Scene(hbox, 300, 400);
        stage.setScene(mainScene);
        stage.setTitle("Servidor");
        stage.show();
    }

    public void recibirMensaje(String mensaje, String usuario) {
        var nuevoMensaje = new NuevoMensaje(mensaje, usuario);
        hbox.fireEvent(nuevoMensaje);
    }
}