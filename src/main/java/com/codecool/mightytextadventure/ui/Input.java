package com.codecool.mightytextadventure.ui;


import java.util.Scanner;

public class Input {


    public String getInputFromUser(){
        Scanner scanner = new Scanner(System.in);
        String inputUser = scanner.nextLine();
        return inputUser;
    }

    public String getNameFromUser(){
        Scanner scanner = new Scanner(System.in);
        String inputName = scanner.nextLine();
        return inputName;
    }


}
