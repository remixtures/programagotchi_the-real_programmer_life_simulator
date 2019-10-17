package org.academiadecodigo.stringteasers.programmators.game.character.actions;

public enum HealthAction {

    HOSPITAL(0, 0, 15, 50),
    GOTOGYM(0, 0, 10, 30),
    WALK(0, 0, 5, 0),
    RUN(0, 0, 8, 0);


    private int eat;
    private int sleep;
    private int health;
    private int money;


    HealthAction(int eat, int sleep, int health, int money){
        this.eat = eat;
        this.sleep = sleep;
        this.health = health;
        this.money = money;

    }





}
