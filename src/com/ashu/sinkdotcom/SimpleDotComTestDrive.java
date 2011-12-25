package com.ashu.sinkdotcom;

public class SimpleDotComTestDrive {

	public static void main(String[] args) {
		SimpleDotCom simple = new SimpleDotCom();
		GameHelper helper = new GameHelper();
		int[] loc = { 2, 3, 4 };
		String result = "failed";

		String userGuess = "";

		boolean isAlive = true;

		simple.setLocationCells(loc);

		while (isAlive) {
			if (result == "kill") {
				isAlive = false;
			} else {
				userGuess = helper.getUserInput("Enter a number: ");
				result = simple.checkYourself(userGuess);

			}

		}
	}
}
