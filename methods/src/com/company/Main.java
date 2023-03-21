package com.company;

public class Main {

    public static void main(String[] args) {

        calculateScore(true, 800,  5, 100);

        calculateScore(true, 10000, 8, 200);







        int tablePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("jeepla", tablePosition);

        tablePosition = calculateHighScorePosition(900);
        displayHighScorePosition("jeepla2", tablePosition);

        tablePosition = calculateHighScorePosition(400);
        displayHighScorePosition("jeepla3", tablePosition);

        tablePosition = calculateHighScorePosition(50);
        displayHighScorePosition("jeepla4", tablePosition);

    }

    public static void displayHighScorePosition (String PlayerName, int tablePosition){
        System.out.println(PlayerName + " Managed to get into position " + tablePosition + " ON THE HIGH SCORE TABLE");
    }
    public static int calculateHighScorePosition (int playerScore) {

//                if (playerScore >= 1000 ){
//                return 1;
//        }
//        else if (playerScore >= 500 ){
//            return 2;
//        }
//        else if (playerScore >= 100 ){
//            return 3;
//        }
//            return 4;
        int position = 4;

            if (playerScore >= 1000) {
                position = 1;
            }else if(playerScore >=500) {
                position = 2;
            }else if(playerScore >=100){
                position =3;
            }
            return position;
        }


    public static int  calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {




        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;


        }
        return -1;

    }
}




