/**
Title: Control.java
Description: this class acts as the main driver of all the classes to create instances of each room
Date Created: June 6, 2021
Date Last Revised:
@author: Ty Keith - 3270281
@version: 1.0
@copyright 2021  T.Keith

Required:   compiled Control.Java, Locations.java, Characters.java, Items.java
Compile:    javac Control.java

Variables:
public Locations currentLocation - creates a current location object for each room/scene
public Characters currentCharacter - creates a currentCharacter from the Character object
public Items currentDungeonItem1 - creates the currenLocations item 1
public Items currentDungeonItem2 - creates the currenLocations item 2
public Items currentDungeonItem3 - creates the currenLocations item 3
public int currentScene - sets the current scene to help with continuity of the game

Constructors:
Control() - default constructor
Control(int scene) - single parameter consturctor

Methods:
setScene - this is a switch case method that uses the information input by GameMain to create the room/scene needed
as the player progress through the game

Test Plan:
 1. Run the application.
	see GameMain.java for test plan
*/

//import statement
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Control {

    //set all variable for each room variables
    public Locations currentLocation;
    public Characters currentCharacter;
    public Items currentDungeonItem1;
    public Items currentDungeonItem2;
    public Items currentDungeonItem3;
    public int currentScene;



    public void setScene(int scene) {
        this.currentScene = scene;
        switch (scene) {
            case 1:
                //try-catch case for dungeon location
                try {
                    String filePath = "dungeon.txt";
                    File file = new File(filePath);
                    Scanner filesScan = new Scanner(file);
                    String name = filesScan.nextLine();
                    String locationDescription = filesScan.nextLine();
                    String direction1 = filesScan.nextLine();
                    String direction2 = filesScan.nextLine();
                    String direction3 = filesScan.nextLine();
                    this.currentLocation = new Locations(name,locationDescription,direction1,direction2,direction3);
                } catch (FileNotFoundException e) {
                    System.out.println("An error occurred, dungeon.txt file not found.");
                    e.printStackTrace();
                } // end of catch statement
                //try-catch case for dungeon character
                try {
                    String filePath = "thecheschirecat.txt";
                    File file = new File(filePath);
                    Scanner filesScan = new Scanner(file);
                    String character = filesScan.nextLine().replaceAll("\\|", "\n");
                    String description = filesScan.nextLine().replaceAll("\\|", "\n");
                    String firstEncounterSaying = filesScan.nextLine().replaceAll("\\|", "\n");
                    String winSaying = filesScan.nextLine().replaceAll("\\|", "\n");
                    String defeatSaying = filesScan.nextLine().replaceAll("\\|", "\n");
                    this.currentCharacter = new Characters(character, description, firstEncounterSaying, winSaying,
                            defeatSaying);
                } catch (FileNotFoundException e) {
                    System.out.println("An error occurred, thecheschirecat.txt file not found.");
                    e.printStackTrace();
                } // end of catch statement
                //try-catch case for dungeon items
                try {
                    String filePath = "dungeonitems.txt";
                    File file = new File(filePath);
                    Scanner filesScan = new Scanner(file);
                    String itemName = filesScan.nextLine();
                    String attack = filesScan.nextLine();
                    String defense = filesScan.nextLine();
                    int intAttack = Integer.parseInt(attack);
                    int intDefense = Integer.parseInt(defense);
                    this.currentDungeonItem1 = new Items(itemName,intAttack,intDefense);
                } catch (FileNotFoundException e) {
                    System.out.println("An error occurred, dungeonitems.txt file not found.");
                    e.printStackTrace();
                } // end of catch statement
                break;

            case 2:
                //try-catch case for dungeon location
                try {
                    String filePath = "croquetgrounds.txt";
                    File file = new File(filePath);
                    Scanner filesScan = new Scanner(file);
                    String name = filesScan.nextLine();
                    String locationDescription = filesScan.nextLine();
                    String direction1 = filesScan.nextLine();

                    this.currentLocation = new Locations(name,locationDescription,direction1);
                } catch (FileNotFoundException e) {
                    System.out.println("An error occurred, croquetgrounds.txt file not found.");
                    e.printStackTrace();
                } // end of catch statement
                //try-catch case for dungeon character
                try {
                    String filePath = "theknaveofhearts.txt";
                    File file = new File(filePath);
                    Scanner filesScan = new Scanner(file);
                    String character = filesScan.nextLine().replaceAll("\\|", "\n");
                    String description = filesScan.nextLine().replaceAll("\\|", "\n");
                    String firstEncounterSaying = filesScan.nextLine().replaceAll("\\|", "\n");
                    String winSaying = filesScan.nextLine().replaceAll("\\|", "\n");
                    String defeatSaying = filesScan.nextLine().replaceAll("\\|", "\n");
                    this.currentCharacter = new Characters(character, description, firstEncounterSaying, winSaying,
                            defeatSaying);
                } catch (FileNotFoundException e) {
                    System.out.println("An error occurred, theknaveofhearts.txt file not found.");
                    e.printStackTrace();
                } // end of catch statement
                //try-catch case for dungeon items
                try {
                    String filePath = "croquetgroundsitems.txt";
                    File file = new File(filePath);
                    Scanner filesScan = new Scanner(file);
                    String itemName1 = filesScan.nextLine();
                    String attack1 = filesScan.nextLine();
                    String defense1 = filesScan.nextLine();
                    int intAttack1 = Integer.parseInt(attack1);
                    int intDefense1 = Integer.parseInt(defense1);
                    String itemName2 = filesScan.nextLine();
                    String attack2 = filesScan.nextLine();
                    String defense2 = filesScan.nextLine();
                    int intAttack2 = Integer.parseInt(attack2);
                    int intDefense2 = Integer.parseInt(defense2);
                    this.currentDungeonItem1 = new Items(itemName1,intAttack1,intDefense1);
                    this.currentDungeonItem2 = new Items(itemName2,intAttack2,intDefense2);
                } catch (FileNotFoundException e) {
                    System.out.println("An error occurred, croquetgroundsitems.txt file not found.");
                    e.printStackTrace();
                } // end of catch statement
                break;

            case 3:
                //try-catch case for dungeon location
                try {
                    String filePath = "undergroundtunnel.txt";
                    File file = new File(filePath);
                    Scanner filesScan = new Scanner(file);
                    String name = filesScan.nextLine();
                    String locationDescription = filesScan.nextLine();
                    String direction1 = filesScan.nextLine();

                    this.currentLocation = new Locations(name,locationDescription,direction1);
                } catch (FileNotFoundException e) {
                    System.out.println("An error occurred, undergroundtunnel.txt file not found.");
                    e.printStackTrace();
                } // end of catch statement
                //try-catch case for dungeon character
                try {
                    String filePath = "theundergroundtunnel.txt";
                    File file = new File(filePath);
                    Scanner filesScan = new Scanner(file);
                    String character = filesScan.nextLine().replaceAll("\\|", "\n");
                    String description = filesScan.nextLine().replaceAll("\\|", "\n");
                    String firstEncounterSaying = filesScan.nextLine().replaceAll("\\|", "\n");
                    String winSaying = filesScan.nextLine().replaceAll("\\|", "\n");
                    String defeatSaying = filesScan.nextLine().replaceAll("\\|", "\n");
                    this.currentCharacter = new Characters(character, description, firstEncounterSaying, winSaying,
                            defeatSaying);
                } catch (FileNotFoundException e) {
                    System.out.println("An error occurred, theundergroundtunnel.txt file not found.");
                    e.printStackTrace();
                } // end of catch statement
                //try-catch case for dungeon items
                try {
                    String filePath = "undergroundtunnelitems.txt";
                    File file = new File(filePath);
                    Scanner filesScan = new Scanner(file);
                    String itemName = filesScan.nextLine();
                    String attack = filesScan.nextLine();
                    String defense = filesScan.nextLine();
                    int intAttack = Integer.parseInt(attack);
                    int intDefense = Integer.parseInt(defense);
                    this.currentDungeonItem1 = new Items(itemName,intAttack,intDefense);
                } catch (FileNotFoundException e) {
                    System.out.println("An error occurred, undergroundtunnelitems.txt file not found.");
                    e.printStackTrace();
                } // end of catch statement
                break;

            case 4:
                //try-catch case for dungeon location
                try {
                    String filePath = "roadtohatter.txt";
                    File file = new File(filePath);
                    Scanner filesScan = new Scanner(file);
                    String name = filesScan.nextLine();
                    String locationDescription = filesScan.nextLine();
                    String direction1 = filesScan.nextLine();
                    this.currentLocation = new Locations(name,locationDescription,direction1);
                } catch (FileNotFoundException e) {
                    System.out.println("An error occurred, roadtohatter.txt file not found.");
                    e.printStackTrace();
                } // end of catch statement
                //try-catch case for dungeon character
                try {
                    String filePath = "themadhatter.txt";
                    File file = new File(filePath);
                    Scanner filesScan = new Scanner(file);
                    String character = filesScan.nextLine().replaceAll("\\|", "\n");
                    String description = filesScan.nextLine().replaceAll("\\|", "\n");
                    String firstEncounterSaying = filesScan.nextLine().replaceAll("\\|", "\n");
                    String winSaying = filesScan.nextLine().replaceAll("\\|", "\n");
                    String defeatSaying = filesScan.nextLine().replaceAll("\\|", "\n");
                    this.currentCharacter = new Characters(character, description, firstEncounterSaying, winSaying,
                            defeatSaying);
                } catch (FileNotFoundException e) {
                    System.out.println("An error occurred, themadhatter.txt file not found.");
                    e.printStackTrace();
                } // end of catch statement
                //try-catch case for dungeon items
                try {
                    String filePath = "roadtohatteritems.txt";
                    File file = new File(filePath);
                    Scanner filesScan = new Scanner(file);
                    String itemName1 = filesScan.nextLine();
                    String attack1 = filesScan.nextLine();
                    String defense1 = filesScan.nextLine();
                    int intAttack1 = Integer.parseInt(attack1);
                    int intDefense1 = Integer.parseInt(defense1);
                    String itemName2 = filesScan.nextLine();
                    String attack2 = filesScan.nextLine();
                    String defense2 = filesScan.nextLine();
                    int intAttack2 = Integer.parseInt(attack2);
                    int intDefense2 = Integer.parseInt(defense2);
                    this.currentDungeonItem1 = new Items(itemName1,intAttack1,intDefense1);
                    this.currentDungeonItem2 = new Items(itemName2,intAttack2,intDefense2);
                } catch (FileNotFoundException e) {
                    System.out.println("An error occurred, roadtohatteritems.txt file not found.");
                    e.printStackTrace();
                } // end of catch statement
                break;

            case 5:
                //try-catch case for dungeon location
                try {
                    String filePath = "wonderlandforest.txt";
                    File file = new File(filePath);
                    Scanner filesScan = new Scanner(file);
                    String name = filesScan.nextLine();
                    String locationDescription = filesScan.nextLine();
                    String direction1 = filesScan.nextLine();
                    this.currentLocation = new Locations(name,locationDescription,direction1);
                } catch (FileNotFoundException e) {
                    System.out.println("An error occurred, wonderlandforest.txt file not found.");
                    e.printStackTrace();
                } // end of catch statement
                //try-catch case for dungeon character
                try {
                    String filePath = "thecaterpiller.txt";
                    File file = new File(filePath);
                    Scanner filesScan = new Scanner(file);
                    String character = filesScan.nextLine().replaceAll("\\|", "\n");
                    String description = filesScan.nextLine().replaceAll("\\|", "\n");
                    String firstEncounterSaying = filesScan.nextLine().replaceAll("\\|", "\n");
                    String winSaying = filesScan.nextLine().replaceAll("\\|", "\n");
                    String defeatSaying = filesScan.nextLine().replaceAll("\\|", "\n");
                    this.currentCharacter = new Characters(character, description, firstEncounterSaying, winSaying,
                            defeatSaying);
                } catch (FileNotFoundException e) {
                    System.out.println("An error occurred, thecaterpiller.txt file not found.");
                    e.printStackTrace();
                } // end of catch statement
                //try-catch case for dungeon items
                try {
                    String filePath = "wonderlandforestitems.txt";
                    File file = new File(filePath);
                    Scanner filesScan = new Scanner(file);
                    String itemName1 = filesScan.nextLine();
                    String attack1 = filesScan.nextLine();
                    String defense1 = filesScan.nextLine();
                    int intAttack1 = Integer.parseInt(attack1);
                    int intDefense1 = Integer.parseInt(defense1);
                    String itemName2 = filesScan.nextLine();
                    String attack2 = filesScan.nextLine();
                    String defense2 = filesScan.nextLine();
                    int intAttack2 = Integer.parseInt(attack2);
                    int intDefense2 = Integer.parseInt(defense2);
                    this.currentDungeonItem1 = new Items(itemName1,intAttack1,intDefense1);
                    this.currentDungeonItem2 = new Items(itemName2,intAttack2,intDefense2);
                } catch (FileNotFoundException e) {
                    System.out.println("An error occurred, wonderlandforestitems.txt file not found.");
                    e.printStackTrace();
                } // end of catch statement
                break;

            case 6:
                //try-catch case for dungeon location
                try {
                    String filePath = "lootroom.txt";
                    File file = new File(filePath);
                    Scanner filesScan = new Scanner(file);
                    String name = filesScan.nextLine();
                    String locationDescription = filesScan.nextLine();
                    String direction1 = filesScan.nextLine();
                    String direction2 = filesScan.nextLine();
                    this.currentLocation = new Locations(name,locationDescription,direction1,direction2);
                } catch (FileNotFoundException e) {
                    System.out.println("An error occurred, lootroom.txt file not found.");
                    e.printStackTrace();
                } // end of catch statement
                //try-catch case for dungeon character
                try {
                    String filePath = "thelootroom.txt";
                    File file = new File(filePath);
                    Scanner filesScan = new Scanner(file);
                    String character = filesScan.nextLine().replaceAll("\\|", "\n");
                    String description = filesScan.nextLine().replaceAll("\\|", "\n");
                    String firstEncounterSaying = filesScan.nextLine().replaceAll("\\|", "\n");
                    String winSaying = filesScan.nextLine().replaceAll("\\|", "\n");
                    String defeatSaying = filesScan.nextLine().replaceAll("\\|", "\n");
                    this.currentCharacter = new Characters(character, description, firstEncounterSaying, winSaying,
                            defeatSaying);
                } catch (FileNotFoundException e) {
                    System.out.println("An error occurred, thelootroom.txt file not found.");
                    e.printStackTrace();
                } // end of catch statement
                //try-catch case for dungeon items
                try {
                    String filePath = "lootroomitems.txt";
                    File file = new File(filePath);
                    Scanner filesScan = new Scanner(file);
                    String itemName1 = filesScan.nextLine();
                    String attack1 = filesScan.nextLine();
                    String defense1 = filesScan.nextLine();
                    int intAttack1 = Integer.parseInt(attack1);
                    int intDefense1 = Integer.parseInt(defense1);
                    String itemName2 = filesScan.nextLine();
                    String attack2 = filesScan.nextLine();
                    String defense2 = filesScan.nextLine();
                    int intAttack2 = Integer.parseInt(attack2);
                    int intDefense2 = Integer.parseInt(defense2);
                    String itemName3 = filesScan.nextLine();
                    String attack3 = filesScan.nextLine();
                    String defense3 = filesScan.nextLine();
                    int intAttack3 = Integer.parseInt(attack3);
                    int intDefense3 = Integer.parseInt(defense3);
                    this.currentDungeonItem1 = new Items(itemName1,intAttack1,intDefense1);
                    this.currentDungeonItem2 = new Items(itemName2,intAttack2,intDefense2);
                    this.currentDungeonItem3 = new Items(itemName3,intAttack3,intDefense3);
                } catch (FileNotFoundException e) {
                    System.out.println("An error occurred, lootroomitems.txt file not found.");
                    e.printStackTrace();
                } // end of catch statement
                break;

            case 7:
                //try-catch case for dungeon location
                try {
                    String filePath = "seaoftears.txt";
                    File file = new File(filePath);
                    Scanner filesScan = new Scanner(file);
                    String name = filesScan.nextLine();
                    String locationDescription = filesScan.nextLine();
                    String direction1 = filesScan.nextLine();
                    this.currentLocation = new Locations(name,locationDescription,direction1);
                } catch (FileNotFoundException e) {
                    System.out.println("An error occurred, seaoftears.txt file not found.");
                    e.printStackTrace();
                } // end of catch statement
                //try-catch case for dungeon character
                try {
                    String filePath = "thetweedles.txt";
                    File file = new File(filePath);
                    Scanner filesScan = new Scanner(file);
                    String character = filesScan.nextLine().replaceAll("\\|", "\n");
                    String description = filesScan.nextLine().replaceAll("\\|", "\n");
                    String firstEncounterSaying = filesScan.nextLine().replaceAll("\\|", "\n");
                    String winSaying = filesScan.nextLine().replaceAll("\\|", "\n");
                    String defeatSaying = filesScan.nextLine().replaceAll("\\|", "\n");
                    this.currentCharacter = new Characters(character, description, firstEncounterSaying, winSaying,
                            defeatSaying);
                } catch (FileNotFoundException e) {
                    System.out.println("An error occurred, thetweedles.txt file not found.");
                    e.printStackTrace();
                } // end of catch statement
                //try-catch case for dungeon items
                try {
                    String filePath = "seaoftearsitems.txt";
                    File file = new File(filePath);
                    Scanner filesScan = new Scanner(file);
                    String itemName1 = filesScan.nextLine();
                    String attack1 = filesScan.nextLine();
                    String defense1 = filesScan.nextLine();
                    int intAttack1 = Integer.parseInt(attack1);
                    int intDefense1 = Integer.parseInt(defense1);
                    String itemName2 = filesScan.nextLine();
                    String attack2 = filesScan.nextLine();
                    String defense2 = filesScan.nextLine();
                    int intAttack2 = Integer.parseInt(attack2);
                    int intDefense2 = Integer.parseInt(defense2);
                    this.currentDungeonItem1 = new Items(itemName1,intAttack1,intDefense1);
                    this.currentDungeonItem2 = new Items(itemName2,intAttack2,intDefense2);
                } catch (FileNotFoundException e) {
                    System.out.println("An error occurred, seaoftearsitems.txt file not found.");
                    e.printStackTrace();
                } // end of catch statement
                break;

            case 8:
                //try-catch case for dungeon location
                try {
                    String filePath = "whiterabbitshut.txt";
                    File file = new File(filePath);
                    Scanner filesScan = new Scanner(file);
                    String name = filesScan.nextLine();
                    String locationDescription = filesScan.nextLine();
                    String direction1 = filesScan.nextLine();
                    this.currentLocation = new Locations(name,locationDescription,direction1);
                } catch (FileNotFoundException e) {
                    System.out.println("An error occurred, whiterabbitshut.txt file not found.");
                    e.printStackTrace();
                } // end of catch statement
                //try-catch case for dungeon character
                try {
                    String filePath = "thewhiterabbit.txt";
                    File file = new File(filePath);
                    Scanner filesScan = new Scanner(file);
                    String character = filesScan.nextLine().replaceAll("\\|", "\n");
                    String description = filesScan.nextLine().replaceAll("\\|", "\n");
                    String firstEncounterSaying = filesScan.nextLine().replaceAll("\\|", "\n");
                    String winSaying = filesScan.nextLine().replaceAll("\\|", "\n");
                    String defeatSaying = filesScan.nextLine().replaceAll("\\|", "\n");
                    this.currentCharacter = new Characters(character, description, firstEncounterSaying, winSaying,
                            defeatSaying);
                } catch (FileNotFoundException e) {
                    System.out.println("An error occurred, thewhiterabbit.txt file not found.");
                    e.printStackTrace();
                } // end of catch statement
                //try-catch case for dungeon items
                break;
            default:
                System.out.println("You did not setup your switch statement properly you dingus!!!!!!!!!!!");
        } // end of switch case
    } // end of set dungeon scene

    // default parameter contstructor
    Control(){
        setScene(0);
    } //end of default control constructor

    //parameter constructor
    Control(int scene){
        setScene(scene);
    } //end of paramter constructor

} //end of Contorl class
