package org.academiadecodigo.stringteasers.programmators.game.character.actions;

public enum WorkAction {

    BEG(0, -5, -10, 20, 0),
    LIGHT_PROGRAMMING(-10 , -20, 0, 10, 20),
    WORKDAY(-20 , -40, 0, 20, 40),
    OVERTIME(-40, -80, 0, 30, 70),
    CRUNCH(-80, -100, 0, 40, 90);


    private int eat;
    private int sleep;
    private int health;
    private int money;
    private int work;

    WorkAction(int eat, int sleep, int health, int money, int work) {

        this.eat = eat;
        this.sleep = sleep;
        this.health = health;
        this.money = money;
        this.work = work;

    }

    public int[] toArray (WorkAction action){

        int[] values = new int[4];

        values[0] = action.health;
        values[1] = action.eat;
        values[2] = action.sleep;
        values[3] = action.money;
        values[4] = action.work;

        return values;


    }


}
