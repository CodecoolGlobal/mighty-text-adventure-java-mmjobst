package com.codecool.mightytextadventure.logic;

import com.codecool.mightytextadventure.data.Storyline;
import com.codecool.mightytextadventure.ui.Input;

import java.util.Arrays;

import static com.codecool.mightytextadventure.data.Storyline.values;

public class StoryElement {
    private Input input = new Input();

    public Enum getStoryElement() {
        String inputFromUser = input.getInputFromUser().toUpperCase().trim();
        if (inputFromUser.equals("FENSTER") || inputFromUser.equals("NIE")) {
            return Storyline.OVER;
        }
        return Arrays.stream(values())
                .filter(storyElement -> storyElement.name().equals(inputFromUser))
                .findFirst()
                .orElse(Storyline.TRYAGAIN);
    }
}


