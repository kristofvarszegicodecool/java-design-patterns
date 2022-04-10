package org.designpatterns.template;

import java.util.Scanner;

public class GuessTheNumberGameWithoutTemplate {
    public void play() {
        final int secretNumber = (int) (Math.random() * 101.);
        int guess = -1;
        while (guess != secretNumber) {
            Scanner keyboardScanner = new Scanner(System.in);
            System.out.println("Enter your guess:");
            guess = keyboardScanner.nextInt();
            if (secretNumber > guess) {
                System.out.println("The secret number is larger");
            } else if (secretNumber < guess) {
                System.out.println("The secret number is smaller");
            }
        }
        System.out.println("You have guessed the secret;)");
    }
}
