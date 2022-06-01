package com.unit4Evaluation3Q3;

import java.util.ArrayList;

public class PlayList {

	ArrayList<Song> al = new ArrayList<>();

	public void addSongs(Song song) {
		boolean flag = true;
		for (Song s : al) {
			if (s.movieName.equals(song.movieName) && s.songName.equals(song.songName)) {
				flag = false;
			}
		}
		if (flag) {
			this.al.add(song);
			System.out.println("Song added to the playlist successfully.");
		} else {
			System.out.println("Song is already added to the playlist");
		}
	}

}
