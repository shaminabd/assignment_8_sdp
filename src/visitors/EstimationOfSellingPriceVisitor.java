package visitors;

import cars.Minivan;
import cars.Sedan;
import cars.Truck;

public class EstimationOfSellingPriceVisitor implements CarVisitor {
    //count formula is
    //base price - (wearCostPerKm * mileage of the car)

    private double calculatePrice(double basePrice, double priceDropPerKm, double mileage) {
        return basePrice - (priceDropPerKm * mileage);
    }

    @Override
    public void visitTruck(Truck truck) {
        double price = calculatePrice(25_000_000, 400, truck.getMileage());
        System.out.println("Truck price in current condition is " + price + " ₸");
    }

    @Override
    public void visitSedan(Sedan sedan) {
        double price = calculatePrice(9_000_000, 100, sedan.getMileage());
        System.out.println("Sedan price in current condition is " + price + " ₸");
    }

    @Override
    public void visitMinivan(Minivan minivan) {
        double price = calculatePrice(13_000_000, 150, minivan.getMileage());
        System.out.println("Minivan price in current condition is " + price + " ₸");
    }
}
