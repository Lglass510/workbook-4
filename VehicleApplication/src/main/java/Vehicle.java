

public class Vehicle {

    //Fields
    int maxMPH;
    double fuelCapacity;
    int seats;
    String fuelType;
    String color;


    public Vehicle (int maxMPH, double fuelCapacity, int seats, String fuelType, String color) {
        this.maxMPH = maxMPH;
        this.fuelCapacity = fuelCapacity;
        this.seats = seats;
        this.fuelType = fuelType;
        this.color = color;
    }

    public Vehicle() {
    }

    //gets and sets
    //region
    public int getMaxMPH() {
        return maxMPH;
    }

    public void setMaxMPH(int maxMPH) {
        this.maxMPH = maxMPH;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    int cargoCapacity;
    //endregion





}
