class GameLogic {
    private char[] lyrics;
    private char[] attempts;

    // Método para definir a palavra secreta
    public String getWord(Scanner scanner) {
        System.out.print("Enter the word to guess: ");
        return scanner.nextLine().toLowerCase();
    }

    // Inicializa o jogo com a palavra secreta
    public void initializeGame(String word) {
        lyrics = word.toCharArray();
        attempts = new char[word.length()];
        for (int i = 0; i < attempts.length; i++) {
            attempts[i] = '_';
        }
    }

    // Exibe o início do jogo
    public void displayGameStart() {
        System.out.println("=====================================");
        System.out.println("               Hangman               ");
        System.out.println("=====================================");
        System.out.println("Secret word = " + String.valueOf(attempts));
    }

    // Outros métodos para adicionar lógica do jogo, como verificar tentativas, etc.
}
