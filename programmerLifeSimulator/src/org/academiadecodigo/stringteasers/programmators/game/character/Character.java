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


    /**
     * needs tinkering
     * @param action
     */
    public void hungerEffects( HungerAction action) {

        switch(action) {

            case TRASH:
                return HungerAction.TRASH;

            case SALAD:
                return HungerAction.SALAD;

            case APPLE:
                return HungerAction.APPLE;

            default:
                return HungerAction.JUNKFOOD;

        }

    }

    /**
     * aux method to effects methods
      * @param effects
     */
    public void addEffects(int[] effects){

        if(noMoney(effects[3])){
            return;
        }

        effects[0] += health;
        effects[1] += hunger;
        effects[2] += sleep;
        effects[3] += money;
        capped();
        jobsDone();
        hungerSleepDeprivation();

    }


    private Boolean noMoney(int money) {
        if((money + this.money)<0){
            return true;
        }
        return false;
    }

    private void capped() {

        if(health > 100) {
            health = 100;
        }
        if(health <= 0){
            dead = false;
        }
        if (hunger > 100){
            hunger = 100;
        }
        if(hunger < 0){
            hunger = 0;
        }
        if(sleep > 100){
            sleep = 100;
        }
        if (sleep < 0){
            sleep = 0;
        }
    }


    private void jobsDone() {

        if(work >= 100){
            work = 0;
            money = 25+((int)Math.random()*100);
        }
    }


    private void hungerSleepDeprivation() {

        if(hunger == 0){
            health -= 10;
        }
        if(sleep == 0){
            health -= 10;
        }
    }

}
