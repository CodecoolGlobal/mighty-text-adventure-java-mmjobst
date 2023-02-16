package com.codecool.mightytextadventure.logic;

import com.codecool.mightytextadventure.data.Actions;
import com.codecool.mightytextadventure.data.StoryCard;
import com.codecool.mightytextadventure.data.Storyline;

public class ActionSelector {
    public void actionSelector(String actionFromUser) {
        StoryCard storyCard = new StoryCard();
        Actions actionEnum = Actions.valueOf(actionFromUser); //String als argument und gibt uns das entsprechende enum object

        switch (actionEnum) {
            case UMSCHAUEN:
                System.out.println(storyCard.lookAround());
                break;
            case REDEN:
                System.out.println("reden");
                break;
            case GEHEN:
                System.out.println("gehen");
                break;
        }

    }

}
