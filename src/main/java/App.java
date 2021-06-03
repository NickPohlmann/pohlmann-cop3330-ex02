/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Nicholas Pohlmann
 */
import java.io.OptionalDataException;
import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        String inputString = myApp.readString();
        int stringLength = myApp.getStringLength(inputString);
        String outputString = myApp.generateOutputString(inputString, stringLength);
        myApp.printOutputString(outputString);
    }

    private String readString() {
        System.out.print("What is the input string? ");
        String string = in.nextLine();
        return string;
    }

    private int getStringLength(String string) {
        int stringLength = string.length();
        return stringLength;
    }

    private String generateOutputString(String inputString, int stringLength){
        return inputString + " has " + stringLength + " characters.";
    }

    private void printOutputString (String outputString) { System.out.println(outputString);}
}
