package org.academiadecodigo.stringteasers.programmators.game;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Game implements KeyboardHandler {

    private int menu;
    private Boolean isMenuUp;
    private Keyboard key;


    public void start() {

         key = new Keyboard(this);
         init();


    }


    private void init(){
        Picture background = new Picture(0 ,0 , "resources/programmatorSimulator.png");
        background.draw();

        Rectangle healthBar = new Rectangle(27 , 100 , 320 , 20);
        Rectangle foodBar = new Rectangle(27 , 130 , 320 , 20);
        Rectangle sleepBar = new Rectangle(27 , 160 , 320 , 20);
        Rectangle workBar = new Rectangle(27 , 190 , 0 , 20);

        Text healthText = new Text(30,102, "Health");
        Text foodText = new Text(30, 132, "Hunger");
        Text sleepText = new Text(30,162, "Sleep");
        Text workText = new Text(30, 192, "Work");

        healthBar.setColor(Color.BLUE);
        foodBar.setColor(Color.BLUE);
        sleepBar.setColor(Color.BLUE);
        workBar.setColor(Color.BLUE);

        healthText.setColor(Color.WHITE);
        foodText.setColor(Color.WHITE);
        sleepText.setColor(Color.WHITE);
        workText.setColor(Color.WHITE);


        healthBar.fill();
        foodBar.fill();
        sleepBar.fill();
        workBar.fill();

        healthText.draw();
        foodText.draw();
        sleepText.draw();
        workText.draw();

        keyboardInit();
    }

    private void keyboardInit(){


        int[] keys = {

                KeyboardEvent.KEY_Q,
                KeyboardEvent.KEY_W,
                KeyboardEvent.KEY_E,
                KeyboardEvent.KEY_R,
                KeyboardEvent.KEY_T,
                KeyboardEvent.KEY_Y
        };

        KeyboardEvent[] keyboardEvents = new KeyboardEvent[keys.length];


        for (int i = 0; i < keyboardEvents.length; i++){
            keyboardEvents[i] = new KeyboardEvent();
            keyboardEvents[i].setKey(keys[i]);
            keyboardEvents[i].setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
            key.addEventListener(keyboardEvents[i]);
        }

    }




    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        switch (keyboardEvent.getKey()){

            case KeyboardEvent.KEY_Q:
                GameLogic.HealthMenu();
                break;
            case KeyboardEvent.KEY_W:

                break;
            case KeyboardEvent.KEY_E:

                break;
            case KeyboardEvent.KEY_R:

                break;
            case KeyboardEvent.KEY_T:

                break;
            case KeyboardEvent.KEY_Y:

                break;

        }

    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
