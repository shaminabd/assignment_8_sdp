package cars;

import visitors.CarVisitor;

public class Sedan extends Car {
    public Sedan(double mileage, int seatCount, double fuelVolume, double fuelConsumptionPer100km, double averageSpeed) {
        super(mileage, seatCount, fuelVolume, fuelConsumptionPer100km, averageSpeed);
    }

    @Override
    public void accept(CarVisitor visitor) {
        visitor.visitSedan(this);
    }
}
