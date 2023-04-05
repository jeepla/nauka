public class Main {
    public static void main(String[] args) {
        int position = calculateHighScorePosition(1500);
        int position1 = calculateHighScorePosition(999);
        int position2 = calculateHighScorePosition(499);
        int position3 = calculateHighScorePosition(99);
        int position4 = calculateHighScorePosition(-1000);
        displayHighScorePosition("tim", position);
        displayHighScorePosition("Cuba", position1);
        displayHighScorePosition("Weronika", position2);
        displayHighScorePosition("Patryk", position3);
        displayHighScorePosition("Ula", position4);
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score list.");
    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500) {
            return 2;
        } else if (score >= 100) {
            return 3;
        }
        return 4;
    }
}


