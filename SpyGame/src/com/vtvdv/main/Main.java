package com.vtvdv.main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.vtvdv.actors.ActorView;
import com.vtvdv.actors.Agent;
import com.vtvdv.utility.IO;

public class Main {
	
	static ActorView actorView = new ActorView();
	static String agencyName;
	static MainView mainView = new MainView();
	
	private static List<Agent> playerAgents; //Currently hired agent.
	
	public static void main(String[] args) throws IOException {
		IO.main(null); //Generates list of names;
		playerAgents = IO.getAgents();
		
		mainView.intro();
		
		mainView.nameAgency();
		
		Scanner scan = new Scanner(System.in);
		agencyName = scan.nextLine();
		if (agencyName == null || agencyName.isEmpty()) {
			mainView.invalidName();
			mainView.nameAgency();
		}

		mainView.userPrompt();
		while(scan.hasNext()) {
			int i = scan.nextInt();
			scan.nextLine();
			switch(i) {
			case 1:
				if(playerAgents.size()==0) {
					mainView.noAgents();
				} else {
					mainView.displayAgents(playerAgents);
				}
				break;
			case 2:
				mainView.noMissions();
				break;
			case 3:
				mainView.noMissionsAvailable();
				break;
			case 4:
				hiring();				
				break;
			case 5:
				mainView.bye();
				IO.saveAgents(playerAgents);
				System.exit(0);
				break;
			default:
				mainView.invalidInput();
				break;
			}
			mainView.userPrompt();
		}
	}
		
	public static void hiring() {
		Agent agent = new Agent();
		mainView.hireAgent(agent);
		try(Scanner scan = new Scanner(System.in)) {
			String response = scan.nextLine();
			if(response.equalsIgnoreCase("y")) {
				agent.setAgencyName(agencyName);
				mainView.agentHired(agent, agencyName);
			} else {
				mainView.notHired(agent);
			}
			scan.close();
		}
	}

	public List<Agent> getPlayerAgents() {
		return playerAgents;
	}

	public void setPlayerAgents(List<Agent> playerAgents) {
		this.playerAgents = playerAgents;
	}
	
	
}
