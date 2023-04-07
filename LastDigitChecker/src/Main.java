public class Main {
    public static void main(String[] args) {

    }

    public static boolean hasSameLastDigit(int n1, int n2, int n3) {
        if (n1 < 10 || n1 > 1000 || n2 < 10 || n2 > 1000 || n3 < 10 || n3 > 1000) {
            return false;
        } else {
            return n1 % 10 == n2 % 10 || n2 % 10 == n3 % 10 || n3 % 10 == n1% 10;
        }
    }
    public static boolean isValid(int number){
        return number <=1000 && number >=10;
    }
}
