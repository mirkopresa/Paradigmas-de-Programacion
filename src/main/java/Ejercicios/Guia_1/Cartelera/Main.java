package Ejercicios.Guia_1.Cartelera;

public class Main {
    public static void main(String[] args) {
        // habria que hacer una version interactiva, pero el funcionamiento esta
        Sistema sistema = new Sistema();
        sistema.agregarUsuario("Mirko", "123456", true);
        sistema.agregarUsuario("Sawken", "69420", false);
        System.out.println(sistema.iniciarSesion("Mirko", "12345"));
        System.out.println(sistema.iniciarSesion("Sawken", "69420"));
        if (!sistema.cerrarPrograma()) {
            System.out.println("No tienes permisos de cerrar el sistema");
        } else {
            return;
        }
        System.out.println(sistema.enviarMensaje("Mirko", "wachinaso"));
        sistema.verHistorial();
        System.out.println(sistema.cerrarSesion());
        System.out.println(sistema.iniciarSesion("Mirko", "123456"));
        System.out.println(sistema.enviarMensaje("Sawken", "ee"));
        System.out.println(sistema.enviarMensaje("Sawken", "porque me decis eso SAJ"));
        sistema.verHistorial();
        sistema.cerrarPrograma();
    }
}
