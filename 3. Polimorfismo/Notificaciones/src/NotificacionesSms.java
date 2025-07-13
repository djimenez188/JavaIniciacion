public class NotificacionesSms extends Notificaciones {
    public NotificacionesSms(String mensaje) {
        super(mensaje);
    }

    public void mensajeFinal() {
        System.out.println("El contenido del SMS es: " + mensaje);
    }
}
