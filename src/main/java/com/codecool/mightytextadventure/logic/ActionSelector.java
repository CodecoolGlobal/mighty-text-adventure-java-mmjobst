package com.codecool.mightytextadventure.logic;

import com.codecool.mightytextadventure.data.Actions;
import com.codecool.mightytextadventure.data.StoryCard;
import com.codecool.mightytextadventure.data.Storyline;

public class ActionSelector {
    public String actionSelector(String actionFromUser) {
        StoryCard storyCard = new StoryCard();
        System.out.println("actionselector input: " + actionFromUser);

        if (actionFromUser.equals(Storyline.UMSCHAUEN.name())) {
            return storyCard.lookAround();
        }

        return null;
    }

}
