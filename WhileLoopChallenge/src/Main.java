public class Main {
    public static void main(String[] args) {
        int number = 4;
        int finishNumber = 20;
        int countEven = 0;
        int countOdd = 0;
        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                countOdd++;
                continue;
            }
            System.out.println("Even number " + number);
            countEven++;
            if (countEven == 5) {
                break;
            }

        }
        System.out.println("total odd =" + countOdd);
        System.out.println("total even =" + countEven);


    }

    public static boolean isEvenNumber(int number) {
        if ((number % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }

}

