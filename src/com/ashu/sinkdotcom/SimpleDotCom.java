package com.ashu.sinkdotcom;

import java.util.ArrayList;

class SimpleDotCom {

	private String dotcomName;
	private ArrayList<String> locationCells;
	
	void setDotComName (String name) {
		dotcomName = name; 
	}
	
	void setLocationCells(ArrayList<String> loc) {
		locationCells = loc;
	}
	
	String getDotComName () {
		return dotcomName;
	}

	public String checkYourself(String stringGuess) {

		String result = "miss";

		int index = locationCells.indexOf(stringGuess);
		if (index >= 0) {
			locationCells.remove(index);
			if (locationCells.isEmpty()) {
				result = "kill";
			} else {
				result = "hit";
			}
		}
		
		System.out.println(result);
		return result;
	}
}
