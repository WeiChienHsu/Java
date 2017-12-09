public class Hello {

    public static void main(String[] args){
        int score = 100000;
        int levelCompleted = 8;
        int bonus = 200;
        boolean gameOver = true;

        calculateScore(true, 800, 8, 100);

        System.out.println(calculateScore(false, 500, 10, 200));

        }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if(gameOver) {
            int finalScore = score + (bonus * levelCompleted);
            System.out.println("your final score is: " + finalScore);
            return finalScore;
        } else {
            System.out.println("You haven't finished the game!");
            return -1;
        }
    }
}