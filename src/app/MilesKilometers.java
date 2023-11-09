package app;

import java.util.Scanner;

public class MilesKilometers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value in kilometers:");
        double kilometers = scanner.nextDouble();

        double miles = convertKilometersToMiles(kilometers);

        System.out.println(kilometers + " kilometers is equal to " + miles + " miles.");
    }

    public static double convertKilometersToMiles(double kilometers) {
        return kilometers / 1.60934;
    }
}