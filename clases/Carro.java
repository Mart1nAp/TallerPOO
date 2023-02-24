public class Car {

    // Attributes
    private String brand;
    private String model;
    private int year;
    private int currentSpeed;

    // Constructor
    public Car(String brand, String model, int year, int currentSpeed) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.currentSpeed = currentSpeed;
    }

    // Methods
    public void accelerate(int amount) {
        if (amount >= 0) {
            currentSpeed += amount;
            System.out.println("Accelerating " + amount + " km/h. Current speed: " + currentSpeed + " km/h.");
        } else {
            System.out.println("The acceleration amount must be greater than or equal to zero.");
        }
    }

    public void brake(int amount) {
        if (amount >= 0) {
            currentSpeed -= amount;
            if (currentSpeed < 0) {
                currentSpeed = 0;
            }
            System.out.println("Braking " + amount + " km/h. Current speed: " + currentSpeed + " km/h.");
        } else {
            System.out.println("The braking amount must be greater than or equal to zero.");
        }
    }

    public void printInformation() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Current speed: " + currentSpeed + " km/h.");
    }
}
