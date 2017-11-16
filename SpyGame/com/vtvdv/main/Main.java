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
	
	static Agent currentAgent; //Currently hired agent.
	
	public static void main(String[] args) throws IOException {
		
		mainView.intro();
		
		mainView.nameAgency();
		
		Scanner scan = new Scanner(System.in);
		agencyName = scan.nextLine();
		if (agencyName == null || agencyName.isEmpty()) {
			mainView.invalidName();
			mainView.nameAgency();
		}
		System.out.println("Exited name check");

		mainView.userPrompt();
		while(scan.hasNext()) {
			int i = scan.nextInt();
			scan.nextLine();
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
				List<Agent> agents = new ArrayList<>();
				for(int i2 = 0; i2 < 100; i2++) {
					agents.add(new Agent());
				}
				IO.saveAgents(agents);
				break;
			default:
				mainView.invalidInput();
				break;
			}
			mainView.userPrompt();
		}
		scan.close();
	}
}
