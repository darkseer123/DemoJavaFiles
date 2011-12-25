package com.ashu.sinkdotcom;

class SimpleDotCom {

	private int[] locationCells;
	private int numOfHits;

	void setLocationCells(int[] loc) {
		locationCells = loc;
	}

	public String checkYourself(String stringGuess) {

		int guess = Integer.parseInt(stringGuess);
		String result = "miss";

		for (int cell : locationCells) {
			if (guess == cell) {
				result = "hit";
				numOfHits++;
				break;
			}
		}

		if (numOfHits == locationCells.length) {
			result = "kill";
		}

		System.out.println(result);

		return result;
	}
}
