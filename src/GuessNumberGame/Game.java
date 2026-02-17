package GuessNumberGame;

//Responsible for:
//Generating a random number
//Checking whether the guess is correct
//Giving feedback (too high / too low / correct)

import java.util.Random;

public class Game {

    private Random random = new Random();
    private int number;  // gem tallet her

    public Game(int maxNumber) {
        number = random.nextInt(maxNumber) + 1; // lavet til maxnumber så spilleren selv kan bestemme
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

