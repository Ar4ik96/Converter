package app;

import java.util.Scanner;

public class MilesKilometers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value in miles.");

        if (scanner.hasNextDouble()) {
            double miles = scanner.nextDouble();
            double kilometers = convertMilesToKilometers(miles);
            System.out.println(miles + " miles is equal to " + kilometers + " kilometers.");
        } else {
            System.out.println("Invalid input. Please enter a numeric value in miles.");
        }
    }

    private static double convertMilesToKilometers(double miles) {
        return miles * 1.60934;
    }
}
