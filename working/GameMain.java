/**
Title: GameMain.java
Description: This is the main class that communicates with the other classes that were created in order for the game
             to properly run. The game runs a choose your own adventure text game. It requires player input in order
             to progress through the game. every choice made has a consequnce on the final outcome of the players
             adventure, so they need to think and choose wisely at every step of the game
Date Created: June 2021
Date Last Revised:
@author: Ty Keith - 3270281
@version: 1.0
@copyright 2021  T.Keith

Required:   Actions.Java, Characters.Java, Control.Java, Direction.Java, Inventory.Java, Items.Java, Locations
            Player.Java, thecaterpiller.txt, thecheschirecat.txt, thekingandqueenofhearts.txt, theknaveofhearts.txt,
            themadhatter.txt, thetweedles.txt, thewhiterabbit.txt,
Required Compiled: Actions.Java, Characters.Java, Control.Java, Direction.Java, Inventory.Java, Items.Java, Locations
                    Player.Java
Compile:    javac GameMain.java
Run:        java GameMain

Classes:
Player player1 - this object creates on instance of player1 which sets their lives and a preset name
Scanner scan - this object is created in order to receive player input when needed
Inventory playerInventory - this object creates an instance of the players inventory and allows them to add items into
                            their invenotory, if their inventory does get full they will be prompted to frop an item
                            of their choice
Control game - this object creates an actual instance of the game an allows the GameMain to call instances of each
                scene into play, depending on the players choiees and routes taken
Random random - a random object used to app some simple probabilites to outcomes of certain actions
File file - a file object that searches for a specific txt file in thhe same directory as the game
Scanner filesScan - a scanner object that reads a text files and prints that to console

Variables:
String playerChoice - a string integer that holds player choices from the scan object
int currentScene - this is an integer value that helps to communicate the current scene to the game object when needed
int doValue - a conditional value used in do-while loops
int nestDoValue - a conditional value used in nested  do-while loops
int randoInt - a intger variable that holds a random objects random interger
int nestRandoInt - a secondary intger variable that holds a random objects random interger
String continueChoice - a variable that holds the scan objects input from the player on if they want to continur
                        playing the adventure or not

Test Plan:
 1. Run the application.
    EXPECTED:
                the game has several areas that are identical but have different results based on what the player
                chooses, the test plan will cover the 2 main branches. If you refer to the 'AliceinWonderland.jpeg' file
                to visualize this. The left and Right (Branch 1) routes have different encounters but the same
                strucutre on how they work, but the middle (Branch 2) route requires a different strucuture to explain
                each area and choices. The rooms may be in different directions but the structure from the contorl class
                is the genral output will function the same. The game starts with printing out the below to the console:

                        You have 3 lives left.

                        Welcome! Alice

                        You have awoken in a dungeon, you must have been knocked out when you were
                        captured! The King and Queen of Hearts plan to make you stand trial for the
                        theft of their precious tarts. You know it was not you but you have zero
                        proof of that!! Suddenly you hear a noise. This is where your adventure begins.

                        The Cheschire Cat has appeared out of nowhere!!

                        Wake up Alice!! You have been placed into the dungeon and are awaiting trial by the King and Queen of Hearts.
                        Take the Golden Key and Escape to the White Rabbits Hut, for if you do not then you are in
                        for a certain death!. The king and queen do not play fairly with their trials!

                        Will you take the golden key?? (yes or no):

the player has to input a choice to proceed, that choice can be yes or no

if the player chooses 'yes' then the below dialogue prints to the console:

                        Quick Alice! run take any direction out of here but hurry! I hear the guards coming now!!!

                        You run to the door, and see that you have 3 exit directions
                        Direction: go right
                        Direction: go left
                        Direction: go straight
                        Which direction will you go?:

if instead the player chooses 'no' then the player will get the below message and will die and start again with the
prompt:

                        Why would you not take the Golden Key!? You will surely die now. [You hear guards marching down the hallway to take you to the guillotine!, you are surely going to die!]

                        You have 2 lives left

                        Will you take the golden key?? (yes or no):

for Branch1 the player will now need to choose what direction they will go, which is left or right:thier choice will
open up different branches to follow, again depending on the direction selected by the player the print out to the
console could be different:

if the player choose to go 'right' then the console prints the below:

                        You have stumbled upon: Croquet Grounds
                        a green lucious outdoor space to play and have fun

                        You Notice: The Knave of Hearts
                        An attendant to the King and Queen. The Knave is generally indifferent to anything and easily startled.

                        OH MY! These tarts are delicious! Hey Wait, what!?.
                        Who are you? You cant be here, it is too late!!!!.
                        You have already seen too much, I do not want to do this but I have no choice.
                        [The Knave of Hearts takes a defensive stance and pulls his sword!]

                        Will you stay and fight or run away?? (attack or run):


from there the player will have to choose if they want to attack or run. if they attack or run they will continue on
the same branch. if they attack they will have a chance to defeat the enemy and collect a reward. if they run the
wont collect any items. This part has variablility to but they will get something like below:

                        You Decided to attack.
                        Oh owwwwwwwwiiiiieeeee, you really did it this time I am bleeding and must get medical attention [The Knave of Hearts runs away in tears and blood!]

                        You picked up and item, your inventory now looks like:
                        Golden Key
                        Attack Score: 0
                        Defense Score: 0

                        Croquet Mallet
                        Attack Score: 1
                        Defense Score: 0

                        You have stumbled upon: Wonderland Forest
                        A confusing forest where no end is in sight.. lets hope you do not get lost!!

                        You Notice: The Caterpillar
                        A large caterpillar who sits on a giant mushroom while smoking a hookah all day

                        Will you stay and sneak attack or sneak away?? (attack or run):

if the player decided to run they will get the below output:

                        You Decided to run

                        You have stumbled upon: Wonderland Forest
                        A confusing forest where no end is in sight.. lets hope you do not get lost!!

                        You Notice: The Caterpillar
                        A large caterpillar who sits on a giant mushroom while smoking a hookah all day

                        Will you stay and sneak attack or sneak away?? (attack or run):


the next encounter is exactly the same in structure as above but the potential to collect different items in the game
is the main difference. the console print outs will be virtually the same as the previous encounter just with
different characters and dialgoue. for this purpose the test docs wont include all text print out and options in
order to keep the size of the documentation at a reasonable level.

once the player decides to attack or run during the 2nd encounter they will then approach the boss with all of their
collected items they are presented with the below console print out

                        You have stumbled upon: The White Rabbits Hut
                        You have made it!! It is the White Rabbit's hut but its oddly quiet here...


                        Hit the enter key to proceed...

                        the player will then be given the following print out and in that print out it tells them theur attacka nd defense
                        score based off the items that they collected in the attack encounters (or the 0 score if they didnt pick up and items)

                        You approach the The White Rabbits Hut and are
                        immediatley ambushed by: The King and Queen of Hearts
                        The King and Queen of Hearts are the rulers of Wonderland and are known to be aggressive and ruthless.

                        [Queens says] Alice, you clever little girl escaping our dungeons and the consequences of your actions will be dire.
                        You don't understand the trouble you are now in.
                        [King says] Do you know what my Queen?! We shall have her head in no time.

                        You have no choice but to defend yourself from The King and Queen of Hearts
                        Hopefully you built your inventory enough to give yourself a fighting chance!!
                        The King and Queen of Hearts attack!

                        Hit the enter key to proceed...

                        Your combined Attack/Defense score is 0

                        Hit the enter key to proceed...


depending on the players Attack/Defense score they get different odds of beating ht eboss and will get someting
similar to below:

                        You have a terrible chance at defeating The King and Queen of Hearts
                        Good Luck, you will need it!! Attack now for your best chance at defeating them


                        Your effort and might was not enough, you were defeated
                        [King says] Oh Alice you poor girl you deserved what your have gotten!
                        [Queen says] OFF WITH HER HEAD!!!!
                        [The King and Queen of hearts have defeated you !!!!!!!!!!]

                        You have 2 lives left

they will then have to repeat the encounter until they lose all their lives or win. if the play wins they will get the
below console printout dialogue which then compelte the game:

                        Your effort and might pulled through, you defeated The King and Queen of Hearts

                        [Queen says] Oh my, could this be? how have we been defeated. This is terrible!!! [The King and Queen have been defeated for good!]You....You did it!! You beat the King and Queen of Hearts. They planned to play you dirty and you
                        managed to overcome them!!!!! Congratulations. Now that they are defeated lets get you home,
                        where you will be safe forever.

                        You....You did it!! You beat the King and Queen of Hearts. They planned to play you dirty and you
                        managed to overcome them!!!!! Congratulations. Now that they are defeated lets get you home,
                        where you will be safe forever.

                        [The White Rabbit leads you inside of his hut]

                        It has been wonderful getting to meet you and everyone here will
                        miss you forever! Good luck with the rest of your Life

                        [The White Rabbit pulls out a large book and hits you with it, jolting you awake, as you come to your
                        senses you realize that it was all just a very bad dream and that you were safe all along in the comfort
                        of your sister lap, while she read her book. You feel foolish but you will never forget the adventure
                        that you had in your dream and will never quite believe that it wasn't real.....]

                        After reading...Hit the enter key to proceed...

the player will then be prompted and asked if they want to play again. they will get to below console print out. if
they choose yes then the game restarts from the beginning of they choose no they get the below print out to the
console:

Would you like to play again?? (yes or no)
If yes the game will restart! If no the console will shut down: 'no'


Game Over!!!

NOW, if the player at the very beginning chooses to go Straight Branch 2 opens up and they will have some different
interacrtions for the next 2 rooms where when completed they will be asked to choose a direction which will connect
them back into Branch 1 at the second enemy encounter where they will play thorugh that encounter before moving onto
the boss. If they choose to go straight there next few encounters will look like below:

                        You have stumbled upon: Underground Tunnel
                        A mysterious tunnel that leads to somewhere!


                        You come across a Strange Mushroom.
                        do you dare consume it (yes/no)????:

if the player chooses to yes they will then be prompted with a chance encounter of gaining or losoing a life
depending on if the mushroom is good or bad. But they have the off chance to have the mushroom be terrible and instanly
kill them and cause them to have to restart the game. Its the risk you take when eating random mushrooms. If the
player chooses to eat the mushroom they could have a print out similar to below:

                        You eat the Strange Mushroom
                        You feel okay.....
                        But your stomach hurts a bit. You lost a life!!!
                        You have 2 lives left


if the player chooses no they will go on to the next room and get the following print out the the console:


                        You dont risk it and move on further into the tunnel

the next encounter is activated and the player will get the following console print out:

                        You have stumbled upon: Loot Room
                        A random room full of loot.. YAY! Better hurry and grab something before you get caught!


                        You come across some items:
                        Item 1: Little Cakes
                        Item 2: Little Bottle
                        Item 3: Strange Mushroom


                        Quickly..Choose an item number and get going:

here the player has to choose an item whcih will give them an unknown advantage or in the case of the strange room a
potential disadvantage. Once an item is chosen the player will have to choose the direction they would like to go
whcih will hook them back into branch 1 and start second enemy ecnouter before they move onto the boss fight. The
player will get the below print out to the console:

                        You picked up Little Cakes
                        Your current inventory is as follows:
                        Golden Key
                        Attack Score: 0
                        Defense Score: 0

                        Little Cakes
                        Attack Score: 1
                        Defense Score: 0

                        You can move left or right out of this room, choose a direction:

from here the encounters continue as if you took branch 1 and will continue as so from the test plan on line # 139

     ACTUAL:
              program performs as expected.


 2. Good data cases:
                the user will input keyboard commamnd which are all read in as string inputs from a scanner object
                that tests against keywords that are aceptable, to keep the spirit of the text adventure alive. All
                data input no matter how long as long as it is with the appropraite keywords is good data

 3. Bad data cases:
                 the scanner classes in the game are all string related scanners and any user input will be input as
                 strings and handled by contain statments that must contain certain key words, if these keywords aren't hit then it
                 will print to the console. examples of this are below:

                                Acceptable Options:
                                attack
                                run

                                Please type a valid option from above:

                                Acceptable Options:
                                go right
                                go left
                                go straight

                                Please type a valid option from above:


                                Acceptable Options:
                                Item 1
                                Item 2
                                Item 3

                                Please type a valid option from above:

                 when a text file is read in and the file cannot be found the console with throw an exception and
                 print the folowing message out to the console:

                                An error occurred, file not found.

*/

// import statements
import java.io.File;
import java.util.Scanner;
import java.util.Random;
import java.io.FileNotFoundException;
public class GameMain {
  public static void main(String[] args) {
      //set player instance and variables
      Scanner scan = new Scanner(System.in);
      Player player1 = new Player();
      Inventory playerInventory = new Inventory();
      Control game;
      int currentScene;
      // main do-loop that is actually a never ending loop to keep the game always running
      do {
          // if statement that checks if the player has at least one life
          if (player1.getLife() > 0) {
              //start of them game statements
              //create the game instance and set the first scene
              game = new Control(1);
              System.out.println("\n" + "Welcome! " + player1.getName() + "\n");
              System.out.println("You have awoken in a " + game.currentLocation.getDescription());
              System.out.println("you must have been knocked out when you were captured!");
              System.out.println("The King and Queen of Hearts plan to make you stand trial for the");
              System.out.println("theft of their precious tarts. You know it was not you but you have zero");
              System.out.println("proof of that!! Suddenly you hear a noise. This is where your adventure begins.");
              //interaction with the first character from scene 1
              System.out.println("\n" + game.currentCharacter.getName() + " has appeared out of nowhere!!");
              System.out.println("\n" + game.currentCharacter.getFirstEncounterSaying());
              int doValue = 0;
              // do statement that has the player choose if they will accept the dungeon key to escape
              do {
                  System.out.print("\n" + "Will you take the golden key?? (yes or no): ");
                  String playerChoice = scan.nextLine();
                  //if they take the key then it is put into their inventory
                  if (player1.getLife() > 1 && playerChoice.toLowerCase().contains("yes")) {
                      player1.setAction("pickup item");
                      playerInventory.setPlayerInventory(game.currentDungeonItem1);
                      System.out.println("\n" + game.currentCharacter.getWinSaying());
                      doValue = 1;
                  } // end of if-statement
                  //else if they say no they die and lose a life
                  else if (player1.getLife() > 1 && playerChoice.toLowerCase().contains("no")) {
                      System.out.println("\n" + game.currentCharacter.getDefeatSaying() + "\n");
                      int newLifeCount = player1.getLife() - 1;
                      player1.setLife(newLifeCount);
                      doValue = 0;
                  }// end of else-if statement
                  // secondary else if statement that takes a plyer form 1 life to 0 and breaks out of the loop
                  else if (player1.getLife() == 1 && playerChoice.toLowerCase().contains("no")) {
                      System.out.println("\n" + game.currentCharacter.getDefeatSaying() + "\n");
                      int newLifeCount = player1.getLife() - 1;
                      player1.setLife(newLifeCount);
                      break;
                  }// end of else-if statement
                  /* if the player enters an incorrect word then the else statement makes them loop back and enter a
                  /  proper statement */
                  else {
                      System.out.print("\n" + "You need to type in yes or no: ");
                      doValue = 0;
                  } // end of else statement
              } // end of do statment
              while (doValue == 0 && player1.getLife() > 0);
              //the player gets to choose where they head on their adventure without really knowing where they will go
              if (player1.getLife() > 0) {
                  System.out.println("\n" + "You run to the door, and see that you have 3 exit directions");
                  System.out.println("Direction: " + game.currentLocation.getDirection1());
                  System.out.println("Direction: " + game.currentLocation.getDirection2());
                  System.out.println("Direction: " + game.currentLocation.getDirection3());
                  System.out.print("Which direction will you go?: ");
                  doValue = 0;
                  // do statement that gets player input
                  do {
                      String playerChoice = scan.nextLine();
                      if (playerChoice.toLowerCase().contains("right")) {
                          game.setScene(2);
                          doValue = 2;
                      } // end of if direction statement
                      else if (playerChoice.toLowerCase().contains("left")) {
                          game.setScene(4);
                          doValue = 4;
                      } // end of else-if direction statement
                      else if (playerChoice.toLowerCase().contains("straight")) {
                          game.setScene(3);
                          doValue = 3;
                      } // end of else-if direction statement
                      /* if the player does not enter acceptable statements the else statement loops back and prompts
                         them to do so */
                      else {
                          System.out.println("\n\n" + "Acceptable Options:");
                          System.out.println("      go right");
                          System.out.println("      go left");
                          System.out.println("      go straight");
                          System.out.print("\n" + "Please type a valid option from above: ");
                          doValue = 0;
                      }
                  } // end of do statement
                  while (doValue == 0 && player1.getLife() > 0);
              } // end of if statment
              // afte the player chooses their direcion a new scene is set from the control class and they continue on
              if (game.currentScene == 3 && player1.getLife() > 0) {
                  System.out.print("\n\n" + "You have stumbled upon: ");
                  System.out.println(game.currentLocation.getName());
                  System.out.println(game.currentLocation.getDescription());
                  System.out.println("\n\n" + "You come across a " + game.currentDungeonItem1.getItemName() + ".");
                  System.out.print("do you dare consume it???? (yes/no): ");
                  doValue = 0;
                  /*
                  In this do-statment the player gets to choose if they want to pickup an item and consumer it
                  if they do they risk death by a random variable that decides their fate
                   */
                  do {
                      String playerChoice = scan.nextLine();
                      if (playerChoice.toLowerCase().contains("yes")) {
                          System.out.println("\n" + "You eat the " + game.currentDungeonItem1.getItemName());
                          Random random = new Random();
                          int randoInt = random.nextInt(3);
                          if (randoInt == 0 || randoInt == 1 || randoInt == 2) {
                              System.out.println("You feel okay.....");
                              int nestRandoInt = random.nextInt(1);
                              if (nestRandoInt == 0) {
                                  System.out.println("But your stomach hurts a bit. You lost a life!!!");
                                  int newLifeCount = player1.getLife() - 1;
                                  player1.setLife(newLifeCount);
                                  doValue = 1;
                              }// end of nested do-if-statement
                              else {
                                  System.out.println("And you start to feel more than great! You lost gain a life!!!");
                                  int newLifeCount = player1.getLife() + 1;
                                  player1.setLife(newLifeCount);
                                  doValue = 1;
                              } // end of nested else statement
                          } // end of if statment
                          else {
                              System.out.println("You took a risk and it did not pay off. You die a slow painful " +
                                      "death and have lost all your lives from the poisoning. SHAME!!!!");
                              player1.setLife(0);
                              doValue = 1;
                          }// end of else statement
                      } // end of if statement
                      else if (playerChoice.toLowerCase().contains("no")) {
                          System.out.println("\n" + "You dont risk it and move on further into the tunnel");
                          doValue = 1;
                      } //end of else if statement
                      else {
                          System.out.print("Please type in yes or no: ");
                          doValue = 0;
                      } //
                  } // end of do statement
                  while (doValue == 0 && player1.getLife() > 0);
                  game.setScene(6);
              }// end of if statement
              /*
              secondary scene option that has the player take on a new enemy that is called from the control class
              when a certain scene is set. that choice is set when the player makes certain choices
              */
              else if (player1.getLife() > 0){
                  System.out.print("\n\n" + "You have stumbled upon: ");
                  System.out.println(game.currentLocation.getName());
                  System.out.println(game.currentLocation.getDescription());
                  System.out.print("\n" + "You Notice: ");
                  System.out.println(game.currentCharacter.getName());
                  System.out.println(game.currentCharacter.getDescription());
                  System.out.println("\n" + game.currentCharacter.getFirstEncounterSaying());
                  System.out.print("\n" + "Will you stay and fight or run away?? (attack or run): ");
                  doValue = 0;
                  do {
                      String playerChoice = scan.nextLine();
                      // player gets to choose to attack or run
                      if (playerChoice.toLowerCase().contains("attack")) {
                          player1.setAction("attack");
                          System.out.println("\n" + "You Decided to attack.");
                          Random random = new Random();
                          int nestDoValue = 0;
                          do {
                              /*
                              if the player decides to attack they go through a random operation that determines
                              their chance at winning the battle. If they win the battle there is another random
                              operation that decided if they get a good or bad weapon/defense item to take to the
                              final battle with them
                              */
                              int randoInt = random.nextInt(3);
                              if (randoInt == 0 || randoInt == 1 || randoInt == 2) {
                                  System.out.println(game.currentCharacter.getDefeatSaying());
                                  int nestRandoInt = random.nextInt(3);
                                  if (nestRandoInt == 0 || nestRandoInt == 1 || nestRandoInt == 2) {
                                      playerInventory.setPlayerInventory(game.currentDungeonItem2);
                                      System.out.println("\n\n" + "You picked up and item, your inventory now looks like:");
                                      playerInventory.getPlayerInventory();
                                      doValue = 1;
                                      currentScene = game.currentScene + 3;
                                      game.setScene(currentScene);
                                      break;
                                  }// end of nested do-if-statement
                                  else {
                                      playerInventory.setPlayerInventory(game.currentDungeonItem1);
                                      System.out.println("\n\n" + "You picked up and item, your inventory now looks like:");
                                      playerInventory.getPlayerInventory();
                                      doValue = 1;
                                      currentScene = game.currentScene + 3;
                                      game.setScene(currentScene);
                                      break;
                                  } // end of nested do-else-statement
                              } // end of if-statement
                              // player has died, list a life and must choose to fight or run again
                              else {
                                  System.out.println(game.currentCharacter.getWinSaying());
                                  int newLifeCount = player1.getLife() - 1;
                                  player1.setLife(newLifeCount);
                                  nestDoValue = 0;
                                  doValue = 1;
                              } // end of else statement
                          } // nest do statement
                          while (nestDoValue == 0 && player1.getLife() > 0);
                      } // end of if statement
                      //player runs but has no opportunity to pickup an item
                      else if (playerChoice.toLowerCase().contains("run")) {
                          player1.setAction("run");
                          System.out.println("\n\n" + "You Decided to run");
                          currentScene = game.currentScene + 3;
                          game.setScene(currentScene);
                          doValue = 1;
                      } // end of else if statment
                      // player is prompted with acceptable options to enter and then has to re-enter their intent.
                      else  {
                          System.out.println("\n\n" + "Acceptable Options:");
                          System.out.println("      attack");
                          System.out.println("      run");
                          System.out.print("\n" + "Please type a valid option from above: ");
                          doValue = 0;
                      } // end of else statement
                  } // end of do statement
                  while (doValue == 0 && player1.getLife() > 0);
              } // end of else-if statement
              /*
              player moves to next scene and depending on prior choices has to battle another enemy or if they took
              the undergournd tunnel they can decide to pickup 1 of 3 items that they have no idea if it helps or
              hurts them
              */
              if (player1.getLife() > 0) {
                  doValue = 0;
                  game.setScene(game.currentScene);
                  do {
                      // player prompted with items that they can choose from
                      if (game.currentScene == 6 && doValue == 0) {
                          System.out.print("\n\n" + "You have stumbled upon: ");
                          System.out.println(game.currentLocation.getName());
                          System.out.println(game.currentLocation.getDescription());
                          System.out.println("\n\n" + "You come across some items: ");
                          System.out.println("     Item 1: " + game.currentDungeonItem1.getItemName());
                          System.out.println("     Item 2: " + game.currentDungeonItem2.getItemName());
                          System.out.println("     Item 3: " + game.currentDungeonItem3.getItemName());
                          System.out.print("\n\n" + "Quickly..Choose an item number and get going: ");
                          int nestedDoValue = 0;
                          // do loop that lets the player choose what item they want to pickup
                          do {
                              String playerChoice = scan.nextLine();
                              if (playerChoice.toLowerCase().contains("1")) {
                                  player1.setAction("pickup item");
                                  System.out.println("\n" + "You picked up " + game.currentDungeonItem1.getItemName());
                                  playerInventory.setPlayerInventory(game.currentDungeonItem1);
                                  System.out.println("Your current inventory is as follows: ");
                                  playerInventory.getPlayerInventory();
                                  nestedDoValue = 1;
                              } //end of nested if statement
                              else if (playerChoice.toLowerCase().contains("2")) {
                                  player1.setAction("pickup item");
                                  System.out.println("\n" + "You picked up " + game.currentDungeonItem2.getItemName());
                                  playerInventory.setPlayerInventory(game.currentDungeonItem2);
                                  System.out.println("Your current inventory is as follows: ");
                                  playerInventory.getPlayerInventory();
                                  nestedDoValue = 1;
                              } // end of else if statement
                              else if (playerChoice.toLowerCase().contains("3")) {
                                  System.out.println("\n" + "You picked up " + game.currentDungeonItem3.getItemName());
                                  int secondNestedDoValue = 0;
                                  /*
                                  if strange mushrrom is picked up and consumed they player again takes a chance
                                   on if that is beneficial or not to them
                                  */
                                  do {
                                      System.out.print("do you dare consume it???? (yes/no): ");
                                      playerChoice = scan.nextLine();
                                      if (playerChoice.toLowerCase().contains("yes")) {
                                          System.out.println("You eat the " + game.currentDungeonItem3.getItemName());
                                          Random random = new Random();
                                          int randoInt = random.nextInt(3);
                                          if (randoInt == 0 || randoInt == 1 || randoInt == 2) {
                                              System.out.println("You feel okay.....");
                                              int nestRandoInt = random.nextInt(1);
                                              if (nestRandoInt == 0) {
                                                  System.out.println("But your stomach hurts a bit. You lost a life!!!");
                                                  int newLifeCount = player1.getLife() - 1;
                                                  player1.setLife(newLifeCount);
                                                  secondNestedDoValue = 1;
                                              }// end of nested do-if-statement
                                              else {
                                                  System.out.println("And you start to feel more than great! You lost gain a life!!!");
                                                  int newLifeCount = player1.getLife() + 1;
                                                  player1.setLife(newLifeCount);
                                                  secondNestedDoValue = 1;
                                              } // end of nested else statement
                                          } // end of if statment
                                          else {
                                              System.out.println("You took a risk and it did not pay off. You die a slow painful " +
                                                      "death and have lost all your lives from the poisoning. SHAME!!!!");
                                              player1.setLife(0);
                                              secondNestedDoValue = 1;
                                          }// end of else statement
                                      } // end of if statement
                                      /*in
                                      the mechanics of this the play never acutally holds the mushroom in their
                                      inventory they simply get some prompts and thats it.
                                       */
                                      else if (playerChoice.toLowerCase().contains("no")) {
                                          System.out.println("You dont risk it, you drop the mushroom and have lost " +
                                                  "your chance to grab another item");
                                          System.out.println("You leave empty handed");
                                          secondNestedDoValue = 1;
                                      } // end of else if-statement
                                  } // end of do statement
                                  while (secondNestedDoValue == 0 && player1.getLife() > 0);
                                  nestedDoValue = 1;
                              } // end of else if statement
                              // player again is prompted to enter the correct parameters if it was done wrong
                              else {
                                  System.out.println("\n\n" + "Acceptable Options:");
                                  System.out.println("      Item 1");
                                  System.out.println("      Item 2");
                                  System.out.println("      Item 3");
                                  System.out.print("\n" + "Please type a valid option from above: ");
                                  nestedDoValue = 0;
                              } //end of else statement
                          } // end of do statement
                          while (nestedDoValue == 0 && player1.getLife() > 0);

                          /*
                          player can choose which direction to head out of the loot room and then will have to
                          battle a boss once they leave
                          */
                          System.out.print("You can move left or right out of this room, choose a direction: ");
                          int newNestedDoValue = 0;
                          do {
                              String playerChoice = scan.nextLine();
                              if (playerChoice.toLowerCase().contains("right")) {
                                  game.setScene(5);
                                  newNestedDoValue = 5;
                              } // end of if statement
                              else if (playerChoice.toLowerCase().contains("left")) {
                                  game.setScene(7);
                                  newNestedDoValue = 7;
                              } //end of else if statement
                              else {
                                  System.out.println("\n\n" + "Acceptable Options:");
                                  System.out.println("      go left");
                                  System.out.println("      go right");
                                  System.out.print("\n" + "Please type a valid option from above: ");
                                  newNestedDoValue = 0;
                              } // end of else statement
                          } // end of do statement
                          while (newNestedDoValue == 0 && player1.getLife() > 0);
                      } //end of if statement
                      /*
                      if the player did not take the undergound tunnel they will be directed to this else if
                      statement that is also use from the underground tunnel. the underground tunnel route forces
                      them this way in order to take on the remaining scenes. The portion is a repeat of the above
                      code but have ahd different scenes activated based on the choices the player has made up until
                      this point in the game
                       */
                      else if (player1.getLife() > 0){
                          System.out.print("\n\n" + "You have stumbled upon: ");
                          System.out.println(game.currentLocation.getName());
                          System.out.println(game.currentLocation.getDescription());
                          System.out.print("\n" + "You Notice: ");
                          System.out.println(game.currentCharacter.getName());
                          System.out.println(game.currentCharacter.getDescription());
                          System.out.print("\n" + "Will you stay and sneak attack or sneak away?? (attack or run): ");
                          int nestedDoValue = 0;
                          do {
                              String playerChoice = scan.nextLine();
                              // looks ot see if player wants to attack or run
                              if (playerChoice.toLowerCase().contains("attack") || playerChoice.toLowerCase().contains(
                                      "yes")) {
                                  player1.setAction("sneak attack");
                                  System.out.println("\n" + "You decided to sneak attack.");
                                  Random random = new Random();
                                  int randoInt = random.nextInt(9);
                                  //if they attack they have a random chance at failing like in the other encounters
                                  if (randoInt != 4) {
                                      System.out.println("Your attack was successfull " + game.currentCharacter.getName() + " have been defeated");
                                      int nestRandoInt = random.nextInt(3);
                                      // player has a random chance of grabbing a good item
                                      if (nestRandoInt == 0 || nestRandoInt == 1 || nestRandoInt == 2) {
                                          playerInventory.setPlayerInventory(game.currentDungeonItem2);
                                          System.out.println("\n\n" + "You picked up and item, your inventory now looks like:");
                                          playerInventory.getPlayerInventory();
                                          nestedDoValue = 1;
                                          game.setScene(8);
                                          break;
                                      }// end of nested do-if-statement
                                      /*
                                      if player doesnt get the good item that automatically pick up a lesser item
                                      before moving on
                                      */
                                      else {
                                          playerInventory.setPlayerInventory(game.currentDungeonItem1);
                                          System.out.println("\n\n" + "You picked up an item, your inventory now looks like:");
                                          playerInventory.getPlayerInventory();
                                          nestedDoValue = 1;
                                          game.setScene(8);
                                          break;
                                      } // end of nested do-else-statement
                                  } // end of if-statement
                                  /*
                                  enemy has a chance on the sneak attack to counter the attack and force another
                                  encounter
                                   */
                                  else {
                                      System.out.println(game.currentCharacter.getName() + " countered your attack" +
                                              "and did damage to you!!!!!");
                                      System.out.println(game.currentCharacter.getWinSaying());
                                      int newLifeCount = player1.getLife() - 1;
                                      player1.setLife(newLifeCount);
                                      nestedDoValue = 0;
                                      System.out.print("\n" + "Will you try to attack again?: ");
                                  } // end of else statement
                              } // end of if statement
                              // player can choose to run away as well
                              else if (playerChoice.toLowerCase().contains("run")) {
                                  player1.setAction("run");
                                  System.out.println("\n" + "You Decided to run");
                                  game.setScene(8);
                                  nestedDoValue = 1;
                              } // end of else if statment
                              // if player inputs bad parameters they will be prompted to enter valid ones
                              else  {
                                  System.out.println("\n\n" + "Acceptable Options:");
                                  System.out.println("      attack");
                                  System.out.println("      run");
                                  System.out.print("\n" + "Please type a valid option from above: ");
                                  nestedDoValue = 0;
                              } // end of else statement
                          } // end of do statement
                          while (nestedDoValue == 0 && player1.getLife() > 0);
                      } // end of else statement
                  } // end of do statement
                  while ((game.currentScene == 7 || game.currentScene == 5) && doValue == 0 && player1.getLife() > 0);
              } // end of if statement
              /*
              This marks the final encounter with the bosses of the game. this first portion just initilaizes the
              battle in prints out dialouge to the player from the contol class
               */
              if (player1.getLife() > 0) {
                  game.setScene(8);
                  System.out.print("\n\n" + "You have stumbled upon: ");
                  System.out.println(game.currentLocation.getName());
                  System.out.println(game.currentLocation.getDescription());
                  System.out.print("\n\n" + "Hit the enter key to proceed...");
                  String playerChoice = scan.nextLine();
                  System.out.print("\n" + "You approach the " + game.currentLocation.getName() + " and are");
                  System.out.print("\n" + "immediatley ambushed by: ");
                  System.out.println(game.currentCharacter.getName());
                  System.out.println(game.currentCharacter.getDescription());
                  System.out.println("\n" + game.currentCharacter.getFirstEncounterSaying());
                  System.out.println("\n" + "You have no choice but to defend yourself from " + game.currentCharacter.getName());
                  System.out.println("Hopefully you built your inventory enough to give yourself a fighting chance!!");
                  System.out.println(game.currentCharacter.getName() + " attack!");
                  System.out.print("\n\n" + "Hit the enter key to proceed...");
                  playerChoice = scan.nextLine();
                  /*
                  player has to attack so the players inventory uses a method to score all the items they have
                  collected and that will determine what chances they have to beat the bosses
                  */
                  player1.setAction("attack");
                  int attackDefenseScore = playerInventory.getAttackDefenseScore();
                  System.out.println("\n\n" + "Your combined Attack/Defense score is " + attackDefenseScore);
                  System.out.print("\n\n" + "Hit the enter key to proceed...");
                  playerChoice = scan.nextLine();
                  /*
                   start of the battle, do statement that open into an if statment that ranks the players
                  inventory, againthe rank determines the chances of a successfull outcome.
                  */
                  doValue = 0;
                  do {
                      // check the att/def score and lets the player know the chances they have to defeat the boss
                      if (attackDefenseScore >= 4 && player1.getLife() > 0) {
                          System.out.println("\n" + "You have a great chance at defeating " + game.currentCharacter.getName());
                          System.out.println("Attack now for your best chance at defeating them");
                          int nestedDoValue = 0;
                          do {
                              Random random = new Random();
                              int randoInt = random.nextInt(99);
                              // if statement that activates if the chances were in the players favour
                              if (randoInt != 0 || randoInt != 49 || randoInt != 99) {
                                  System.out.print("\n\n" + "Your effort and might pulled through, you defeated ");
                                  System.out.println(game.currentCharacter.getName());
                                  System.out.print("\n" + game.currentCharacter.getDefeatSaying() + "\n");
                                  nestedDoValue = 1;
                                  doValue = 1;
                              } // end of if statement
                              // else that activated if the chances were in the players favour
                              else {
                                  System.out.print("\n\n" + "Your effort and might was not enough, you were defeated ");
                                  System.out.print("\n" + game.currentCharacter.getWinSaying() + "\n");
                                  int newPlayerLife = player1.getLife() - 1;
                                  player1.setLife(newPlayerLife);
                                  System.out.print("\n" + "Hit the enter key to proceed...");
                                  playerChoice = scan.nextLine();
                                  nestedDoValue = 0;
                              } // end of else statement
                          } // end of do statement
                          while (nestedDoValue == 0 && player1.getLife() > 0);
                      } // end of if statement
                      // check the att/def score and lets the player know the chances they have to defeat the boss
                      else if (attackDefenseScore < 4 && attackDefenseScore >= 3 && player1.getLife() > 0) {
                          System.out.println("\n" + "You have a decent chance at defeating " + game.currentCharacter.getName());
                          System.out.println("Attack now for your best chance at defeating them");
                          int nestedDoValue = 0;
                          do {
                              Random random = new Random();
                              int randoInt = random.nextInt(3);
                              if (randoInt != 4) {
                                  System.out.print("\n\n" + "Your effort and might pulled through, you defeated ");
                                  System.out.println(game.currentCharacter.getName());
                                  System.out.print("\n" + game.currentCharacter.getDefeatSaying() + "\n");
                                  nestedDoValue = 1;
                                  doValue = 1;
                              } // end of if statement
                              else {
                                  System.out.print("\n\n" + "Your effort and might was not enough, you were defeated ");
                                  System.out.print("\n" + game.currentCharacter.getWinSaying() + "\n");
                                  int newPlayerLife = player1.getLife() - 1;
                                  player1.setLife(newPlayerLife);
                                  System.out.print("\n\n" + "Hit the enter key to proceed...");
                                  playerChoice = scan.nextLine();
                                  nestedDoValue = 0;
                              } // end of else statement
                          } // end of do statement
                          while (nestedDoValue == 0 && player1.getLife() > 0);
                      }  // end of if-else statement
                      // check the att/def score and lets the player know the chances they have to defeat the boss
                      else if (attackDefenseScore < 3 && attackDefenseScore >= 2 && player1.getLife() > 0) {
                          System.out.println("\n" + "You have a so/so chance at defeating " + game.currentCharacter.getName());
                          System.out.println("Attack now for your best chance at defeating them");
                          int nestedDoValue = 0;
                          do {
                              Random random = new Random();
                              int randoInt = random.nextInt(2);
                              if (randoInt != 0) {
                                  System.out.print("\n\n" + "Your effort and might pulled through, you defeated ");
                                  System.out.println(game.currentCharacter.getName());
                                  System.out.print("\n" + game.currentCharacter.getDefeatSaying() + "\n");
                                  nestedDoValue = 1;
                                  doValue = 1;
                              } // end of if statement
                              else {
                                  System.out.print("\n\n" + "Your effort and might was not enough, you were defeated ");
                                  System.out.print("\n" + game.currentCharacter.getWinSaying() + "\n");
                                  int newPlayerLife = player1.getLife() - 1;
                                  player1.setLife(newPlayerLife);
                                  System.out.print("\n\n" + "Hit the enter key to proceed...");
                                  playerChoice = scan.nextLine();
                                  nestedDoValue = 0;
                              } // end of else statement
                          } // end of do statement
                          while (nestedDoValue == 0 && player1.getLife() > 0);
                      }  // end of if-else statement
                      // check the att/def score and lets the player know the chances they have to defeat the boss
                      else if (attackDefenseScore < 2 && attackDefenseScore >= 1 && player1.getLife() > 0) {
                          System.out.println("\n" + "You have a not so great of a chance at defeating " + game.currentCharacter.getName());
                          System.out.println("Attack now for your best chance at defeating them");
                          int nestedDoValue = 0;
                          do {
                              Random random = new Random();
                              int randoInt = random.nextInt(9);
                              if (randoInt != 0 || randoInt != 3 || randoInt != 6) {
                                  System.out.print("\n\n" + "Your effort and might pulled through, you defeated ");
                                  System.out.println(game.currentCharacter.getName());
                                  System.out.print("\n" + game.currentCharacter.getDefeatSaying() + "\n");
                                  nestedDoValue = 1;
                                  doValue = 1;
                              } // end of if statement
                              else {
                                  System.out.print("\n\n" + "Your effort and might was not enough, you were defeated ");
                                  System.out.print("\n" + game.currentCharacter.getWinSaying() + "\n");
                                  int newPlayerLife = player1.getLife() - 1;
                                  player1.setLife(newPlayerLife);
                                  System.out.print("\n\n" + "Hit the enter key to proceed...");
                                  playerChoice = scan.nextLine();
                                  nestedDoValue = 0;
                              } // end of else statement
                          } // end of do statement
                          while (nestedDoValue == 0 && player1.getLife() > 0);
                      }  // end of if-else statement
                      // check the att/def score and lets the player know the chances they have to defeat the boss
                      else if (attackDefenseScore < 1 && player1.getLife() > 0) {
                          System.out.println("\n" + "You have a terrible chance at defeating " + game.currentCharacter.getName());
                          System.out.println("Good Luck, you will need it!! Attack now for your best chance at defeating them");
                          int nestedDoValue = 0;
                          do {
                              Random random = new Random();
                              int randoInt = random.nextInt(99);
                              if (randoInt != 0 || randoInt != 49) {
                                  System.out.print("\n\n" + "Your effort and might was not enough, you were defeated ");
                                  System.out.print("\n" + game.currentCharacter.getWinSaying() + "\n");
                                  int newPlayerLife = player1.getLife() - 1;
                                  player1.setLife(newPlayerLife);
                                  System.out.print("\n\n" + "Hit the enter key to proceed...");
                                  playerChoice = scan.nextLine();
                                  nestedDoValue = 0;
                              } // end of if statement
                              else {
                                  System.out.print("\n\n" + "Your effort and might pulled through, you defeated ");
                                  System.out.println(game.currentCharacter.getName());
                                  System.out.print("\n" + game.currentCharacter.getDefeatSaying() + "\n");
                                  nestedDoValue = 1;
                                  doValue = 1;
                              } // end of else statement
                          } // end of do statement
                          while (nestedDoValue == 0 && player1.getLife() > 0);
                      }  // end of if-else statement
                  } // end of do statement
                  while (doValue == 0 && player1.getLife() > 0);
                  /*
                  when the player successfully defeates the boss the end script is read in via a scanner
                  and the player gets to final game dialogue.
                  */
                  if (player1.getLife() >= 1) {
                      try {
                          String filePath = "thewhiterabbit.txt";
                          File file = new File(filePath);
                          Scanner filesScan = new Scanner(file);
                          do {
                              String outro = filesScan.nextLine();
                              System.out.println(outro);
                          }
                          while (filesScan.hasNextLine());
                          System.out.print("\n\n" + "After reading...Hit the enter key to proceed...");
                          playerChoice = scan.nextLine();
                          player1.setLife(0);
                      } catch (FileNotFoundException e) {
                          System.out.println("An error occurred, file not found.");
                          e.printStackTrace();
                      } // end of catch statement
                  } // end of if statement
              } // end of if statement
          } // end of if-statment
          /*
          this else statement activate upon player death or game complete and prompts the user to choose if they are
          done playing or if they wish to continue playing or not. the statement loops until a saticfactory prompt
          has been input by the player
           */
          else if (player1.getLife() == 0) {
              System.out.print("\n" + "Would you like to play again?? (yes or no)");
              System.out.print("\n" + "If yes the game will restart! If no the console will shut down: ");
              int doValue = 0;
              do {
                  String continueChoice = scan.nextLine();
                  if (continueChoice.toLowerCase().contains("yes")) {
                      player1.setLife(3);
                      playerInventory.clearInventory();
                      doValue = 1;
                  } // end of replay if statement
                  else if (continueChoice.toLowerCase().contains("no")) {
                      System.out.println("\n\n" + "Game Over!!!");
                      System.exit(0);
                  } // end of replay if else statement
                  else {
                      System.out.print("Please type yes or no: ");
                      doValue = 0;
                  } // end of else statement
              } // end of do statement
              while (doValue == 0);
          } // end of else statement
      } // end of do statement
      while (player1.getLife() > -1);
  } //end of main class
} //end of GameMain class
