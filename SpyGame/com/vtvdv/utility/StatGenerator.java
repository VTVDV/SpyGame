package com.vtvdv.utility;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StatGenerator {
	Random random = new Random();
	List<String> maleNames;
	List<String> femaleNames;

	public StatGenerator() {
		try {
			maleNames = IO.getNames(true);
			femaleNames = IO.getNames(false);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public int getStat() {
		return random.nextInt(99);
	}

	public String getMaleName() {
		int namePosition = random.nextInt(maleNames.size());
		return maleNames.get(namePosition);
	}

	public String getFemaleName() {
		int namePosition = random.nextInt(femaleNames.size());
		return femaleNames.get(namePosition);
	}

	public String getGender() {
		int gender = random.nextInt(2);
		return gender == 0 ? "Male" : "Female";
	}
}
