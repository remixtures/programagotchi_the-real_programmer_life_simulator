package org.academiadecodigo.stringteasers.programmators.game.character.actions;

public enum HealthAction{

    HOSPITAL(0, 0, 50, 50),
    GO_TO_GYM(-5, -10, 20, 20),
    WALK(-5, -5, 5, 0),
    RUN(-5, -10, 10, 0);


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

    public int[] toArray (HealthAction action){

        int[] values = new int[4];

        values[0] = action.health;
        values[1] = action.eat;
        values[2] = action.sleep;
        values[3] = action.money;

        return values;


    }



}
