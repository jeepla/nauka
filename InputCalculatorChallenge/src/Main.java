import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    }
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int sum = 0;


    while(scanner.hasNextInt()){
        sum+= scanner.nextInt();
        counter++;
    }
        System.out.println("SUM =" + sum + " AVG =" + Math.round((double)sum/counter));
        scanner.close();
    }
    }
