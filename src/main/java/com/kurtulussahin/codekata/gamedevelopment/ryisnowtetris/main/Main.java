package com.kurtulussahin.codekata.gamedevelopment.ryisnowtetris.main;

import javax.swing.*;

public class Main {

    public static void main(String[] args){

        JFrame window = new JFrame(("Simple tetris"));
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);

        GamePanel gp = new GamePanel();
        window.add(gp);
        window.pack();
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}
