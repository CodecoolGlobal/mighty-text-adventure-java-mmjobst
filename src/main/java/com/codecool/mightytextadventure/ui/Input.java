package com.codecool.mightytextadventure.ui;


import java.util.Scanner;

public class Input {


    public String getInputFromUser(String textEnum){
        Scanner scanner = new Scanner(System.in);
        System.out.println(textEnum);
        String inputUser = scanner.nextLine();
        return inputUser;
    }

    public String getActionFromUser() {
        Scanner action = new Scanner(System.in);
        String userAction = action.nextLine();
        return userAction;
    }

}
