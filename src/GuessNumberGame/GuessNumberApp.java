package GuessNumberGame;

//Responsible for:
//Starting the program
//Creating objects
//Running the game loop

public class GuessNumberApp {
    public static void main(String[] args) {

        Game game = new Game();
        Player player = new Player();

        System.out.println("Welcome to the guessing game!");
        System.out.println("The number is between 1-10!");
        System.out.println("Guess the random number!");

        int numGuesses = 0;
        boolean isHit = false;

        while (!isHit) {
            int guess = player.getGuess("Enter your guess:");
            numGuesses++;

            String result = game.checkGuess(guess);
            System.out.println(result);

            if (result.equals("Correct")) {
                isHit = true;
                System.out.println("You guessed it in " + numGuesses + " tries!");
            }
        }
    }
}

