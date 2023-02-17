package com.codecool.mightytextadventure.logic;

import com.codecool.mightytextadventure.data.Level;
import com.codecool.mightytextadventure.ui.Display;
import com.codecool.mightytextadventure.ui.Input;
import com.codecool.mightytextadventure.data.Storyline;

public class Game {
    private final Level[] levels;
    private final Input input;
    private final Display display;

    private final StoryElement storyElement;

    public Game(Level[] levels, Input input, Display display, StoryElement storyElement) {
        this.levels = levels;
        this.input = input;
        this.display = display;
        this.storyElement = storyElement;
    }

    public void run() {
        boolean isRunning = true;
        while (isRunning) {
            isRunning = step();
        }
    }

    private boolean step() {
        Enum temp = (storyElement.getStoryElement());
        String item = String.valueOf(temp);
        if (item.equals("FENSTER") || item.equals("NIE")){
            display.printMessage(Storyline.OVER.getText());
            return false;
        }else {
            display.printMessage((Storyline.valueOf(item).getText()));
        }
        return true;
    }
}
