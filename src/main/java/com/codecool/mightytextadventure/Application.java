package com.codecool.mightytextadventure;

import com.codecool.mightytextadventure.data.Level;
import com.codecool.mightytextadventure.logic.Game;
import com.codecool.mightytextadventure.logic.StoryElement;
import com.codecool.mightytextadventure.ui.Display;
import com.codecool.mightytextadventure.ui.Input;
import com.codecool.mightytextadventure.data.Storyline;

public class Application {
    public static void main(String[] args) {

        Display display = new Display();
        Input input = new Input();
        StoryElement storyElement= new StoryElement();

        display.printMessage(Storyline.HELLO.getText());
        String inputFromUser = input.getInputFromUser();
        display.printMessage(inputFromUser + Storyline.AUFWACHEN.getText());

        Level[] levels = loadAreas();

        Game game = new Game(levels, input, display, storyElement);
        game.run();

        display.printMessage("Exiting from Mighty Text Adventure!");
    }

    private static Level[] loadAreas(){
        Level[] levels =   new Level[7];
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
