package cars;

import visitors.CarVisitor;

public abstract class Car {
    protected double mileage;
    protected int seatCount;
    protected double fuelVolume;
    protected double fuelConsumptionPer100km;
    protected double averageSpeed;

    public Car(double mileage, int seatCount, double fuelVolume, double fuelConsumptionPer100km, double averageSpeed) {
        this.mileage = mileage;
        this.seatCount = seatCount;
        this.fuelVolume = fuelVolume;
        this.fuelConsumptionPer100km = fuelConsumptionPer100km;
        this.averageSpeed = averageSpeed;
    }

    public abstract void accept(CarVisitor visitor);

    public double getMileage() {
        return mileage;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public double getFuelVolume() {
        return fuelVolume;
    }

    public double getFuelConsumptionPer100km() {
        return fuelConsumptionPer100km;
    }

    public double getAverageSpeed() {
        return averageSpeed;
    }
}
