/**
Title: Direction.java
Description: used by the locations class to set direction allowable in each location
Date Created: May 30, 2021
Date Last Revised:
@author: Ty Keith - 3270281
@version: 1.0
@copyright 2021  T.Keith

Required:   compiled Direction.Java
Compile:    javac Direction.java

Variables:
private String direction;


Constructors:
Direction() - default, no paramater constructor
Direction(String direction) - takes an input to create a direction object

Methods:
setDirection - uses parameters to set the direction
getDirection - returns the direction value

Test Plan:
 see GameMain.java
*/

//import objects classes
import java.util.Scanner;

public class Direction {

    //setup action variable
    private String direction;

    //action setter method
    public void setDirection(String direction) {
        String directionLower = direction.toLowerCase();
                if (directionLower.equals("go right") || directionLower.equals("go left") || directionLower.equals(
                        "go straight") || directionLower.equals("no exit")) {
            this.direction = directionLower;
        } // end of if statement

        else {
            int doValue;
            // do-while statement that prints selection list to user to choose action from
            do {
                System.out.println("Direction List:");
                System.out.println("go right");
                System.out.println("go left");
                System.out.println("go straight");
                System.out.println("no exit");
                System.out.print("Please select a valid movement direction from the above list: ");
                Scanner scanDirection = new Scanner(System.in);
                String newDirection = scanDirection.nextLine();
                String newDirectionLower = newDirection.toLowerCase();
                if (directionLower.equals("go right") || directionLower.equals("go left") || directionLower.equals(
                        "go straight")) {
                    this.direction = newDirectionLower;
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
    public String getDirection() {
        return this.direction;
    } // end of action getter

    // default parameter constructor
    Direction() {

    } // end of parameter constructor

    // parameter constructor
    Direction(String direction) {
        this.setDirection(direction);
    } // end of parameter constructor

} //end of Direction class
