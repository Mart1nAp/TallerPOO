public class Computador {

    // Atributos
    private String marca;
    private int memoriaRam;
    private int capacidadDisco;
    private boolean encendido;

    // Constructor
    public Computador(String marca, int memoriaRam, int capacidadDisco, boolean encendido) {
        this.marca = marca;
        this.memoriaRam = memoriaRam;
        this.capacidadDisco = capacidadDisco;
        this.encendido = encendido;
    }

    // Métodos
    public void encender() {
        if (!encendido) {
            System.out.println("Encendiendo el computador...");
            encendido = true;
        } else {
            System.out.println("El computador ya está encendido.");
        }
    }

    public void apagar() {
        if (encendido) {
            System.out.println("Apagando el computador...");
            encendido = false;
        } else {
            System.out.println("El computador ya está apagado.");
        }
    }

    public void aumentarMemoriaRam(int cantidad) {
        memoriaRam += cantidad;
        System.out.println("Se aumentó la memoria RAM en " + cantidad + " GB. La nueva cantidad es: " + memoriaRam + " GB.");
    }

}