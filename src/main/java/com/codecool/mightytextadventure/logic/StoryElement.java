package com.codecool.mightytextadventure.logic;

import com.codecool.mightytextadventure.data.Storyline;
import com.codecool.mightytextadventure.ui.Input;
import com.codecool.mightytextadventure.ui.Display;

import static com.codecool.mightytextadventure.data.Storyline.*;

public class StoryElement {
    Display display = new Display();
    Input input = new Input();
    public Enum getStoryElement() {
        String inputFromUser = input.getInputFromUser().toUpperCase().trim();
        if (inputFromUser.equals("FENSTER") || inputFromUser.equals("NIE")) {
            return Storyline.OVER;
        }
        for (Storyline storyElement : values()) {
            if (storyElement.name().equals(inputFromUser)) {
                return storyElement;
            }
        }
        return Storyline.TRYAGAIN;
    }
}


