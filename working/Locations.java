/**
Title: Locations.java
Description: This class sets the base schema of any location to be used within the game
Date Created: May 29, 2021
Date Last Revised:
@author: Ty Keith - 3270281
@version: 1.0
@copyright 2021  T.Keith

Required:   compiled Locations.Java, Direction.java
Compile:    javac Locations.java


Variables:
private String name - the name of the location
private String description - location description
Direction direction1 = new Direction() - the allowable first direction
Direction direction2 = new Direction() - the allowable second direction
Direction direction3 = new Direction() - the allowable third direction

Constructors:
Locations() - default constructor
Locations(String name, String description, String direction1) - 3 parameter constructor
Locations(String name, String description, String direction1, String direction2) - 4 parameter constructor
Locations(String name, String description, String direction1, String direction2, String direction3) - 5 parameter
constructor

Methods:
setName - sets location name
getName - returns locations name

setDescription - sets description of location
getDescription - returns the description of the location

setDirection1 - sets the first direction of the location
getDirection1 - gets the first direction of the location

setDirection2 - sets the second direction of the location
getDirection2 - gets the second direction of the location

setDirection3 - sets the third direction of the location
getDirection3 - gets the third direction of the location


Test Plan:
 see GameMain.java test plan
*/

//import scanner and arrays object class
import java.util.Scanner;

public class Locations{

    // setup variables
    private String name;
    private String description;
    Direction direction1 = new Direction();
    Direction direction2 = new Direction();
    Direction direction3 = new Direction();

    // name setter method
    public void setName(String locationName){
        // if statement to check conditions of constructor input
        if (locationName != null || locationName.length() > 1) {
            this.name = locationName;
        } // end of if statement
        // else statement that runs until conditions satisfied
        else {
            int doValue = 0;
            do {
                Scanner scanName = new Scanner(System.in);
                String newName = scanName.nextLine();
                String newNameLower = newName.toLowerCase();
                if (newNameLower != null || newNameLower.length() > 1){
                    this.name = newNameLower;
                    doValue = 1;
                    System.out.println();
                } // end of do if statement
                else {
                    doValue = 0;
                    System.out.println();
                    System.out.println();
                } // end of else statement
            } // end of do statement
            while (doValue == 0);
        } // end of else statement
    } // end of name setter method

    // name getter method
    public String getName(){
        return this.name;
    } // end of name getter method


    // description setter method
    public void setDescription(String locationDescription){
        // if statements that checks if constructor input meets certain requirements
        if (locationDescription != null || locationDescription.length() > 1) {
            this.description = locationDescription;
        } // end of if statement
        // else statement that runs until conditions are satisfied
        else {
            int doValue = 0;
            do {
                Scanner scanDescription = new Scanner(System.in);
                String newDescription = scanDescription.nextLine();
                String newDescriptionLower = newDescription.toLowerCase();
                if (newDescriptionLower != null || newDescriptionLower.length() > 1){
                    this.name = newDescriptionLower;
                    doValue = 1;
                    System.out.println();
                } // end of do if statement
                else {
                    doValue = 0;
                    System.out.println();
                    System.out.println();
                } // end of else statement
            } // end of do statement
            while (doValue == 0);
        } // end of else statement
    } // end of description setter method

    // description getter method
    public String getDescription(){
        return this.description;
    } // end of description getter method


    // direction1 setter method
    public void setDirection1(String locationDirection1){
        // set input to lower case then if statement to route constructor input
        String ldLower = locationDirection1.toLowerCase();
        if (ldLower.equals("go right") || ldLower.equals("go left") || ldLower.equals("go straight")) {
            direction1.setDirection(ldLower);
        } // end of if statement
        // else statement that runs until condiations are satisfied
        else {
            int doValue = 0;
            do {
                System.out.println("Direction 1 List:");
                System.out.println("    go right");
                System.out.println("    go left");
                System.out.println("    go straight");
                System.out.print("Please Enter a valid direction for the room from the list below: ");
                Scanner scanDirection1 = new Scanner(System.in);
                String newDirection1 = scanDirection1.nextLine();
                String newDirection1Lower = newDirection1.toLowerCase();
                if (newDirection1Lower.equals("go right") || newDirection1Lower.equals("go left") || newDirection1Lower.equals("go straight")){
                    direction1.setDirection(newDirection1Lower);
                    doValue = 1;
                    System.out.println();
                } // end of do if statement
                else {
                    doValue = 0;
                    System.out.println();
                    System.out.println();
                } // end of else statement
            } // end of do statement
            while (doValue == 0);
        } // end of else statement
    } // end of direction1 setter method

    // direction1 getter method
    public String getDirection1(){
        return direction1.getDirection();
    } // end of direction1 getter method


    // direction2 setter method
    public void setDirection2(String locationDirection2){
        // set input to lower case then if statement to route constructor input
        String ldLower = locationDirection2.toLowerCase();
        if (ldLower.equals("go right") || ldLower.equals("go left") || ldLower.equals("go straight")) {
            direction2.setDirection(ldLower);
        } // end of if statement
        // elif to direct variables based on the constructor that was used
        else if (locationDirection2.equals("no exit")) {
            direction2.setDirection("no exit");
        } // end of secondary if statement
        // else statement that rus until the conditions are satisfied
        else {
            int doValue = 0;
            do {
                System.out.println("Direction 2 List:");
                System.out.println("    go right");
                System.out.println("    go left");
                System.out.println("    go straight");
                System.out.print("Please Enter a valid direction for the room from the list below: ");
                Scanner scanDirection2 = new Scanner(System.in);
                String newDirection2 = scanDirection2.nextLine();
                String newDirection2Lower = newDirection2.toLowerCase();
                if (newDirection2Lower.equals("go right") || newDirection2Lower.equals("go left") || newDirection2Lower.equals("go straight")){
                    direction2.setDirection(newDirection2Lower);
                    doValue = 1;
                    System.out.println();
                } // end of do if statement
                else {
                    doValue = 0;
                    System.out.println();
                    System.out.println();
                } // end of else statement
            } // end of do statement
            while (doValue == 0);
        } // end of else statement
    } // end of direction2 setter method

    // direction2 getter method
    public String getDirection2(){
        return direction2.getDirection();
    } // end of direction2 getter method


    // direction3 setter method
    public void setDirection3(String locationDirection3){
        // set input to lower case then if statement to route constructor input
        String ldLower = locationDirection3.toLowerCase();
        if (ldLower.equals("go right") || ldLower.equals("go left") || ldLower.equals("go straight")) {
            direction3.setDirection(ldLower);
        } // end of if statement
        // else if that routes variables based on what constructor was used
        else if (locationDirection3.equals("no exit")) {
            direction3.setDirection("no exit");
        } // end of secondary if statement
        // else statement that runs until the conditions are satisfied
        else {
            int doValue = 0;
            do {
                System.out.println("Direction 3 List:");
                System.out.println("    go right");
                System.out.println("    go left");
                System.out.println("    go straight");
                System.out.print("Please Enter a valid direction for the room from the list below: ");
                Scanner scanDirection3 = new Scanner(System.in);
                String newDirection3 = scanDirection3.nextLine();
                String newDirection3Lower = newDirection3.toLowerCase();
                if (newDirection3Lower.equals("go right") || newDirection3Lower.equals("go left") || newDirection3Lower.equals("go straight")){
                    direction2.setDirection(newDirection3Lower);
                    doValue = 1;
                    System.out.println();
                } // end of do if statement
                else {
                    doValue = 0;
                    System.out.println();
                    System.out.println();
                } // end of else statement
            } // end of do statement
            while (doValue == 0);
        } // end of else statement
    } // end of direction3 setter method

    // direction3 getter method
    public String getDirection3(){
        return direction3.getDirection();
    } // end of direction3 getter method


    //default constructor
    Locations(){

    } // end of default constructor

    //5  parameter constructor
    Locations(String name, String description, String direction1, String direction2, String direction3){
        this.setName(name);
        this.setDescription(description);
        this.setDirection1(direction1);
        this.setDirection2(direction2);
        this.setDirection3(direction3);
    } // end of default constructor

    //4  parameter constructor
    Locations(String name, String description, String direction1, String direction2){
        this.setName(name);
        this.setDescription(description);
        this.setDirection1(direction1);
        this.setDirection2(direction2);
        this.setDirection3("no exit");
    } // end of default constructor

    //3  parameter constructor
    Locations(String name, String description, String direction1){
        this.setName(name);
        this.setDescription(description);
        this.setDirection1(direction1);
        this.setDirection2("no exit");
        this.setDirection3("no exit");
    } // end of default constructor
} //end of Locations class
