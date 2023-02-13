package com.codecool.mightytextadventure.data;

public enum Storyline {
    AUFWACHEN("Du wachst im Inno-Lab auf, du weißt nicht wie du hiergekommen bist " +
            "(vielleicht der letzte Wodka Wellness im Respawn?) " +
            "aber du bist jetzt wohl bei CodeCool. " +
            "Du lernst deine Mitstudierenden kennen und zwei sehr große Mentoren.")
    ;
    private final String text;

    Storyline(String text) {
        this.text = text;
    }

    public String getText(){
        return text;
    }
}
