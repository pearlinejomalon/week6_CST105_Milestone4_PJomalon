 /**Program: NFL Player Manager Class
*File: Manager.java
*Summary: Design, implement and test the NFL Manager Player Class
*Author: Pearl Jomalon
Date: October 15, 2018
**/


package nfldraft;

import java.util.*;

public class Manager { //Begin Manager Class

	private static ArrayList <Player> PLAYER_LIST = new ArrayList<Player>();  //Create ArrayList
	
	
	public Manager() {   //Create Manager method
		createPlayers();
	}
	
	//List players and stats
	//Add to ArrayList
	//**updated Player variables
	public static void createPlayers() {
		Player tbrady = new OffensivePlayer("Tom Brady", "San Mateo, CA", "New England Patriots", "QB", "Michigan", "August 3rd", 41, 76in, 225lb, 19);
		Player eelliott = new Player("Ezekiel Elliott", "Alton, IL", "Dallas Cowboys", "RB", "Ohio State", "July 22nd", 23, 72in, 228lb, 3);
		Player damendola = new Player("Danny Amendola", "The Woodlands, TX", "Miami Dolphins", "WR", "Texas Tech", "November 2nd", 32, 71in, 190lb, 10);
		
		Player vmiller = new Player("Von Miller", "Desoto, TX", "Denver Broncos", "LB", "Texas A&M", "March 26th", 29, 75in, 250lb, 8);
		Player jwatt = new Player("J.J. Watt", "Pewaukee, WI", "Houston Texans", "DE", "Central Michigan", "March 22nd", 29, 77in, 288lb 8);
		Player ppeterson = new Player("Patrick Peterson", "Fort Lauderdale, FL", "Arizona Cardinals", "CB", "LSU", 28, 73in, 203lb 8);
		
		PLAYER_LIST.add(tbrady);
		PLAYER_LIST.add(eelliott);
		PLAYER_LIST.add(damendola);
		PLAYER_LIST.add(vmiller);
		PLAYER_LIST.add(jwatt);
		PLAYER_LIST.add(ppeterson);
		
	}
	
	//Create toString method
	public String toString() {
		String playerList = "";
		for(Player player : PLAYER_LIST)
			playerList += (player.name + " " + "\n");
		return playerList;
	}
	
	//Add main method
	//Test string, getter and setter
	public static void main(String[] args) {
		Manager test = new Manager();
		System.out.println("String Test:\n\nPlayers in this NFL Draft are: \n" + test.toString());
		System.out.println("Getter Test: \nTom Brady is " + Manager.PLAYER_LIST.get(0).getAge() + " years old. He is the " + Manager.PLAYER_LIST.get(0).getPosition() + " for the " + Manager.PLAYER_LIST.get(0).getTeamName() + ".");
		
		Manager.PLAYER_LIST.get(2).setName("Ezekiel Elliott");
		Manager.PLAYER_LIST.get(2).setPosition("RB");
		Manager.PLAYER_LIST.get(2).setTeamName("Dallas Cowboys");
		System.out.println("\nSetter Test:\n" + Manager.PLAYER_LIST.get(2).getName() + " plays for the " + Manager.PLAYER_LIST.get(2).getTeamName() + " as a " + Manager.PLAYER_LIST.get(2).getPosition() + ".");
		
	}
}
