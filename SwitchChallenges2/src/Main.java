public class Main {
    public static void main(String[] args) {
    }
    public static void printNumberInWord(int Number){
        switch (Number) {
            case 0:
                System.out.println("ZERO");
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
            case 7:
                System.out.println("SEVEN");
            case 8:
                System.out.println("EIGHT");
            case 9:
                System.out.println("NINE");
            default:
                System.out.println("OTHER");

        }
        }
    public static void printDayOfWeek(int day) {
        String dayOfWeek = switch(day){
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid day";
        };

    }
}