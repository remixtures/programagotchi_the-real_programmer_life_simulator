package org.academiadecodigo.stringteasers.programmators.game;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.stringteasers.programmators.game.character.Character;

public class Game implements KeyboardHandler {

    private int menu;

    private Boolean isMenuUp;
    private Keyboard key;
    private GameLogic gameLogic;
    private Character character;
    private Rectangle healthBar;
    private Rectangle foodBar;
    private Rectangle sleepBar;
    private Rectangle workBar;


    public Game(){
        character = new Character();
        gameLogic = new GameLogic(character);
    }

    public void start() {

         key = new Keyboard(this);
         init();


    }


    private void init(){
        Picture background = new Picture(0 ,0 , "resources/programmatorSimulator.png");
        background.draw();

        healthBar = new Rectangle(27 , 100 , 320 , 20);
        foodBar = new Rectangle(27 , 130 , 320 , 20);
        sleepBar = new Rectangle(27 , 160 , 320 , 20);
        workBar = new Rectangle(27 , 190 , 0 , 20);

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
                KeyboardEvent.KEY_1,
                KeyboardEvent.KEY_2,
                KeyboardEvent.KEY_3,
                KeyboardEvent.KEY_4,
                KeyboardEvent.KEY_5,
                KeyboardEvent.KEY_6,
        };

        KeyboardEvent[] keyboardEvents = new KeyboardEvent[keys.length];


        for (int i = 0; i < keyboardEvents.length; i++){
            keyboardEvents[i] = new KeyboardEvent();
            keyboardEvents[i].setKey(keys[i]);
            keyboardEvents[i].setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
            key.addEventListener(keyboardEvents[i]);

        }

    }
    private void press2(){}
    private void press3(){}
    private void press4(){}




    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {


        switch (keyboardEvent.getKey()){

            case KeyboardEvent.KEY_Q:
                gameLogic.HealthMenu();
                break;
            case KeyboardEvent.KEY_W:
                gameLogic.hungerMenu();
                break;
            case KeyboardEvent.KEY_E:
                gameLogic.sleepMenu();
                break;
            case KeyboardEvent.KEY_R:
                gameLogic.workMenu();
                break;
            case KeyboardEvent.KEY_1:
                gameLogic.whichMenu(1);
                meterUpdate();
                break;
            case KeyboardEvent.KEY_2:
                gameLogic.whichMenu(2);
                meterUpdate();
                break;
            case KeyboardEvent.KEY_3:
                gameLogic.whichMenu(3);
                meterUpdate();
                break;
            case KeyboardEvent.KEY_4:
                gameLogic.whichMenu(4);
                meterUpdate();
                break;
            case KeyboardEvent.KEY_5:
                gameLogic.whichMenu(5);
                meterUpdate();
                break;
            case KeyboardEvent.KEY_6:
                gameLogic.whichMenu(6);
                meterUpdate();
                break;
        }



    }

    private void meterUpdate(){
        double pixel = 3.2;
        System.out.println("qwertyuiop");
        if(healthBar.getWidth() > (character.getHealth()*pixel)){
            reduce((healthBar.getWidth()-(character.getHealth()*pixel)), healthBar);

        }else if(healthBar.getWidth() < (character.getHealth()*pixel)){
            increase(((character.getHealth()*pixel)-healthBar.getWidth()), healthBar);

        }


    }

    private static void reduce(double x, Rectangle u) {
        int rectX = u.getX();
        u.grow(-x,0);
        u.translate(rectX - u.getX(),0);

    }

    private static void increase(double x, Rectangle u) {
        int rectX = u.getX();
        u.grow(x,0);
        u.translate(rectX - u.getX(),0);
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
