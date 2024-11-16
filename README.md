# Hangman Game

A simple Hangman game implemented in Java, to practice programming logic, string manipulation 
and console interaction.

---

## 📝 **Description**
This project consists of creating an interactive hangman game, developed in Java. Hangman is a 
guessing game where one player chooses a secret word, and another tries to guess the letters of 
that word with a limited number of tries. The objective of the project was to recreate this dynamic 
in a digital way, using initial concepts of modular programming and encapsulation while I am still 
learning and consolidating these fundamentals.

The game interface is text-based, allowing the user to play directly on the terminal or console. 
The game selects a word entered by a player and presents it as a set of strokes. The other player 
tries to guess, and for each mistake, 1 is subtracted from the total chances (There are 6 chances in total). 
The game ends when the odds reach 0 (defeat) or the word is guessed (victory).

---

## 🚀 **Features**
- Two Player Mode:
    - One player enters the secret word.
    - Another player tries to guess the word.
- Validation of the secret word to accept only letters.
- 5 seconds countdown before the game starts.
- Indication of letters already guessed and current progress.
- End of the game with victory or defeat.

---

## 📂 **Project Structure**

HangmanGame/

├── src/

│   ├── Hangman.java           

│   ├── GameLogic.java


Structure Explanation

**`Hangman.java`**:
Contains the execution of the game. It manages interaction with the player, showing the current state 
of the word, the number of attempts remaining and calling the game logic.

**`GameLogic.java`**:
Contains the logic of the game, such as getting the secret word and checking whether the player won. 
It is separated from main class to modularize responsibilities.

---
## ✨ **Author**
Developed with ❤️ by João Pedro Gallego. Get in touch:
- jopedrogallego@hotmail.com
- https://www.linkedin.com/in/joao-pedro-gallego/