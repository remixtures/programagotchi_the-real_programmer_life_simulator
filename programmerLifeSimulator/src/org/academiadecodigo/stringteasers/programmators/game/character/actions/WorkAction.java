package org.academiadecodigo.stringteasers.programmators.game.character.actions;

public enum WorkAction {

    BEG(0, -5, -10, 5, 0),
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

    public int getWork() {
        return work;
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

            case BEG:
                return "1. Ask for money in the streets.";

            case LIGHT_PROGRAMMING:
                return "2. Do some light programming.";

            case WORKDAY:
                return "3. Normal workday.";

            case OVERTIME:
                return "4. Work overtime.";

            default:
                return "5. Pull an all-nighter.";

        }
    }

}
