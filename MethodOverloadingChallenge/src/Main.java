public class Main {
    public static void main(String[] args) {
        System.out.println(convertToCentimeters(6));
        System.out.println(convertToCentimeters(6,3));
    }

    public static double convertToCentimeters(int inches) {
        return inches * 2.54d;
    }

    public static double convertToCentimeters(int heightInFeet, int heightInInches) {
       return  convertToCentimeters(heightInFeet * 12 + heightInInches);

    }
}





