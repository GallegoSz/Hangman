import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GameLogic gameLogic = new GameLogic();

        System.out.println("Welcome to Hangman!");

        String word = gameLogic.getWord(scanner);
        System.out.println("Word saved!\n");

        gameLogic.initializeGame(word);

        System.out.println("Wait for the count to finish before handing the computer to the next person!");
        Utils.countdown(5);

        System.out.println("End of count!\n\n\n\n\n\n\n\n");
        gameLogic.displayGameStart();

        scanner.close();
    }
}
