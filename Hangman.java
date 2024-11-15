import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GameLogic gameLogic = new GameLogic();

        System.out.println("Welcome to Hangman!");
        String word = gameLogic.getWord(scanner);
        System.out.println("Word saved!\n");

        char[] lyrics = word.toCharArray();
        char[] attempts = new char[word.length()];

        System.out.println("Wait for the count to finish before handing the computer to the next person!");
        count();
        System.out.println("End of count!\n\n\n\n\n\n\n\n");

        System.out.println("=====================================");
        System.out.println("               Hangman               ");
        System.out.println("=====================================");

        for (int i = 0; i < attempts.length; i++) {
            attempts[i] = '_';
        }

        System.out.println("Secret word = " + String.valueOf(attempts));

        int chance = 6;
        boolean isGameWon = false;

        while (chance > 0 && !isGameWon) {
            System.out.println("\nCurrent word: " + String.valueOf(attempts));
            System.out.println("Attempts left: " + chance);
            System.out.print("Enter a letter: ");
            char guess = scanner.nextLine().toLowerCase().charAt(0);

            boolean correctGuess = false;

            for (int i = 0; i < lyrics.length; i++) {
                if (lyrics[i] == guess) {
                    attempts[i] = guess;
                    correctGuess = true;
                }
            }

            if (!correctGuess) {
                chance--;
                System.out.println("Incorrect guess.");
            } else {
                System.out.println("Good guess!");
            }

            isGameWon = gameLogic.checkWin(attempts);
        }

        if (isGameWon) {
            System.out.println("\nCongratulations! You've guessed the word: " + String.valueOf(attempts));
        } else {
            System.out.println("\nGame Over! The word was: " + word);
        }
    }

    private static void count() {
        for (int i = 5; i >= 1; i--) {
            try {
                Thread.sleep(1000);
                System.out.println(i + "s");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
