package org.academiadecodigo.stringteasers.programmators.game.character;

public class Character {

    private int money;
    private int health;
    private int food;
    private int work;
    private boolean dead;

    public Character() {

        money = 50;
        health = 100;
        food = 100;
        work = 0;
        dead = false;

    }

    public int getMoney() {
        return money;
    }

    public int getHealth() {
        return health;
    }

    public int getFood() {
        return food;
    }

    public int getWork() {
        return work;
    }

    public void setHealth(int health, int food) {

        this.health = health;

        if (health == 0) {
            dead = true;
        }
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setWork(int work) {
        this.work = work;
    }

}
