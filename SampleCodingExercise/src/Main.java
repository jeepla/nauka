public class Main {
    public static void main(String[] args) {
    }

    public static boolean hasTeen(int numberOne, int numberTwo, int numberThree) {

        return (isTeen(numberOne) || isTeen(numberTwo) || isTeen(numberThree))
    }




    public static boolean isTeen(int numberOne) {
      return numberOne >=13 && numberOne <=19;
    }
}








