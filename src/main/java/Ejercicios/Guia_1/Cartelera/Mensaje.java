package Ejercicios.Guia_1.Cartelera;

public class Mensaje {
    private final Usuario remitente;
    private final Usuario destinatario;
    private final String mensaje;

    public Mensaje(Usuario remitente, Usuario destinatario, String mensaje) {
        this.remitente = remitente;
        this.destinatario = destinatario;
        this.mensaje = mensaje;
    }

    public Usuario getRemitente() {
        return remitente;
    }

    public Usuario getDestinatario() {
        return destinatario;
    }

    public String getMensaje() {
        return mensaje;
    }
}
