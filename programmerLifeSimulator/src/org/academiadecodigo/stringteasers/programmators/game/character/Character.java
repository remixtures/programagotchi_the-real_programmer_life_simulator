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

                setValues( workAction.getHealth() , workAction.getSleep() , workAction.getEat(), workAction.getMoney() , workAction.getWork());

            }

        }
    }

    public void goSleep(SleepActions sleepActions){

        for (SleepActions action: SleepActions.values()) {

            if (action.equals(sleepActions)){

                setValues( sleepActions.getHealth() ,sleepActions.getSleep() , sleepActions.getEat(), sleepActions.getMoney(), 0);
            }

        }

    }

    public void goHealthy(HealthAction healthAction) {

        for (HealthAction action: HealthAction.values()) {

            if (action.equals(healthAction)){

                setValues( healthAction.getHealth() , healthAction.getMoney() , healthAction.getEat(),healthAction.getSleep() , 0 );

            }

        }
        isDead();

    }

    public void goEat(HungerAction eat) {

        for (HungerAction action: HungerAction.values()) {

            if (action.equals(eat)){

                setValues( eat.getHealth() ,eat.getSleep()  , eat.getEat(), eat.getMoney() , 0 );

            }

        }
        isDead();


    }

    private void setValues(int health , int sleep , int hunger , int money, int work){
        if (isDead()){
            return;
        }
        this.health = (this.health+health) > 100 ? 100 : this.health+health;
        this.sleep = (this.sleep+sleep) > 100 ? 100 : this.sleep+sleep;
        this.hunger = (this.hunger+hunger) > 100 ? 100 : this.hunger+hunger;
        this.money += money;
        this.work = (this.work+work) >= 100 ?  0 : this.work+work;
        if(work != 0 && this.work == 0){
            this.money += 100;
        }
        isDead();
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

