package GuessNumberGame;
// Responsible for:
//Reading user input
//Returning the player's guess


//Vi importerer scanner
import java.util.Scanner;

public class Player {

    // initialiserer scanner
    private Scanner scanner = new Scanner(System.in);

    //Returnerer spillerens gæt med getGuess()
    public int getGuess(String prompt) {
        System.out.print(prompt + " ");
        return scanner.nextInt();
    }


}
