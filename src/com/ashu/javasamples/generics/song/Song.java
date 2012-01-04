package com.ashu.javasamples.generics.song;

class Song {

	String title;
	String artist;
	String rating;
	String bpm;

	Song(String _title, String _artist, String _rating, String _bpm) {
		this.title = _title;
		this.artist = _artist;
		this.rating = _rating;
		this.bpm = _bpm;
	}

	public String getTitle() {
		return title;
	}

	public String getArtist() {
		return artist;
	}

	public String getRating() {
		return rating;
	}

	public String getBPM() {
		return bpm;
	}

	public String toString() {
		return title;
	}
}
