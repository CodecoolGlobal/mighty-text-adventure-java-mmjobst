package com.codecool.mightytextadventure.logic;

import com.codecool.mightytextadventure.data.Actions;

public class ActionValidator {
    public boolean actionValidator(String userAction) {
        for (Actions action : Actions.values()) {
            if (action.name().equals(userAction)) {
                return true;
            }
        }
        return false;
    }
}
