package org.academiadecodigo.stringteasers.programmators.game.character.actions;

public enum SleepActions {

    UNDER_THE_BRIDGE(-5, 30, -10, 0),
    ON_THE_ACADEMY(-5, 30, 0, 0),
    IN_MY_ROOM(-5, 50, 5 , 0),
    HOSTEL(-5, 70, 5, 30),
    HOTEL(0, 70, 10, 50);




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
    public int[] toArray (SleepActions action){

        int[] values = new int[4];

        values[0] = action.health;
        values[1] = action.eat;
        values[2] = action.sleep;
        values[3] = action.money;

        return values;


    }

}
