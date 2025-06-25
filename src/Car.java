public class Car {
    private final String manufacturer;
    private final String model;
    private final int year;
    private final int topSpeed;
    private final double acceleration;

    public Car(String manufacturer, String model, int year, int topSpeed, double acceleration){
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
        this.topSpeed = topSpeed;
        this.acceleration = acceleration;
    }

    public String getModel(){
        return model;
    }

    public int getTopSpeed(){
        return topSpeed;
    }

    public double getAcceleration(){
        return acceleration;
    }


    public String toString() {
        return manufacturer + " " +model + " (" + year + ")";
    }
}
