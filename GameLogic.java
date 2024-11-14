import java.util.Scanner;

public class GameLogic {
    public String getWord(Scanner scanner) {
        String word = "";

        while (true) {
            System.out.println("What's your word?");
            word = scanner.nextLine();

            if (!word.isEmpty() && word.matches("[a-zA-Z]+")) {
                break;
            } else {
                System.out.println("\nPlease enter a valid word (only letters).");
            }
        }
        return word;
    }

    public String checkWord() {

    }
}
