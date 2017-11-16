package com.vtvdv.actors;

public class ActorFactory {
	public Actor getActor(String actor) {
		if(actor == "Agent") {
			return new Agent();
		}
		return null;
	}
}
