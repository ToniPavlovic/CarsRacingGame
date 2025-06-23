public class Car {
    private final String manufacturer;
    private final String model;
    private final int year;
    private final int horsepower;
    private final int weight;
    private final int topSpeed;
    private final double acceleration;

    public Car(String manufacturer, String model, int year, int horsepower, int weight, int topSpeed, double acceleration){
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
        this.horsepower = horsepower;
        this.weight = weight;
        this.topSpeed = topSpeed;
        this.acceleration = acceleration;
    }

    public double getPerformanceScore(){
        return (horsepower * 1.5 + topSpeed * 2) - (weight * 0.5 + acceleration * 30);
    }

    public String toString() {
        return manufacturer + " " +model + " (" + year + ")";
    }
}
