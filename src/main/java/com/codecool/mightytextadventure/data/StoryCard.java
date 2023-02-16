package com.codecool.mightytextadventure.data;

public class StoryCard {
     public String storyElement(String action, int lvl) {
         Storyline storyLineEnum = Storyline.valueOf(action + lvl);
         return storyLineEnum.getText();
     }
     public String help() {
         return Storyline.HELP.getText();
     }
}
