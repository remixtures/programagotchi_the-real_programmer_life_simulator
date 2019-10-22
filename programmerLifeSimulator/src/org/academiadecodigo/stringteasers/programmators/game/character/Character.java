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

        money = 10;
        health = 100;
        hunger = 100;
        sleep = 100;
        work = 0;

        dead = false;

    }

    public void goWork(WorkAction workAction){

        for (WorkAction action: WorkAction.values()) {

            if (action.equals(workAction)){

                setValues( workAction.getHealth() , workAction.getSleep() , workAction.getEat(), workAction.getMoney() );
                work+=workAction.getWork();
            }

        }
    }

    public void goSleep(SleepActions sleepActions){

        for (SleepActions action: SleepActions.values()) {

            if (action.equals(sleepActions)){

                setValues( sleepActions.getHealth() ,sleepActions.getSleep() , sleepActions.getEat(), sleepActions.getMoney());
            }

        }

    }

    public void goHealthy(HealthAction healthAction) {

        for (HealthAction action: HealthAction.values()) {

            if (action.equals(healthAction)){

                setValues( healthAction.getHealth() , healthAction.getMoney() , healthAction.getEat(),healthAction.getSleep() );

            }

        }
        isDead();

    }

    public void goEat(HungerAction eat) {

        for (HungerAction action: HungerAction.values()) {

            if (action.equals(eat)){

                setValues( eat.getHealth() ,eat.getSleep()  , eat.getEat(), eat.getMoney() );

            }

        }
        isDead();


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
        if (health <= 0){
            dead = true;
        }
        return dead;
    }

    public int getSleep() {
        return sleep;
    }


}

