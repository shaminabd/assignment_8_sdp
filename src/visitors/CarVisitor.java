package visitors;

import cars.Minivan;
import cars.Sedan;
import cars.Truck;

public interface CarVisitor {
    void visitTruck(Truck truck);
    void visitSedan(Sedan sedan);
    void visitMinivan(Minivan minivan);
}
