package org.academiadecodigo.bootcamp;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Player {
    private int life;
    private Picture picture;
    private boolean rightIndex = true;

    // CONSTRUCTOR//
    public Player() {
        life = 5;
        picture = new Picture(10, 10, "right.png");
        picture.draw();
    }

    //GETTERS//
    public int getLife() {
        return life;
    }

    //MOVES//
    public void moveRight() {
        if (picture.getMaxX() < 1000) {
            if (rightIndex) {
                picture.load("right.png");
                rightIndex = false;
            } else {
                picture.load("right1.png");
                rightIndex = true;
            }
            picture.translate(10, 0);
        }
    }

    public void moveLeft() {

        if (picture.getX() > 10) {
            if (rightIndex) {
                picture.load("left.png");
                rightIndex = false;
            } else {
                picture.load("left1.png");
                rightIndex = true;
            }
            picture.translate(-10, 0);
        }
    }


    public void moveUp() {

        if (picture.getY() > 10) {
            if (rightIndex) {
                picture.load("up.png");
                rightIndex = false;
            } else {
                picture.load("up1.png");
                rightIndex = true;
            }
            picture.translate(0, -10);
        }
    }

    public void moveDown() {

        if (picture.getMaxY() < 510) {
            if (rightIndex) {
                picture.load("down.png");
                rightIndex = false;
            } else {
                picture.load("down1.png");
                rightIndex = true;
            }
            picture.translate(0, 10);
        }
    }

    //MOVES DIAGONAL//
    public void moveLeftDown() {
        if (picture.getMaxY() < 510 && picture.getX() > 10) {
            picture.translate(-10, 10);
        }
    }


    public void moveRightDown() {
        if (picture.getMaxX() < 1000 && picture.getMaxY() < 510) {
            picture.translate(10, 10);
        }
    }


    public void moveLeftUp() {

        if (picture.getX() > 10 && picture.getY() > 10) {


            picture.translate(-10, -10);
        }
    }

    public void moveRightUp() {

        if (picture.getMaxX() < 1000 && picture.getY() > 10) {
            picture.translate(10, -10);
        }
    }
}
