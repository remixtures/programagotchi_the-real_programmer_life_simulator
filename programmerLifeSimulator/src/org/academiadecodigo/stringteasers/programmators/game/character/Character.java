package org.academiadecodigo.stringteasers.programmators.game.character;

import org.academiadecodigo.stringteasers.programmators.game.character.actions.HealthAction;
import org.academiadecodigo.stringteasers.programmators.game.character.actions.HungerAction;
import org.academiadecodigo.stringteasers.programmators.game.character.actions.SleepActions;
import org.academiadecodigo.stringteasers.programmators.game.character.actions.WorkAction;

public class Character {

    private int money;
    private int health;
    private int hunger;
    private int work;
    private int sleep;
    private boolean dead;

    public Character() {

        money = 50;
        health = 100;
        hunger = 100;
        sleep = 100;
        work = 0;
        dead = false;

    }

    public void goWork(WorkAction workAction){

        for (WorkAction action: WorkAction.values()) {

            if (action.equals(workAction)){

                money+=workAction.getMoney();
                health+=workAction.getHealth();
                hunger+=workAction.getEat();
                sleep+=workAction.getSleep();
                work+=workAction.getWork();
            }

        }
    }

    public void goSleep(SleepActions sleepActions){

        for (SleepActions action: SleepActions.values()) {

            if (action.equals(sleepActions)){

                money+=sleepActions.getMoney();
                health+=sleepActions.getHealth();
                hunger+=sleepActions.getEat();
                sleep+=sleepActions.getSleep();
            }

        }

    }

    public void goHealthy(HealthAction healthAction) {

        for (HealthAction action: HealthAction.values()) {

            if (action.equals(healthAction)){

                health+=healthAction.getHealth();
                money+=healthAction.getMoney();
                hunger+=healthAction.getEat();
                sleep+=healthAction.getSleep();
            }

        }

    }

    public void goEat(HungerAction eat) {
    }

    public int getMoney() {
        return money;
    }

    public int getHealth() {
        return health;
    }

    public int getHunger() {
        return hunger;
    }

    public int getWork() {
        return work;
    }

    public int getSleep() {

        return sleep;
    }







}
