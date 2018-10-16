/**
 * Program: NFL Draft
 * File: Player.java
 * Summary: Update NFL Player class to include abstract class
 * Author: Pearl Jomalon
 * Date: October 14, 2018
 */

package nfldraft;

//**update** change class to abstract class
public abstract class Player {  //begin player class
	
	//declare global instance variables
	//**update** changed instance variables
	private String name;
	private String homeTown;
	private String teamName;
	private String position;
	private String collegeTeam;
	private String dateOfBirth;
	private int age;
	private int height;
	private int weight;
	private int yearsPro;

	
	
	public Player () { } //empty constructor
	
	//player constructor that accepts all parameters
	public Player(String nameIn, String homeTownIn, String teamNameIn, String positionIn, String collegeTeamIn, String dateOfBirthIn, int ageIn, int heightIn, int weightIn, int yearsProIn, int prospectGradeIn) {
		name = nameIn;
		homeTown = homeTownIn;
		teamName = teamNameIn;
		position = positionIn;
		collegeTeam = collegeTeamIn;
		dateOfBirth = dateOfBirthIn;
		age = ageIn;
		height = heightIn;
		weight = weightIn;
		yearsPro = yearsProIn;
	}
	
	//getters and setters for all parameters
		public void setName(String nameIn) {
			this.name = nameIn;
		}
		public String getName() {
			return this.name;
		}
		
		public void setHomeTown(String homeTownIn) {
			this.homeTown = homeTownIn;
		}
		public String getHomeTown() {
			return this.homeTown;
		}
		
		public void setTeamName (String teamNameIn) {
			this.teamName = teamNameIn;
		}
		public String getTeamName() {
			return this.teamName;
		}
		
		public void setPosition(String positionIn) {
			this.position = positionIn;
		}
		public String getPosition() {
			return this.position;
		}
		
		public void setCollegeTeam(String collegeTeamIn) {
			this.collegeTeam = collegeTeamIn;
		}
		
		public String getCollegeTeam() {
			return this.collegeTeam;
		}
		
		public void setDateOfBirth(String dateOfBirthIn) {
			this.dateOfBirth = dateOfBirthIn;
		}
		public String getDateOfBirth() {
			return this.dateOfBirth;
		}
		
		public void setAge(int ageIn) {
			this.age = ageIn;
		}
		public int getAge() {
			return this.age;
		}
		public void setHeight(int heightIn) {
			this.height = heightIn;
		}
		public int getHeight() {
			return this.height;
		}
		public void setWeight(int weightIn) {
			this.weight = weightIn;
		}
		public int getWeight() {
			return this.weight;
		}
		public void setYearsPro(int yearsProIn) {
			this.yearsPro = yearsProIn;
		}
		public int getYearsPro() {
			return this.yearsPro;
		}

}

