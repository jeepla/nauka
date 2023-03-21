package com.company;

public class Main {

    public static void main(String[] args) {
    
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;

        System.out.println("FLoat minimum Value =" + myMinFloatValue);
        System.out.println("Float maximum Value =" + myMaxFloatValue);


        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;

        System.out.println("FLoat minimum Value =" + myMinDoubleValue);
        System.out.println("Double maximum Value =" + myMaxDoubleValue);



     int myIntValue = 5 / 3;
     float myFloatValue = 5f / 3f;
     double myDoubleValue = 5d / 3d;

        System.out.println("MyIntValue= " + myIntValue);
        System.out.println("MyFloatValue= "+ myFloatValue);
        System.out.println("myDoubleValue= "+ myDoubleValue);

        // 1 pound = 0.45359237kg

        double funty = 15d;
        double kilogramy = (funty * 0.45359237d);
        System.out.println(kilogramy);

    }
}
