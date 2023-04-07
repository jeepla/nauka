public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(12021));
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(1333));

    }
    public static boolean isPalindrome(int number){
        int reverse =0;
        int lastDigit = 0;
        int helper = number;

            while (number / 10 !=0) {
                lastDigit = number % 10;
                reverse = (reverse * 10) +lastDigit;
                number = number /10;
            }
        lastDigit = number % 10;
        reverse = (reverse * 10) +lastDigit;
        return helper == reverse;
    }
}