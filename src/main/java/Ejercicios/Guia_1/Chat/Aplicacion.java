package Ejercicios.Guia_1.Chat;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Aplicacion {
    private final Map<String, Usuario> usuarios;
    private Usuario usuarioActual;
    private static Scanner scanner;

    public Aplicacion() {
        this.usuarios = new HashMap<>();
        this.usuarioActual = null;
        scanner = new Scanner(System.in);
    }

    public String agregarUsuario() {
        System.out.println("Ingrese un nombre:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese un numero de celular:");
        int numero = Integer.parseInt(scanner.nextLine());
        Usuario nuevoUsuario = new Usuario(nombre, numero);
        if (usuarioActual == null) {
            usuarioActual = nuevoUsuario;
            usuarios.put(nombre, nuevoUsuario);
            return "Usuario creado con exito.\nCambio a usuario nuevo.";
        }
        if (usuarios.containsKey(nombre)) {
            return "Usuario ya existente.";
        }
        usuarios.put(nombre, nuevoUsuario);
        return "Usuario creado con exito.";
    }

    public String enviarMensaje() {
        if (usuarios.size() < 2) {
            return "Deben existir por lo menos 2 usuarios";
        }
        System.out.println("Ingresa un destinatario:");
        String nombreDestinatario = scanner.nextLine();
        if (!usuarios.containsKey(nombreDestinatario)) {
            return "Error: Usuario no encontrado.";
        }
        System.out.println("Ingresa un mensaje:");
        String texto = scanner.nextLine();
        Usuario destinatario = usuarios.get(nombreDestinatario);
        Mensaje mensaje = new Mensaje(usuarioActual, destinatario, texto);
        usuarioActual.enviarMensaje(destinatario, mensaje);
        destinatario.recibirMensaje(usuarioActual, mensaje);
        return "Mensaje enviado con exito.";
    }

    public String cambiarUsuario() {
        if (usuarios.size() < 2) {
            return "Deben existir por lo menos 2 usuarios";
        }
        System.out.println("Ingresa un nombre:");
        String nombre = scanner.nextLine();
        if (!usuarios.containsKey(nombre)) {
            return "Usuario invalido.";
        }
        usuarioActual = usuarios.get(nombre);
        return String.format("Usuario cambiado a %s", nombre);
    }

    public void getHistorial() {
        if (usuarios.size() < 2) {
            System.out.println("Deben existir por lo menos 2 usuarios");
            return;
        }
        System.out.println("Ingresa un nombre:");
        String nombre = scanner.nextLine();
        if (!usuarios.containsKey(nombre)) {
            System.out.println("Usuario invalido.");
        }
        Usuario destinatario = usuarios.get(nombre);
        ArrayList<Mensaje> enviados = usuarioActual.getMensajesEnviados(destinatario);
        if (enviados == null) {
            System.out.println("No se han encontrado mensajes enviados a ese usuario.");
        } else {
            for (Mensaje mensaje : enviados) {
                System.out.println("Mensaje enviado de " + mensaje.getRemitente().getNombre() + " a " + mensaje.getDestinatario().getNombre() + ":");
                System.out.println(mensaje.getMensaje());
            }
        }
        ArrayList<Mensaje> recibidos = destinatario.getMensajesEnviados(usuarioActual);
        if (recibidos == null) {
            System.out.println("No se han encontrado mensajes recibidos de ese usuario.");
        } else {
            for (Mensaje mensaje : recibidos) {
                System.out.println("Mensaje recibido de " + mensaje.getRemitente().getNombre() + " a " + mensaje.getDestinatario().getNombre() + ":");
                System.out.println(mensaje.getMensaje());
            }
        }
    }

    public String getUsuarioActual() {
        if (usuarioActual == null) {
            return "-";
        }
        return usuarioActual.getNombre();
    }

    public static void main(String[] args) {
        Aplicacion app = new Aplicacion();
        while (true) {
            System.out.println("Usuario actual: " + app.getUsuarioActual());
            System.out.println("Ingrese una de las opciones:");
            System.out.println("1: Crear un nuevo usuario");
            System.out.println("2: Enviar un mensaje a otro usuario");
            System.out.println("3: Cambiar a otro usuario");
            System.out.println("4: Obtener historial de mensajes con otro usuario");
            System.out.println("5: Salir");
            String opcion = scanner.nextLine();
            switch (opcion) {
                case "1":
                    System.out.println(app.agregarUsuario());
                    break;
                case "2":
                    System.out.println(app.enviarMensaje());
                    break;
                case "3":
                    System.out.println(app.cambiarUsuario());
                    break;
                case "4":
                    app.getHistorial();
                    break;
                case "5":
                    return;
                default:
                    System.out.println("Opcion invalida");
            }
        }
    }
}
