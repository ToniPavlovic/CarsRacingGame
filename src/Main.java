import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Cars Racing Game! The first player to reach 3 points wins! Have fun!");

        System.out.print("Player 1, enter your username: ");
        String firstPlayerUsername = scanner.nextLine();

        System.out.print("Player 2, enter your username: ");
        String secondPlayerUsername = scanner.nextLine();

        boolean playAgain;

        do {
            int firstPlayerPoints = 0;
            int secondPlayerPoints = 0;

            for (int i = 0; i < 3; i++) {
                System.out.println("\nTrack Setup for Race " + (i+1));
                Track track = createTrack(scanner);
                System.out.println("Track selected: " + track);

                System.out.println(firstPlayerUsername + ", create your car!");
                Car firstPlayerCar = createCar(scanner);

                System.out.println(secondPlayerUsername + ", create your car!");
                Car secondPlayerCar = createCar(scanner);

                System.out.println("\n🏁 Race on " + track.getName() + " begins!");

                double firstPlayerTime = simulateRace(firstPlayerCar, track);
                double secondPlayerTime = simulateRace(secondPlayerCar, track);

                System.out.printf("%s total time: %.2f sec%n", firstPlayerUsername, firstPlayerTime);
                System.out.printf("%s total time: %.2f sec%n", secondPlayerUsername, secondPlayerTime);

                if (firstPlayerTime < secondPlayerTime) {
                    System.out.println("The winner is: " + firstPlayerUsername + " with " + firstPlayerCar + "!");
                    firstPlayerPoints++;
                } else if (secondPlayerTime < firstPlayerTime) {
                    System.out.println("The winner is: " + secondPlayerUsername + " with " + secondPlayerCar + "!");
                    secondPlayerPoints++;
                } else {
                    System.out.println("It' a tie!");
                }
            }

            if (firstPlayerPoints > secondPlayerPoints) {
                System.out.println("🏆 Congratulations! " + firstPlayerUsername + " has won the game!");
            } else if (secondPlayerPoints > firstPlayerPoints) {
                System.out.println("🏆 Congratulations! " + secondPlayerUsername + " has won the game!");
            } else {
                System.out.println("🤝 It's a tie!");
            }
                playAgain = askToPlayAgain(scanner);
        }while (playAgain);
    }

    public static Car createCar(Scanner scanner){
        System.out.print("Enter car manufacturer: ");
        String manufacturer = scanner.nextLine();

        System.out.print("Enter car's model: ");
        String model = scanner.nextLine();

        System.out.print("Enter car's year: ");
        int year = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter car's top speed (km/h): ");
        int topSpeed = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter car's 0-100 km/h acceleration time (sec): ");
        double acceleration = Double.parseDouble(scanner.nextLine());

        return new Car(manufacturer, model, year, topSpeed, acceleration);
    }

    public static Track createTrack(Scanner scanner){
        System.out.print("Enter track name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the number of laps: ");
        int laps = Integer.parseInt(scanner.nextLine());

        return new Track(name, laps);
    }

    public static double simulateRace(Car car, Track track){
        double totalTime = 0;
        for (int i = 1; i <= track.getLaps(); i++){
            double baseTime = (100.0 / car.getTopSpeed()) + (car.getAcceleration() * 0.7);
            double variation = Math.random() * 2 - 1;
            double lapTime = baseTime + variation;

            System.out.printf("%s - Lap %d: %.2f sec%n", car.getModel(), i, lapTime);
            totalTime += lapTime;
        }
        return totalTime;
    }

    public static boolean askToPlayAgain(Scanner scanner){
        System.out.print("Wanna play again? (Yes/No)");
        String decision = scanner.nextLine();
        return decision.equalsIgnoreCase("Yes");
    }
}