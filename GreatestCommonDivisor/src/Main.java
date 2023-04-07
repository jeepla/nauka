public class Main {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25,15));
        System.out.println(getGreatestCommonDivisor(12,30));
    }
    public static int getGreatestCommonDivisor(int first, int second){
        if(first <10 || second<10)
            return -1;
        int GreatestCommonDivisor = 1;
        for (int i = 1; i<second + 1;i++){
            if(first % i == 0 && second % i == 0){
                GreatestCommonDivisor = i;
            }
        }
        return GreatestCommonDivisor;

    }
}