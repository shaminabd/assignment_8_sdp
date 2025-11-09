import cars.Car;
import cars.Minivan;
import cars.Sedan;
import cars.Truck;

import java.util.List;

public class HardCodeValues {
    public static String getDestinationName() {
        return "Burabay";
    }

    public static double getDistance() {
        return 257;
    }

    public static List<Car> createVehicles() {
        return List.of(
            new Minivan(20_000, 9, 75, 12, 180),
            new Truck(50_000, 7, 80, 15, 130),
            new Sedan(35_000, 5, 60, 8, 140)
        );
    }
}
