package com.vtvdv.main;

import java.util.List;

import com.vtvdv.actors.ActorView;
import com.vtvdv.actors.Agent;

public class MainView {
	
	ActorView actorView = new ActorView();
	
	public void intro() {
		System.out.println("Welcome to the Spy Game, you have been made the director");
		System.out.println("of a new spy agency.");
	}
	
	public void nameAgency() {
		System.out.println("Please name your agency:");
	}
	
	public void invalidName() {
		System.out.println("That name is invalid, please use another name.");
	}
	
	public void invalidInput( ) {
		System.out.println("That is invalid, please enter a number between 1 and 5.");
	}
		
	public void userPrompt() {
		System.out.println("Hello director, what would you like to do?");
		System.out.println("1: View agents");
		System.out.println("2: View missions");
		System.out.println("3: Find new missions");
		System.out.println("4: Find a new agent");
		System.out.println("5: Quit");
	}
	
	public void noAgents() {
		System.out.println("You have no agents.");
	}
	
	public void displayAgents(List<Agent> agents) {
		for(Agent a: agents) {
			actorView.printAgentInfo(a);
		}
	}
	
	
	public void noMissions() {
		System.out.println("You have no missions.");
	}
	
	public void noMissionsAvailable() {
		System.out.println("There are no missions available at this time.");
	}
	
	public void existingAgent() {
		System.out.println("WARNING! You can only have one agent.");
		System.out.println("If you hire a new agent, your old agent will be retired.");
	}
		
	public void hireAgent(Agent agent) {
		System.out.println("We have found the following agent for hire:");
		actorView.printAgentInfo(agent);
		System.out.println("Would you like to hire this agent?");
	}
	
	public void agentHired(Agent agent, String agencyName) {
		System.out.println(agent.getName() + " has joined " + agencyName);
	}
	
	public void notHired(Agent agent) {
		System.out.println(agent.getName() + " has not been hired.");
	}
	
	public void bye() {
		System.out.println("Good bye Director.");
	}
}
