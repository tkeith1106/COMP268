/**
Title: Inventory.java
Description: this class uses the Item.java class inorder to create a player inventory via an array list
Date Created: May 30, 2021
Date Last Revised:
@author: Ty Keith - 3270281
@version: 1.0
@copyright 2021  T.Keith

Required:   compiled Inventory.Java, Items.Java
Compile:    javac Inventory.java

Classes:
ArrayList<Items> playerInventory = new ArrayList<Items>() - default array list which will hold items

Constructors:
Inventory() - default constructor that does nothing
Inventory(Items item) - uses item objects to add to array list inventory object

Methods:
setPlayerInventory - sets new item into player inventory if player inventory is less than 3
getPlayerInventory - returns items in player inventory
getItemAttack - gets item attack score based of index position
getItemDefense - gets item defense score based of index position
getAttackDefenseScore - counts the attack and defense score of all items in inventory
clearInventory - clears inventory

Test Plan:
 1. Run the application.
   see GameMain.java
*/

// import array list object class
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Inventory{
    // setup inventory list
    public static ArrayList<Items> playerInventory = new ArrayList<Items>();

    //setter method for inventory
    public void setPlayerInventory(Items item) {
        // if statement to check size of inventory
        if (playerInventory.size() < 3 && playerInventory.size() >= 0) {
            playerInventory.add(item);
        }
        // else statement to replace an item if the inventory is greater than 3 items
        else {
            int doValue = 0;
            /* do statement that iterates through current invenory and prints reseults then askes the
            /  user to replace an item of their choice. there is a try/catch incase the user inputs
            /  a non valid data type */
            do {
                Scanner scan = new Scanner(System.in);
                System.out.println("Inventory List:");
                for (int i = 0; i < playerInventory.size(); i++) {
                    System.out.println("\t\t" + (i+1) + ": " + playerInventory.get(i).getItemName());
                }
                System.out.println();
                System.out.print("Your inventory is full. Please enter the number of an item to drop: ");
                try {
                    int userInput = scan.nextInt();
                    if ((userInput - 1) < 3 && (userInput - 1) >= 0) {
                        playerInventory.remove((userInput - 1));
                        playerInventory.add(item);
                        doValue = 1;
                    } // end of do-if conditional statement
                    else {
                        doValue = 0;
                        System.out.println("Please Enter a Valid list index number from 1-3!" + "\n");
                    } // end of else statment
                } // end of try
                catch (InputMismatchException e) {
                    System.err.println("Wrong input! Input only integer numbers please...");
                    doValue = 0;
                } // end of catch

            } // end of do statement
            while (doValue == 0);
        }
    } // end of setter method

    // getter method for inventory
    public void getPlayerInventory() {
        for (int i = 0; i < playerInventory.size(); i++) {
            System.out.println(playerInventory.get(i).getItemName());
            System.out.println("\t\tAttack Score: " + playerInventory.get(i).getAttack());
            System.out.println("\t\tDefense Score: " + playerInventory.get(i).getDefense());
            System.out.println();
        } // end of for loop
    } // end of getter method

    // getter method for getItemAttack
    public int getItemAttack(int itemIndex) {
        int attackScore;
        attackScore = playerInventory.get(itemIndex).getAttack();
        return attackScore;
    } // end of getter method

    // getter method for getItemDefense
    public int getItemDefense(int itemIndex) {
        int defenseScore;
        defenseScore = playerInventory.get(itemIndex).getAttack();
        return defenseScore;
    } // end of getter method

    // get getAttackDefenseScore method
    public int getAttackDefenseScore() {
        int item1Attack = 0;
        int item2Attack = 0;
        int item3Attack = 0;
        int item1Defense = 0;
        int item2Defense = 0;
        int item3Defense = 0;
        int attackDefenseScore = 0;
        // counts single inventory item A/D score
        if (playerInventory.size() == 1) {
            item1Attack = playerInventory.get(0).getAttack();
            item1Defense = playerInventory.get(0).getDefense();
            int attackScore = item1Attack+item2Attack+item3Attack;
            int defenseScore = item1Defense+item2Defense+item3Defense;
            attackDefenseScore = attackScore+defenseScore;
        } // single item A/D score
        // counts 2 inventory item A/D score
        else if (playerInventory.size() == 2) {
            item1Attack = playerInventory.get(0).getAttack();
            item2Attack = playerInventory.get(1).getAttack();
            int attackScore = item1Attack+item2Attack+item3Attack;
            item1Defense = playerInventory.get(0).getDefense();
            item2Defense = playerInventory.get(1).getDefense();
            int defenseScore = item1Defense+item2Defense+item3Defense;
            attackDefenseScore = attackScore+defenseScore;
        }// two item A/D score
        // counts 3 inventory item A/D score
        else if (playerInventory.size() == 3) {
            item1Attack = playerInventory.get(0).getAttack();
            item2Attack = playerInventory.get(1).getAttack();
            item3Attack = playerInventory.get(2).getAttack();
            int attackScore = item1Attack+item2Attack+item3Attack;
            item1Defense = playerInventory.get(0).getDefense();
            item2Defense = playerInventory.get(1).getDefense();
            item3Defense = playerInventory.get(2).getDefense();
            int defenseScore = item1Defense+item2Defense+item3Defense;
            attackDefenseScore = attackScore+defenseScore;
        }// three item A/D score
        return attackDefenseScore;
    } // end of getter method

    // clearInventory method
    // uses array list size to clear item by index
    public void clearInventory() {
        for (int i = 0; i < playerInventory.size();) {
            playerInventory.remove(i);
        } // end of clear inventory method
    } //end of clear inventory

    // default constructor
    Inventory() {
    }

    // paramater constructor
    Inventory(Items item) {
        this.setPlayerInventory(item);

    } // end of parameter consructor
} //end of Inventory class





