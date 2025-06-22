public class Car {
    private String manufacturer;
    private String model;
    private  int year;
    private int horsepower;
    private int weight;
    private int topSpeed;
    private double acceleration;

    public Car(String manufacturer, String model, int year, int horsepower, int weight, int topSpeed, double acceleration){
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
        this.horsepower = horsepower;
        this.weight = weight;
        this.topSpeed = topSpeed;
        this.acceleration = acceleration;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public int getWeight() {
        return weight;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public double getAcceleration(){
        return acceleration;
    }

    public double getPerformanceScore(){
        return (horsepower * 1.5 + topSpeed * 2) - (weight * 0.5 + acceleration * 30);
    }

    public String toString() {
        return manufacturer + " " +model + " (" + year + ")";
    }
}
