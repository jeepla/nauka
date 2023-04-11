import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double minNumber = 0;
        double maxNumber = 0;
        int loopCount = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("enter a number, or any character to exit:");
            String nextEntry = scanner.nextLine();
            try {
                double validNum = Double.parseDouble(nextEntry);
                if (loopCount == 0 || validNum < minNumber) {
                    minNumber = validNum;
                }
                if (loopCount == 0 || validNum > maxNumber) {
                    maxNumber = validNum;
                }
                loopCount++;
            } catch (NumberFormatException nfe) {
                break;
            }
        }
        if(loopCount > 0) {
            System.out.println("min = " + minNumber + " , max = " + maxNumber);
        }else {
            System.out.println("No valid data entered");
        }
    }
}
