public class NotificacionesEmail extends Notificaciones {
    public NotificacionesEmail(String mensaje) {
        super(mensaje);
    }

    public void mensajeFinal() {
        System.out.println("El contenidor del e-mail es: " + mensaje);
    }
}
