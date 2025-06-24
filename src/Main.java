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
                System.out.println(firstPlayerUsername + ", create your car!");
                Car firstPlayerCar = createCar(scanner);

                System.out.println(secondPlayerUsername + ", create your car!");
                Car secondPlayerCar = createCar(scanner);

                System.out.println(firstPlayerUsername + "'s car: " + firstPlayerCar);
                System.out.println(secondPlayerUsername + "'s car: " + secondPlayerCar);

                double firstPlayerCarScore = firstPlayerCar.getPerformanceScore();
                double secondPlayerCarScore = secondPlayerCar.getPerformanceScore();

                System.out.println(firstPlayerUsername + "'s car performance score: " + firstPlayerCarScore + " points!");
                System.out.println(secondPlayerUsername + "'s car performance score: " + secondPlayerCarScore + " points!");

                if (firstPlayerCarScore > secondPlayerCarScore) {
                    System.out.println("The winner is: " + firstPlayerUsername + " with " + firstPlayerCar + "!");
                    firstPlayerPoints++;
                } else if (secondPlayerCarScore > firstPlayerCarScore) {
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

    public static boolean askToPlayAgain(Scanner scanner){
        System.out.print("Wanna play again? (Yes/No)");
        String decision = scanner.nextLine();
        return decision.equalsIgnoreCase("Yes");
    }
}