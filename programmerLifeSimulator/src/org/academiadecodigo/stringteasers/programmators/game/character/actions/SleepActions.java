package org.academiadecodigo.stringteasers.programmators.game.character.actions;

public enum SleepActions{

    UNDER_THE_BRIDGE(-5, 30, -10, 0),
    ON_THE_ACADEMY(-5, 30, 0, 0),
    IN_MY_ROOM(-5, 50, 5 , 0),
    HOSTEL(-5, 70, 5, -30),
    HOTEL(0, 70, 10, -50);




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


    public int getHealth() {
        return health;
    }

    public int getMoney() {
        return money;
    }

    public int getEat() {
        return eat;
    }

    public int getSleep() {
        return sleep;
    }

    @Override
    public String toString() {

        switch (this) {

            case UNDER_THE_BRIDGE:
                return "1. Spend the night under a bridge.";

            case IN_MY_ROOM:
                return "3. Sleep in your bed at home.";

            case HOSTEL:
                return "4. Stay at a hostel.";

            case HOTEL:
                return "5. Stay at a hotel.";

            default:
                return "2. Take a nap in the academy.";

        }
    }
}
