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


    private Keyboard key;
    private GameLogic gameLogic;
    private Character character;
    Text moneyText;

    Rectangle[] bars = new Rectangle[4];
    Text[] barText = new Text[4];



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

        bars[0] = new Rectangle(27 , 100 , 320 , 20);
        bars[1] = new Rectangle(27 , 130 , 320 , 20);
        bars[2] = new Rectangle(27 , 160 , 320 , 20);
        bars[3] = new Rectangle(27 , 190 , 0 , 20);

        barText[0] = new Text(30,102, "Health");
        barText[1] = new Text(30, 132, "Hunger");
        barText[2] = new Text(30,162, "Sleep");
        barText[3] = new Text(30, 192, "Work");

        moneyText = new Text(70, 78, String.valueOf(character.getMoney()));
        moneyText.grow(8,8);

        bars[0].setColor(Color.BLUE);
        bars[1].setColor(Color.BLUE);
        bars[2].setColor(Color.BLUE);
        bars[3].setColor(Color.BLUE);

        barText[0].setColor(Color.WHITE);
        barText[1].setColor(Color.WHITE);
        barText[2].setColor(Color.WHITE);
        barText[3].setColor(Color.WHITE);



        bars[0].fill();
        bars[1].fill();
        bars[2].fill();
        bars[3].fill();

        barText[0].draw();
        barText[1].draw();
        barText[2].draw();
        barText[3].draw();
        moneyText.draw();

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




    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        if (character.isDead()){
            Picture deadPic = new Picture(0,0,"resources/programmatorSimulator.png");
            deadPic.draw();
            return;
        }

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


    private void meterUpdate() {

        double pixel = 3.2;

        //System.out.println("before: " + healthBar.getWidth() + "   " + character.getHealth() * pixel);

        for (int i = 0; i < bars.length; i++) {
            if (bars[i].getWidth() != (type(i) * 3.2)) {

                double a = bars[i].getY();
                double t = barText[i].getY();
                System.out.println(a);
                bars[i].delete();
                bars[i] = new Rectangle(27, a, type(i)* pixel, 20);
                bars[i].setColor(Color.BLUE);
                bars[i].fill();
                barText[i] = new Text(30, t, stringtype(i));
                barText[i].setColor(Color.WHITE);
                barText[i].draw();

            }
        }
        moneyText.delete();
        moneyText = new Text(70, 78, String.valueOf(character.getMoney()));
        moneyText.grow(8,8);
        moneyText.draw();
    }


    private String stringtype(int type) {

        switch (type) {
            case 0:
                return "Health";

            case 1:
                return "Hunger";

            case 2:
                return "Sleep";

            default:
                return "Work";
        }

    }
    private int type(int type) {

        switch (type) {
            case 0:
                return character.getHealth();

            case 1:
                return character.getHunger();

            case 2:
                return character.getSleep();

            default:
                return character.getWork();
        }

    }



    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
