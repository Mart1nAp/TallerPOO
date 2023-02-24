package clases;
public class Computer {

    // Attributes
    public String brand;
    private int ramMemory;
    private int diskCapacity;
    private boolean turnedOn;

    // Constructor
    public Computer(String brand, int ramMemory, int diskCapacity, boolean turnedOn) {
        this.brand = brand;
        this.ramMemory = ramMemory;
        this.diskCapacity = diskCapacity;
        this.turnedOn = turnedOn;
    }

    // Methods
    public void turnOn() {
        if (!turnedOn) {
            System.out.println("Turning on the computer...");
            turnedOn = true;
        } else {
            System.out.println("The computer is already turned on.");
        }
    }

    public void turnOff() {
        if (turnedOn) {
            System.out.println("Turning off the computer...");
            turnedOn = false;
        } else {
            System.out.println("The computer is already turned off.");
        }
    }

    public void increaseRamMemory(int amount) {
        ramMemory += amount;
        System.out.println("RAM memory increased by " + amount + " GB. New amount: " + ramMemory + " GB.");
    }
}