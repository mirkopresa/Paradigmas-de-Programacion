package Ejercicios.Guia_1.Cartelera;

import java.util.ArrayList;

public class Usuario {
    private final String nombre;
    private final String contrasena;
    private final boolean personal;
    private final ArrayList<Mensaje> mensajesEnviados;
    private final ArrayList<Mensaje> mensajesRecibidos;

    public Usuario(String nombre, String contrasena, boolean personal) {
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.personal = personal;
        this.mensajesEnviados = new ArrayList<>();
        this.mensajesRecibidos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public boolean getPersonal() {
        return personal;
    }

    public ArrayList<Mensaje> getMensajesEnviados() {
        return mensajesEnviados;
    }

    public ArrayList<Mensaje> getMensajesRecibidos() {
        return mensajesRecibidos;
    }

    public void enviarMensaje(Usuario destinatario, Mensaje mensaje) {
        mensajesEnviados.add(mensaje);
    }

    public void recibirMensaje(Usuario remitente, Mensaje mensaje) {
        mensajesRecibidos.add(mensaje);
    }
}