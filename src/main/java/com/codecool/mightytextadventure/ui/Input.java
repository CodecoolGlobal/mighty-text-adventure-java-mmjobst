package com.codecool.mightytextadventure.ui;

import java.util.Scanner;

public class Input {
    public String getInputFromUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wie heißt du?");
        String inputUser = scanner.nextLine();
        return inputUser;
    }
}
