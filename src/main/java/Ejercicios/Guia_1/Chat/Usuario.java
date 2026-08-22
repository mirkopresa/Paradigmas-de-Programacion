package Ejercicios.Guia_1.Chat;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

public class Usuario {
    private final String nombre;
    private final int numero;
    private final Map<Usuario, ArrayList<Mensaje>> mensajesEnviados;
    private final Map<Usuario, ArrayList<Mensaje>> mensajesRecibidos;

    public Usuario(String nombre, int numero) {
        this.nombre = nombre;
        this.numero = numero;
        this.mensajesEnviados = new HashMap<>();
        this.mensajesRecibidos = new HashMap<>();
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumero() {
        return numero;
    }

    public ArrayList<Mensaje> getMensajesEnviados(Usuario destinatario) {
        if (!mensajesEnviados.containsKey(destinatario)) {
            return null;
        }
        return mensajesEnviados.get(destinatario);
    }

    public ArrayList<Mensaje> getMensajesRecibidos(Usuario remitente) {
        if (!mensajesEnviados.containsKey(remitente)) {
            return null;
        }
        return mensajesRecibidos.get(remitente);
    }

    public void enviarMensaje(Usuario destinatario, Mensaje mensaje) {
        if (!mensajesEnviados.containsKey(destinatario)) {
            ArrayList<Mensaje> enviados = new ArrayList<Mensaje>();
            enviados.add(mensaje);
            mensajesEnviados.put(destinatario, enviados);
        } else {
            mensajesEnviados.get(destinatario).add(mensaje);
        }
    }

    public void recibirMensaje(Usuario remitente, Mensaje mensaje) {
        if (!mensajesRecibidos.containsKey(remitente)) {
            ArrayList<Mensaje> recibidos = new ArrayList<Mensaje>();
            recibidos.add(mensaje);
            mensajesRecibidos.put(remitente, recibidos);
        } else {
            mensajesRecibidos.get(remitente).add(mensaje);
        }
    }
}
