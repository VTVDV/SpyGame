package com.vtvdv.actors;

import java.util.List;

import com.vtvdv.events.Mission;
import com.vtvdv.items.Item;
import com.vtvdv.items.Weapon;

public class Agent implements Actor{
	//MAIN STATS
	private String name; //Agent's name.
	private String gender; //Agent's name.
	private int attack; //Agent's attack power (Higher is better).
	private int deffence; //Agent's defence power, mitigates attack from others (Higher is better).
	private int speed; //How fast agent can move between locations.
	private int stealth; //Affects chance of agent being discovered.
	private int health; //Health of Agent.
	
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
	
	
}
