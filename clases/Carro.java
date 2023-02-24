public class Carro {

    // Atributos
    private String marca;
    private String modelo;
    private int ano;
    private int velocidadActual;

    // Constructor
    public Carro(String marca, String modelo, int ano, int velocidadActual) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadActual = velocidadActual;
    }

    // Métodos
    public void acelerar(int cantidad) {
        if (cantidad >= 0) {
            velocidadActual += cantidad;
            System.out.println("Acelerando " + cantidad + " km/h. Velocidad actual: " + velocidadActual + " km/h.");
        } else {
            System.out.println("La cantidad de aceleración debe ser mayor o igual a cero.");
        }
    }

    public void frenar(int cantidad) {
        if (cantidad >= 0) {
            velocidadActual -= cantidad;
            if (velocidadActual < 0) {
                velocidadActual = 0;
            }
            System.out.println("Frenando " + cantidad + " km/h. Velocidad actual: " + velocidadActual + " km/h.");
        } else {
            System.out.println("La cantidad de frenado debe ser mayor o igual a cero.");
        }
    }

    public void imprimirInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + ano);
        System.out.println("Velocidad actual: " + velocidadActual + " km/h.");
    }

}
