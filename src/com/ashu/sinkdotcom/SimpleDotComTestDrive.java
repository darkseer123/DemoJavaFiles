package com.ashu.sinkdotcom;

import java.io.IOException;

public class SimpleDotComTestDrive {

	public static void main(String[] args) throws IOException {
		SimpleDotCom simple = new SimpleDotCom();
		int[] loc = { 2, 3, 4 };
		
		simple.setLocationCells(loc);

		String userGuess = "2";
		String result = simple.checkYourself(userGuess);
	}
}
