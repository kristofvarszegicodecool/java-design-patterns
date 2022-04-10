package org.designpatterns.template;

public class App {
    public static void main(String[] args) {
        Game game = new GuessTheNumberGame();
        //GuessTheNumberGameWithoutTemplate game = new GuessTheNumberGameWithoutTemplate();
        game.play();
    }
}
