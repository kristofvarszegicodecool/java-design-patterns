package org.designpatterns.template;

public class App {
    public static void main(String[] args) {
        Game game = new GuessTheNumberGame();
        game.play();
    }
}
