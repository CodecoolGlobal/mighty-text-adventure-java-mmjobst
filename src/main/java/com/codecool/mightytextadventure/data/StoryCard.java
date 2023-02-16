package com.codecool.mightytextadventure.data;

public class StoryCard {
     private Actions action;
     private Storyline storyline;
     private Level level;

     public void goTo(Storyline storyline) {
         System.out.println("text = " + storyline);
     }

     public void talkTo(Actions action) {
         System.out.println("action = " + action);
     }

     public String lookAround() {
         return String.valueOf(Storyline.UMSCHAUEN.getText());
     }

    public Actions getAction() {
        return action;
    }

    public void setAction(Actions action) {
        this.action = action;
    }

    public Storyline getStoryline() {
        return storyline;
    }

    public void setStoryline(Storyline storyline) {
        this.storyline = storyline;
    }
}
