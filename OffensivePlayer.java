/**
 * Program: NFL Draft
 * File: OffensivePlayer.java
 * Summary: Offensive Player extension of Player class
 * Author: Pearl Jomalon
 * Date: October 14, 2018
 */

package nfldraft;

public class OffensivePlayer extends Player {  //Begin OffensivePlayer subclass
	private int touchdowns;
	private int receptions;
	private int totalYards;
	
	public OffensivePlayer() {  //Declare offensive variables
		
	}
	
	//constructor with variables
	public OffensivePlayer(String nameIn, String homeTownIn, String teamNameIn, String positionIn, String collegeTeamIn, String dateOfBirthIn, int ageIn, int heightIn, int weightIn, int yearsProIn, int prospectGradeIn, int touchdownsIn, int receptionsIn, int totalYardsIn) {
		
		//abstract class variables
		super(nameIn, homeTownIn, teamNameIn, positionIn, collegeTeamIn, dateOfBirthIn, ageIn, heightIn, weightIn, yearsProIn);
		
		//assign values to private variables
		touchdowns = touchdownsIn;
		receptions = receptionsIn;
		totalYards = totalYardsIn;
	}
	
	//set and get methods for new variables
	public void setTouchdowns(int touchdownsIn) {
		this.touchdowns = touchdownsIn;
	}
	public int getTouchdowns() {
		return this.touchdowns;
	}
	
	public void setReceptions(int receptionsIn) {
		this.receptions = receptionsIn;
	}
	public int getReceptions() {
		return this.receptions;
	}
	
	public void setTotalYards(int totalYardsIn) {
		this.totalYards = totalYardsIn;
	}
	public int getTotalYards() {
		return this.totalYards;
	}
	

}
