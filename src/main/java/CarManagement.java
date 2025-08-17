import java.util.ArrayList;

public class CarManagement {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", 2020, "530", 2.0, "Luxury sedan with advanced tech");
        Car car2 = new Car("Audi", 2018, "A5", 1.8, "Sporty coupe with sleek design");
        Car car3 = new Car("KIA", 2022, "Sportage", 1.6, "Compact SUV with modern features");
        Car car4 = new Car("Mercedes", 2019, "C63", 4.0, "High-performance luxury car");

        Car[] allCars = {car1, car2, car3, car4};

        System.out.println("Brochure for Car ID " + car1.getCarID() + ":");
        System.out.println(car1.generateCarBrochure());

        CarSorter sorter = new CarSorter();
        for (Car car : allCars) {
            sorter.sortCars(car);
        }

        ArrayList<Car> smallEngines = sorter.getSmallEngines();
        ArrayList<Car> mediumEngines = sorter.getMediumEngines();
        ArrayList<Car> largeEngines = sorter.getLargeEngines();

        // Print small engine cars
        System.out.println("\nSmall Engine Cars (< 2.0L):");
        if (!smallEngines.isEmpty()) {
            for (Car car : smallEngines) {
                System.out.println(car.generateCarBrochure());
            }
        } else {
            System.out.println("No small engine cars found.");
        }

        // medium
        System.out.println("\nMedium Engine Cars (2.0L - 3.9L):");
        if (!mediumEngines.isEmpty()) {
            for (Car car : mediumEngines) {
                System.out.println(car.generateCarBrochure());
            }
        } else {
            System.out.println("No medium engine cars found.");
        }

        // large 
        System.out.println("\nLarge Engine Cars (>= 4.0L):");
        if (!largeEngines.isEmpty()) {
            for (Car car : largeEngines) {
                System.out.println(car.generateCarBrochure());
            }
        } else {
            System.out.println("No large engine cars found.");
        }
    }
}