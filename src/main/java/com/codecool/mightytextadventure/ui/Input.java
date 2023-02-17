package com.codecool.mightytextadventure.ui;


import java.util.Scanner;

public class Input {
    private final Scanner scanner = new Scanner(System.in);

    public String getInputFromUser() {
        return scanner.nextLine();
    }
}
