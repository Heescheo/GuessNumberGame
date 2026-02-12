package GuessNumberGame;

//Responsible for:
//Generating a random number
//Checking whether the guess is correct
//Giving feedback (too high / too low / correct)

import java.util.Random;

public class Game {
    Random random = new Random(); // initialiserer random
    int randNumb; //initialiserer en int med ingen værdi (null)

    //metode der generere et tal mellem
public int getNumber(){
    int randNumb = random.nextInt(10);
    return randNumb;
}
    //metode med if statement der tjekker guess mod det genererede tal
public String checkGuess(){
    if (guess > randNumb){
        return "Too high";
    }else if (guess < randNumb){
        return "Too low";
    }
    else {
        return "Correct";
    }
}
}
