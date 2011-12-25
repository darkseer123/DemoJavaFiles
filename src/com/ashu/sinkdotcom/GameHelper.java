package com.ashu.sinkdotcom;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class GameHelper {

	public String getUserInput(String prompt) {
		String inputLine = null;

		System.out.print(prompt + " ");
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			inputLine = br.readLine();

			if (inputLine.length() == 0) {
				return null;
			}
		} catch (IOException e) {
			System.out.println("IOException: " + e);
		}

		return inputLine;
	}
}
