package org.academiadecodigo.stringteasers.programmators.game.character.actions;

public enum WorkAction {

    BEG(0, -5, -10, 20),
    SELLPROGRAM(0, -40, 0, 100),
    CONSULTING(0, -20, 0, 50);


    private int eat;
    private int sleep;
    private int health;
    private int money;

    WorkAction(int eat, int sleep, int health, int money) {

        this.eat = eat;
        this.sleep = sleep;
        this.health = health;
        this.money = money;

    }



}
