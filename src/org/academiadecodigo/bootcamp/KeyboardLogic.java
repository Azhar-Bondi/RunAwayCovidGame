package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.Player;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class KeyboardLogic implements KeyboardHandler {
    private Keyboard keyboard;
    private Player player;
    private KeyboardEvent up, down, left, right, rightR, leftR, upR, downR;
    boolean upPressed = false;
    boolean downPressed = false;
    boolean leftPressed = false;
    boolean rightPressed = false;

    //CONSTRUCTOR//
    public KeyboardLogic(Player player) {
        this.player = player;
        keyboard = new Keyboard(this);
        init();
    }
    //SETTERS AND GETTERS//

    public void setPlayer(Player player) {
        this.player = player;
    }

    //METHODS//
    public void init() {
        keyboard = new Keyboard(this);

        this.right = new KeyboardEvent();
        right.setKey(KeyboardEvent.KEY_RIGHT);
        right.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        this.left = new KeyboardEvent();
        left.setKey(KeyboardEvent.KEY_LEFT);
        left.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        this.up = new KeyboardEvent();
        up.setKey(KeyboardEvent.KEY_UP);
        up.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        this.down = new KeyboardEvent();
        down.setKey(KeyboardEvent.KEY_DOWN);
        down.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        this.rightR = new KeyboardEvent();
        rightR.setKey(KeyboardEvent.KEY_RIGHT);
        rightR.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);

        this.leftR = new KeyboardEvent();
        leftR.setKey(KeyboardEvent.KEY_LEFT);
        leftR.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);

        this.upR = new KeyboardEvent();
        upR.setKey(KeyboardEvent.KEY_UP);
        upR.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);

        this.downR = new KeyboardEvent();
        downR.setKey(KeyboardEvent.KEY_DOWN);
        downR.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);

        keyboard.addEventListener(right);
        keyboard.addEventListener(left);
        keyboard.addEventListener(up);
        keyboard.addEventListener(down);
        keyboard.addEventListener(rightR);
        keyboard.addEventListener(leftR);
        keyboard.addEventListener(upR);
        keyboard.addEventListener(downR);
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        if (upPressed) {
            player.moveUp();
            // upPressed=false;
        }
        if (downPressed) {
            player.moveDown();
            //downPressed=false;
        }
        if (leftPressed) {
            player.moveLeft();
            //leftPressed=false;
        }
        if (rightPressed) {
            player.moveRight();
            //rightPressed=false;
        }
        if (downPressed == false && keyboardEvent.getKey() == KeyboardEvent.KEY_DOWN) {
            downPressed = true;
            System.out.println(downPressed);
        }
        if (upPressed == false && keyboardEvent.getKey() == KeyboardEvent.KEY_UP) {
            upPressed = true;
            System.out.println(upPressed);
        }
        if (leftPressed == false && keyboardEvent.getKey() == KeyboardEvent.KEY_LEFT) {
            leftPressed = true;
            System.out.println(leftPressed);
        }
        if (rightPressed == false && keyboardEvent.getKey() == KeyboardEvent.KEY_RIGHT) {
            rightPressed = true;
            System.out.println(rightPressed);
        }
        if (upPressed && leftPressed) {
            player.moveLeftUp();
            //upPressed = false;
            //leftPressed = false;
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {
        if (downPressed == true && keyboardEvent.getKey() == KeyboardEvent.KEY_DOWN) {
            downPressed = false;
            System.out.println(downPressed);
        }
        if (upPressed == true && keyboardEvent.getKey() == KeyboardEvent.KEY_UP) {
            upPressed = false;
            System.out.println(upPressed);
        }
        if (leftPressed == true && keyboardEvent.getKey() == KeyboardEvent.KEY_LEFT) {
            leftPressed = false;
            System.out.println(leftPressed);
        }
        if (rightPressed == true && keyboardEvent.getKey() == KeyboardEvent.KEY_RIGHT) {
            rightPressed = false;
            System.out.println(rightPressed);
        }
    }
}
