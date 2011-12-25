package com.ashu.sinkdotcom;

import java.util.ArrayList;

public class SimpleDotComTestDrive {

	public static void main(String[] args) {
		GameHelper helper = new GameHelper();
		SimpleDotCom simple = new SimpleDotCom();
		
		String url = "http://www.goibibo.com";
		
		ArrayList<String> loc = new ArrayList<String>();
		loc.add("2");
		loc.add("3");
		loc.add("4");
				
		String result = "failed";
		String userGuess = "";
		
		int numOfGuesses = 0;

		boolean isAlive = true;

		simple.setDotComName(url);
		simple.setLocationCells(loc);

		while (isAlive) {
			if (result == "kill") {
				isAlive = false;
				System.out.printf("You took %d guesses to kill %s\n", numOfGuesses, simple.getDotComName());
			} else {
				userGuess = helper.getUserInput("Enter a number: ");
				result = simple.checkYourself(userGuess);
				numOfGuesses++;

			}

		}
	}
}
