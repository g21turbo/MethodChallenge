public class Main {

    public static void main(String[] args) {

        int highScorePosition = calculateHighScorePosition(3000);
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Tom", highScorePosition);

        highScorePosition = calculateHighScorePosition(350);
        displayHighScorePosition("Rick", highScorePosition);

        highScorePosition = calculateHighScorePosition(99);
        displayHighScorePosition("Steve", highScorePosition);

        highScorePosition = newCalculateHighScorePosition(99);
        displayHighScorePosition("Steve", highScorePosition);


    }

    public static void displayHighScorePosition(String name, int scorePosition) {
        System.out.println(name + " managed to get into position " + scorePosition +
                            " on the high score list.");
    }

    public static int calculateHighScorePosition(int playerScore) {


        if (playerScore >= 1000){
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        }
        return 4;

    }

    public static int newCalculateHighScorePosition(int playerScore) {

        int position = 4;
        if (playerScore >= 1000){
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        }
        return position;

    }
}