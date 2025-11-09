package visitors;

import cars.Minivan;
import cars.Sedan;
import cars.Truck;

public class PassengerCapacityVisitor implements CarVisitor{
    @Override
    public void visitTruck(Truck truck) {
        System.out.println("Truck passenger seat capacity is " + truck.getSeatCount());
    }

    @Override
    public void visitSedan(Sedan sedan) {
        System.out.println("Sedan passenger capacity is " + sedan.getSeatCount());
    }

    @Override
    public void visitMinivan(Minivan minivan) {
        System.out.println("Minivan passenger capacity is " + minivan.getSeatCount());
    }
}
