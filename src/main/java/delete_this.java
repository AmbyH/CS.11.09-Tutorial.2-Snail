import java.util.Scanner;

public class delete_this {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the dataset (space-separated numbers):");
        String input = scanner.nextLine();

        // Split the input into individual numbers
        String[] numbers = input.split(" ");

        // Calculate the sum of the numbers
        double sum = 0;
        for (String number : numbers) {
            sum += Double.parseDouble(number);
        }

        // Calculate the mean
        double mean = sum / numbers.length;

        System.out.println("The mean of the dataset is: " + mean);

        scanner.close();
    }
}