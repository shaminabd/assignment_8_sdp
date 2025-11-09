package factory;

import cars.Car;
import cars.Minivan;
import cars.Sedan;
import cars.Truck;

import java.util.ArrayList;
import java.util.List;

public class HardCodeValuesFactory {
    public static String getDestinationName() {
        return "Burabay";
    }

    public static double getDistance() {
        return 257;
    }

    public static List<Car> createVehicles() {
        List<Car> vehicles = new ArrayList<>();

        vehicles.add(new Minivan(20_000, 9, 75, 12, 180));
        vehicles.add(new Truck(50_000, 7, 80, 15, 130));
        vehicles.add(new Sedan(35_000, 5, 60, 8, 140));

        return vehicles;
    }
}
