package com.codecool.mightytextadventure.logic;

import com.codecool.mightytextadventure.data.Actions;
import com.codecool.mightytextadventure.data.StoryCard;

public class ActionSelector {
    public void actionSelect(String actionFromUser, int level) {
        StoryCard storyCard = new StoryCard();

        if (actionFromUser.equals("HELP")) {
            System.out.println(storyCard.help());
        } else {
            System.out.println(storyCard.storyElement(actionFromUser, level));
        }


    }
}
