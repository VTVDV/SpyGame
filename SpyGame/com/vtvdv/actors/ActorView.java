package com.vtvdv.actors;

public class ActorView {
	public void printAgentInfo(Agent agent) {
		System.out.println("-Agent Dossier-");
		System.out.println("AGENCY: " + agent.getAgencyName());
		System.out.println("---------------------");
		System.out.println("NAME: " + agent.getName());
		System.out.println("TYPE: " + agent.getType());
		System.out.println("ATTACKK: " + agent.getAttack());
		System.out.println("DEFENCE: " + agent.getDefence());
		System.out.println("SPEED: " + agent.getSpeed());
		System.out.println("STEALTH: " + agent.getStealth());
		System.out.println("HEALTH:" + agent.getHealth() + "/" + agent.getMaxHealth());
		System.out.println("---------------------");
	}
		
	public void recruitAgent(Agent agent) {
		System.out.println(agent.getName() + " has been recruited.");
	}
	
	public void retireAgent(Agent agent) {
		System.out.println(agent.getName() + " has been retired.");
	}
	
}
