package com.vtvdv.utility;

import java.util.Random;

public class StatGenerator {
	Random random = new Random();
	
	public int getStat() {
		return random.nextInt(99);
	}
}
