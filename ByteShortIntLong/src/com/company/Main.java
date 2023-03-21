package com.company;

public class Main {

    public static void main(String[] args) {
    int myValue = 10000;

    int myMinIntValue = Integer.MIN_VALUE;
    int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("integer Minimum Value = " +myMinIntValue);
        System.out.println("integer Maximum Value = " +myMaxIntValue);
        System.out.println("busted max value =" +(myMaxIntValue + 1));
        System.out.println("busted min value =" +(myMinIntValue - 1));
        int myMaxIntTest = 2147483647;
        System.out.println(myMaxIntTest);

            byte myMinByteValue = Byte.MIN_VALUE;
            byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);

        short myMaxShortValue = Short.MAX_VALUE;
        short MyMinShortValue = Short.MIN_VALUE;
        System.out.println("short Minimum Value = " + MyMinShortValue);
        System.out.println("short Maximum Value = " + myMaxShortValue);

        long myLongValue = 100L;

        long myMaxLongValue = Long.MAX_VALUE;
        long MyMinLongValue = Long.MIN_VALUE;
        System.out.println("Long Minimum Value = " + MyMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);

            int myTotal = (myMinIntValue / 2);
            byte myNewByteValue = (byte) (myMinByteValue / 2);

            short myNewShortValue = (short) (MyMinShortValue /2 );


                byte bajt1 = 10;
                short kruciak1 =20;
                int chujnia1 =  50;
                long wszystko = 50000L + (10*(bajt1+kruciak1+chujnia1));

        System.out.println(wszystko);
    }
}
