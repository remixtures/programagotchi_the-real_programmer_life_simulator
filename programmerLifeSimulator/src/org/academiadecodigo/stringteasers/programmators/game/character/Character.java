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

        if (workAction != WorkAction.BEG){

        }

        for (WorkAction action: WorkAction.values()) {

            if (action.equals(workAction)){

                setValues( workAction.getHealth() , workAction.getMoney() , workAction.getEat(), workAction.getSleep() );
                work+=workAction.getWork();
            }

        }
    }

    public void goSleep(SleepActions sleepActions){

        for (SleepActions action: SleepActions.values()) {

            if (action.equals(sleepActions)){

                setValues( sleepActions.getHealth() , sleepActions.getMoney() , sleepActions.getEat(),sleepActions.getSleep() );
            }

        }

    }

    public void goHealthy(HealthAction healthAction) {

        for (HealthAction action: HealthAction.values()) {

            if (action.equals(healthAction)){

                setValues( healthAction.getHealth() , healthAction.getMoney() , healthAction.getEat(),healthAction.getSleep() );

            }

        }

    }

    public void goEat(HungerAction eat) {

        for (HealthAction action: HealthAction.values()) {

            if (action.equals(eat)){

                setValues( eat.getHealth() , eat.getMoney() , eat.getEat(), eat.getSleep() );

            }

        }


    }

    private void setValues(int health , int sleep , int hunger , int money){

        this.health += health;
        this.sleep += sleep;
        this.hunger += hunger;
        this.money += money;
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

    public boolean isDead() {
        return dead;
    }

    public int getSleep() {
        return sleep;
    }


}

