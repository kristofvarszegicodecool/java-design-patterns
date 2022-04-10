package org.designpatterns.template;

import java.util.Scanner;

public class GuessTheNumberGame extends Game {
    int secretNumber;
    int guess;
    Scanner keyboardScanner;

    @Override
    protected void init() {
        secretNumber = (int) (Math.random() * 101.);
        guess = -1;
        keyboardScanner = new Scanner(System.in);
    }

    @Override
    protected void executeOneRound() {
        System.out.println("Enter your guess:");
        guess = keyboardScanner.nextInt();
        if (secretNumber > guess) {
            System.out.println("The secret number is larger");
        } else if (secretNumber < guess) {
            System.out.println("The secret number is smaller");
        }
    }

    @Override
    protected void displayFinalResult() {
        System.out.println("You have guessed the secret;)");
    }

    protected boolean isGameOver() { return guess == secretNumber; }
}
