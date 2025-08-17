import java.util.ArrayList;

public class CarSorter {
    private ArrayList<Car> smallEngines;
    private ArrayList<Car> mediumEngines;
    private ArrayList<Car> largeEngines;

    public CarSorter() {
        smallEngines = new ArrayList<>();
        mediumEngines = new ArrayList<>();
        largeEngines = new ArrayList<>();
    }

    // sorting cars based on engine size
    public void sortCars(Car car) {
        double engineSize = car.getEngineSize();
        if (engineSize < 2.0) {
            smallEngines.add(car);
        } else if (engineSize >= 2.0 && engineSize < 4.0) {
            mediumEngines.add(car);
        } else {
            largeEngines.add(car);
        }
    }

    public ArrayList<Car> getSmallEngines() {
        return smallEngines;
    }

    public ArrayList<Car> getMediumEngines() {
        return mediumEngines;
    }

    public ArrayList<Car> getLargeEngines() {
        return largeEngines;
    }
}