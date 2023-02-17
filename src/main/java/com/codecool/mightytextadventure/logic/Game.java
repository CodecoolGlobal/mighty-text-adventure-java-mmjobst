package com.codecool.mightytextadventure.logic;

import com.codecool.mightytextadventure.data.Storyline;
import com.codecool.mightytextadventure.ui.Display;

public class Game {
    private final Display display;

    private final StoryElement storyElement;
    int knowledge = 0;

    public Game(Display display, StoryElement storyElement) {
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
        knowledge += 1;
        Enum temp = (storyElement.getStoryElement());
        String item = String.valueOf(temp);
        if (item.equals("OVER")) {
            display.printMessage((Storyline.LINE.getText()));
            display.printMessage((Storyline.OVER.getText()));
            return false;
        } else if (item.equals("WISSEN")) {
            display.printMessage((Storyline.LINE.getText()));
            display.printMessage((Storyline.WISSEN.getText()) + knowledge);
        } else if (item.equals("HINAUF")) {
            display.printMessage((Storyline.LINE.getText()));
            display.printMessage(Storyline.HINAUF.getText() + "Deine momentanen Wissenspunkte: " + knowledge);
            if (knowledge >= 15) {
                display.printMessage((Storyline.LINE.getText()));
                display.printMessage(Storyline.WIN.getText());
                return false;
            } else {
                display.printMessage((Storyline.LINE.getText()));
                display.printMessage(Storyline.NOTYET.getText());
            }
        } else {
            display.printMessage((Storyline.LINE.getText()));
            display.printMessage((Storyline.valueOf(item).getText()));
        }
        return true;
    }
}
