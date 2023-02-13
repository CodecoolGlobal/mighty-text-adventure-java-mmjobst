package com.codecool.mightytextadventure.data;

public enum Storyline {
    HELLO("""
            Wie heißt du?
            """),
    AUFWACHEN("""
            du wachst im Inno-Lab auf, du weißt nicht wie du hierhergekommen bist
            (vielleicht der letzte Wodka Wellness im Respawn?). Du bist jetzt wohl bei CodeCool.
            Du lernst deine Mitstudierenden kennen und zwei sehr große Mentoren.""")
    ;
    private final String text;

    Storyline(String text) {
        this.text = text;
    }

    public String getText(){
        return text;
    }
}
