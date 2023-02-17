package com.codecool.mightytextadventure.ui;


import java.util.Scanner;

public class Input {


    public String getInputFromUser(){
        Scanner scanner = new Scanner(System.in);
        String inputUser = scanner.nextLine();
        return inputUser;
    }


}
