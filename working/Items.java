/**
Title: Items.java
Description: this class is the base schema to create any items to be used in the game
Date Created: May 29, 2021
Date Last Revised:
@author: Ty Keith - 3270281
@version: 1.0
@copyright 2021  T.Keith

Required:   compiled Items.Java
Compile:    javac Items.java


Variables:
private String itemName - the items name that is set via parameters
private int attack - the items attack score which is set via parameters
private int defense - the items defense score which is set via parameters


Constructors:
Items() - default constructor
Items(String itemName, int attack, int defense) - constructor that creates and item with certain parameters

Methods:
setItemName - sets the items name
getItemName - returns the item name
setAttack - sets the attack score
getAttack - returns attack score
setDefense - sets the defense score
getDefense - returns defense score

Test Plan:
 see GameMain.java
*/

// import scanner object
import java.util.Scanner;

//main items class
public class Items {

    //setup variables
    private String itemName;
    private int attack;
    private int defense;

    // item setter method
    public void setItemName(String item) {

        // if statement that checks to make sure character length is valid
        if (item.length() >= 2) {
            this.itemName = item;
        } // end of if statement
        // else statement that causes a scanner object to open an loop until the setter is satisfied
        else {
            int doValue = 0;
            do {
                System.out.println("Item Name has to be longer than 2 characters.");
                System.out.print("Input a new item name: ");
                Scanner scanItem = new Scanner(System.in);
                String newItemName = scanItem.nextLine();
                if (newItemName.length() >= 2) {
                    this.itemName = newItemName;
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
    } // end of item setter

    // item getter method
    public String getItemName() {
        return this.itemName;
    } // end of item getter

    // attack setter method
    public void setAttack(int attackScore) {
        // if statement that checks to make sure attack score is valid
        if (attackScore >= 0 && attackScore == (int)attackScore) {
            this.attack = attackScore;
        } // end of if statement
        // else statement that causes a scanner object to open an loop until the setter is satisfied
        else {
            int doValue = 0;
            do {
                System.out.println("Attack Score cannot be a less than a zero integer value.");
                System.out.print("Input a new attack score: ");
                Scanner scanAttack = new Scanner(System.in);
                int newAttackScore = scanAttack.nextInt();
                if (newAttackScore >= 0 && newAttackScore == (int)newAttackScore) {
                    this.attack = newAttackScore;
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
    } // end of attack setter

    // attack getter method
    public int getAttack() {
        return this.attack;
    } // end of attack getter

    // defense setter method
    public void setDefense(int defenseScore) {
        // if statement that checks to make sure attack score is valid
        if (defenseScore >= 0 && defenseScore == (int)defenseScore) {
            this.defense = defenseScore;
        } // end of if statement
        else {
            int doValue = 0;
            do {
                System.out.println("Defense Score cannot be a less than a zero integer value.");
                System.out.print("Input a new defense score: ");
                Scanner scanDefense = new Scanner(System.in);
                int newDefenseScore = scanDefense.nextInt();
                if (newDefenseScore >= 0 && newDefenseScore == (int)newDefenseScore) {
                    this.defense = newDefenseScore;
                    doValue = 1;
                    System.out.println();
                } // end of if statement
                // else statement that causes a scanner object to open an loop until the setter is satisfied
                else {
                    doValue = 0;
                    System.out.println();
                    System.out.println();
                } // end of else statement
            } // end of do statement
            while (doValue == 0);
        } // end of else statement
    } // end of attack setter

    // defense getter method
    public int getDefense() {
        return this.defense;
    } // end of defense getter

    // default constructor
    Items() {

    }// end of default constuctor

    // item parameter constructor
    Items(String itemName, int attack, int defense){
            this.setItemName(itemName);
            this.setAttack(attack);
            this.setDefense(defense);
} // end of item constructor

} //end of Items class
