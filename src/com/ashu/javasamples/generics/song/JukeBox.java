package com.ashu.javasamples.generics.song;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class JukeBox {

	ArrayList<Song> songList = new ArrayList<Song>();

	public void go() {
		getSongs();
		System.out.println(songList);
	}

	private void getSongs() {
		try {
			File file = new File("Songs.txt");
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line = null;

			while ((line = br.readLine()) != null) {
				addSong(line);
			}

		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	private void addSong(String _song) {
		String[] token = _song.split("/");

		Song nextSong = new Song(token[0], token[0], token[0], token[0]);
		songList.add(nextSong);
	}
}
