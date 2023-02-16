package com.codecool.mightytextadventure.logic;

import com.codecool.mightytextadventure.data.Level;
import com.codecool.mightytextadventure.data.Storyline;
import com.codecool.mightytextadventure.data.Storyline;
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

    int knowledge = 0;

    private boolean step() {
//        display.printMessage(Storyline.HELLO.getText());
        String inputFromUser = input.getInputFromUser().toUpperCase();
//        if display.printMessage(inputFromUser + ", " + Storyline.AUFWACHEN.getText());
//        inputFromUser = input.getInputFromUser().toUpperCase();
        if (inputFromUser.equals(Storyline.REDEN.toString())) {
            display.printMessage(Storyline.REDEN.getText());
            knowledge += 1;
        }

        public class storyElement(String StorylineElement){

                    if (inputFromUser.equals(Storyline.MARTIN.toString())) {
                display.printMessage(Storyline.MARTIN.getText());
                knowledge += 1;
            }
        }
        if (inputFromUser.equals(Storyline.MARTIN.toString())) {
            display.printMessage(Storyline.MARTIN.getText());
            knowledge += 1;
        }
        if (inputFromUser.equals(Storyline.EMAD.toString())) {
            display.printMessage(Storyline.EMAD.getText());
            knowledge += 1;
        }
        if (inputFromUser.equals(Storyline.SELBST.toString())) {
            display.printMessage(Storyline.SELBST.getText());
        }
        if (inputFromUser.equals(Storyline.MITSTUDIERENDE.toString())) {
            display.printMessage(Storyline.MITSTUDIERENDE.getText());
        }
        if (inputFromUser.equals(Storyline.UMSCHAUEN.toString())) {
            display.printMessage(Storyline.UMSCHAUEN.getText());
        }
        if (inputFromUser.equals(Storyline.INNOLAB.toString())) {
            display.printMessage(Storyline.INNOLAB.getText());
        }
        if (inputFromUser.equals("FENSTER") || inputFromUser.equals("NIE")) {
            display.printMessage(Storyline.OVER.getText());
            return false;
        }
        if (inputFromUser.equals("SOFA") || inputFromUser.equals("BETT")) {
            display.printMessage(Storyline.SOFA.getText());
        }
        if (inputFromUser.equals(Storyline.INNOLAB.toString())) {
            display.printMessage(Storyline.INNOLAB.getText());
        }

        return true;
    }
}
