package com.codecool.mightytextadventure.data;

public enum Storyline {
    HELLO("""
            Wie heißt du?
            """),
    AUFWACHEN("""
            , du befindest dich im Inno-Lab des Talent Gardens, zwar weißt du nicht wie du hierhergekommen bist 
            (vielleicht war der letzte Wodka Wellness im Respawn gestern doch zuviel?), 
            aber du bist jetzt wohl bei CodeCool inskribiert..."""),

    INNOLAB("""
            Du sitzt im Innolab, willst du dich UMSCHAUEN, mit den anderen REDEN oder HINAUF in den 
            zweiten Stock gehen?"""),

    UMSCHAUEN("""
            Du schaust dich um, es gibt Tische, Stühle ... 
            """),

    REDEN("""
            Im Raum befinden sich MARTIN, EMAD, MITSTUDIERENDE und du SELBST. Mit wem möchtest du reden?\s
            """),
    EMAD("""
            "Every mistake you make is progress! Growth Mindset!"
                        \n
            Möchtest du noch mit jemand anderem REDEN oder lieber zurück ins INNOLAB?
            """),
    MITSTUDIERENDE("""
            "Hallo, I bin da Fleischi, woas is dei Lieblingsessen - vielleicht koch i es amal für di!"\n
            \n
            Möchtest du noch mit jemand anderem REDEN oder lieber zurück ins INNOLAB?
            """),
    SELBST("""
         "Was tue ich eigentlich hier? Was ist das Wesen von Freiheit? Bin ich wirklich frei - 
         wie kann ich wissen ob meine Entscheidungen wirklich meine eigenen sind?"
             \n
            Möchtest du noch mit jemand anderem REDEN oder lieber zurück ins INNOLAB?
            """),
    MARTIN("""
            "Ich versuche, deinen Verstand zu befreien, Neo. Aber ich kann dir nur die Tür zeigen. 
            Hindurchgehen musst du alleine."
             \n
            Möchtest du noch mit jemand anderem REDEN oder lieber zurück ins INNOLAB?
            """);

    private final String text;

    Storyline(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
