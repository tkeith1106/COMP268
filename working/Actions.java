/**
Title: Actions.java
Description: this class verifies that the actions being taken by the play adhere to the list below
Date Created: May 22, 2021
Date Last Revised:
@author: Ty Keith - 3270281
@version: 1.0
@copyright 2021  T.Keith

Required:   compiled Actions.Java
Compile:    javac Actions.java

Variables:
private String action - the main variable for the action
private ArrayList<String> actionList - array list that is loaded from text to check actions against.

Constructors:
Actions() - default paramater
Actions(String action) - single parameter constructor

Methods:
setAction - checks the action against an array list then sets the action
getAction - returns the action value

Test Plan:
 see GameMain.java for the test plan
*/

//import objects classes
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Actions {
    //setup action variable
    private String action;
    private ArrayList<String> actionList = new ArrayList<String>();
    //action setter method
    public void setAction(String action) {
        try {
            String filePath = "actions.txt";
            File file = new File(filePath);
            Scanner filesScan = new Scanner(file);
            do {
                String listItem = filesScan.nextLine();
                actionList.add(listItem);
            }
            while (filesScan.hasNextLine());

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred, actions.txt file not found.");
            e.printStackTrace();
        } // end of catch statement

        // if statement to verify that the command exists in the action list
        if (actionList.contains(action)) {
            String actionLower = action.toLowerCase();
            this.action = actionLower;
        } // end of if statement

        else if (!actionList.contains(action)){
            int doValue = 0;
            // do-while statement that prints selection list to user to choose action from
            do {
                System.out.println("Action List:");
                for (int i = 0; i<actionList.size(); i++) {
                    System.out.println("\t" + "\t" + actionList.get(i));
                } // end of for loop
                System.out.print("Please select a valid action from the above list: ");
                Scanner scanAction = new Scanner(System.in);
                String newAction = scanAction.nextLine();
                if (actionList.contains(newAction.toLowerCase())) {
                    this.action = newAction.toLowerCase();
                    doValue = 1;
                    System.out.println();
                } // end of if statement
                else {
                    doValue = 0;
                    System.out.println();
                    System.out.println();
                } // end of else statement
            } // end of do statement
            while (doValue == 0);
        } // end of else statement
    } // end of setter method

    //action getter method
    public String getAction() {
        return this.action;
    } // end of action getter

    // default parameter constructor
    Actions() {
    } // end of parameter constructor

    // parameter constructor
    Actions(String action) {
        this.setAction(action);
    } // end of parameter constructor

} //end of Actions class
