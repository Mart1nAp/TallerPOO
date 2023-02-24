package clases;
public class Cellphone {

    // Attributes
    public String brand;
    private String model;
    private int batteryCapacity;
    protected boolean charging;

    // Constructor
    public Cellphone(String brand, String model, int batteryCapacity, boolean charging) {
        this.brand = brand;
        this.model = model;
        this.batteryCapacity = batteryCapacity;
        this.charging = charging;
    }

    // Methods
    public void charge() {
        if (!charging) {
            System.out.println("Charging the cellphone...");
            charging = true;
        } else {
            System.out.println("The cellphone is already charging.");
        }
    }

    public void printInformation() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Battery capacity: " + batteryCapacity);
    }

    public void use(int minutes) {
        if (charging) {
            System.out.println("You cannot use the cellphone while it's charging.");
        } else {
            int remainingBattery = batteryCapacity - minutes;
            if (remainingBattery > 0) {
                System.out.println("Using the cellphone for " + minutes + " minutes. Remaining battery: " + remainingBattery + " minutes.");
                batteryCapacity = remainingBattery;
            } else {
                System.out.println("The cellphone battery has run out.");
                batteryCapacity = 0;
            }
        }
    }
}