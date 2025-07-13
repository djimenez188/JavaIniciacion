public class Auto extends Vehiculo {
   public Auto (String marca, String modelo){
       super (marca, modelo);
   }
    public void encender() {
        System.out.println("El Auto se encendio");
    }

    public void tocarBocina() {
        System.out.println("Tocar la bocina");
    }
}
