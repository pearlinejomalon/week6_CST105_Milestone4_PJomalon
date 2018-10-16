/**
 * Program: NFL Draft
 * File: DefensivePlayer.java
 * Summary: Defensive Player extension of Player class
 * Author: Pearl Jomalon
 * Date: October 14, 2018
 */

package nfldraft;

public class DefensivePlayer extends Player {  //Begin DefensivePlayer subclass
	private int tackles;
	private int forcedFumbles;
	private int interceptions;
	
	public DefensivePlayer() {  //Declare defensive variables
		
	}
	
	//constructor with variables
	public DefensivePlayer(String nameIn, String homeTownIn, String teamNameIn, String positionIn, String collegeTeamIn, String dateOfBirthIn, int ageIn, int heightIn, int weightIn, int yearsProIn, int tacklesIn, int forcedFumblesIn, int interceptionsIn) {
		
		//abstract class variables
		super(nameIn, homeTownIn, teamNameIn, positionIn, collegeTeamIn, dateOfBirthIn, ageIn, heightIn, weightIn, yearsProIn);
		
		//assign values to private variables
		tackles = tacklesIn;
		forcedFumbles = forcedFumblesIn;
		interceptions = interceptionsIn;
	}
	
	//set and get methods for new variables
	public void setTackles(int tacklesIn) {
		this.tackles = tacklesIn;
	}
	public int getTackles() {
		return this.tackles;
	}
	
	public void setForcedFumbles(int forcedFumblesIn) {
		this.forcedFumbles = forcedFumblesIn;
	}
	public int getForcedFumbles() {
		return this.forcedFumbles;
	}
	
	public void setInterceptions(int interceptionsIn) {
		this.interceptions = interceptionsIn;
	}
	public int getInterceptions() {
		return this.interceptions;
	}
	
}
