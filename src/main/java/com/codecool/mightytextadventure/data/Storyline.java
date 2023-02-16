package com.codecool.mightytextadventure.data;

public enum Storyline {
    HILFE ("""
            Es ist immer gut nach Hilfe zu fragen! Hier die wichtigsten Eingaben für dich: 
            INNOLAB - Du vermisst die gute alte Zeit im Prog Basic? Geh zurück ins INNOLAB!
            REDEN - Du hast genug davon einsam und alleine zu programmieren oder 
            möchtest den weisen Rat eines Mentors hören? Dann gilt für dich "REDEN ist Gold, schweigen ist langweilig!"
            UMSCHAUEN - Du möchtest deine Umgebung besser kennenlernen, dann hilft UMSCHAUEN. Es ist immer gut zuerst einmal seine Möglichkeiten zu kennen, 
            GEHEN - 10.000 Schritte am Tag ist dein Ziel? Dann starte deine Reise und geh zu den Dingen die dich interessieren!
            """),
    HELLO("""
            Wie heißt du?
            """),
    AUFWACHEN("""
            , du befindest dich in einem großen Raum mit Glasfront, zwar weißt du nicht wie du hierhergekommen bist 
            (vielleicht war der letzte Wodka Wellness im Respawn gestern doch zuviel?), 
            aber du bist jetzt wohl bei CodeCool inskribiert... plötzlich schwebt dir das Wort "INNOLAB" vor, 
            sollst du es wagen? Oder besser um HILFE fragen? """),

    INNOLAB("""
            Du bist im Inno-Lab des Talent Gardens, das Prog Basic Modul läuft schon, was willst du als nächstes tun? 
            Dich UMSCHAUEN, mit den anderen Personen im Raum REDEN oder HINAUF in den zweiten Stock gehen?"""),

    UMSCHAUEN("""
            Um dich herum sind andere Menschen, außerdem siehst du ein Sofa, ein paar Schreibtische und Sessel.
            Vor dir steht ein Notebook. Möchtest du mit jemandem REDEN oder zu etwas GEHEN?
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
