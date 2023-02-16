package com.codecool.mightytextadventure.logic;
import com.codecool.mightytextadventure.data.Actions;

public class ActionValidator {
    public boolean actionValidator(String userAction) {
//        System.out.println("userAction = " + userAction);

        for (Actions action : Actions.values()) {
            if(action.equals(Actions.valueOf(userAction))) {
                return true;
            }
        }
        return false;
    }
}
