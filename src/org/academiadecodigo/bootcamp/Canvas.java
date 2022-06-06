package org.academiadecodigo.bootcamp;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Canvas {

    private Rectangle canvas;
    private int width;
    private int height;

    public Canvas (){
        canvas = new Rectangle(10,10,1000,500);
        canvas.setColor(Color.BLACK);
        canvas.draw();
    }

}
