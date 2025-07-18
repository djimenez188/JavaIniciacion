public interface Dispositivo {
    void encender();

    void apagar();

    public static void main(String[] args) {
        Televisor t = new Televisor();
        t.encender();
        Radio r = new Radio();
        r.apagar();
    }
}
