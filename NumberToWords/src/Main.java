public class Main {
    public static void main(String[] args) {

    }
public static int getDigitCount(int number){
   if (number <0){
       return -1;}
       int counter = 1;
       while (number / 10 !=0){
          counter++;
          number = number/10;
       }
       return counter;
}

public static int reverse(int number){
        int lastDigit = 0;
        int reverse = 0;
    while (number / 10 !=0){
        lastDigit= number%10;
        reverse = (reverse *10) + lastDigit;
        number = number / 10;
    }
    if(number%10 !=0){ //2
        reverse = (reverse *10) + number;
    }
        return reverse;
}



    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }

            int helper = reverse(number);
            int lastDigit = 0;
            int digit = getDigitCount(number);
            for (int i = 0; i<digit; i++) {
                lastDigit = helper %10;
                switch(lastDigit) {
                    case 0:
                        System.out.print("Zero ");
                        break;
                    case 1:
                        System.out.print("One ");
                        break;
                    case 2:
                        System.out.print("Two ");
                        break;
                    case 3:
                        System.out.print("Three ");
                        break;
                    case 4:
                        System.out.print("Four ");
                        break;
                    case 5:
                        System.out.print("Five ");
                        break;
                    case 6:
                        System.out.print("Six ");
                        break;
                    case 7:
                        System.out.print("Seven ");
                        break;
                    case 8:
                        System.out.print("Eight ");
                        break;
                    case 9:
                        System.out.print("Nine ");
                        break;
                    default:
                        System.out.print("Invalid Value");
                }
                helper = helper /10;
            }
        }
    }
