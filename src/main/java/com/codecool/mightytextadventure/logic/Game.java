package com.codecool.mightytextadventure.logic;

import com.codecool.mightytextadventure.data.Level;
import com.codecool.mightytextadventure.data.Storyline;
import com.codecool.mightytextadventure.data.Actions;
import com.codecool.mightytextadventure.ui.Display;
import com.codecool.mightytextadventure.ui.Input;

public class Game {
    private final Level[] levels;
    private final Input input;
    private final Display display;

    public Game(Level[] levels, Input input, Display display) {
        this.levels = levels;
        this.input = input;
        this.display = display;
    }

    public void run() {
        boolean isRunning = true;
        while (isRunning) {
            isRunning = step();
        }
    }

    private boolean step() {
        String inputFromUser = input.getInputFromUser(Storyline.HELLO.getText());
        System.out.println(inputFromUser + ", " + Storyline.AUFWACHEN.getText());

        String actionFromUser = input.getActionFromUser();
        actionFromUser = actionFromUser.toUpperCase();

        ActionManager actionManager = new ActionManager();
        boolean b = actionManager.actionValidator(actionFromUser);
        System.out.println("boolean: " + b);

        return true;
    }
}
