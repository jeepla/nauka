import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numberCounter = 1;
        int sumOfNumbers = 0;
        while (numberCounter <= 5) {
            System.out.println("Enter Number #" + numberCounter + ":");
            String nextNumber = scanner.nextLine();
            try {
                int Number = Integer.parseInt(nextNumber);
                numberCounter++;
                sumOfNumbers += Number;
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid Number");
            }
        }
        System.out.println("The sum of the 5 numbers = " + sumOfNumbers);
    }
}