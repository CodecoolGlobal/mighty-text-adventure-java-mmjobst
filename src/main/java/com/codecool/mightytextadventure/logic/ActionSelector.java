package com.codecool.mightytextadventure.logic;

import com.codecool.mightytextadventure.data.Actions;
import com.codecool.mightytextadventure.data.StoryCard;
import com.codecool.mightytextadventure.data.Storyline;

public class ActionSelector {
    public String actionSelector(String actionFromUser) {
        StoryCard storyCard = new StoryCard();
        System.out.println("input: " + actionFromUser);

//        Storyline.UMSCHAUEN = Storyline.valueOf(actionFromUser)


//            switch (actionFromUser) {
//                case UMSCHAUEN:
//                    return storyCard.lookAround();
//                case GEHEN:
//                    return null;
//                case REDEN:
//                    return "hallo";
//            }
        return null;
    }

}
