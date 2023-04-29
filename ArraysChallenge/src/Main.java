import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] firstArray = getRandomArray(5);
        System.out.println(Arrays.toString(firstArray));
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));
        int[] reverseArray = sortIntegers(new int[]{7,30,35});
        System.out.println(Arrays.toString(reverseArray));




    }

    private static int[] getRandomArray(int len) {
        Random random = new Random();
        int[] newInt = new int[len];
        for (int i = 0; i < len; i++) {
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }
    private static int[] sortIntegers(int[] array){

        System.out.println(Arrays.toString(array));
        int[] reverseArray = Arrays.copyOf(array,array.length);
        boolean flag = true;
        int temp;
        while (flag){
            flag = false;
            for(int i = 0; i < reverseArray.length -1; i++){
                if(reverseArray[i] < reverseArray[i + 1]){
                    temp = reverseArray[i];
                    reverseArray[i] = reverseArray[i+1];
                    reverseArray[i+1] = temp;
                    flag = true;
                    System.out.println("----->" + Arrays.toString(reverseArray));
                }
            }
            System.out.println("-->" + Arrays.toString(reverseArray));
        }
        return reverseArray;
    }

}