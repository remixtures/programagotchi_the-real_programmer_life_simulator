package org.academiadecodigo.stringteasers.programmators.game.character.actions;

public enum SleepActions {

    UNDERTHEBRIDGE(0, 1, 0, 0),
    ONTHECAR(0, 3, 0, 5),
    HOSTEL(0, 5, 0, 20),
    HOTEL(0, 9, 0, 50);




    private int eat;
    private int sleep;
    private int health;
    private int money;

    SleepActions(int eat, int sleep, int health, int money){

        this.eat = eat;
        this.sleep = sleep;
        this.health = health;
        this.money = money;

    }

}
