package ProjectJava;
import java.util.Scanner;

public class E1Question {
    public static void main(String[] args) {
        /*

         */



        Scanner scanner = new Scanner(System.in);

        // Set the number of days in a week
        int daysInWeek = 7;

        // Create an array to store temperatures for a week
        double[] temperatures = new double[daysInWeek];

        // Input temperatures for each day
        for (int i = 0; i < daysInWeek; i++) {
            System.out.print("Enter temperature for day " + (i + 1) + ": ");
            temperatures[i] = scanner.nextDouble();
        }

        // Find the highest and lowest temperatures
        double highestTemperature = temperatures[0];
        double lowestTemperature = temperatures[0];

        for (int i = 1; i < daysInWeek; i++) {
            if (temperatures[i] > highestTemperature) {
                highestTemperature = temperatures[i];
            }

            if (temperatures[i] < lowestTemperature) {
                lowestTemperature = temperatures[i];
            }
        }

        // Display the results
        System.out.println("Highest temperature for the week: " + highestTemperature);
        System.out.println("Lowest temperature for the week: " + lowestTemperature);

        scanner.close();
    }
}




