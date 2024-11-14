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
