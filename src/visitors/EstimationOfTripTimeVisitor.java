package visitors;

import cars.Minivan;
import cars.Sedan;
import cars.Truck;

public class EstimationOfTripTimeVisitor implements CarVisitor{
    private final double totalDistance;
    private final String destinationName;
    public EstimationOfTripTimeVisitor(String destinationName, double totalDistance) {
        this.destinationName = destinationName;
        this.totalDistance = totalDistance;
    }
    @Override
    public void visitTruck(Truck truck) {
        double time =totalDistance/truck.getAverageSpeed();
        System.out.printf("Truck will take %.2f hours to reach %s%n", time, destinationName);
    }

    @Override
    public void visitSedan(Sedan sedan) {
        double time =totalDistance/sedan.getAverageSpeed();
        System.out.printf("Sedan will take %.2f hours to reach %s%n", time, destinationName);
    }

    @Override
    public void visitMinivan(Minivan minivan) {
        double time =totalDistance/minivan.getAverageSpeed();
        System.out.printf("Minivan will take %.2f hours to reach %s%n", time, destinationName);
    }
}
