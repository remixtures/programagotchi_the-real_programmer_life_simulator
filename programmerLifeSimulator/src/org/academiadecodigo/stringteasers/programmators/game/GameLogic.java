package org.academiadecodigo.stringteasers.programmators.game;

import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.stringteasers.programmators.game.character.actions.HealthAction;
import org.academiadecodigo.stringteasers.programmators.game.character.actions.HungerAction;
import org.academiadecodigo.stringteasers.programmators.game.character.actions.SleepActions;
import org.academiadecodigo.stringteasers.programmators.game.character.actions.WorkAction;


public class GameLogic {

    public static Boolean isMenuUp = false;
    private static int x = 260;
    private static int add = 25;
    private static Text[] actions = new Text[10];


    static void HealthMenu(){

        if(!isMenuUp) {

            for (int i = 0; i < HealthAction.values().length; i++) {

                actions[i] = new Text(60, (x + add*i), HealthAction.values()[i].toString());
                actions[i].grow(10, 7);
                actions[i].draw();
            }
            isMenuUp = true;
            return;
        }

        clear();
        isMenuUp = false;
    }

    static void hungerMenu(){

        if(!isMenuUp) {

            for (int i = 0; i < HungerAction.values().length; i++) {

                actions[i] = new Text(60, (x + add*i), HungerAction.values()[i].toString());
                actions[i].grow(10, 7);
                actions[i].draw();
            }
            isMenuUp = true;
            return;
        }

        clear();
        isMenuUp = false;
    }

    static void sleepMenu(){

        if(!isMenuUp) {

            for (int i = 0; i < SleepActions.values().length; i++) {

                actions[i] = new Text(60, (x + add*i), SleepActions.values()[i].toString());
                actions[i].grow(10, 7);
                actions[i].draw();
            }
            isMenuUp = true;
            return;
        }

        clear();
        isMenuUp = false;
    }

    static void workMenu(){

        if(!isMenuUp) {

            for (int i = 0; i < WorkAction.values().length; i++) {

                actions[i] = new Text(60, (x + add*i), WorkAction.values()[i].toString());
                actions[i].grow(10, 7);
                actions[i].draw();
            }
            isMenuUp = true;
            return;
        }

        clear();
        isMenuUp = false;
    }

    private static void clear(){
        int i = 0;
        while(actions[i] != null) {
            actions[i].delete();
            i++;
        }
    }

}
