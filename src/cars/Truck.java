package cars;

import visitors.CarVisitor;

public class Truck extends Car {
    public Truck(double mileage, int seatCount, double fuelVolume, double fuelConsumptionPer100km, double averageSpeed) {
        super(mileage, seatCount, fuelVolume, fuelConsumptionPer100km, averageSpeed);
    }

    @Override
    public void accept(CarVisitor visitor) {
        visitor.visitTruck(this);
    }
}
