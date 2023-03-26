package com.company;

public class Main {

    public static void main(String[] args) {

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("it is not an alien!");
        }

        int topScore = 80;
        if (topScore <= 100) {
            System.out.println("you got the high score");
        }


        int secondTopScore = 95;
        if (topScore > secondTopScore && topScore < 100) {
            System.out.println("greater then second top score and less than 100");

        }
        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("either or both of the conditions are true");
        }
        int newValue = 50;
        if (newValue == 50) {
            System.out.println("this isnt an error");
        }
        boolean isCar = false;
        if (isCar) {
            System.out.println("this is not supposed to happen");
        }
        isCar = true;
        boolean wasCar = isCar ? true : false;

        if (wasCar) {
            System.out.println("wasCar is true");
        }
        double jedynka = 20.00d;
        double dwojka = 80.00d;
        double trojka = ((jedynka + dwojka) * 100d);
        System.out.println("wynik trojka = " + trojka);
        double czworka = (trojka % 40d);
        System.out.println("wynik czworka =" + czworka);
        boolean buljon = (czworka == 0) ? true : false;
        System.out.println("schody ruchome " + buljon);
        if (!buljon) {
            System.out.println("????");
        }
    }

}



