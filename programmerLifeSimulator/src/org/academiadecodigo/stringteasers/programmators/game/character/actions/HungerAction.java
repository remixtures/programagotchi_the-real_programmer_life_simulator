package org.academiadecodigo.stringteasers.programmators.game.character.actions;

public enum HungerAction {

    APPLE(3, 0, 5, 2),
    TRASH(5, 0, -10, 0),
    JUNKFOOD(10, 0, -5, 5),
    SALAD(8, 0, 10, 7),
    RESTAURANT(15, 0, 5, 15),
    COFFEE(0, 5, -4, 3),
    SLEEPPILL(0, 15, -10, 20);


    private int eat;
    private int sleep;
    private int health;
    private int money;

    HungerAction(int eat, int sleep, int health, int money) {

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

            case APPLE:
                return "1. Eat an apple.";

            case TRASH:
                return "2. Pick food from the trash can.";

            case JUNKFOOD:
                return "3. Go out to eat at a junk food outlet";

            case SALAD:
                return "4. Eat a salad.";

            case RESTAURANT:
                return "5. Go out to eat at a restaurant.";

            case COFFEE:
                return "6. Drink a cup of coffee.";

            default:
                return "7. Take a sleeping pill.";

        }

    }
}
