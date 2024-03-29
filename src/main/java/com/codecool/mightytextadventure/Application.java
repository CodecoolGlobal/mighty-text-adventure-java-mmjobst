package com.codecool.mightytextadventure;

import com.codecool.mightytextadventure.data.Level;
import com.codecool.mightytextadventure.data.Storyline;
import com.codecool.mightytextadventure.logic.Game;
import com.codecool.mightytextadventure.logic.StoryElement;
import com.codecool.mightytextadventure.ui.Display;
import com.codecool.mightytextadventure.ui.Input;

public class Application {
    public static void main(String[] args) {

        Display display = new Display();
        Input input = new Input();
        StoryElement storyElement = new StoryElement();
        displayWelcomeMessage(display, input);

        Game game = new Game(display, storyElement);
        game.run();
        display.printMessage((Storyline.LINE.getText()));
        display.printMessage((Storyline.LINE.getText()));
        display.printMessage("ENDE - WIR HOFFEN ES HAT EUCH GEFALLEN!");
        display.printMessage((Storyline.LINE.getText()));
        display.printMessage((Storyline.LINE.getText()));
    }

    private static void displayWelcomeMessage(Display display, Input input) {
        display.printMessage((Storyline.LINE.getText()));
        display.printMessage(Storyline.HELLO.getText());
        String inputFromUser = input.getInputFromUser();
        display.printMessage((Storyline.LINE.getText()));
        display.printMessage(inputFromUser + Storyline.AUFWACHEN.getText());
    }

    private static Level[] loadAreas() {
        Level[] levels = new Level[7];
        levels[0] = new Level("Start room");
        levels[1] = new Level("Room 1");
        levels[2] = new Level("Room 2");
        levels[3] = new Level("Room 3");
        levels[4] = new Level("Room 4");
        levels[5] = new Level("Room 5");
        levels[6] = new Level("Room 6");
        return levels;
    }
}
