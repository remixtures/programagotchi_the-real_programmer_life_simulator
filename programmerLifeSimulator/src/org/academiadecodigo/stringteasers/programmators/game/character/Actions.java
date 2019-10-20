package org.academiadecodigo.stringteasers.programmators.game.character;

import org.academiadecodigo.stringteasers.programmators.game.character.actions.HungerAction;
import org.academiadecodigo.stringteasers.programmators.game.character.actions.SleepActions;

public class Actions {

    public static HungerAction hungerAction(HungerAction action) {


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


    public static int[] sleepAction(SleepActions action) {

        int[] values;
        switch(action) {

            case UNDER_THE_BRIDGE:
                values = action.toArray(SleepActions.UNDER_THE_BRIDGE);
                break;

            case ON_THE_ACADEMY:
                values = action.toArray(SleepActions.ON_THE_ACADEMY);
                break;

            case IN_MY_ROOM:
                values = action.toArray(SleepActions.IN_MY_ROOM);
                break;

            //default:
              //  values = action.toArray(HungerAction.JUNKFOOD);

        }

        return null;
    }


    public static int[] healthAction(HungerAction action) {

        int[] values;
        switch(action) {

            case TRASH:
                values = action.toArray(HungerAction.TRASH);
                break;

            case SALAD:
                values = action.toArray(HungerAction.SALAD);
                break;

            case APPLE:
                values = action.toArray(HungerAction.APPLE);
                break;
            default:
                values = action.toArray(HungerAction.JUNKFOOD);

        }

        return values;
    }


    public static int[] workAction(HungerAction action) {

        int[] values;
        switch(action) {

            case TRASH:
                values = action.toArray(HungerAction.TRASH);
                break;

            case SALAD:
                values = action.toArray(HungerAction.SALAD);
                break;

            case APPLE:
                values = action.toArray(HungerAction.APPLE);
                break;
            default:
                values = action.toArray(HungerAction.JUNKFOOD);

        }

        return values;
    }








}
