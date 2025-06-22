import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Player 1, enter your username: ");
        String firstPlayerUsername = scanner.nextLine();

        System.out.print("Player 2, enter your username: ");
        String secondPlayerUsername = scanner.nextLine();

        System.out.println(firstPlayerUsername + ", create your car: ");
        Car firstPlayerCar = createCar(scanner);

        System.out.println(secondPlayerUsername + ", create your car: ");
        Car secondPlayeCar = createCar(scanner);

        System.out.println(firstPlayerUsername + "'s car: " +firstPlayerCar);
        System.out.println(secondPlayerUsername + "'s car: " +secondPlayeCar);

        double firstPlayerCarScore = firstPlayerCar.getPerformanceScore();
        double secondPlayerCarScore = secondPlayeCar.getPerformanceScore();

        System.out.println(firstPlayerUsername + "'s car performance score: " +firstPlayerCarScore + " points!");
        System.out.println(secondPlayerUsername + "'s car performance score: " +secondPlayerCarScore + " points!");

        if (firstPlayerCarScore > secondPlayerCarScore){
            System.out.println("The winner is: " +firstPlayerUsername + " with" +firstPlayerCar + "!");
        }
        else if (secondPlayerCarScore > firstPlayerCarScore){
            System.out.println("The winner is: " +firstPlayerUsername + " with" +firstPlayerCar + "!");
        }
        else {
            System.out.println("It' a tie!");
        }
    }

    public static Car createCar(Scanner scanner){
        System.out.print("Enter car manufacturer: ");
        String manufacturer = scanner.nextLine();

        System.out.print("Enter car's model: ");
        String model = scanner.nextLine();

        System.out.print("Enter car's  year: ");
        int year = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter car's horsepower: ");
        int horsepower = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter car's weight (kg): ");
        int weight = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter car's top speed (km/h): ");
        int topSpeed = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter car's 0-100 km/h acceleration time (sec): ");
        double acceleration = Double.parseDouble(scanner.nextLine());

        return new Car(manufacturer, model, year, horsepower, weight, topSpeed, acceleration);
    }
}