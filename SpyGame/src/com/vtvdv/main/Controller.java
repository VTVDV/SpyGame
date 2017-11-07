package com.vtvdv.main;

import java.util.Random;

import com.vtvdv.actors.Agent;

public class Controller {
	
	Random random = new Random();
	
	public Agent fight(Agent attacker, Agent defender) { //Winner of fight is returned.
		if(attacker.getAttack() == defender.getDeffence()) { // 50/50 on who wins, no deaths.
			return tieBreaker(attacker, defender);
		}
		else if(attacker.getAttack() < defender.getDeffence()) { //Defender wins.
			if (attacker.getAttack() < defender.getDeffence()*2) {
				die(attacker); //Attacker is overpowered and dies.
			}
			return defender;
		}
		die(defender); //If not a tie or better defence, defender dies.
		return attacker;
	}
	
	public void die(Agent agent) {
		agent.setHealth(0);
		agent.setDead(true);
	}
	
	public Agent tieBreaker(Agent agent1, Agent agent2) { //Determines winner in event of a tie.
		int winner = random.nextInt(2);
		if(winner == 0) {
			return agent1;
		}
		return agent2;
	}
}
