package GuessNumberGame;

//Responsible for:
//Generating a random number
//Checking whether the guess is correct
//Giving feedback (too high / too low / correct)

import java.util.Random;

public class Game {

    private Random random = new Random();
    private int number;  // gem tallet her

    public Game() {
        number = random.nextInt(10) + 1; // 1-10
    }

    public String checkGuess(int guess) {
        if (guess > number) {
            return "Too high";
        } else if (guess < number) {
            return "Too low";
        } else {
            return "Correct";
        }
    }
}

