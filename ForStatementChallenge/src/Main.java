public class Main {
    public static void main(String[] args) {
        int howMany = 0;
       for (int i = 500; i <=1000; i++){
           if (isPrime(i)){
               System.out.println(i);
               howMany++;
               if (howMany == 3){
                   break;
               }
           }
       }
    }
    public static boolean isPrime(int wholeNumber) {
       if(wholeNumber <= 2){
           return (wholeNumber == 2);
       }
    for (int divisor = 2; divisor <= wholeNumber / 2; divisor++){
        if (wholeNumber % divisor == 0){
            return false;
        }
    }

        return true;
    }
}
