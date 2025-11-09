import cars.Car;
import visitors.EstimationOfSellingPriceVisitor;
import visitors.EstimationOfTripTimeVisitor;
import visitors.FuelDistanceVisitor;
import visitors.PassengerCapacityVisitor;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String destination = HardCodeValues.getDestinationName();
        double distance = HardCodeValues.getDistance();
        List<Car> vehicles = HardCodeValues.createVehicles();

        EstimationOfSellingPriceVisitor sellingPriceVisitor = new EstimationOfSellingPriceVisitor();
        PassengerCapacityVisitor passengerCapacityVisitor = new PassengerCapacityVisitor();
        FuelDistanceVisitor fuelDistanceVisitor = new FuelDistanceVisitor();
        EstimationOfTripTimeVisitor tripTimeVisitor = new EstimationOfTripTimeVisitor(destination, distance);

        System.out.println("Selling Price Visitor");
        vehicles.forEach(car -> car.accept(sellingPriceVisitor));
        System.out.println();
        System.out.println();

        System.out.println("Passenger Capacity Visitor");
        vehicles.forEach(car -> car.accept(passengerCapacityVisitor));
        System.out.println();
        System.out.println();

        System.out.println("Fuel Distance");
        vehicles.forEach(car -> car.accept(fuelDistanceVisitor));
        System.out.println();
        System.out.println();

        System.out.println("Trip Time Visitor");
        vehicles.forEach(car -> car.accept(tripTimeVisitor));
        System.out.println();
        System.out.println();
    }
}