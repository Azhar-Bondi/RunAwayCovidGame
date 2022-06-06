package org.academiadecodigo.bootcamp;


import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        Canvas canvas = new Canvas();
        Player p1 = new Player();
        KeyboardLogic keyboardLogic = new KeyboardLogic(p1);
        keyboardLogic.init();
    }
}
