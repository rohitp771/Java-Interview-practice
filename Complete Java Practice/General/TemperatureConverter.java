import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Choose an option (1 or 2): ");
        int choice = scanner.nextInt();

        double temperature, convertedTemp;

        switch (choice) {
            case 1:
                System.out.print("Enter temperature in Celsius: ");
                temperature = scanner.nextDouble();
                convertedTemp = (temperature * 9 / 5) + 32;
                System.out.println(temperature + "°C = " + convertedTemp + "°F");
                break;

            case 2:
                System.out.print("Enter temperature in Fahrenheit: ");
                temperature = scanner.nextDouble();
                convertedTemp = (temperature - 32) * 5 / 9;
                System.out.println(temperature + "°F = " + convertedTemp + "°C");
                break;

            default:
                System.out.println("Invalid choice! Please enter 1 or 2.");
        }

        scanner.close();
    }
}
