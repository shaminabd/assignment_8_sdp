package visitors;

import cars.Minivan;
import cars.Sedan;
import cars.Truck;

public class EstimationOfSellingPriceVisitor implements CarVisitor {
    //count formula is
    //base price - (wearCostPerKm * mileage of the car)

    private double calculatePrice(double basePrice, double wearCostPerKm, double mileage) {
        return basePrice - (wearCostPerKm * mileage);
    }

    @Override
    public void visitTruck(Truck truck) {
        double price = calculatePrice(25_000_000, 40, truck.getMileage());
        System.out.printf("Truck price in current condition is %.2f ₸%n", price);
    }

    @Override
    public void visitSedan(Sedan sedan) {
        double price = calculatePrice(9_000_000, 30, sedan.getMileage());
        System.out.printf("Sedan price in current condition is %.2f ₸%n", price);
    }

    @Override
    public void visitMinivan(Minivan minivan) {
        double price = calculatePrice(13_000_000, 25, minivan.getMileage());
        System.out.printf("Minivan price in current condition is %.2f ₸%n", price);
    }
}
