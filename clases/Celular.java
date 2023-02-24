public class Celular {

    // Atributos
    public String marca;
    private String modelo;
    private int capacidadBateria;
    protected boolean cargando;

    // Constructor
    public Celular(String marca, String modelo, int capacidadBateria, boolean cargando) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadBateria = capacidadBateria;
        this.cargando = cargando;
    }

    // Métodos
    public void cargar() {
        if (!cargando) {
            System.out.println("Cargando el celular...");
            cargando = true;
        } else {
            System.out.println("El celular ya está cargando.");
        }
    }

    public void imprimirInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Capacidad bateria: " + capacidadBateria);
    }

    public void usar(int minutos) {
        if (cargando) {
            System.out.println("No puedes usar el celular mientras está cargando.");
        } else {
            int bateriaRestante = capacidadBateria - minutos;
            if (bateriaRestante > 0) {
                System.out.println("Usando el celular durante " + minutos + " minutos. Batería restante: " + bateriaRestante + " minutos.");
                capacidadBateria = bateriaRestante;
            } else {
                System.out.println("La batería del celular se agotó.");
                capacidadBateria = 0;
            }
        }
    }

}