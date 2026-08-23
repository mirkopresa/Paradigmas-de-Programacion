package Ejercicios.Guia_1.Cartelera;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class Sistema {
    private final Map<String, Usuario> usuarios;
    private Usuario usuarioActual;

    public Sistema() {
        this.usuarios = new HashMap<>();
        this.usuarioActual = null;
    }

    public void agregarUsuario(String nombre, String contrasena, boolean personal) {
        Usuario nuevoUsuario = new Usuario(nombre, contrasena, personal);
        // asumo que nadie va a poner usuarios repetidos
        usuarios.put(nombre, nuevoUsuario);
    }

    public String iniciarSesion(String nombre, String contrasena) {
        if (!usuarios.containsKey(nombre)) {
            return "El usuario no existe.";
        }
        Usuario usuario = usuarios.get(nombre);
        if (!usuario.getContrasena().equals(contrasena)){
            return "Contraseña incorrecta.";
        }
        usuarioActual = usuario;
        return "El usuario ha iniciado sesion correctamente.";
    }

    public String enviarMensaje(String nombre, String texto) {
        if (!usuarios.containsKey(nombre)) {
            return "El usuario ingresado no existe.";
        }
        Usuario destinatario = usuarios.get(nombre);
        Mensaje mensaje = new Mensaje(usuarioActual, destinatario, texto);
        usuarioActual.enviarMensaje(destinatario, mensaje);
        destinatario.recibirMensaje(usuarioActual, mensaje);
        return "Mensaje enviado con exito.";
    }

    public void verHistorial() {
        if (usuarioActual == null) {
            System.out.println("Debes iniciar sesion primero.");
            return;
        }
        ArrayList <Mensaje> enviados = usuarioActual.getMensajesEnviados();
        ArrayList <Mensaje> recibidos = usuarioActual.getMensajesRecibidos();
        System.out.println();
        for (Mensaje mensaje : enviados) {
            System.out.println("Mensaje enviado de " + mensaje.getRemitente().getNombre() + " a " + mensaje.getDestinatario().getNombre() + ":");
            System.out.println(mensaje.getMensaje() + "\n");
        }
        for (Mensaje mensaje : recibidos) {
            System.out.println("Mensaje enviado de " + mensaje.getRemitente().getNombre() + " a " + mensaje.getDestinatario().getNombre() + " :");
            System.out.println(mensaje.getMensaje() + "\n");
        }
    }

    public String cerrarSesion() {
        usuarioActual = null;
        return "Sesion finalizada correctamente.";
    }

    public boolean cerrarPrograma() {
        return usuarioActual.getPersonal();
    }
}
