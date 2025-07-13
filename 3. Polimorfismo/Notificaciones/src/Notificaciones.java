public class Notificaciones {
    public String mensaje;

    public Notificaciones(String mensaje) {
        this.mensaje = mensaje;
    }

    public static void main(String[] args) {
        NotificacionesSms mensaje1 = new NotificacionesSms("El sms es una forma antigua pero segura de comunicación.");
        mensaje1.mensajeFinal();
        NotificacionesEmail mensaje2 = new NotificacionesEmail("El email es un sistema de mensajería muy utilizado.");
        mensaje2.mensajeFinal();
    }
}
