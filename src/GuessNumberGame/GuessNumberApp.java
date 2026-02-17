package GuessNumberGame;

//Responsible for:
//Starting the program
//Creating objects
//Running the game loop

public class GuessNumberApp {
    public static void main(String[] args) {

        Player player = new Player();
        char replay = 'y';
        int difficulty = player.chooseDifficulty();
        int maxNumber;

        if (difficulty == 1)
            maxNumber = 50;
        else if (difficulty == 2)
            maxNumber = 100;
        else
            maxNumber = 500;


        while (replay == 'y') {
            Game game = new Game(maxNumber);


            System.out.println("Welcome to the guessing game!");
            System.out.println("The number is between 1 - " + maxNumber + " !");
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

            replay = player.askReplay("Do you want to play again? Answer with \"y\" or \"n\"");
            System.out.println("Thank you for playing! :-)");
        }
    }
}

