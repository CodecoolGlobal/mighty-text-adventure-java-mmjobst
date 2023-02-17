package com.codecool.mightytextadventure.data;

public enum Storyline {
    HILFE ("""
            Es ist immer gut nach Hilfe zu fragen! Hier die wichtigsten Eingaben für dich: 
            INNOLAB - Du vermisst die gute alte Zeit im Prog Basic? Geh zurück ins INNOLAB!
            REDEN - Du hast genug davon einsam und alleine zu programmieren oder möchtest den weisen Rat eines Mentors hören? 
            Dann gilt für dich "REDEN ist Gold, schweigen ist langweilig!"
            UMSCHAUEN - Du möchtest deine Umgebung besser kennenlernen, dann hilft UMSCHAUEN. 
            Es ist immer gut zuerst einmal seine Möglichkeiten zu kennen, 
            GEHEN - 10.000 Schritte am Tag ist dein Ziel? Dann starte deine Reise und geh zu den Dingen die dich interessieren!
            """),
    HELLO("""
            Wie heißt du?
            """),
    AUFWACHEN("""
            , du befindest dich in einem großen Raum mit Glasfront, zwar weißt du nicht wie du hierhergekommen bist, 
            aber du bist jetzt wohl bei CodeCool inskribiert... plötzlich schwebt dir das Wort "INNOLAB" vor, 
            sollst du es wagen oder besser um HILFE fragen? """),

    INNOLAB("""
            Du bist im Inno-Lab des Talent Gardens, das Prog Basic Modul läuft schon seit einiger Zeit, was willst du 
            als Nächstes tun? Dich UMSCHAUEN, mit den anderen Personen im Raum REDEN oder HINAUF in den zweiten Stock gehen?
            """),

    UMSCHAUEN("""
            Um dich herum sind andere Menschen, außerdem siehst du ein Sofa, ein paar Schreibtische und Sessel.
            Vor dir steht ein Notebook. Möchtest du mit jemandem REDEN oder zu etwas GEHEN?
            """),
    GEHEN("""
            Möchtest du zu dem bequem aussehenden SOFA oder dem aufgedrehten BEAMER gehen? Du kannst auch das NOTEBOOK aufklappen,
             oder in den zweiten Stock HINAUF gehen. 
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
            """),
    SOFA(""" 
            Oh...mhm...das ist so bequem... und du bist sooo müde ...  du könntest für 5 Minuten, nur ganz kurz, 
            nur ein Nickerchen...\n
            
            Oh no, besser schnell wieder ans NOTEBOOK setzen!!
            """),
    NOTEBOOK("""
            Die SI-Week hat gestartet und du sitzt zuhause vor deinem Notebook, was machst du?\n
            
            -> du öffnest JOURNEY
            -> du wirfst das Notebook aus dem FENSTER
            -> du legst dich aufs SOFA
            """),
    OVER("""
            ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣤⣤⠀⠀⠀⢀⣴⣿⡶⠀⣾⣿⣿⡿⠟⠛⠁
            ⠀⠀⠀⠀⠀⠀⣀⣀⣄⣀⠀⠀⠀⠀⣶⣶⣦⠀⠀⠀⠀⣼⣿⣿⡇⠀⣠⣿⣿⣿⠇⣸⣿⣿⣧⣤⠀⠀⠀
            ⠀⠀⢀⣴⣾⣿⡿⠿⠿⠿⠇⠀⠀⣸⣿⣿⣿⡆⠀⠀⢰⣿⣿⣿⣷⣼⣿⣿⣿⡿⢀⣿⣿⡿⠟⠛⠁⠀⠀
            ⠀⣴⣿⡿⠋⠁⠀⠀⠀⠀⠀⠀⢠⣿⣿⣹⣿⣿⣿⣿⣿⣿⡏⢻⣿⣿⢿⣿⣿⠃⣼⣿⣯⣤⣴⣶⣿⡤⠀
            ⣼⣿⠏⠀⣀⣠⣤⣶⣾⣷⠄⣰⣿⣿⡿⠿⠻⣿⣯⣸⣿⡿⠀⠀⠀⠁⣾⣿⡏⢠⣿⣿⠿⠛⠋⠉⠀⠀⠀
            ⣿⣿⠲⢿⣿⣿⣿⣿⡿⠋⢰⣿⣿⠋⠀⠀⠀⢻⣿⣿⣿⠇⠀⠀⠀⠀⠙⠛⠀⠀⠉⠁⠀⠀⠀⠀⠀⠀⠀
            ⠹⢿⣷⣶⣿⣿⠿⠋⠀⠀⠈⠙⠃⠀⠀⠀⠀⠀⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
            ⠀⠀⠈⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣤⣤⣴⣶⣦⣤⡀⠀
            ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⡀⠀⠀⠀⠀⠀⠀⠀⣠⡇⢰⣶⣶⣾⡿⠷⣿⣿⣿⡟⠛⣉⣿⣿⣿⠆
            ⠀⠀⠀⠀⠀⠀⢀⣤⣶⣿⣿⡎⣿⣿⣦⠀⠀⠀⢀⣤⣾⠟⢀⣿⣿⡟⣁⠀⠀⣸⣿⣿⣤⣾⣿⡿⠛⠁⠀
            ⠀⠀⠀⠀⣠⣾⣿⡿⠛⠉⢿⣦⠘⣿⣿⡆⠀⢠⣾⣿⠋⠀⣼⣿⣿⣿⠿⠷⢠⣿⣿⣿⠿⢻⣿⣧⠀⠀⠀
            ⠀⠀⠀⣴⣿⣿⠋⠀⠀⠀⢸⣿⣇⢹⣿⣷⣰⣿⣿⠃⠀⢠⣿⣿⢃⣀⣤⣤⣾⣿⡟⠀⠀⠀⢻⣿⣆⠀⠀
            ⠀⠀⠀⣿⣿⡇⠀⠀⢀⣴⣿⣿⡟⠀⣿⣿⣿⣿⠃⠀⠀⣾⣿⣿⡿⠿⠛⢛⣿⡟⠀⠀⠀⠀⠀⠻⠿⠀⠀
            ⠀⠀⠀⠹⣿⣿⣶⣾⣿⣿⣿⠟⠁⠀⠸⢿⣿⠇⠀⠀⠀⠛⠛⠁⠀⠀⠀⠀⠀⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀
            ⠀⠀⠀⠀⠈⠙⠛⠛⠛⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
            """),
    JOURNEY("""
            Du starrst die Journey Projekte an und nöchtest mit einem starten, aber warte - welcher Wochentag ist heute?\n
                    
            ANFANG der Woche 
            oder
            ENDE der Woche
            """),
    ANFANG("""
            Schau auf Discord, Manuela hat dort mittwochs eine Liste der Fehler gepostet die sie beim durchcoden der Beispiele gefunden hat. 
            Jetzt kannst auch du mit dem Coden loslegen bis es nächste Woche wieder ins INNOLAB geht!
            """),
    ENDE("""
            Oh no, es ist zu früh in der Woche! Du kannst noch nicht mit den Beispielen beginnen, 
            denn Manuela muss sie erst durchcoden, um euch dann eine Liste der Fehler zu schicken...
                        
            Aber willst du es trotzdem versuchen und ein Journey PROJEKT starten?\n
            Oder besser WARTEN?
            """),
    WARTEN("""
            Dank Manuelas Hilfe schaffst du es bis Montag einen Großteil der Journey Projekte zu lösen. Good for you, 
            das wird ein toller SI-Week Review im INNOLAB!
            """),
    PROJEKT("""
            Stunden später und keine Zeile Code weiter glaubst du ein teuflisches Lachen zu hören... ganz leise... 
            jedesmal wenn du das Journey-Projekt öffnest...
            ⠀⠀⠀⠀⠀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
            ⠀⠀⣠⡾⠛⠛⠛⠛⠛⠛⠛⠛⠛⠻⠿⠿⠷⠶⠶⠶⠶⣶⡀⠀⠀⠀⠀⠀⠀⠀
            ⠀⢰⡿⠀⠀⠸⣷⠀⠀⠀⡀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡀⠸⣧⠀⠀⠀⠀⠀⠀⠀
            ⠀⠸⣧⠀⠀⠀⢻⡆⠀⠀⢻⣦⡤⠀⠀⠀⠀⠀⣀⣾⡇⠀⢹⣇⠀⠀⠀⠀⠀⠀
            ⠀⠀⢿⡄⠀⠀⠈⣿⡀⠀⠀⠙⠿⣶⡤⠀⠀⢠⣾⠟⠁⠀⠀⢻⡆⠀⠀⠀⠀⠀
            ⠀⠀⠸⡇⠀⠀⠀⢹⣇⠀⠀⡀⠀⠀⠀⠀⠀⠀⠁⢀⠀⠀⡄⠈⢿⡄⠀⠀⠀⠀
            ⠀⠀⠀⢿⠀⠀⠀⠀⢿⡄⠀⢹⣷⣄⡀⣶⣦⡀⢀⣿⣆⣾⡇⠀⠘⣷⠀⠀⠀⠀
            ⠀⠀⠀⠘⡇⠀⠀⠀⠸⣷⠀⠀⢻⡿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠸⣆⠀⠀⠀
            ⠀⠀⠀⠀⣿⡀⠀⠀⠀⢻⡆⠀⠀⠀⠈⢻⣿⠃⠙⢿⡏⠈⠇⠀⠀⠀⢹⡄⠀⠀
            ⠀⠀⠀⠀⢸⣇⠀⠀⠀⠈⠉⠀⠀⠀⠀⠀⠁⠀⠀⠈⠀⠀⠀⠀⠀⠀⠈⣿⡀⠀
            ⠀⠀⠀⠀⠀⣿⣀⣴⠾⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠿⠿⠿⠷⠶⠶⠶⠾⠷⠀
            ⠀⠀⠀⠀⠀⢸⡿⠁⣴⣾⣿⣿⣿⣿⣿⣷⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⠶⠂⠀⠀
            ⠀⠀⠀⠀⠀⠀⠁⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⠀⠀⠀⠀
            ⠀⠀⠀⠀⠀⠀⠀⠈⠉⠉⠉⠉⠉⠉⠉⠙⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠀⠀⠀⠀
            
            Nach weiteren Stunden liegst du weinend am Boden, vielleicht doch besser WARTEN?!
            """),
    BEAMER("""
            Oh no, es ist anscheinend Freitag und das heißt Demo-Days der Beamer ist bereits an und die ersten Präsentationen laufen, 
            Panik steigt in dir hoch. Was wirst du präsentieren? 
            
            -> nichts, du läufst hinaus und kommst NIE wieder
            -> du schmuggelst dich zu einem anderen TEAM
            -> du legst dich aufs SOFA und hoffst, dass dich niemand bemerkt
            """),
    TEAM("""
            Deine Gruppe besteht aus Manuela, Chen und Julia. Sie sehen alle sehr entspannt aus als hätten sie 
            das Teamprojekt sehr genossen...\n
            
            ...das macht dich zwar misstrauisch...aber du schmuggelst dich dazu, gerade reden sie über die ZIELE 
            ihres Teamworks. 
            """),
    ZIELE ("""
             Ihre Ziele waren: 
             - eine unterhaltsame Geschichte schreiben
             - "proper" OOP 
             - gutes Timemanagement and Taskverteilung\n
             
             Hochgesteckte Ziele denkst du dir... da gabs sicher auch PROBLEME! 
            """),
    PROBLEME ("""
             Ihre Probleme waren: 
             - eine unterhaltsame Geschichte schreiben
             - "proper" OOP 
             - gutes Timemanagement and Taskverteilung\n
             
             Haha, sehr lustig... ein paar mehr DETAILS bitte!?
            """),

    PROBLEME ("""
             Ihre Probleme waren: 
             - eine unterhaltsame Geschichte schreiben
             - "proper" OOP 
             - gutes Timemanagement and Taskverteilung\n
             
             Haha, sehr lustig... ein paar mehr DETAILS bitte!?
            """),

    HINAUF("""
            Du kannst noch nicht in andere Stockwerke gehen bis du dein PA bestanden hast - erst dann bist du "next level"!
                        
            Möchtest du dein PA jetzt gleich machen?
            [[ja, klar!->PA JA 1]]
            [[nope, ich schaue mich lieber noch ein bisschen um!!->PA NEIN]]
            """),
    TRYAGAIN("""
            Ups, versuchs nochmal oder schreib HILFE!
            """);


    private final String text;

    Storyline(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}


