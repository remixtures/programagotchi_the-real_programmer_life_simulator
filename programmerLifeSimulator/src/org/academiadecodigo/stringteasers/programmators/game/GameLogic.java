package org.academiadecodigo.stringteasers.programmators.game;
import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.stringteasers.programmators.game.character.Character;
import org.academiadecodigo.stringteasers.programmators.game.character.actions.HealthAction;
import org.academiadecodigo.stringteasers.programmators.game.character.actions.HungerAction;
import org.academiadecodigo.stringteasers.programmators.game.character.actions.SleepActions;
import org.academiadecodigo.stringteasers.programmators.game.character.actions.WorkAction;


public class GameLogic {

    public static Boolean isMenuUp = false;
    private static int x;
    private static int add;
    private static Text[] actions;
    private static int currentMenu;
    private Character character;

    public GameLogic(Character character){
        isMenuUp = false;
        x = 260;
        add = 25;
        actions = new Text[10];
        this.character = character;
    }

    static void HealthMenu(){

        if(!isMenuUp) {
            currentMenu = 1;
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
            currentMenu = 2;
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
            currentMenu = 3;
            for (int i = 0; i < SleepActions.values().length; i++) {

                actions[i] = new Text(60, (x + add*i), SleepActions.values()[i].toString());
                actions[i].grow(10, 7);
                actions[i].draw();
            }
            isMenuUp = true;
            return;
        }

        clear();
        currentMenu = 0;
        isMenuUp = false;
    }

    static void workMenu(){

        if(!isMenuUp) {
            currentMenu = 4;
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
        int i = 0   ;
        currentMenu = 0;
        while(actions[i] != null) {
            actions[i].delete();
            i++;
        }
    }


    public void whichMenu(int key) {

        switch (currentMenu){
            case 0:
                return;
            case 1:
                if (HealthAction.values().length > key){
                    System.out.println("Health");
                    System.out.println(character.getHealth());
                    character.goHealthy(HealthAction.values()[key-1]);

                }
                break;
            case 2:
                if (HungerAction.values().length > key){
                    System.out.println("Hunger");
                    System.out.println(character.getHealth());
                    character.goEat(HungerAction.values()[key-1]);
                    System.out.println(character.getHealth());
                }
                break;
            case 3:
                if (SleepActions.values().length > key){
                    System.out.println("Sleep");
                    character.goSleep(SleepActions.values()[key-1]);
                }
                break;
            case 4:
                if (WorkAction.values().length > key){
                    System.out.println("Work option: " + WorkAction.values()[key-1]);
                    character.goWork(WorkAction.values()[key-1]);
                    System.out.println(character.getMoney());
                    System.out.println(character.getWork());
                }
                break;
        }


    }



}
