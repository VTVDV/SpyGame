package com.vtvdv.main;

import java.util.Scanner;

import com.vtvdv.actors.ActorView;
import com.vtvdv.actors.Agent;

public class Main {
	
	static ActorView actorView = new ActorView();
	static String agencyName;
	static MainView mainView = new MainView();
	
	static Agent currentAgent; //Currently hired agent.
	
	public static void main(String[] args) {
		
		mainView.intro();
		
		mainView.nameAgency();
		
		Scanner scan = new Scanner(System.in);

		while(scan.hasNext()) {
			agencyName = scan.next();
			while(agencyName == null || agencyName.isEmpty()) {
				mainView.invalidName();
				mainView.nameAgency();
			}
		}
		
		while(true) {
			mainView.userPrompt();		
			if(scan.hasNextInt()) {
				while(scan.hasNextInt()) {
					int i = scan.nextInt();
					switch(i) {
					case 1: 
						if(currentAgent != null) {
							actorView.printAgentInfo(currentAgent);
						}
						break;
					case 2: 
						mainView.noMissions();
						break;
					case 3: 
						mainView.noMissionsAvailable();
						break;
					case 4:
						Agent agent = new Agent();
						mainView.hireAgent(agent);
						break;
					default: 
						mainView.invalidInput(); 
						break;
					}
				}
			}
		}
	}
}
