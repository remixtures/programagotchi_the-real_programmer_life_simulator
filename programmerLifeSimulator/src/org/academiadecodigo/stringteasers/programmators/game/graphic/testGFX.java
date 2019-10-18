package org.academiadecodigo.stringteasers.programmators.game.graphic;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class testGFX  {

    public static void main(String[] args) throws Exception{

        Rectangle rectangle = new Rectangle(10, 10, 375, 600);
        rectangle.setColor(new Color(200,200,200));
        rectangle.fill();

        Rectangle life = new Rectangle(40, 40, 315 , 30);
        life.fill();

        Rectangle Food = new Rectangle(40, 80, 315 , 30);
        Food.fill();

        Rectangle Work = new Rectangle(40, 120, 315 , 30);
        Work.fill();

        Rectangle sleep = new Rectangle(40, 160, 315 , 30);
        sleep.fill();

        Rectangle life1 = new Rectangle(40, 40, 315 , 30);
        life1.setColor(Color.GREEN);
        life1.fill();


        Rectangle Food2 = new Rectangle(40, 80, 315 , 30);
        Food2.setColor(Color.YELLOW);
        Food2.fill();

        Rectangle Work3 = new Rectangle(40, 120, 315 , 30);
        Work3.setColor(Color.RED);
        Work3.fill();

        Rectangle sleep4 = new Rectangle(40, 160, 315 , 30);
        sleep4.setColor(Color.BLUE);
        sleep4.fill();

        Rectangle action1 =new Rectangle(57, 550, 40, 40);
        action1.draw();

        Rectangle action2 =new Rectangle(137, 550, 40, 40);
        action2.draw();

        Rectangle action3 =new Rectangle(217, 550, 40, 40);
        action3.draw();

        Rectangle action4 =new Rectangle(297, 550, 40, 40);
        action4.draw();

        Rectangle textBox = new Rectangle(40,200, 315, 340 );
        textBox.draw();


        Thread.sleep(1000);

        reduce(-40,sleep4);

        Thread.sleep(1000);
       increase(40, sleep4);
    }


    private static void reduce(double x, Rectangle u) {

        u.grow(x,0);
        u.translate(-x-u.getX(),0);

    }

    private static void increase(double x, Rectangle u) {

        u.grow(40,0);
        u.translate(u.getX()+40,0);
    }


}
