package com.vtvdv.actors;

import java.util.List;
import java.util.Random;

import com.vtvdv.events.Mission;
import com.vtvdv.items.Item;
import com.vtvdv.items.Weapon;
import com.vtvdv.utility.StatGenerator;

public class Agent implements Actor{
	StatGenerator statGen = new StatGenerator(); //Used to generate.
	
	//MAIN STATS
	private String name; //Agent's name.
	private String gender; //Agent's name.
	
	//RANGE BETWEEN 1-100
	private int attack; //Agent's attack power (Higher is better).
	private int deffence; //Agent's defence power, mitigates attack from others (Higher is better).
	private int speed; //How fast agent can move between locations.
	private int stealth; //Affects chance of agent being discovered.
	private int health; //Current health of Agent.
	private int maxHealth; //Max health of Agent.
	
	//DEATH RELATED
	private boolean isDead; //If the agent is dead.
	private String causeOfDeath; //How the agent died.
	private Agent killer; //Who killed the Agent.
	
	//INVENTORY
	private List<Item> inventory; //Agent's inventory.
	private Weapon weapon; //Agent's equipped weapon.
	
	//MISSION RELATED
	private Mission mission; //Agent's current mission.
	private List<Mission> completedMissions; //List of completed missions.
	private List<Mission> failedMissions; //List of failed missions.
	
	//RANK RELATED
	private int level; //Agent's level.
	private int experience; //Agent's experience.
	
	public Agent() {
		name = "Place Holder";
		attack = statGen.getStat();
		deffence = statGen.getStat();
		speed = statGen.getStat();
		stealth = statGen.getStat();
		maxHealth = statGen.getStat();
		health = maxHealth;
	}

	//GETTERS AND SETTERS
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return "Agent";
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getDeffence() {
		return deffence;
	}

	public void setDeffence(int deffence) {
		this.deffence = deffence;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getStealth() {
		return stealth;
	}

	public void setStealth(int stealth) {
		this.stealth = stealth;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public boolean isDead() {
		return isDead;
	}

	public void setDead(boolean isDead) {
		this.isDead = isDead;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getMaxHealth() {
		return maxHealth;
	}

	public void setMaxHealth(int maxHealth) {
		this.maxHealth = maxHealth;
	}

	public String getCauseOfDeath() {
		return causeOfDeath;
	}

	public void setCauseOfDeath(String causeOfDeath) {
		this.causeOfDeath = causeOfDeath;
	}

	public Agent getKiller() {
		return killer;
	}

	public void setKiller(Agent killer) {
		this.killer = killer;
	}

	public List<Item> getInventory() {
		return inventory;
	}

	public void setInventory(List<Item> inventory) {
		this.inventory = inventory;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public Mission getMission() {
		return mission;
	}

	public void setMission(Mission mission) {
		this.mission = mission;
	}

	public List<Mission> getCompletedMissions() {
		return completedMissions;
	}

	public void setCompletedMissions(List<Mission> completedMissions) {
		this.completedMissions = completedMissions;
	}

	public List<Mission> getFailedMissions() {
		return failedMissions;
	}

	public void setFailedMissions(List<Mission> failedMissions) {
		this.failedMissions = failedMissions;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}
	
	
	
}
