package GuessNumberGame;

//Responsible for:
//Generating a random number
//Checking whether the guess is correct
//Giving feedback (too high / too low / correct)

import java.util.Random;

public class Game {
    Random random = new Random(); // initialiserer random

    //metode der generere et tal mellem 0-10
    public int getNumber() {
        return random.nextInt(11);
    }

    //metode med if statement der tjekker guess mod det genererede tal
    public String checkGuess(int guess) {
        if (guess > getNumber()) {
            return "Too high";
        } else if (guess < getNumber()) {
            return "Too low";
        } else if (guess == getNumber()) {
            return "Correct";
        } else {
            return "Error";
        }
    }
}
