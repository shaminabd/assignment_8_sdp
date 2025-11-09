package visitors;

import cars.Minivan;
import cars.Sedan;
import cars.Truck;

public class FuelDistanceVisitor implements CarVisitor{
    //formulat to calculate distance
    //fuel volume dividing into fuel consumption and then multiply 100
    //(fV / c) * 100 = distance
    @Override
    public void visitTruck(Truck truck) {
        double distance = (truck.getFuelVolume()/ truck.getFuelConsumptionPer100km()) * 100;
        System.out.printf("Truck distance that it can travel is %.2f km%n", distance);
    }

    @Override
    public void visitSedan(Sedan sedan) {
        double distance = (sedan.getFuelVolume()/ sedan.getFuelConsumptionPer100km()) * 100;
        System.out.printf("Sedan distance that it can travel is %.2f km%n", distance);
    }

    @Override
    public void visitMinivan(Minivan minivan) {
        double distance = (minivan.getFuelVolume()/ minivan.getFuelConsumptionPer100km()) * 100;
        System.out.printf("Minivan distance that it can travel is %.2f km%n", distance);
    }
}
