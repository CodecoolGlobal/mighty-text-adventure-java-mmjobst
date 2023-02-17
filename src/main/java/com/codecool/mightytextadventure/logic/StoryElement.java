package com.codecool.mightytextadventure.logic;

import com.codecool.mightytextadventure.data.Storyline;
import com.codecool.mightytextadventure.ui.Input;

import static com.codecool.mightytextadventure.data.Storyline.*;

public class StoryElement {

    Input input = new Input();

    int knowledge = 0;

    public Enum getStoryElement() {
        String inputFromUser = input.getInputFromUser().toUpperCase();
        for (Storyline storyElement : values()) {
            if (storyElement.name().equals(inputFromUser)) {
                knowledge += 1;
                return storyElement;
            }
        }
        return Storyline.TRYAGAIN;
    }
}
