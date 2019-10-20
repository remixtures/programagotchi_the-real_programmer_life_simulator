package org.academiadecodigo.stringteasers.programmators.game.character;

import org.academiadecodigo.stringteasers.programmators.game.character.actions.HungerAction;

public class Actions {

    public static int[] hungerAction(HungerAction action) {

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
