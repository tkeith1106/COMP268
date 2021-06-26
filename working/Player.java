/**
Title: Player.java
Description: This class initiates the player object that will be used to track the name of the player and how many
             remaining lives that they have left.
Date Created: May 22, 2021
Date Last Revised:
@author: Ty Keith - 3270281
@version: 1.0
@copyright 2021  T.Keith

Required:   compiled Player.Java
Compile:    javac Player.java

Variables:
private int life - the amount of lives the player has
private String name - players name, right now default is Alice but could be changed to accept user input later on

Constructors:
Player() - single default constructor that initiates a player with 3 lives

Methods:
setLife(int life) - sets the players life with a variety of different constraints on how the players lives are set
getLife() - returns players life count
getName - returns players name


Test Plan:
 see GameMain.java
*/

public class Player extends Actions{

  // setup variables
  private int life;
  private String name = "Alice";

  // setter methods to set life counts
  public void setLife(int life) {
      if (life <= 0) {
          System.out.println("You are Dead!!..Game Over.");
          this.life = 0;
      } // end of 0 if-statement

      else if (life == 1) {
          System.out.println("You only have 1 life left");
          System.out.println("Next time you die it is GAME OVER!!");
          this.life = 1;
      } // end of 1 if-statement

      else if (life == 2) {
          System.out.println("You have 2 lives left");
          this.life = 2;
      } // end of 2 if-statement

      else if (life == 3) {
          System.out.println("You have 3 lives left.");
          this.life = 3;
      } // end of 3 if-statement

      else if (life == 4) {
          System.out.println("You have 4 lives left.");
          this.life = 4;
      } // end of 4 if-statement

      else if (life > 4 && life < 10) {
          System.out.println("Your have reached maximum life capabilities.");
          System.out.println("You have 5 lives left.");
          this.life = 5;
      } // end of 5 to 9 if-statement

      else if (life == 10) {
          this.life = 0;
      } // end of 10 if-statement, that is only to help with the end of the game

      else {
          System.out.println("Max Health already reached.");
          this.life = 5;
      } // end of else-statement
  } //  end of life setter

    // get life getter method
    public int getLife() {
      return this.life;
    } // end of life getter class

    // name getter method
    public String getName() {
      return this.name;
    } //end of name setter class

    // default constructor when a player instance is created
    Player(){
      this.setLife(3);
    } // end of player default constructor

} //end of Player class
