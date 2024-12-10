package testcar;

public class Car {

    public String brand;
    public String color;
    private int currentSpeed;
    private int maxSpeed;
    private float fuel;
    private float maxFuel;
    private float fuelPerKM;

    public Car(String brand, String color, int maxSpeed, float fuel, float maxFuel, float fuelPerKM, int currentSpeed) {
        this.brand = brand;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.fuel = maxFuel;
        this.maxFuel = maxFuel;
        this.fuelPerKM = fuelPerKM;
        this.currentSpeed = 0;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getColor() {
        return this.color;
    }

    public int getCurrentSpeed() {
        return this.currentSpeed;
    }

    public float getMaxFuel() {
        return this.maxFuel;
    }

    public float getFuel() {
        return this.fuel;
    }

    public void accelerate() {
        if (currentSpeed < maxSpeed) {
            currentSpeed++;
        }
    }

    public void driveCar(float minute) {
        float distance = (currentSpeed / 60.0f) * minute;
        float fuelNeed = distance * fuelPerKM;

        if (fuel >= fuelNeed) {
            fuel -= fuelNeed;
        }
    }

    public void addFuel(float fuelAmount) {
        if (fuel + fuelAmount <= maxFuel) {
            fuel += fuelAmount;
        }
    }
}
