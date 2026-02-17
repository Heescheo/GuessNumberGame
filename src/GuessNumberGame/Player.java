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
    //Returnere spillerens svar med ask Replay()
    public char askReplay(String prompt) {
        System.out.print(prompt + " ");
        return scanner.next().charAt(0);
    }

    //Laver en public int med 3 difficulties og kalder den chooseDifficulty()
    // der returnerer nummer-input fra brugeren

    public int chooseDifficulty() {
        System.out.println("Choose difficulty:");
        System.out.println("1 = Easy (1–50)");
        System.out.println("2 = Medium (1–100)");
        System.out.println("3 = Hard (1–500)");

        return scanner.nextInt();
    }
    }