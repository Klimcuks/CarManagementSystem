public class Car {
    private String brand;
    private int year;
    private String model;
    private double engineSize;
    private String description;
    private static int carIDSystem = 0;
    private int carID;

    Car(String brand, int year, String model, double engineSize, String description) {
        this.brand = brand;
        this.year = year;
        this.model = model;
        this.engineSize = engineSize;
        this.description = description;
        carIDSystem++;
        this.carID = carIDSystem;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    public double getEngineSize() {
        return engineSize;
    }

    public int getCarID() {
        return carID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String generateCarBrochure() {
        return String.format(
                "Car Brochure\n" +
                        "------------\n" +
                        "Brand: %s\n" +
                        "Year: %d\n" +
                        "Model: %s\n" +
                        "Engine Size: %.1fL\n" +
                        "Description: %s\n" +
                        "Car ID: %d\n",
                brand, year, model, engineSize, description, carID
        );
    }
}
