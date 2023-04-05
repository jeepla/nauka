public class Main {
    public static void main(String[] args) {
        printYearsAndDays(525600);
    }
    public static void printYearsAndDays(long minutes){
        if(minutes <0){
            System.out.println(" Invalid Value ");
        }
        else{
            long hours = minutes / 60;
            long days = hours / 24;

            System.out.println(minutes + " min = " + (days / 365 ) + " y and " + (days % 365) + " d");
        }
    }
}