//package com.codecool.mightytextadventure.data;
//
//import java.util.Collection;
//import java.util.Map;
//import java.util.Set;
//
////
//enum Language{
//    EN,DE,IT,RO;
//}
//
//enum Action{
//    LOOKAROUND("Look around","inspiziere", "" ),
//}
//
//public class StoryElement{
//
////    enum ACTIONS{
////        LOOKAROUND
////    }
//    private String storyText;
//    private String internalName;
//    private static String helpText;
//
//    // implementiere alle Arten von Aktionen.
//    private Map<String, StoryElement> CHOICE;
//
//
//    public StoryElement(String storyText, String internalName, String helpText) {
//        this.setStoryText(storyText);
//        this.setInternalName(internalName);
//        StoryElement.setHelpText(helpText);
//    }
//    public StoryElement(String storyText, String internalName) {
//        this.setStoryText(storyText);
//        this.setInternalName(internalName);
//    }
//    public void setStoryText(String text){
//        this.storyText = text;
//    }
//    public void setInternalName(String text){
//        this.internalName = text;
//    }
//    public static void setHelpText(String text){
//        StoryElement.helpText = text;
//    }
//    public String getStoryText() {
//        return this.storyText;
//    }
//    public String getInternalName() {
//        return this.internalName;
//    }
//    public StoryElement executeChoice( String text ){
//        return (StoryElement) this.CHOICE.get(text);
//    }
//
//    public void setChoice( String choice, StoryElement element) throws Exception{
//        this.CHOICE.put(choice, element);
//    }
//
//    public void execute(String action, String parameter) throws Exception{
//        // wenn aktion + parameter nicht gültig --> throw Exception
//        // wenn aktion + parameter gültig --> return next StoryElement
//        // wenn aktion + parameter gültig, aber kein nächstes StoryElement mehr vorhanden --> return null
//    }
//
//    public boolean isLastElement(){
//        // überprüfe, ob es noch nächste StoryElemente gibt
//        // ja: return false
//        // nein: return true
//    }
//}
