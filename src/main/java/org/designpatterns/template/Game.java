package org.designpatterns.template;

public abstract class Game {
    protected abstract void init();

    protected abstract void executeOneRound();

    protected abstract boolean isGameOver();

    protected abstract void displayFinalResult();

    public final void play() {
        init();
        while (!isGameOver()) {
            executeOneRound();
        }
        displayFinalResult();
    }
}
