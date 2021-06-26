/**
Title: Characters.java
Description: a class the creates each instance of a character
Date Created: May 30, 2021
Date Last Revised:
@author: Ty Keith - 3270281
@version: 1.0
@copyright 2021  T.Keith

Required:   compiled Characters.Java
Compile:    javac Characters.java

Variables:
private String name - name of the character
private String description - description of the character
private String firstEncounterSaying - the saying when player first encounters the character
private String winSaying - the saying when player is defeated by the character
private String defeatSaying - the saying when player defeats the character

Constructors:
Characters() - default character paramater
Characters(String name, String description, String firstEncounterSaying, String winSaying, String  defeatSaying) -
        paramater driven contructor

Methods:
setName - sets the character name
getName - returns the characters name
setDescription - sets the characters description
getDescription - returns the characters description
setFirstEncounterSaying - sets the first encounter saying
getFirstEncounterSaying - returns the first encounter saying
setWinSaying - sets the charcters win saying
getWinSaying - returns the characters win saying
setDefeatSaying - sets the characters defeat saying
getDefeatSaying - returns the characters defeat saying

Test Plan:
 see GameMain.java for test plan
*/

public class Characters {

    //setup variables
    private String name;
    private String description;
    private String firstEncounterSaying;
    private String winSaying;
    private String defeatSaying;

    // name setter
    public void setName(String name) {
        this.name = name;
    } // end of description setter

    // name getter
    public String getName() {
        return this.name;
    } // end of description getter


    // description setter
    public void setDescription(String description) {
        this.description = description;
    } // end of description setter

    // description getter
    public String getDescription() {
        return this.description;
    } // end of description getter


    // firstEncounterSaying setter
    public void setFirstEncounterSaying(String firstEncounterSaying) {
        this.firstEncounterSaying = firstEncounterSaying;
    } // end of description setter

    // firstEncounterSaying getter
    public String getFirstEncounterSaying() {
        return this.firstEncounterSaying;
    } // end of description getter


    // winSaying setter
    public void setWinSaying(String winSaying) {
        this.winSaying = winSaying;
    } // end of description setter

    // winSaying getter
    public String getWinSaying() {
        return this.winSaying;
    } // end of description getter

    // DefeatSaying setter
    public void setDefeatSaying(String defeatSaying) {
        this.defeatSaying = defeatSaying;
    } // end of DefeatSaying setter

    // DefeatSaying getter
    public String getDefeatSaying() {
        return this.defeatSaying;
    } // end of DefeatSaying getter

    // default constructor
    Characters() {
    } // end of deafult constructor

    // parameter constructor
    Characters(String name, String description, String firstEncounterSaying, String winSaying, String  defeatSaying) {
        this.setName(name);
        this.setDescription(description);
        this.setFirstEncounterSaying(firstEncounterSaying);
        this.setWinSaying(winSaying);
        this.setDefeatSaying(defeatSaying);
    }//end of the character parameter constructor
} //end of Characters class
