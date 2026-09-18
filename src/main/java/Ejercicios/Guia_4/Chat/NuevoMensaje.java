package Ejercicios.Guia_4.Chat;

import javafx.event.Event;
import javafx.event.EventType;

public class NuevoMensaje extends Event {
    private String mensajeEnviado;
    private String usuario;
    public static final EventType<NuevoMensaje> MENSAJE_ENVIADO = new EventType<>(Event.ANY, "MENSAJE ENVIADO");

    public NuevoMensaje(String mensaje, String usuario) {
        super(MENSAJE_ENVIADO);
        this.mensajeEnviado = mensaje;
        this.usuario = usuario;
    }

    public String getMensaje() {
        return mensajeEnviado;
    }

    public String getUsuario() {
        return usuario;
    }
}
